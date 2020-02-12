<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="../include/header.jsp"/>
        <!-- Start Bradcaump area -->
        <div class="ht__bradcaump__area" style="background: rgba(0, 0, 0, 0) url(resources/client/images/bg/order-list.jpg) no-repeat scroll center center / cover ;">
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
                                    <span class="breadcrumb-item active">주문내역</span>
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
                                    <li><a href="#">wishlist</a></li>
                                    <li><a href="#">내정보</a></li>
                                    <li><a href="#">Logout</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-9">
                        <div class="wishlist-content">
                            <form action="#">
                                <div class="wishlist-table table-responsive">
                                    <table>
                                        <thead>
                                        <tr>
                                            <th class="product-remove"><span class="nobr">주문번호</span></th>
                                            <th class="product-name"><span class="nobr">주문상품</span></th>
                                            <th class="product-price"><span class="nobr">지불가격</span></th>
                                            <th class="product-stock-stauts"><span class="nobr">상태</span></th>
                                            <th class="product-add-to-cart"><span class="nobr">기타</span></th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td class="product-remove"><a href="#">4</a></td>
                                            <td class="product-name"><a href="#">초코하임 외 2건</a></td>
                                            <td class="product-price"><span class="amount">15000 원</span></td>
                                            <td class="product-stock-status"><span class="badge badge-cancel">취소됨</span></td>
                                            <td class="product-add-to-cart"></td>
                                        </tr>
                                        <tr>
                                            <td class="product-remove"><a href="#">3</a></td>
                                            <td class="product-name"><a href="#">Vue.js 2 Cookbook 외 1건</a></td>
                                            <td class="product-price"><span class="amount">55000 원</span></td>
                                            <td class="product-stock-status"><span class="badge badge-complete">배송완료</span></td>
                                            <td class="product-add-to-cart"><a href="#">리뷰작성</a><a href="#">환불반품</a></td>
                                        </tr>
                                        <tr>
                                            <td class="product-remove"><a href="#">2</a></td>
                                            <td class="product-name"><a href="#">스프링 레시피</a></td>
                                            <td class="product-price"><span class="amount">40000 원</span></td>
                                            <td class="product-stock-status"><span class="badge badge-nowGo">배송중</span></td>
                                            <td class="product-add-to-cart"><a href="#">배송조회</a></td>
                                        </tr>
                                        <tr>
                                            <td class="product-remove"><a href="#">1</a></td>
                                            <td class="product-name"><a href="#">BBQ 황금올리브 외 2건</a></td>
                                            <td class="product-price"><span class="amount">40000 원</span></td>
                                            <td class="product-stock-status"><span class="badge badge-payComp">결제완료</span></td>
                                            <td class="product-add-to-cart"><a href="#">주문취소</a></td>
                                        </tr>
                                        </tbody>
                                        <tfoot>
                                        <tr>
                                            <td colspan="6">
                                                <div class="wishlist-share">
                                                    <h4 class="wishlist-share-title">Share on:</h4>
                                                    <div class="social-icon">
                                                        <ul>
                                                            <li><a href="#"><i class="zmdi zmdi-rss"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-vimeo"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-tumblr"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-pinterest"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-linkedin"></i></a></li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </td>
                                        </tr>
                                        </tfoot>
                                    </table>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- cart-main-area end -->
<jsp:include page="../include/footer.jsp" />    