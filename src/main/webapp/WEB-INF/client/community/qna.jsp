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
                                    <li><a href="notice.do">공지</a></li>
                                    <li><a href="faq.do">FAQ</a></li>
                                    <li><a href="qna-list.do">Q&A</a></li>
                                    <li><a href="reviewList.do">Review</a></li>
                                    <li><a href="contact.do">Contact</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                     <div class="col-lg-8">
                        <div id="shipping" class="wishlist-content">
                            <h6> Q & A </h6><br>
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
                                        <tbody id="qnaTbody">

                                        	<c:forEach var="qna" items="${clientQnaList}">
                                            <tr>
                                                <input type="hidden" value="${qna.qnaTbDepth}">
                                                <td class="product-remove"> "${qna.rnum}" </td>

                                                <c:if test="${qna.qnaTbSecret == 'Y'}">
                                                    <!-- 비밀글 -->
                                                    <c:if test="${sessionScope.customer.customerTbNo eq qna.customerTbNo}">
                                                        <!-- 내 글이면 -->
                                                        <c:if test="${qna.qnaTbStatus eq 'N'}">
                                                            <!-- 정상글 -->
                                                            <td style="text-align: left;">
                                                                    <c:if test="${qna.adminsTbId eq null}">
                                                                        <span class="badge badge-success">
                                                                            <i class="fa fa-lock" aria-hidden="true"></i>
                                                                            Q
                                                                        </span>
                                                                    </c:if>
                                                                    <c:if test="${qna.adminsTbId ne null}">
                                                                        <span class="badge badge-warning">
                                                                            <i class="fa fa-lock" aria-hidden="true"></i>
                                                                            A
                                                                        </span>
                                                                    </c:if>
                                                                <a href="qna-read.do?qnaTbNo=${qna.qnaTbNo}">${qna.qnaTbTitle}</a>
                                                            </td>
                                                        </c:if>
                                                        <c:if test="${qna.qnaTbStatus eq 'D'}">
                                                            <!-- 삭제된글 -->
                                                            <td style="text-align: left;">
                                                                    <c:if test="${qna.adminsTbId eq null}">
                                                                        <span class="badge badge-success">
                                                                            <i class="fa fa-lock" aria-hidden="true"></i>
                                                                            Q
                                                                        </span>
                                                                    </c:if>
                                                                    <c:if test="${qna.adminsTbId ne null}">
                                                                        <span class="badge badge-warning">
                                                                            <i class="fa fa-lock" aria-hidden="true"></i>
                                                                            A
                                                                        </span>
                                                                    </c:if>
                                                                ${qna.qnaTbTitle}
                                                            </td>
                                                        </c:if>
                                                    </c:if>
                                                    <c:if test="${sessionScope.customer.customerTbNo ne qna.customerTbNo}">
                                                        <!-- 내 글이아니면 -->
                                                        <c:if test="${qna.qnaTbStatus eq 'N'}">
                                                            <!-- 정상글 -->
                                                            <td style="text-align: left;">
                                                                    <c:if test="${qna.adminsTbId eq null}">
                                                                        <span class="badge badge-success">
                                                                            <i class="fa fa-lock" aria-hidden="true"></i>
                                                                            Q
                                                                        </span>
                                                                    </c:if>
                                                                    <c:if test="${qna.adminsTbId ne null}">
                                                                        <span class="badge badge-warning">
                                                                            <i class="fa fa-lock" aria-hidden="true"></i>
                                                                            A
                                                                        </span>
                                                                    </c:if>
                                                                ${qna.qnaTbTitle}
                                                            </td>
                                                        </c:if>
                                                        <c:if test="${qna.qnaTbStatus eq 'D'}">
                                                            <!-- 삭제된글 -->
                                                            <td style="text-align: left;">
                                                                    <c:if test="${qna.adminsTbId eq null}">
                                                                        <span class="badge badge-success">
                                                                            <i class="fa fa-lock" aria-hidden="true"></i>
                                                                            Q
                                                                        </span>
                                                                    </c:if>
                                                                    <c:if test="${qna.adminsTbId ne null}">
                                                                        <span class="badge badge-warning">
                                                                            <i class="fa fa-lock" aria-hidden="true"></i>
                                                                            A
                                                                        </span>
                                                                    </c:if>
                                                               ${qna.qnaTbTitle}
                                                            </td>
                                                        </c:if>
                                                    </c:if>
                                                </c:if>
                                                <c:if test="${qna.qnaTbSecret == 'N' }">
                                                    <!-- 그냥 글 -->
                                                    <c:if test="${qna.qnaTbStatus eq 'N'}">
                                                        <!-- 정상글 -->
                                                        <td style="text-align: left;">
                                                                <c:if test="${qna.adminsTbId eq null}">
                                                                    <span class="badge badge-success">
                                                                        Q
                                                                    </span>
                                                                </c:if>
                                                                <c:if test="${qna.adminsTbId ne null}">
                                                                    <span class="badge badge-warning">
                                                                        A
                                                                    </span>
                                                                </c:if>
                                                            <a href="qna-read.do?qnaTbNo=${qna.qnaTbNo}">${qna.qnaTbTitle}</a>
                                                        </td>
                                                    </c:if>
                                                    <c:if test="${qna.qnaTbStatus eq 'D'}">
                                                        <!-- 삭제된 글 -->
                                                        <td style="text-align: left;">
                                                            <c:if test="${qna.adminsTbId eq null}">
                                                                <span class="badge badge-success">
                                                                    Q
                                                                </span>
                                                            </c:if>
                                                            <c:if test="${qna.adminsTbId ne null}">
                                                                <span class="badge badge-warning">
                                                                    A
                                                                </span>
                                                            </c:if>
                                                           ${qna.qnaTbTitle}
                                                        </td>
                                                    </c:if>
                                                </c:if>

                                                <c:if test="${qna.adminsTbId eq null }">
                                                <td class="product-price"><span class="amount">${qna.customerTbName}</span></td>
                                                </c:if>
                                                <c:if test="${qna.adminsTbId ne null }">
                                                <td class="product-price"><span class="amount">관리자</span></td>
                                                </c:if>
                                                <td class="product-stock-status"><span class="wishlist-in-stock">${qna.qnaTbRegDate}</span></td>
                                            </tr>
                                            </c:forEach>

                                        </tbody>
                                    </table>
                                </div>
                            </form>
                            <!-- Start Pagenation -->
                            <div class="row">
                                <div class="col-xs-12">
                                    <ul class="htc__pagenation">
                                    <c:if test="${paging.prev == true }">
                                        <li><a href="/qna-list.do?currentPage=${paging.startPage - paging.pageBlock}"><i class="zmdi zmdi-chevron-left"></i></a></li>
                                        </c:if>
                                        <c:forEach var="i" begin="${paging.startPage}" end="${paging.endPage}">
                                         <c:if test="${paging.currentPage eq i}">
				                           	<li class="active"><a href="/qna-list.do?currentPage=${i}">${i}</a></li>                           
				                         </c:if>
				                         <c:if test="${paging.currentPage ne i}">
				                           	<li><a href="/qna-list.do?currentPage=${i}">${i}</a></li>   
				                         </c:if>         	                                        
                                        </c:forEach>
                                        <c:if test="${paging.next == true }">
                                        <li><a href="/qna-list.do?currentPage=${paging.endPage + 1}"><i class="zmdi zmdi-chevron-right"></i></a></li>
                                        </c:if>
                                    </ul>
                                </div>
                            </div>
                            <!-- End Pagenation -->
                        </div>
                    </div>
                </div>
            </div>
        </div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
    $(document).ready(function () {
        var listSize = '${clientQnaList.size()}';
        listSize *=1;
        for(var i=0; i<listSize; i++)
        {
            var tr = $("#qnaTbody").children().eq(i);
            var depth = tr.children().eq(0).val();
            depth *= 1;
            if(depth != 0)
            {
                for(var j=0; j<depth; j++)
                {
                    tr.children().eq(2).prepend('<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>');
                }
            }
        }
    });
</script>
<jsp:include page="../include/footer.jsp"/>
