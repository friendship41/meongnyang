<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-09
  Time: 오후 6:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp"/>


<!-- Start Bradcaump area -->
<div class="ht__bradcaump__area" style="background: rgba(0, 0, 0, 0) url(/resources/client/images/bg/product-read.jpg) no-repeat scroll center center / cover ;">
    <div class="ht__bradcaump__wrap">
        <div class="container">
            <div class="row">
                <div class="col-xs-12">
                    <div class="bradcaump__inner">
                        <nav class="bradcaump-inner">
                            <a class="breadcrumb-item" href="index.html">Home</a>
                            <span class="brd-separetor"><i class="zmdi zmdi-chevron-right"></i></span>
                            <span class="breadcrumb-item active">상품 상세</span>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- End Bradcaump area -->
<!-- Start Product Details Area -->
<section class="htc__product__details bg__white ptb--100">
    <!-- Start Product Details Top -->
    <div class="htc__product__details__top">
        <div class="container">
            <div class="row">
                <div class="col-md-5 col-lg-5 col-sm-12 col-xs-12">
                    <div class="htc__product__details__tab__content">
                        <!-- Start Product Big Images -->
                        <div class="product__big__images">
                            <div class="portfolio-full-image tab-content">
                                <c:forEach var="singleImage" items="${imageList}">
                                    <c:if test="${singleImage.pdImageTbRepresentative eq 'Y'}">
                                        <div role="tabpanel" class="tab-pane fade in active" id="img-tab-${singleImage.pdImageTbNo}">
                                            <img src="${singleImage.pdImageTbPath}" alt="full-image" width="510" height="677">
                                        </div>
                                    </c:if>
                                    <c:if test="${singleImage.pdImageTbRepresentative eq 'N'}">
                                        <div role="tabpanel" class="tab-pane fade" id="img-tab-${singleImage.pdImageTbNo}">
                                            <img src="${singleImage.pdImageTbPath}" alt="full-image" width="510" height="677">
                                        </div>
                                    </c:if>
                                </c:forEach>
                            </div>
                        </div>
                        <!-- End Product Big Images -->
                        <!-- Start Small images -->
                        <ul class="product__small__images" role="tablist">
                            <c:forEach var="singleImage" items="${imageList}">
                                <c:if test="${singleImage.pdImageTbRepresentative eq 'Y'}">
                                    <li role="presentation" class="pot-small-img active">
                                        <a href="#img-tab-${singleImage.pdImageTbNo}" role="tab" data-toggle="tab">
                                            <img src="${singleImage.pdImageTbPath}" alt="small-image" width="80" height="106">
                                        </a>
                                    </li>
                                </c:if>
                                <c:if test="${singleImage.pdImageTbRepresentative eq 'N'}">
                                    <li role="presentation" class="pot-small-img">
                                        <a href="#img-tab-${singleImage.pdImageTbNo}" role="tab" data-toggle="tab">
                                            <img src="${singleImage.pdImageTbPath}" alt="small-image" width="80" height="106">
                                        </a>
                                    </li>
                                </c:if>
                            </c:forEach>
                        </ul>
                        <!-- End Small images -->
                    </div>
                </div>
                <div class="col-md-7 col-lg-7 col-sm-12 col-xs-12 smt-40 xmt-40">
                    <div class="ht__product__dtl">
                        <h2>상품명 : ${detail.productTbName}</h2>
                        <h6>평점 : ${detail.pdSaleTbRating}</h6>
                        <ul class="pro__prize">
                            <li class="old__prize">가격 : <span id="nowPrice">10000</span>원</li>
                            <li id="priceLi">할인가 : <span id="nowDiscount">8000</span>원</li>
                        </ul>
                        <div class="ht__pro__desc">
                            <div class="sin__desc align--left">
                                <p><span>옵션</span></p>
                                <select id="optionSelectBox" class="select__size">
                                    <c:forEach var="singleSale" items="${saleList}">
                                        <option value="${singleSale.pdSaleTbNo}">${singleSale.pdSaleTbSize}</option>
                                    </c:forEach>
                                </select>
                            </div>
                            <div class="sin__desc align--left">
                                <p><span>수량</span></p>&nbsp;&nbsp;
                                <input type="number" value="1" style="text-align: right; height: 20px;" min="1" max="99" id="ordersDetialTbAmount">
                            </div>
                            <div class="sin__desc align--left">
                                <ul class="shopping__btn">
                                    <li><a onclick="addCart()" style="cursor: pointer"> Add Cart </a></li>
                                    <li class="shp__checkout"><a href="checkout.html">Check Out</a></li>
                                </ul>
                            </div>
                            <div class="sin__desc product__share__link">
                                <p><span>공유하기</span></p>
                                <ul class="pro__share">
                                    <li><a href="#" target="_blank"><i class="icon-social-instagram icons"></i></a></li>
                                    <li><a href="#" target="_blank"><i class="icon-social-google icons"></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- End Product Details Top -->
