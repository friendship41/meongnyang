<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="float:left; width: 20%;">
<select class="ht__select" id="selectBox" name="cmAddressTbNo" style="width:100px;height:50px;">
          		<option id="addOption" value="thisIsSelect">선택하세요</option>
          <c:forEach var="address" items="${addressList }">
          		<option value="${address.cmAddressTbNo }">${address.cmAddressTbNickname }</option>
          </c:forEach>
</select>
<br><br><br>
<br>
<select class="ht__select" id="select" style="width:100px;height:50px;">
          		<option value="select">반경을 선택하세요</option>
         		<option value="1">1KM</option>	
          		<option value="2">2KM</option>
				<option value="5">5KM</option>
         
</select>
</div>
<input type="hidden" id="mapList" value="${mapList }">
<div id="map" style="width:600px;height:500px; width: 60%;"></div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=6909f7ffa42194d19411603d190716fa&libraries=services"></script>
<script>

var container = document.getElementById('map'); //지도를 담을 영역의 DOM 레퍼런스

var meLat;
var meLng;
var mapList = $("#mapList").val();

    $("#selectBox").change(function () {
    	 var selectedValue = $("#selectBox option:selected").val();
         console.log(selectedValue);
    	if(selectedValue == 'thisIsSelect') 
    		{
    			$("#addOption").attr("value", -1);
    		}
    	else 
    	{
            var ajaxUrl = "/market-map-single-ajax.do?cmAddressTbNo=" + selectedValue;
            $.ajax({
                url     : ajaxUrl,
                type    : "GET",
                async	: false,
                data    : {},
                dataType: "json"
            })
                .done(function (json) {
                    console.log(json);
                    console.log(json.cmAddressTbLat);
                    console.log(json.cmAddressTbLng);
                   meLat = json.cmAddressTbLat;
                   meLng = json.cmAddressTbLng;
                })
                .fail(function (xhr, status, errorThrown) {
                    alert(errorThrown);
                });
    	}
        });

$("#select").change(function() {
	var selectValue = $("#select").val();
	console.log(selectValue);
		mapLevel(selectValue);
		console.log(mapList);
	
});

