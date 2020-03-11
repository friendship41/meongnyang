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
<div style="float:left; width: 20%;  margin-left:50px;">
<select class="ht__select" id="selectBox" name="cmAddressTbNo" style="width:130px;height:50px;">
          		<option id="addOption" value="thisIsSelect">선택하세요</option>
          <c:forEach var="address" items="${addressList }">
          		<option value="${address.cmAddressTbNo }">${address.cmAddressTbNickname }</option>
          </c:forEach>
</select>
<br><br><br>
<select class="ht__select" id="select" style="width:130px;height:50px;">
          		<option value="select">반경을 선택하세요</option>
         		<option value="1">1KM</option>	
          		<option value="2">2KM</option>
				<option value="5">5KM</option>
</select>
<br><br><br>
<br><br>
<fieldset style="width:100px; border:1px;">
<legend>범례</legend>
	<label for="buy">삽니다</label>
	<img src="http://i1.daumcdn.net/dmaps/apis/n_local_blit_04.png">
	<label for="sale">팝니다</label>
	<img src="http://t1.daumcdn.net/localimg/localimages/07/mapapidoc/markerStar.png">
</fieldset>
</div>
<div id="map" style="width:600px;height:500px; width: 60%;"></div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=6909f7ffa42194d19411603d190716fa&libraries=services"></script>
<script>

var container = document.getElementById('map'); //지도를 담을 영역의 DOM 레퍼런스

var meLat;
var meLng;
var mapList = new Array();

<c:forEach items="${mapList}" var="mapList">
	var obj = new Object();
	obj.customerTbNo = "${mapList.customerTbNo}";
	obj.marketTbNo = "${mapList.marketTbNo}";
	obj.marketTbTitle = "${mapList.marketTbTitle}";
	obj.marketTbSellOrBuy = "${mapList.marketTbSellOrBuy}";
	obj.cmAddressTbNo = "${mapList.cmAddressTbNo}";
	obj.cmAddressTbLat = "${mapList.cmAddressTbLat}";
	obj.cmAddressTbLng = "${mapList.cmAddressTbLng}";
	mapList.push(obj);
</c:forEach>

$(document).ready(function () {
	

    $("#select").hide(); 	
	
	$("#selectBox").change(function () {
   	 var selectedValue = $("#selectBox option:selected").val();
        
   	if(selectedValue == 'thisIsSelect') 
   		{
   			console.log(selectedValue);
   			$("#select").hide();
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
                  meLat = json.cmAddressTbLat;
                  meLng = json.cmAddressTbLng;
                  $("#select").show();
               })
               .fail(function (xhr, status, errorThrown) {
                   alert(errorThrown);
               });
   		}
       		});

});
	
$("#select").change(function() {
	var selectValue = $("#select").val();
	var selectBox = $("#selectBox").val();
	if(selectBox == 'thisIsSelect') {
		alert("본인의 주소를 먼저 선택해주세요.");
		$("#select").attr("value", "select");
	} else {
		mapLevel(selectValue);
	}
	
});


    

function mapLevel(selectValue) {
	if(selectValue == "1") {
		var options = { //지도를 생성할 때 필요한 기본 옵션
				
				center: new kakao.maps.LatLng(meLat, meLng),
				level: 4   	
					
			};
		
	} else if(selectValue == "2") {
		var options = { //지도를 생성할 때 필요한 기본 옵션
				
				center: new kakao.maps.LatLng(meLat, meLng),
				level: 5    
			
			};
		
	} else if(selectValue == "5") {
		var options = { //지도를 생성할 때 필요한 기본 옵션
				
				center: new kakao.maps.LatLng(meLat, meLng),
				level: 6   	
				
			};
	}
	var map = new kakao.maps.Map(container, options); //지도 생성 및 객체 리턴
	
	// 마커가 표시될 위치입니다 
	var markerPosition  = new kakao.maps.LatLng(meLat, meLng); 
	// 마커를 생성합니다
	var marker2 = new kakao.maps.Marker({
	    position: markerPosition,
	});
	// 마커가 지도 위에 표시되도록 설정합니다
	marker2.setMap(map);
	
	var iwContent = '<div>나 </div>', 
    iwPosition = new kakao.maps.LatLng(meLat, meLng); //인포윈도우 표시 위치입니다
		// 인포윈도우를 생성합니다
	var infowindow = new kakao.maps.InfoWindow({
    	position : iwPosition, 
    	content : iwContent 
	});
  
	// 마커 위에 인포윈도우를 표시합니다. 두번째 파라미터인 marker를 넣어주지 않으면 지도 위에 표시됩니다
	infowindow.open(map, marker2); 
	
	
	var mapTypeControl = new kakao.maps.MapTypeControl();

	//지도에 컨트롤을 추가해야 지도위에 표시됩니다
	//kakao.maps.ControlPosition은 컨트롤이 표시될 위치를 정의하는데 TOPRIGHT는 오른쪽 위를 의미합니다
	map.addControl(mapTypeControl, kakao.maps.ControlPosition.TOPRIGHT);

	//지도 확대 축소를 제어할 수 있는  줌 컨트롤을 생성합니다
	var zoomControl = new kakao.maps.ZoomControl();
	map.addControl(zoomControl, kakao.maps.ControlPosition.RIGHT);
	
	
	var positions = new Array();
	for (let i =0; i < mapList.length; i++) {
			var obj2 = new Object();
	    	obj2.content= '<div>'+mapList[i].marketTbTitle+'</div>';
	    	obj2.latlng= new kakao.maps.LatLng(mapList[i].cmAddressTbLat, mapList[i].cmAddressTbLng);
	    	obj2.title= "market-read.do?marketTbNo="+mapList[i].marketTbNo;
	    	
	    	
	    	positions.push(obj2);
			console.log(positions);
			
	}
	
	
	//이미지 지도에 표시할 마커입니다
	//이미지 지도에 표시할 마커를 아래와 같이 배열로 넣어주면 여러개의 마커를 표시할 수 있습니다 
	var imageSrc = "http://t1.daumcdn.net/localimg/localimages/07/mapapidoc/markerStar.png";
	var imageSrc2 = "http://i1.daumcdn.net/dmaps/apis/n_local_blit_04.png";
	for (let i = 0; i < positions.length; i ++) {
	    // 마커를 생성합니다
	    
	    var imageSize = new kakao.maps.Size(31, 35);
	   
	    var markerImage = new kakao.maps.MarkerImage(imageSrc, imageSize);
	    var markerImage2 = new kakao.maps.MarkerImage(imageSrc2, imageSize);
	    if(mapList[i].marketTbSellOrBuy == "S") {
		    var marker = new kakao.maps.Marker({
		        map: map, // 마커를 표시할 지도
		        position: positions[i].latlng, 
		        image: markerImage, 
		        title: positions[i].title 
		    });
	    }
	    
	    else if(mapList[i].marketTbSellOrBuy == "B") {
		   	var marker = new kakao.maps.Marker({
		    	map: map, 
		    	position: positions[i].latlng,
		    	image: markerImage2,
		    	title: positions[i].title 
		    });
	    }
	    
	    var infowindow = new kakao.maps.InfoWindow({
	        content: positions[i].content // 인포윈도우에 표시할 내용
	    });
	    
	    
	    
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