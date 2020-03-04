<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="../include/header.jsp" />
        <!-- Start Bradcaump area -->
        <div class="ht__bradcaump__area" style="background: rgba(0, 0, 0, 0) url(/resources/client/images/bg/order-read.jpg) no-repeat scroll center center / cover ;">
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
                                    <li><a href="/orderList.do">주문내역</a></li>
                                    <li><a href="/wishlistSelect.do">wishlist</a></li>
                                    <li><a href="/myinfo.do">내정보</a></li>
                                    <li><a href="/logout.do">Logout</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-9">
                        <div class="order-details">
                            <h5 class="order-details__title_big">주문 상세</h5>
                            <div class="order-details__item">
                            <c:set var="sumPrice" value="0"/>
                            <c:forEach items="${detailList}" var="detail">
                                <div class="single-item">
                                    <div class="single-item__thumb">
                                        <img src="${detail.pdImageTbPath}" alt="ordered item" width="58px" height="70">
                                    </div>
                                    <div class="single-item__content">
                                        <a href="#">${detail.pdSaleTbProductName}</a>
                                        <span class="price"><fmt:formatNumber value="${detail.ordersDetailTbPrice}"/> 원</span>
                                        <c:set var="sumPrice" value="${sumPrice + detail.ordersDetailTbPrice}" />
                                    </div>
                                </div>
                            </c:forEach>
                            <c:out value="sumPrice" />                                                  
                            </div>
                            <div class="order-details__count">
                                <div class="order-details__count__single">
                                    <h5>소 계</h5>
                                    <span class="price"><fmt:formatNumber value="${sumPrice}"/> 원</span>
                                </div>
                                <div class="order-details__count__single">
                                    <h5>사용 포인트</h5>
                                    <span class="price"><fmt:formatNumber value="${order.pdOrderTbUsedPoint }"/> 원</span>
                                </div>
                                <div class="order-details__count__single">
                                    <h5>배송비</h5>
                                    <span class="price"><fmt:formatNumber value="${order.pdOrderTbDeliveryFee }"/> 원</span>
                                </div>
                            </div>
                            <div class="ordre-details__total">
                                <h5>결제 금액</h5>
                                <span class="price"><fmt:formatNumber value="${order.pdOrderTbPayment }"/> 원</span>
                            </div>
                            <div class="ordre-details__total1">
                                <h5>Address</h5>
                                <span class="price">${order.pdOrderTbAddress}</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <h5>수령인</h5>
                                <span class="price">${order.pdOrderTbReceiver}</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- cart-main-area end -->
<jsp:include page="../include/footer.jsp" />