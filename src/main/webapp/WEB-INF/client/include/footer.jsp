<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Start Footer Area -->
<footer id="htc__footer">
    <!-- Start Footer Widget -->
    <div class="footer__container bg__cat--1">
        <div class="container">
            <div class="row">
                <!-- Start Single Footer Widget -->
                <div class="col-md-12">
                    <div class="footer">
                        <div class="ft__details" style="float:left; width: 33%;">
                        		<h2 class="title__line--2">ABOUT US</h2>
                        		<p>(주)오늘뭐멍냥</p>
                            	<p>주소 : 서울 종로구 돈화문로 26</p>
                            	<p>영업시간 : 영업 시간은 평일 10시 ~ 6시</p>
                            	<p>계좌 : 110 - 353 - 032123 신한</p>
                            	<p>사업자번호/대표자명 : 815-81-12355 / 서은영</p>
                        </div>
                        <div class="ft__details" style="float:left; width: 40%;">
                        		 <h2 class="title__line--2">고객센터</h2>
								<p>주소 : 주소 : 서울 종로구 돈화문로 26</p>
								<p>Tel : 123-123</p>
								<p>E-mail : moengnyang@naver.com</p>
								<p>대표자명 : 김철수</p>
                        </div>
                        <div class="ft__details" style="float:right; width: 20%;">
                        		<h2 class="title__line--2">전자금융거래분쟁담당</h2>
								<p>주소 : 서울 종로구 돈화문로 26</p>
								<p>Tel : 123-123</p>
								<p>E-mail : moengnyang@naver.com</p>
								<p>대표자명 : 김민희</p>
                        </div>
                    </div>
                </div>
                <!-- End Single Footer Widget -->
            </div>
        </div>
    </div>
    <!-- End Footer Widget -->
</footer>
<!-- End Footer Style -->
</div>
<!-- Body main wrapper end -->

<!-- Placed js at the end of the document so the pages load faster -->

<!-- jquery latest version -->
<script src="<c:url value='/resources/client/js/vendor/jquery-3.2.1.min.js'/>"></script>
<!-- Bootstrap framework js -->
<script src="<c:url value='/resources/client/js/bootstrap.min.js'/>"></script>
<!-- All js plugins included in this file. -->
<script src="<c:url value='/resources/client/js/plugins.js'/>"></script>
<script src="<c:url value='/resources/client/js/slick.min.js'/>"></script>
<script src="<c:url value='/resources/client/js/owl.carousel.min.js'/>"></script>
<!-- Waypoints.min.js. -->
<script src="<c:url value='/resources/client/js/waypoints.min.js'/>"></script>
<!-- Main js file that contents all jQuery plugins activation. -->
<script src="<c:url value='/resources/client/js/main.js'/>"></script>
<!-- review image 추가 js -->
<script src="<c:url value='/resources/client/js/review.js'/>"></script>