function mapLevel(selectValue) {
	if(selectValue == "1") {
		var options = { //지도를 생성할 때 필요한 기본 옵션
				//center: new kakao.maps.LatLng("$(lat)", "$(lng)"), //당사자
				center: new kakao.maps.LatLng(meLat, meLng),
				level: 4   	
					
			};
		
	} else if(selectValue == "2") {
		var options = { //지도를 생성할 때 필요한 기본 옵션
				//center: new kakao.maps.LatLng("$(lat)", "$(lng)"), //당사자
				center: new kakao.maps.LatLng(meLat, meLng),
				level: 5    
			
			};
		
	} else if(selectValue == "5") {
		var options = { //지도를 생성할 때 필요한 기본 옵션
				//center: new kakao.maps.LatLng("$(lat)", "$(lng)"), //당사자
				center: new kakao.maps.LatLng(meLat, meLng),
				level: 7   	
				
			};
	}
	var map = new kakao.maps.Map(container, options); //지도 생성 및 객체 리턴
	
	var mapTypeControl = new kakao.maps.MapTypeControl();

	//지도에 컨트롤을 추가해야 지도위에 표시됩니다
	//kakao.maps.ControlPosition은 컨트롤이 표시될 위치를 정의하는데 TOPRIGHT는 오른쪽 위를 의미합니다
	map.addControl(mapTypeControl, kakao.maps.ControlPosition.TOPRIGHT);

	//지도 확대 축소를 제어할 수 있는  줌 컨트롤을 생성합니다
	var zoomControl = new kakao.maps.ZoomControl();
	map.addControl(zoomControl, kakao.maps.ControlPosition.RIGHT);
	
	var positions = new Array();
	for (var i =0; i < mapList.length; i++) {
		positions[i]={
	    	content: '<div>'+mapList[i].marketTbTitle+'</div>',
	    	latlng: new kakao.maps.LatLng(mapList[i].cmAddressTbLat, mapList[i].cmAddressTbLng),
	    	title: "market-read.do?marketTbNo="+mapList[i].marketTbNo
		}
		
		console.log(positions);
	}
	
	
	//이미지 지도에 표시할 마커입니다
	//이미지 지도에 표시할 마커를 아래와 같이 배열로 넣어주면 여러개의 마커를 표시할 수 있습니다 
	var imageSrc = "http://t1.daumcdn.net/localimg/localimages/07/mapapidoc/markerStar.png";

	for (let i = 0; i < positions.length; i ++) {
	    // 마커를 생성합니다
	    
	    var imageSize = new kakao.maps.Size(31, 35);
	    
	    var markerImage = new kakao.maps.MarkerImage(imageSrc, imageSize);
	    if(true) {
		    var marker = new kakao.maps.Marker({
		        map: map, // 마커를 표시할 지도
		        position: positions[i].latlng, // 마커의 위치
		        image: markerImage, //마커이미지 if(팝니다) image : markerImage	
		        title: positions[i].title //title값
		    });
	    }
	    if(false) {
		   	var marker = new kakao.maps.Marker({
		    	map: map, // 마커를 표시할 지도
		    	position: positions[i].latlng, // 마커의 위치
		    	title: positions[i].title //title값
		    });
	    }
	    
	    var infowindow = new kakao.maps.InfoWindow({
	        content: positions[i].content // 인포윈도우에 표시할 내용
	    });
	    
	    //title 값 나옴
	    console.log(positions[i].title);
	    
	    // for문에서 클로저를 만들어 주지 않으면 마지막 마커에만 이벤트가 등록됩니다
	    kakao.maps.event.addListener(marker, 'mouseover', makeOverListener(map, marker, infowindow));
	    kakao.maps.event.addListener(marker, 'mouseout', makeOutListener(infowindow));
	    kakao.maps.event.addListener(marker, 'click', function() {
	    	location.href=positions[i].title;
	    });
	}

	//인포윈도우를 표시하는 클로저를 만드는 함수입니다 
	function makeOverListener(map, marker, infowindow) {
	    return function() {
	        infowindow.open(map, marker);
	    };
	}

	//인포윈도우를 닫는 클로저를 만드는 함수입니다 
	function makeOutListener(infowindow) {
	    return function() {
	        infowindow.close();
	    };
	}
	
	
	//지도에 표시할 원을 생성합니다 당사자좌표
	
		if(selectValue == "1") {
			var circle = new kakao.maps.Circle({
			    center : new kakao.maps.LatLng(meLat, meLng),  // 원의 중심좌표 입니다 
			    radius: 500, // 미터 단위의 원의 반지름입니다 
			    strokeWeight: 5, // 선의 두께입니다 
			    strokeColor: '#75B8FA', // 선의 색깔입니다
			    strokeOpacity: 1, // 선의 불투명도 입니다 1에서 0 사이의 값이며 0에 가까울수록 투명합니다
			    strokeStyle: 'dashed', // 선의 스타일 입니다
			    fillColor: '#CFE7FF', // 채우기 색깔입니다
			    fillOpacity: 0.7  // 채우기 불투명도 입니다   
			}); 
			
		} else if(selectValue == "2") {
			var circle = new kakao.maps.Circle({
			    center : new kakao.maps.LatLng(meLat, meLng),  // 원의 중심좌표 입니다 
			    radius: 1000, // 미터 단위의 원의 반지름입니다 
			    strokeWeight: 5, // 선의 두께입니다 
			    strokeColor: '#75B8FA', // 선의 색깔입니다
			    strokeOpacity: 1, // 선의 불투명도 입니다 1에서 0 사이의 값이며 0에 가까울수록 투명합니다
			    strokeStyle: 'dashed', // 선의 스타일 입니다
			    fillColor: '#CFE7FF', // 채우기 색깔입니다
			    fillOpacity: 0.7  // 채우기 불투명도 입니다   
			}); 
			
		} else if(selectValue == "5") {
			var circle = new kakao.maps.Circle({
			    center : new kakao.maps.LatLng(meLat, meLng),  // 원의 중심좌표 입니다 
			    radius: 2500, // 미터 단위의 원의 반지름입니다 
			    strokeWeight: 5, // 선의 두께입니다 
			    strokeColor: '#75B8FA', // 선의 색깔입니다
			    strokeOpacity: 1, // 선의 불투명도 입니다 1에서 0 사이의 값이며 0에 가까울수록 투명합니다
			    strokeStyle: 'dashed', // 선의 스타일 입니다
			    fillColor: '#CFE7FF', // 채우기 색깔입니다
			    fillOpacity: 0.7  // 채우기 불투명도 입니다   

			  	//지도에 원을 표시합니다 
			  	
			}); 
		}
		
		circle.setMap(map); 
	

}


</script>
</body>
</html>

<jsp:include page="../include/footer.jsp" />