<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../include/header.jsp"/>


        <!-- Start Bradcaump area -->
        <div class="ht__bradcaump__area" style="background: rgba(0, 0, 0, 0) url(/resources/client/images/bg/notice.jpg) no-repeat scroll center center / cover ;">
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
                                    <input type="text" class="form-control" id="noticeWriter" name="adminsTbId" value="${clientNoticeVO.adminsTbId}" readonly>
                                    <input type="text" class="form-control" id="noticeTitle" name="noticeTbTitle" value="${clientNoticeVO.noticeTbTitle}" readonly>
                                </div>
                            </div>
                            <div class="ht__comment__form__inner">
                                <div class="comment__forms messages">
                                    <textarea class="form-control" id="noticeContent" name="noticeTbContent" readonly>${clientNoticeVO.noticeTbContent}</textarea>
                                </div>
                            </div>
                        </div>
                        <div class="ht__comment__btn--2 mt--30">
                            <a class="fr__btns" href="/notice.do">목록보기</a>
                        </div>
                    </div>
                    <!-- End comment Form -->
                </div>
            </div>
        </div>
        <!-- cart-main-area end -->
       
    </body>

</html>

<jsp:include page="../include/footer.jsp"></jsp:include>