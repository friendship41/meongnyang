<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-09
  Time: 오후 6:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../include/header.jsp"/>


<!-- Start Bradcaump area -->
<div class="ht__bradcaump__area"
     style="background: rgba(0, 0, 0, 0) url(/resources/client/images/bg/checkout.jpg) no-repeat scroll center center / cover ;">
    <div class="ht__bradcaump__wrap">
        <div class="container">
            <div class="row">
                <div class="col-xs-12">
                    <div class="bradcaump__inner">
                        <nav class="bradcaump-inner">
                            <a class="breadcrumb-item" href="index.html">Home</a>
                            <span class="brd-separetor"><i class="zmdi zmdi-chevron-right"></i></span>
                            <span class="breadcrumb-item active">checkout</span>
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
            <div class="col-md-8">
                <div class="checkout__inner">
                    <div class="accordion-list">
                        <div class="accordion">
                            <div class="accordion__title">주소입력칸</div>
                            <div class="accordion__body">
                                <div class="bilinfo">
                                    <form action="#">
                                        <div class="row">
                                            <div class="col-md-12">
                                                <div class="single-input mt-0">
                                                    <select name="bil-country" id="bil-country">
                                                        <option value="select">주소선택</option>
                                                        <option value="arb">화과산</option>
                                                        <option value="ban">강남</option>
                                                        <option value="ind">인하대근처</option>
                                                        <option value="uk">United Kingdom</option>
                                                        <option value="usa">United States</option>
                                                    </select>
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="single-input">
                                                    <input type="text" placeholder="수령인">
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="single-input">
                                                    <input type="text" placeholder="주문자" readonly="">
                                                </div>
                                            </div>
                                            <div class="col-md-12">
                                                <div class="single-input">
                                                    <input type="text" placeholder="전화 번호">
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="single-input">
                                                    <input type="text" placeholder="우편번호" readonly="">
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="single-input">
                                                    <a class="checkout__purchase_a" href="">주소 찾기</a>
                                                </div>
                                            </div>
                                            <div class="col-md-12">
                                                <div class="single-input">
                                                    <input type="text" placeholder="주소1" readonly="">
                                                </div>
                                            </div>
                                            <div class="col-md-12">
                                                <div class="single-input">
                                                    <input type="text" placeholder="상세 주소">
                                                </div>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>

                        </div>

                    </div>
                </div>
                <div class="checkout__point">
                    포인트 : <input type="text"> 점<br><br>
                    사용할포인트 : <input type="text">점
                </div>
            </div>

            <div class="col-md-4">
                <div class="order-details">
                    <h5 class="order-details__title">금액</h5>
                    <div class="order-details__item">
                        <div class="single-item">
                            <div class="single-item__thumb">
                                <img src="../images/cart/1.png" alt="ordered item">
                            </div>
                            <div class="single-item__content">
                                <a href="#">사료</a>
                                <span class="price">128000원</span>
                            </div>
                            <div class="single-item__remove">
                                <a href="#"><i class="zmdi zmdi-delete"></i></a>
                            </div>
                        </div>
                        <div class="single-item">
                            <div class="single-item__thumb">
                                <img src="../images/cart/2.png" alt="ordered item">
                            </div>
                            <div class="single-item__content">
                                <a href="#">캣타워</a>
                                <span class="price">128000원</span>
                            </div>
                            <div class="single-item__remove">
                                <a href="#"><i class="zmdi zmdi-delete"></i></a>
                            </div>
                        </div>
                    </div>
                    <div class="order-details__count">
                        <div class="order-details__count__single">
                            <h5>금액</h5>
                            <span class="price">$909.00</span>
                        </div>
                        <div class="order-details__count__single">
                            <h5>할인액</h5>
                            <span class="price">$9.00</span>
                        </div>
                        <div class="order-details__count__single">
                            <h5>배송비</h5>
                            <span class="price">0</span>
                        </div>
                    </div>
                    <div class="ordre-details__total">
                        <h5>총금액</h5>
                        <span class="price">$918.00</span>
                    </div>
                    <div class="ordre-details__total">
                        <h5>포인트적립액</h5>
                        <span class="price">$918.00</span>
                    </div>
                    <div class="ordre-details__total_c">
                        <a class="checkout__purchase_a" href="market-form.html">결제하기</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- cart-main-area end -->
<!-- Start Brand Area -->
<div class="htc__brand__area bg__cat--4">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="ht__brand__inner">
                    <ul class="brand__list owl-carousel clearfix">
                        <li><a href="#"><img src="../images/brand/1.png" alt="brand images"></a></li>
                        <li><a href="#"><img src="../images/brand/2.png" alt="brand images"></a></li>
                        <li><a href="#"><img src="../images/brand/3.png" alt="brand images"></a></li>
                        <li><a href="#"><img src="../images/brand/4.png" alt="brand images"></a></li>
                        <li><a href="#"><img src="../images/brand/5.png" alt="brand images"></a></li>
                        <li><a href="#"><img src="../images/brand/5.png" alt="brand images"></a></li>
                        <li><a href="#"><img src="../images/brand/1.png" alt="brand images"></a></li>
                        <li><a href="#"><img src="../images/brand/2.png" alt="brand images"></a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- End Brand Area -->


<jsp:include page="../include/footer.jsp"/>