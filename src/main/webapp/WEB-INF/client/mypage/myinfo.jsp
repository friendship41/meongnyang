<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="../include/header.jsp" />

        <!-- Start Bradcaump area -->
        <div class="ht__bradcaump__area" style="background: rgba(0, 0, 0, 0) url(images/bg/4.jpg) no-repeat scroll center center / cover ;">
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

                <!-- Start comment Form --> <!--여기부터다시수정하면됨!!!!!-->

                <div class="col-lg-8">
                    <div class="ht__comment__form">
                        <h4 class="title__line--5">배송지 목록</h4>
                        <div class="ht__comment__form__inner">
                            <div class="comment__form">
                                <script src="https://ssl.daumcdn.net/dmaps/map_js_init/postcode.v2.js"></script>
                                <select class="ht__select">
                                    <option>선택하세요</option>
                                    <option>주소1</option>
                                    <option>주소2</option>
                                    <option>주소3</option>
                                </select>
                                <input id="postcode1" value="" type="text" placeholder=" 주소 *">
                                <input id="postcode2" value="" type="text" placeholder="상세 주소 *">
                                <div class="ht__comment__btn--2 mt--30">
                                    <a class="fr__btn" href="#">수정</a>
                                    <a class="fr__btn" href="#">삭제</a>
                                </div>
                            </div>
                            <div class="ht__comment__btn--2 mt--30">
                               <input type="button" onClick="openDaumZipAddress();" value="주소 찾기"/>
                               <br>
                           </div>
                       </div>
                   </div>
                   <div class="ht__comment__form">
                    <h4 class="title__line--5">비밀번호 변경</h4>
                    <div class="ht__comment__form__inner">
                        <div class="comment__form">
                            <input type="text" placeholder="현재 비밀번호 *">
                            <input type="text" placeholder="새 비밀번호 *">
                            <input type="text" placeholder="비밀번호 확인">
                        </div>
                        
                    </div>
                    <div class="ht__comment__btn--2 mt--30">
                        <a class="fr__btn" href="#">수정</a>
                    </div>
                    <div class="ht__comment__form">
                        <h4 class="title__line--5">연락처 등록</h4>
                        <div class="ht__comment__form__inner">
                            <div class="comment__form">
                                <input type="text" placeholder="연락처를 입력하세요">
                            </div>
                        </div>
                        <div class="ht__comment__btn--2 mt--30">
                            <a class="fr__btn" href="#">등록</a>
                        </div>
                    </div>
                    <div class="ht__comment__form">
                        <h4 class="title__line--5">*회원 탈퇴*</h4>
                        <div class="ht__comment__form__inner">
                            <div class="comment__form">
                                <input type="password" placeholder="현재 비밀번호 *">
                            </div>
                        </div>
                        <div class="ht__comment__btn--2 mt--30">
                            <a class="fr__btn" href="#">탈퇴</a>
                        </div>
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
                        <li><a href="#"><img src="images/brand/1.png" alt="brand images"></a></li>
                        <li><a href="#"><img src="images/brand/2.png" alt="brand images"></a></li>
                        <li><a href="#"><img src="images/brand/3.png" alt="brand images"></a></li>
                        <li><a href="#"><img src="images/brand/4.png" alt="brand images"></a></li>
                        <li><a href="#"><img src="images/brand/5.png" alt="brand images"></a></li>
                        <li><a href="#"><img src="images/brand/5.png" alt="brand images"></a></li>
                        <li><a href="#"><img src="images/brand/1.png" alt="brand images"></a></li>
                        <li><a href="#"><img src="images/brand/2.png" alt="brand images"></a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- End Brand Area -->

<jsp:include page="../include/footer.jsp" />