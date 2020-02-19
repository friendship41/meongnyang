<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<jsp:include page="../include/header.jsp"/>
        <!-- Start Bradcaump area -->
        <div class="ht__bradcaump__area" style="background: rgba(0, 0, 0, 0) url(/resources/client/images/bg/qna.jpg) no-repeat scroll center center / cover ;">
            <div class="ht__bradcaump__wrap">
                <div class="container">
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="bradcaump__inner">
                                <nav class="bradcaump-inner">
                                    <a class="breadcrumb-item" href="index.html">Home</a>
                                    <span class="brd-separetor"><i class="zmdi zmdi-chevron-right"></i></span>
                                    <span class="breadcrumb-item active">Q&A</span>
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
                                    <li><a href="qna-list.do">Q&A</a></li>
                                    <li><a href="#">Review</a></li>
                                    <li><a href="#">Contact</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <form action="qna-update.do" method="post">
                    <input type="hidden" name="qnaTbNo" value="${clientQnaVO.qnaTbNo }">
                    <div class="col-lg-8">
                        <div class="ht__comment__form">
                            <h4 class="title__line--5"> Q & A </h4>
                            <div class="ht__comment__form__inner">
                                <div class="comment__forms">
                                    <input type="text" name="customerTbName" value="이름" readonly>
                                    <input type="text" name="customerTbEmail" value="이메일" readonly>
                                    <input type="text" name="qnaTbTitle" value="${clientQnaVO.qnaTbTitle }">
                                </div>
                            </div>
                            <div class="ht__comment__form__inner">
                                <div class="comment__forms messages">
                                    <textarea name="qnaTbContent">${clientQnaVO.qnaTbContent }</textarea>
                                </div>
                            </div>
                        </div>
                        <div class="ht__comment__btn--2 mt--30">
                            <a class="fr__btns" href="qna-delete.do?qnaTbNo=${clientQnaVO.qnaTbNo }">삭제</a>
                            <button class="fr__btns" type="submit">수정</button>
                        </div>
                    </div>
                    </form>
                </div>
            </div>
        </div>
        <!-- cart-main-area end -->
   
   
<jsp:include page="../include/footer.jsp"/> 
