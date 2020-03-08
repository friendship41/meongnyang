<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-09
  Time: 오후 6:53
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
                <h3 class="breadcrumb-header">프로모션 현황</h3>
            </div>
            <div id="main-wrapper">
                <!-- Row -->
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">프로모션 진행현황</h4>
                            </div>
                            <div class="panel-body">
                                <div class="table-responsive">
                                    <table id="readCountProductTable" class="display table" style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>프로모션 코드</th>
                                            <th>프로모션 이름</th>
                                            <th>시작일</th>
                                            <th>종료일</th>
                                            <th>전체할인율</th>
                                        </tr>
                                        </thead>
                                        <tfoot>
                                        <tr>
                                            <th>프로모션 코드</th>
                                            <th>프로모션 이름</th>
                                            <th>시작일</th>
                                            <th>종료일</th>
                                            <th>전체할인율</th>
                                        </tr>
                                        </tfoot>
                                        <tbody>
                                        <c:forEach items="${promotionList }" var="promotion">
                                        <tr>
                                            <td>${promotion.promotionTbCode }</td>
                                            <td><a class="f-bold" href="promotion-read.ado?promotionTbCode=${promotion.promotionTbCode}">${promotion.promotionTbName}</a></td>
                                            <td>${promotion.promotionTbStartDate }</td>
                                            <td>${promotion.promotionTbEndDate }</td>
                                            <td>${promotion.promotionTbDiscountRate }%</td>
                                        </tr>
                                        </c:forEach>                          
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- !Row -->
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
</body>
</html>
