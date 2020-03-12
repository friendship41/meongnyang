<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../include/header.jsp"/>


        <!-- Start Bradcaump area -->
        <div class="ht__bradcaump__area" style="background: rgba(0, 0, 0, 0) url(/resources/client/images/bg/faq.jpg) no-repeat scroll center center / cover ;">
            <div class="ht__bradcaump__wrap">
                <div class="container">
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="bradcaump__inner">
                                <nav class="bradcaump-inner">
                                  <a class="breadcrumb-item" href="index.html">Home</a>
                                  <span class="brd-separetor"><i class="zmdi zmdi-chevron-right"></i></span>
                                  <span class="breadcrumb-item active">FAQ</span>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- End Bradcaump area -->
        <!-- cart-main-area start -->
    
        <div class="checkout-wrap ptb--100" >        
            <div class="container" >
                <div class="row" >
                
                	<div class="col-lg-3">
                        <div class="htc__product__leftsidebar">
                            <div class="htc__category">
                                <h4 class="title__line--4">Community</h4>
                                <ul class="ht__cat__list">
                                    <li><a href="notice.do">공지</a></li>
                                    <li><a href="faq.do">FAQ</a></li>
                                    <li><a href="qna-list.do">Q&A</a></li>
                                    <li><a href="reviewList.do">Review</a></li>
                                    <li><a href="contact.do">Contact</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>                
                    <div class="col-md-8" >
                        <div class="checkout__inner" >
                            <div class="accordion-list">
                                <div class="accordion">                                
                                   <c:forEach items="${faqList }" var="faqList">
                                    <div class="accordion__title">
                                      ${faqList.faqTbTitle }
                                    </div>
                                    <div class="accordion__body">
                                        <div class="accordion__body__form">
                                            <div class="row">
                                                <div class="col-md-12">                                                 
                                                     <h5 class="checkout-method__title"><i class="zmdi zmdi-caret-right"></i>${faqList.faqTbContent }</h5>                                                    
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                  </c:forEach> 
                                  </div>             
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
   
        <!-- cart-main-area end -->
    

<jsp:include page="../include/footer.jsp"></jsp:include>