<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="include/header.jsp"/>

<!-- Start Slider Area -->
<div class="slider__container slider--one bg__cat--3">
    <div class="slide__container slider__activation__wrap owl-carousel">
        <!-- Start Single Slide -->
        <c:forEach var="banner" items="${bannerList}">
            <div class="single__slide animation__style01 slider__fixed--height">
                <div class="container">
                    <div class="row align-items__center">
                        <div class="col-md-7 col-sm-7 col-xs-12 col-lg-6">
                            <div class="slide">
                                <div class="slider__inner">
                                    <h1>${banner.productTbName}</h1>
                                    <div class="cr__btn">
                                        <a href="shoppingDetail.do?productTbCode=${banner.productTbCode}">쇼핑하러가기</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6 col-sm-5 col-xs-12 col-md-5">
                            <div class="slide__thumb">
                                <img src="${banner.pdImageTbPath}" alt="slider images">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>
        <!-- End Single Slide -->
    </div>
</div>
<!-- Start Slider Area -->

<!-- Start Category Area -->
<section class="htc__category__area ptb--100">
    <div class="container">
        <div class="row">
            <div class="col-xs-12">
                <div class="section__title--2 text-center">
                    <h2 class="title__line">New Arrivals</h2>
                    <p>신제품들 입니다</p>
                </div>
            </div>
        </div>
        <div class="htc__product__container">
            <div class="row">
                <div class="product__list clearfix mt--30">
                    <c:forEach var="newArrival" items="${newArrivalsList}">
                        <input type="hidden" id="psNo-${newArrival.productTbCode}" value="${newArrival.pdSaleTbNo}">
                        <!-- Start Single Category -->
                        <div class="col-md-4 col-lg-3 col-sm-4 col-xs-12">
                            <div class="category">
                                <div class="ht__cat__thumb">
                                    <a href="shoppingDetail.do?productTbCode=${newArrival.productTbCode}">
                                        <img src="${newArrival.pdImageTbPath}" id="productImg-${newArrival.productTbCode}" alt="product images" width="290px" height="385px">
                                    </a>
                                </div>
                                <div class="fr__hover__info">
                                    <ul class="product__action">
                                        <c:if test="${sessionScope.customer ne null}">
                                            <li><a href="wishlistInsert.do?pdSaleTbSize=${newArrival.pdSaleTbSize}&productTbCode=${newArrival.productTbCode}&pdImageTbPath=${newArrival.pdImageTbPath}"><i class="icon-heart icons"></i></a></li>
                                        </c:if>
                                        <c:if test="${sessionScope.customer eq null}">
                                            <li><a href="void(0);" onclick="alert('로그인한 회원만 이용할 수 있습니다.');return false;"><i class="icon-heart icons"></i></a></li>
                                        </c:if>
                                        <li><a onclick="addCart('${newArrival.productTbCode}', '${newArrival.pdSaleTbSize}')" style="cursor: pointer"><i class="icon-handbag icons"></i></a></li>
                                    </ul>
                                </div>
                                <div class="fr__product__inner">
                                    <h4><a href="shoppingDetail.do?productTbCode=${newArrival.productTbCode}" id="productName-${newArrival.productTbCode}">${newArrival.productTbName}</a></h4>
                                    <ul class="fr__pro__prize">
                                        <c:if test="${newArrival.pdSaleTbDiscountRate eq 0}">
                                            <li id="nowPrice-${newArrival.productTbCode}">${newArrival.pdSaleTbSalesPrice}원</li>
                                            <li id="nowDiscount-${newArrival.productTbCode}"></li>
                                        </c:if>
                                        <c:if test="${newArrival.pdSaleTbDiscountRate ne 0}">
                                            <li class="old__prize" id="nowPrice-${newArrival.productTbCode}">${newArrival.pdSaleTbSalesPrice}원</li>
                                            <li id="nowDiscount-${newArrival.productTbCode}">${newArrival.pdSaleTbDiscountRate}원</li>
                                        </c:if>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <!-- End Single Category -->
                    </c:forEach>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- End Category Area -->


