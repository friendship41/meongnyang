<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../include/header.jsp"/>


        <!-- Start Bradcaump area -->
        <div class="ht__bradcaump__area" style="background: rgba(0, 0, 0, 0) url(../images/bg/4.jpg) no-repeat scroll center center / cover ;">
            <div class="ht__bradcaump__wrap">
                <div class="container">
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="bradcaump__inner">
                                <nav class="bradcaump-inner">
                                    <a class="breadcrumb-item" href="index.html">Home</a>
                                    <span class="brd-separetor"><i class="zmdi zmdi-chevron-right"></i></span>
                                    <span class="breadcrumb-item active">공지</span>
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
                                <h4 class="title__line--4">Community</h4>
                                <ul class="ht__cat__list">
                                    <li><a href="#">공지</a></li>
                                    <li><a href="#">FAQ</a></li>
                                    <li><a href="#">Q&A</a></li>
                                    <li><a href="#">Review</a></li>
                                    <li><a href="#">Contact</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <!-- Start comment Form -->
                    <div class="col-lg-8">
                        <div class="ht__comment__form">
                            <h4 class="title__line--5"> 공지사항 </h4>
                            <div class="ht__comment__form__inner">
                                <div class="comment__forms">
                                    <input type="text" value="이름" readonly>
                                    <input type="text" value="제목" readonly>
                                </div>
                            </div>
                            <div class="ht__comment__form__inner">
                                <div class="comment__forms messages">
                                    <textarea name="message" readonly></textarea>
                                </div>
                            </div>
                        </div>
                        <div class="ht__comment__btn--2 mt--30">
                            <a class="fr__btns" href="#">목록보기</a>
                        </div>
                    </div>
                    <!-- End comment Form -->
                </div>
            </div>
        </div>
        <!-- cart-main-area end -->
       
    <!-- 로그인이 뜨는 모달부분 -->
    <div class="modal fade" id="myModal88" tabindex="-1" role="dialog" aria-labelledby="myModal88" aria-hidden="true">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title" id="myModalLabel">로그인 / 회원가입</h4>
                </div>
                <div class="modal-body modal-body-sub">
                    <div class="row">
                        <div class="col-md-8 modal_body_left modal_body_left1" style="border-right: 1px dotted #C2C2C2;padding-right:3em;">
                            <div class="sap_tabs">
                                <div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
                                    <ul>
                                        <li class="resp-tab-item" aria-controls="tab_item-0"><span>Login</span></li>
                                        <li class="resp-tab-item" aria-controls="tab_item-1"><span>Join us</span></li>
                                    </ul>
                                    <div class="tab-1 resp-tab-content" aria-labelledby="tab_item-0">
                                        <div class="facts">
                                            <div class="register">
                                                <form action="#" method="post">
                                                    <input name="Email" placeholder="Email Address" type="text" required="">
                                                    <input name="Password" placeholder="Password" type="password" required="">
                                                    <div class="sign-up">
                                                        <input type="submit" value="Sign in" />
                                                    </div>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="tab-2 resp-tab-content" aria-labelledby="tab_item-1">
                                        <div class="facts">
                                            <div class="register">
                                                <form action="#" method="post">
                                                    <input placeholder="Name" name="Name" type="text" required="">
                                                    <input placeholder="Email Address" name="Email" type="email" required="">
                                                    <input placeholder="Password" name="Password" type="password" required="">
                                                    <input placeholder="Confirm Password" name="Password" type="password" required="">
                                                    <div class="sign-up">
                                                        <input type="submit" value="Create Account" />
                                                    </div>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            
                            <div id="OR" class="hidden-xs">OR</div>
                        </div>
                        <div class="col-md-4 modal_body_right modal_body_right1">
                            <div class="row text-center sign-with">
                                <div class="col-md-12">
                                    <h3 class="other-nw">Sign in with</h3>
                                </div>
                                <div class="col-md-12">
                                    <ul class="social">
                                        <li class="social_facebook"><a href="#" class="entypo-facebook"></a></li>
                                        <li class="social_dribbble"><a href="#" class="entypo-dribbble"></a></li>
                                        <li class="social_twitter"><a href="#" class="entypo-twitter"></a></li>
                                        <li class="social_behance"><a href="#" class="entypo-behance"></a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>

</html>

<jsp:include page="../include/footer.jsp"></jsp:include>