<script src="<c:url value='/resources/client/js/easyResponsiveTabs.js'/>" type="text/javascript"></script>
<script src="//developers.kakao.com/sdk/js/kakao.min.js"></script>
<script type="text/javascript">

    $(document).ready(function () {
        $('#horizontalTab').easyResponsiveTabs({
            type: 'default', //Types: default, vertical, accordion
            width: 'auto', //auto or any width like 600px
            fit: true   // 100% fit in a container
        });
    });

    function removeCartItem(itemId) {
        var ajaxUrl = "/removeCartAjax.do?productTbCode="+itemId;
        $.ajax({
            url: ajaxUrl,
            type: "GET",
            data: {},
            dataType: "json"
        })
            .done(function(json) {
                var item = "pCart-"+itemId
                document.getElementById(item).remove();
                var subtotal = $("#cartSubtotal").val();
                subtotal *= 1;
                var newItemPrice = json.pdSaleTbSalesPrice;
                newItemPrice *= 1;
                subtotal -= newItemPrice;
                $("#cartSubtotal").val(subtotal);
                $("#cartSubtotal").text(subtotal+"원");

                var nowSize = $("#cartListSize").text();
                nowSize *= 1;
                nowSize -= 1;
                $("#cartListSize").text(nowSize);
            })
            .fail(function (xhr, status, errorThrown) {
                alert(errorThrown);
            });
    }
    Kakao.init('56d66fb708db72842c6c188e866a48f7');
    function kakaoChat() {
        Kakao.Channel.chat({
            channelPublicId: '_hNrsxb'
        });
    }



    function addCart(productTbCode, pSize) {
        var params ="?pdSaleTbSalesPrice=";

        var amount = 1;

        var normalPrice = "nowPrice-"+productTbCode;
        var discountPrice = "nowDiscount-"+productTbCode;
        var nowPrice = document.getElementById(normalPrice).innerText;
        var nowDiscount = document.getElementById(discountPrice).innerText;
        nowPrice = nowPrice.substring(0, nowPrice.length-1);
        console.log(nowDiscount);
        if(nowDiscount == null || nowDiscount === '' || nowDiscount == 0 || nowDiscount === '0')
        {
            params += nowPrice;
        }
        else
        {
            nowDiscount = nowDiscount.substring(0, nowDiscount.length-1);
            params += nowDiscount;
        }

        var name = document.getElementById("productName-"+productTbCode).innerText;
        params += "&pdSaleTbProductName=";
        params += (name+"-");
        params += pSize;
        params += "&ordersDetialTbAmount=";
        params += amount;
        params += "&cartImage=";
        var imgPath = document.getElementById("productImg-"+productTbCode).getAttribute("src");
        params += imgPath;
        params += '&productTbCode=';
        params += productTbCode;

        var psNo = document.getElementById("psNo-"+productTbCode).value;
        params += '&pdSaleTbNo=';
        params += psNo;


        var ajaxUrl = "addCartAjax.do"+params;

        $.ajax({
            url: ajaxUrl,
            type: "GET",
            data: {},
            dataType: "json"
        })
            .done(function(json) {
                console.log(json);

                var cartItemHTML = '<div class="shp__single__product" id="pCart-'+json.productTbCode+'">\n' +
                    '                        <div class="shp__pro__thumb">\n' +
                    '                            <a href="shoppingDetail.do?productTbCode='+json.productTbCode+'">\n' +
                    '                                <img src="'+json.cartImage+'" alt="product images" width="99" height="119">\n' +
                    '                            </a>\n' +
                    '                        </div>\n' +
                    '                        <div class="shp__pro__details">\n' +
                    '                            <h2><a href="shoppingDetail.do?productTbCode='+json.productTbCode+'">'+json.pdSaleTbProductName+'</a></h2>\n' +
                    '                            <span class="quantity">수량: '+json.ordersDetialTbAmount+'</span>\n' +
                    '                            <span class="shp__price">'+json.pdSaleTbSalesPrice+'원</span>\n' +
                    '                        </div>\n' +
                    '                        <div class="remove__btn">\n' +
                    '                            <a onclick="removeCartItem(\''+json.productTbCode+'\')" title="Remove this item"><i class="zmdi zmdi-close"></i></a>\n' +
                    '                        </div>\n' +
                    '                    </div>';

                $("#cartWrapDiv").prepend(cartItemHTML);
                var subtotal = $("#cartSubtotal").val();
                subtotal *= 1;
                var newItemPrice = json.pdSaleTbSalesPrice;
                newItemPrice *= 1;
                subtotal += newItemPrice;
                $("#cartSubtotal").val(subtotal);
                $("#cartSubtotal").text(subtotal+"원");

                var nowSize = $("#cartListSize").text();
                nowSize *= 1;
                nowSize += 1;
                $("#cartListSize").text(nowSize);

                alert("상품이 카트에 추가되었습니다.");
            })
            .fail(function (xhr, status, errorThrown) {
                alert(errorThrown);
            });
    }
</script>


</body>

</html>