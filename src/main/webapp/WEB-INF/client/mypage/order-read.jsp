<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:include page="../include/header.jsp" />
        <!-- Start Bradcaump area -->
        <div class="ht__bradcaump__area" style="background: rgba(0, 0, 0, 0) url(resources/client/images/bg/order-read.jpg) no-repeat scroll center center / cover ;">
            <div class="ht__bradcaump__wrap">
                <div class="container">
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="bradcaump__inner">
                                <nav class="bradcaump-inner">
                                    <a class="breadcrumb-item" href="../index.html">Home</a>
                                    <span class="brd-separetor"><i class="zmdi zmdi-chevron-right"></i></span>
                                    <a class="breadcrumb-item" href="../mypage/order-list.html">My Page</a>
                                    <span class="brd-separetor"><i class="zmdi zmdi-chevron-right"></i></span>
                                    <a class="breadcrumb-item" href="../mypage/order-list.html">주문내역</a>
                                    <span class="brd-separetor"><i class="zmdi zmdi-chevron-right"></i></span>
                                    <span class="breadcrumb-item active">주문상세</span>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- End Bradcaump area -->
        <!-- cart-main-area start -->
        <div class="checkout-wrap ptb--100">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3">
                        <div class="htc__product__leftsidebar">
                            <div class="htc__category">
                                <h4 class="title__line--4">My Page</h4>
                                <ul class="ht__cat__list">
                                    <li><a href="#">주문내역</a></li>
                                    <li><a href="/wishlistSelect.do">wishlist</a></li>
                                    <li><a href="#">내정보</a></li>
                                    <li><a href="#">Logout</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-9">
                        <div class="order-details">
                            <h5 class="order-details__title_big">주문 상세</h5>
                            <div class="order-details__item">
                                <div class="single-item">
                                    <div class="single-item__thumb">
                                        <img src="../images/cart/1.png" alt="ordered item">
                                    </div>
                                    <div class="single-item__content">
                                        <a href="#">Vue.js 2 Cookbook</a>
                                        <span class="price">35000 원</span>
                                    </div>
                                </div>
                                <div class="single-item">
                                    <div class="single-item__thumb">
                                        <img src="../images/cart/2.png" alt="ordered item">
                                    </div>
                                    <div class="single-item__content">
                                        <a href="#">미움받을 용기</a>
                                        <span class="price">25000 원</span>
                                    </div>
                                </div>
                            </div>
                            <div class="order-details__count">
                                <div class="order-details__count__single">
                                    <h5>소 계</h5>
                                    <span class="price">60000 원</span>
                                </div>
                                <div class="order-details__count__single">
                                    <h5>할인</h5>
                                    <span class="price">8000 원</span>
                                </div>
                                <div class="order-details__count__single">
                                    <h5>배송비</h5>
                                    <span class="price">3000 원</span>
                                </div>
                            </div>
                            <div class="ordre-details__total">
                                <h5>총 계</h5>
                                <span class="price">55000 원</span>
                            </div>
                            <div class="ordre-details__total1">
                                <h5>Address</h5>
                                <span class="price">경기도 수원시 팔달구 우만동 522-1 202호</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- cart-main-area end -->
<jsp:include page="../include/footer.jsp" />