</section>
<!-- End Product Details Area -->
<!-- Start Product Description -->
<section class="htc__produc__decription bg__white">
    <div class="container">
        <div class="row">
            <div class="col-xs-12">
                <!-- Start List And Grid View -->
                <ul class="pro__details__tab" role="tablist">
                    <li role="presentation" class="description active"><a href="#description" role="tab" data-toggle="tab">상품상세</a></li>
                    <li role="presentation" class="review"><a href="#review" role="tab" data-toggle="tab">review(2)</a></li>
                    <li role="presentation" class="shipping"><a href="#shipping" role="tab" data-toggle="tab">Q&A(2)</a></li>
                </ul>
                <!-- End List And Grid View -->
            </div>
        </div>
        <div class="row">
            <div class="col-xs-12">
                <div class="ht__pro__details__content">
                    <!-- Start Single Content -->
                    <div role="tabpanel" id="description" class="pro__single__content tab-pane fade in active">
                        <div class="pro__tab__content__inner">
                            <h4 class="ht__pro__title">상품 설명</h4>
                            <img src="${detail.productTbDetail}" alt="product-detail">
                        </div>
                    </div>
                    <!-- End Single Content -->
                    <!-- Start Single Content -->
                    <div role="tabpanel" id="review" class="pro__single__content tab-pane fade">
                        <div class="htc__comment__area">
                            <!-- Start comment Form -->
                            <div class="ht__comment__form">
                                <h4 class="title__line--5">Review 남기기</h4>
                                <div class="ht__comment__form__inner">
                                    <div class="comment__form">
                                        <input type="text" placeholder="Name *">
                                        <input type="email" placeholder="Email *">
                                        <div class="file__box preview-image">
                                            <input class="file__name" readonly="readonly" value="file">
                                            <label for="review-file">업로드</label>
                                            <input type="file" id="review-file" class="file-upload">
                                        </div>
                                    </div>
                                    <div class="comment__form message">
                                        <textarea name="message" placeholder="Your Comment"></textarea>
                                    </div>
                                </div>
                                <div class="ht__comment__btn--2 mt--30">
                                    <a class="fr__btn" href="#">Send</a>
                                </div>
                            </div>
                            <!-- End comment Form -->
                            <h4 class="title__line--5">총 2개의 리뷰가 있습니다.</h4>
                            <div class="ht__comment__content">
                                <!-- Start Single Comment -->
                                <div class="comment_c">
                                    <div class="comment__thumb">
                                        <img src="../images/comment/1.png" alt="comment images">
                                    </div>
                                    <div class="ht__comment__details">
                                        <div class="ht__comment__title">
                                            <h2><a href="#">JOHN NGUYEN</a></h2>
                                        </div>
                                        <span>July 15, 2016 at 2:39 am</span>
                                        <p>Exercitation photo booth stumptown tote bag Banksy, elit small batch freegan sed.</p>
                                    </div>
                                </div>
                                <!-- End Single Comment -->
                                <!-- Start Single Comment -->
                                <div class="comment">
                                    <div class="comment__thumb">
                                        <img src="../images/comment/3.png" alt="comment images">
                                    </div>
                                    <div class="ht__comment__details">
                                        <div class="ht__comment__title">
                                            <h2><a href="#">JOHN NGUYEN</a></h2>
                                        </div>
                                        <span>July 15, 2016 at 2:39 am</span>
                                        <p>Exercitation photo booth stumptown tote bag Banksy, elit small batch freegan sed.</p>
                                    </div>
                                </div>
                                <!-- End Single Comment -->
                                <!-- Start Pagenation -->
                                <div class="row">
                                    <div class="col-xs-12">
                                        <ul class="htc__pagenation">
                                            <li><a href="#"><i class="zmdi zmdi-chevron-left"></i></a></li>
                                            <li><a href="#">1</a></li>
                                            <li class="active"><a href="#">3</a></li>
                                            <li><a href="#">19</a></li>
                                            <li><a href="#"><i class="zmdi zmdi-chevron-right"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                                <!-- End Pagenation -->
                            </div>
                        </div>
                    </div>
                    <!-- End Single Content -->
                    <!-- Start Single Content -->
                    <div role="tabpanel" id="shipping" class="pro__single__content tab-pane fade">
                        <div class="pro__tab__content__inner">
                            <div class="wishlist-content">
                                <form action="#">
                                    <div class="wishlist-table table-responsive">
                                        <table>
                                            <thead>
                                            <tr>
                                                <th class="product-remove"><span class="nobr"> NO </span></th>
                                                <th class="product-name"><span class="nobr"> 제 목 </span></th>
                                                <th class="product-price"><span class="nobr"> 글쓴이 </span></th>
                                                <th class="product-stock-stauts"><span class="nobr"> 날짜 </span></th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <tr>
                                                <td class="product-remove"> 2 </td>
                                                <td class="product-name"><a href="#"><span class="badge badge-success">Q</span> 배송문의 </a></td>
                                                <td class="product-price"><span class="amount"> 고객2 </span></td>
                                                <td class="product-stock-status"><span class="wishlist-in-stock"> 20200125 </span></td>
                                            </tr>
                                            <tr>
                                                <td class="product-remove"> 1 </td>
                                                <td class="product-name"><a href="#"><span class="badge badge-warning">A</span> 구매문의 </a></td>
                                                <td class="product-price"><span class="amount"> 고객1 </span></td>
                                                <td class="product-stock-status"><span class="wishlist-in-stock"> 20200125 </span></td>
                                            </tr>
                                            </tbody>
                                        </table>
                                        <input type="button" class="qna-write-btn" value="글쓰기" onclick="javascript:location.href='../community/qna-form.html'">
                                    </div>
                                </form>
                                <!-- Start Pagenation -->
                                <div class="row">
                                    <div class="col-xs-12">
                                        <ul class="htc__pagenation">
                                            <li><a href="#"><i class="zmdi zmdi-chevron-left"></i></a></li>
                                            <li><a href="#">1</a></li>
                                            <li class="active"><a href="#">3</a></li>
                                            <li><a href="#">19</a></li>
                                            <li><a href="#"><i class="zmdi zmdi-chevron-right"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                                <!-- End Pagenation -->
                            </div>
                        </div>
                    </div>
                    <!-- End Single Content -->
                </div>
            </div>
        </div>
    </div>