<section class="ftr__product__area ptb--100">
    <div class="container">
        <div class="row">
            <div class="col-xs-12">
                <div class="section__title--2 text-center">
                    <h2 class="title__line">Best Seller</h2>
                    <p>오늘뭐멍냥의 베스트 셀러 제품입니다.</p>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="product__wrap clearfix">
                <c:forEach var="bestSeller" items="${bestSellerList}">
                    <input type="hidden" id="psNo-${bestSeller.productTbCode}" value="${bestSeller.pdSaleTbNo}">
                    <!-- Start Single Category -->
                    <div class="col-md-4 col-lg-3 col-sm-4 col-xs-12">
                        <div class="category">
                            <div class="ht__cat__thumb">
                                <a href="shoppingDetail.do?productTbCode=${bestSeller.productTbCode}">
                                    <img src="${bestSeller.pdImageTbPath}" id="productImg-${bestSeller.productTbCode}" alt="product images" width="290px" height="385px">
                                </a>
                            </div>
                            <div class="fr__hover__info">
                                <ul class="product__action">
                                    <c:if test="${sessionScope.customer ne null}">
                                        <li><a href="wishlistInsert.do?pdSaleTbSize=${bestSeller.pdSaleTbSize}&productTbCode=${bestSeller.productTbCode}&pdImageTbPath=${bestSeller.pdImageTbPath}"><i class="icon-heart icons"></i></a></li>
                                    </c:if>
                                    <c:if test="${sessionScope.customer eq null}">
                                        <li><a href="void(0);" onclick="alert('로그인한 회원만 이용할 수 있습니다.');return false;"><i class="icon-heart icons"></i></a></li>
                                    </c:if>
                                    <li><a onclick="addCart('${bestSeller.productTbCode}', '${bestSeller.pdSaleTbSize}')" style="cursor: pointer"><i class="icon-handbag icons"></i></a></li>
                                </ul>
                            </div>
                            <div class="fr__product__inner">
                                <h4><a href="shoppingDetail.do?productTbCode=${bestSeller.productTbCode}" id="productName-${bestSeller.productTbCode}">${bestSeller.productTbName}</a></h4>
                                <ul class="fr__pro__prize">
                                    <c:if test="${bestSeller.pdSaleTbDiscountRate eq 0}">
                                        <li id="nowPrice-${bestSeller.productTbCode}">${bestSeller.pdSaleTbSalesPrice}원</li>
                                        <li id="nowDiscount-${bestSeller.productTbCode}"></li>
                                    </c:if>
                                    <c:if test="${bestSeller.pdSaleTbDiscountRate ne 0}">
                                        <li class="old__prize" id="nowPrice-${bestSeller.productTbCode}">${bestSeller.pdSaleTbSalesPrice}원</li>
                                        <li id="nowDiscount-${bestSeller.productTbCode}">${bestSeller.pdSaleTbDiscountRate}원</li>
                                    </c:if>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <!-- End Single Category -->
                </c:forEach>
            </div>
        </div>
    </div>
</section>
<!-- End Product Area 8개수정 -->


<!-- Start Blog Area -->
<section class="htc__blog__area bg__white ptb--100">
    <div class="container">
        <div class="row">
            <div class="col-xs-12">
                <div class="section__title--2 text-center">
                    <h2 class="title__line">Market</h2>
                    <p>중고거래 최근 게시글입니다.</p>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="ht__blog__wrap clearfix">
                <c:forEach var="market" items="${marketList}">
                    <!-- Start Single Blog -->
                    <div class="col-md-6 col-lg-4 col-sm-6 col-xs-12">
                        <div class="blog">
                            <c:if test="${market.marketTbImgPath == null}">
                                <div class="blog__thumb">
                                    <a href="/market-read.do?marketTbNo=${market.marketTbNo}">
                                        <img src="/resources/image/market/unnamed.png" alt="maket images"
                                             width="400" height="287">
                                    </a>
                                </div>
                            </c:if>
                            <c:if test="${market.marketTbImgPath != null}">
                                <div class="blog__thumb">
                                    <a href="/market-read.do?marketTbNo=${market.marketTbNo}">
                                        <img src="${market.marketTbImgPath}" alt="maket images"
                                             width="400" height="287">
                                    </a>
                                </div>
                            </c:if>
                            <div class="blog__details">
                                <div class="bl__date">
                                    <span>${market.marketTbRegDate}</span>
                                </div>
                                <h2>
                                    <a href="/market-read.do?marketTbNo=${market.marketTbNo}">${market.marketTbTitle}</a>
                                </h2>
                                <div class="blog__btn">
                                    <a href="/market-read.do?marketTbNo=${market.marketTbNo}">더보기</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- End Single Blog -->
                </c:forEach>
            </div>
        </div>
    </div>
</section>
<!-- End Blog Area -->
<!-- End Banner Area -->
<c:choose>
<c:when test="${emailSend eq true}">
<script type="text/javascript"> 
	alert("이메일 발송이 완료되었습니다.");
</script>
</c:when>
<c:when test="${emailCertification eq true}">
<script type="text/javascript"> 
	alert("이메일 인증이 완료되었습니다. 로그인을 해주세요.");
</script>
</c:when>

</c:choose>

<jsp:include page="include/footer.jsp"></jsp:include>