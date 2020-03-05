<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-09
  Time: 오후 9:22
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
                <h3 class="breadcrumb-header">상품 상세현황</h3>
            </div>
            <div id="main-wrapper">
                <!-- row -->
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">상품현황</h4>
                            </div>
                            <div class="panel-body">
                                <div class="table-responsive">
                                    <table id="deliveryTable" class="display table" style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>주문번호</th>
                                            <th>주문자명</th>
                                            <th>주문일자</th>
                                            <th>주문상태</th>
                                            <th>-</th>
                                        </tr>
                                        </thead>
                                        <tbody id="deliveryTableBody">
                                        <c:forEach var="singleOrder" items="${orderList}">
                                            <tr>
                                                <td>${singleOrder.pdOrderTbNo}</td>
                                                <td>${singleOrder.customerTbName}</td>
                                                <td>${singleOrder.pdOrderTbOrderDate}</td>
                                                <c:choose>
                                                    <c:when test="${singleOrder.pdOrderTbState eq 'W'}">
                                                        <td><span class="label label-warning">결제대기</span></td>
                                                        <td><span onclick="deleteOrder('${singleOrder.pdOrderTbNo}')" class="btn btn-danger">삭제</span></td>
                                                    </c:when>
                                                    <c:when test="${singleOrder.pdOrderTbState eq 'P'}">
                                                        <td><span class="label label-info">결제완료</span></td>
                                                        <td><span class="btn btn-primary">배송시작</span></td>
                                                    </c:when>
                                                    <c:when test="${singleOrder.pdOrderTbState eq 'D'}">
                                                        <td><span class="label label-nowGo">배송중</span></td>
                                                        <td><span class="btn btn-default">배송완료</span></td>
                                                    </c:when>
                                                    <c:when test="${singleOrder.pdOrderTbState eq 'A'}">
                                                        <td><span class="label label-success">배송완료</span></td>
                                                        <td></td>
                                                    </c:when>
                                                    <c:when test="${singleOrder.pdOrderTbState eq 'R'}">
                                                        <td><span class="label label-danger">환불요청</span></td>
                                                        <td><span class="btn btn-danger">환불처리</span></td>
                                                    </c:when>
                                                    <c:when test="${singleOrder.pdOrderTbState eq 'C'}">
                                                        <td><span class="label label-danger">환불/취소완료</span></td>
                                                        <td></td>
                                                    </c:when>
                                                </c:choose>
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
            </div>
            <!-- Main Wrapper -->
            <jsp:include page="../include/page-footer.jsp"/>
        </div>
        <!-- /Page Inner -->
        <jsp:include page="../include/right-sidebar.jsp"/>
    </div>
    <!-- /Page Content -->
</div>
<!-- /Page Container -->

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
    $(document).ready(function () {
        $("#deliveryTable").DataTable();
    });

    function deleteOrder(orderNum) {
        var url = '/deleteProductOrder.ado?pdOrderTbNo='+orderNum;
        location.href = url;
    }
</script>

<!-- Javascripts -->
<jsp:include page="../include/scripts-load.jsp"/>
</body>
</html>
