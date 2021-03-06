<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-09
  Time: 오후 6:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="kor">
<jsp:include page="../include/head.jsp"/>
<body>

<!-- Page Container -->
<div class="page-container">
    <!-- Page Sidebar -->
    <jsp:include page="../include/page-sidebar.jsp"/>
    <!-- /Page Sidebar -->

    <!-- Page Content -->
    <div class="page-content">
        <!-- Page Header -->
        <jsp:include page="../include/page-header.jsp"/>
        <!-- /Page Header -->
        <!-- Page Inner -->
        <div class="page-inner">
            <div class="page-title">
                <h1 class="breadcrumb-header">프로모션 상세현황</h1>
            </div>
            <div id="main-wrapper">
                <!-- Row -->
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                    <c:if test="${promotionProductList.size() == 0 }">
                     <div>
               		 <button class="btn btn-success" style="margin-bottom:14px;" onclick="location.href='/deletePromotion.ado?promotionTbCode=${promotion.promotionTbCode}'">삭제</button>
                	 </div>
                	 </c:if>
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h2 class="panel-title">${promotion.promotionTbName }</h2>                                
                            </div>
                            <div class="panel-body">
                                <div>
                                    ${promotion.promotionTbContent}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- Row -->
  
                <!-- Row -->
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h2 class="panel-title">프로모션 적용상품 목록</h2>
                            </div>
                            <div class="panel-body">
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                            <div class="row">
                                                <div class="col-md-4">
                                                    <input type="text" class="date-picker text-center form-control" placeholder="01/01/2020">
                                                </div>
                                                <div class="col-md-1">
                                                    <label class="text-center center-block">~</label>
                                                </div>
                                                <div class="col-md-4">
                                                    <input type="text" class="date-picker text-center form-control" placeholder="01/15/2020" style="margin-bottom:14px;">
                                                </div>
                                                <div class="col-md-1">
                                                    <button type="submit" class="btn btn-success center-block" style="margin-bottom:14px;">조회</button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <div class="table-responsive">
                                    <table id="readCountProductTable" class="display table" style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>상품코드</th>
                                            <th>상품이름</th>
                                            <th>카테고리</th>
                                            <th>판매가격</th>
                                            <th>판매량</th>
                                            <th>잔량</th>
                                            <th>할인율</th>
                                        </tr>
                                        </thead>
                                        <tfoot>
                                        <tr>
                                            <th>상품코드</th>
                                            <th>상품이름</th>
                                            <th>카테고리</th>
                                            <th>판매가격</th>
                                            <th>판매량</th>
                                            <th>잔량</th>
                                            <th>할인율</th>
                                        </tr>
                                        </tfoot>
                                        <tbody>
                                        <c:forEach items="${promotionProductList}" var="list">
                                        <tr>
                                            <td>${list.productTbCode}</td>
                                            <td>${list.pdSaleTbProductName}</td>
                                            <td>${list.category}</td>
                                            <td>${list.pdSaleTbSalesPrice} 원</td>
                                            <td>${list.pdSaleTbReceivedAmount - list.pdSaleTbRemainingAmount}</td>
                                            <td>${list.pdSaleTbRemainingAmount}</td>
                                            <td>${list.pdSaleTbDiscountRate} %</td>
                                        </tr>
                                        </c:forEach>                 
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- Row -->
            </div><!-- Main Wrapper -->
            <jsp:include page="../include/page-footer.jsp"/>
        </div>
        <!-- /Page Inner -->
        <jsp:include page="../include/right-sidebar.jsp"/>
    </div>
    <!-- /Page Content -->
</div>
<!-- /Page Container -->


<!-- Javascripts -->
<jsp:include page="../include/scripts-load.jsp"/>
<script type="text/javascript">

</script>
</body>
</html>
