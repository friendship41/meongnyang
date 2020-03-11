<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <jsp:include page="../include/header.jsp"/>       
        <!-- Start Bradcaump area -->
        <div class="ht__bradcaump__area" style="background: rgba(0, 0, 0, 0) url(/resources/client/images/bg/review-list.jpg) no-repeat scroll center center / cover ;">
            <div class="ht__bradcaump__wrap">
                <div class="container">
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="bradcaump__inner">
                                <nav class="bradcaump-inner">
                                  <a class="breadcrumb-item" href="../index.html">Home</a>
                                  <span class="brd-separetor"><i class="zmdi zmdi-chevron-right"></i></span>
                                  <a class="breadcrumb-item" href="../community/notice.html">Community</a>
                                  <span class="brd-separetor"><i class="zmdi zmdi-chevron-right"></i></span>
                                  <span class="breadcrumb-item active">Review</span>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- End Bradcaump area -->
        <!-- Start Blog Area -->
        <section class="htc__blog__area bg__white ptb--100">
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
                                    <li><a href="/reviewList.do">Review</a></li>
                                    <li><a href="#">Contact</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-9 ht__blog__wrap blog--page clearfix">
                        <!-- Start Single Blog -->
                        <!-- 이 부분을 가져다 쓰면됨 -->
                        <c:forEach items="${reviewList}" var="review">
                        <div class="col-md-6 col-lg-4 col-sm-12 col-xs-12">
                            <div class="blog" style="cursor: pointer;">
                            <input type="hidden" id="code" value="${review.productTbCode}">
                            	<c:if test="${review.reviewTbImgPath != null}">
                                <div class="blog__thumb">                                
                                	<img id="img" src="${review.reviewTbImgPath}" alt="blog images">          
                                </div>
                                </c:if>
                                <div class="blog__details">                                   
                                        <span id="productName">상품명 : ${review.productTbName}</span>
                                    <div class="bl__date">
                                        <span id="rate"> ${review.reviewTbRating}</span>
                                    </div>
                                    <h2><span id="reviewContent">${review.reviewTbContent}</span></h2>
                                    <p>${review.reviewTbRegDate}</p>                             
                                </div>
                            </div>
                        </div>
                        </c:forEach>
                        <!-- End Single Blog -->
                    </div>
                </div>
                <!-- Start PAgenation -->
                <div class="row">
                    <div class="col-xs-12">
                        <ul class="htc__pagenation">
                           <c:if test="${page.prev}">
                           <li><a href="/reviewList.do?currentPage=${page.startPage - page.pageBlock}"><i class="zmdi zmdi-chevron-left"></i></a></li>
                           </c:if>
                           <c:forEach var="i" begin="${page.startPage}" end="${page.endPage}">
                           <c:if test="${currentPage eq i}">
                           	<li class="active"><a href="/reviewList.do?currentPage=${i}">${i}</a></li>                           
                           </c:if>
                           <c:if test="${currentPage ne i}">
                           	<li><a href="/reviewList.do?currentPage=${i}">${i}</a></li>   
                           </c:if>
                           </c:forEach>
                           <c:if test="${page.next}">
                           <li><a href="/reviewList.do?currentPage=${page.endPage + 1}"><i class="zmdi zmdi-chevron-right"></i></a></li>
                           </c:if>
                        </ul>
                    </div>
                </div>
                <!-- End PAgenation -->
            </div>
        </section>
        <!-- End Blog Area -->

 
<jsp:include page="../include/footer.jsp"/>
<script>
$(document).ready(function () {

    $('.blog').on('click', this, function (e) {

    	var productName = $(this).find('#productName').text();
    	var content = $(this).find('#reviewContent').text();
    	var rating = $(this).find('#rate').text();
    	var image = $(this).find("#img").attr("src");
    	var href = 'shoppingDetail.do?productTbCode=' + $("#code").val();
    	
    	console.log(productName);
    	console.log(content);
    	console.log(image);
    	console.log(href);
        $("#myModal").modal();
        
        $("#productName").text(productName);
        $("#productName").attr("href", href);
        $("#reviewContent").text(content);
        $(".item_price").text(rating);
        if(image != null) {
        	$("#img").attr("src", image);        	
        } else {
        	$("#img").remove();
        }
    });
});
</script>
    