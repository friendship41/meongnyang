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
                    <div class="col-lg-8">
                        <div id="shipping" class="wishlist-content">
                            <h6> 공지사항 </h6><br>
                            <form action="#">
                                <div class="wishlist-table table-responsive">
                                    <table>
                                        <thead>
                                            <tr>
                                                <th class="product-remove"><span class="nobr"> NO </span></th>
                                                <th class="product-name"><span class="nobr"> 제 목 </span></th>
                                                <th class="product-price"><span class="nobr"> 글쓴이 </span></th>
                                                <th class="product-stock-stauts"><span class="nobr"> 날짜 </span></th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                              
                                        <c:forEach var="noticeList" items="${clientNoticeList}"> 
                                           <tr>
                                              <td>${noticeList.noticeTbNo}</td>
                                              <td><a class="f-bold" href="/notice-read.do?noticeTbNo=${noticeList.noticeTbNo}">${noticeList.noticeTbTitle}</a></td>
                                              <td>${noticeList.adminsTbId}</td>
                                              <td>${noticeList.noticeTbRegDate}</td>
                                        </c:forEach>
                     
                                        </tbody>
                                        
                                    </table>
                                </div>
                            </form>
                            <!-- Start Pagenation -->
                            <div class="row">
                                <div class="col-xs-12">
                                    <ul class="htc__pagenation">
                                        <c:if test="${paging.prev == true}">
                                        <li><a href="#"><i class="zmdi zmdi-chevron-left"></i></a></li>
                                        </c:if>
                                   	    <c:forEach var="i" begin="${paging.startPage}" end="${paging.endPage}">
                                   	    <li><a href="/notice.do?currentPage=${i}">${i}</a></li> 
                                   	    </c:forEach>
                                   	    <c:if test="${paging.next == true }">
                                   	    <li class="active"><a href="#"><i class="zmdi zmdi-chevron-right" ></i></a></li>
                                   	    </c:if>
                                </div>
                            </div>
                            <!-- End Pagenation -->
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- cart-main-area end -->
       
    
</body>

</html>
<jsp:include page="../include/footer.jsp"></jsp:include>