</section>
<!-- End Product Description -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
    $(document).ready(function () {
        var normalPrice = "${saleList.get(0).pdSaleTbSalesPrice}";
        var discount = "${saleList.get(0).pdSaleTbDiscountRate}";
        setPrice(normalPrice,discount);
        $("#optionSelectBox").change(function () {
            var opNo = $("#optionSelectBox option:selected").val();
            var optionMap = getOptionMap();
            var nP = optionMap.get(opNo)[0];
            var discount = optionMap.get(opNo)[1];
            setPrice(nP,discount);
        })
    });

    function getOptionMap() {
        var optionMap = new Map();
        <c:forEach var="sale" items="${saleList}">
            optionMap.set("${sale.pdSaleTbNo}",["${sale.pdSaleTbSalesPrice}","${sale.pdSaleTbDiscountRate}"]);
        </c:forEach>
        return optionMap;
    }

    function setPrice(normalPrice, discount) {
        normalPrice *= 1;
        discount *= 1;
        var finalPrice = normalPrice*((100-discount)/100);
        $("#nowPrice").text(normalPrice);
        if(finalPrice !== normalPrice)
        {
            finalPrice /= 10;
            finalPrice = Math.floor(finalPrice);
            finalPrice *= 10;
            $("#priceLi").html("할인가 : <span id=\"nowDiscount\">"+finalPrice+"</span>원");
        }
        else
        {
            $("#priceLi").html("<span id=\"nowDiscount\"></span>");
        }
    }

    function addCart() {
        var params ="?pdSaleTbSalesPrice=";

        var amount = $("#ordersDetialTbAmount").val();
        amount *= 1;

        var normalPrice = $("#nowPrice").text();
        var discountPrice = $("#nowDiscount").text();
        if(discountPrice == null || discountPrice === '')
        {
            normalPrice *= amount;
            params += normalPrice;
        }
        else
        {
            discountPrice *= amount;
            params += discountPrice;
        }

        var opText = $("#optionSelectBox option:selected").text();
        params += "&pdSaleTbProductName=";
        params += "${detail.productTbName}-";
        params += opText;
        params += "&ordersDetialTbAmount=";
        params += amount;
        params += "&cartImage=";
        params += '${imageList.get(0).pdImageTbPath}';
        params += '&productTbCode=';
        params += '${detail.productTbCode}';
        params += '&pdSaleTbNo=';
        params += $("#optionSelectBox option:selected").val();

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

<jsp:include page="../include/footer.jsp"/>