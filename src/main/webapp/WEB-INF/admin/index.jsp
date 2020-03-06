<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="kor">
<jsp:include page="include/head.jsp"/>
<body onload="chartGo()">

<!-- Page Container -->
<div class="page-container">
    <jsp:include page="include/page-sidebar.jsp"/>

    <!-- Page Content -->
    <div class="page-content">
        <jsp:include page="include/page-header.jsp"/>
        <!-- Page Inner -->
        <div class="page-inner">
            <div class="page-title">
                <h3 class="breadcrumb-header">대시보드</h3>
            </div>
            <div id="main-wrapper">
                <!-- Row -->
                <div class="row">
                    <div class="col-lg-3 col-md-6">
                        <div class="panel panel-white stats-widget">
                            <div class="panel-body">
                                <div class="pull-left">
                                    <span class="stats-number">${monthlySale.pdOrderTbPayment}</span>
                                    <p class="stats-info">월 매출</p>
                                </div>
                                <div class="pull-right">
                                    <c:if test="${monthlySale.upDown eq 'u'}">
                                        <i class="icon-arrow_upward stats-icon"></i>
                                    </c:if>
                                    <c:if test="${monthlySale.upDown eq 'd'}">
                                        <i class="icon-arrow_downward stats-icon"></i>
                                    </c:if>
                                    <c:if test="${monthlySale.upDown eq 'n'}">
                                        <i class="icon-arrow-right stats-icon"></i>
                                    </c:if>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <div class="panel panel-white stats-widget">
                            <div class="panel-body">
                                <div class="pull-left">
                                    <span class="stats-number">${dailySale.pdOrderTbPayment}</span>
                                    <p class="stats-info">일 매출</p>
                                </div>
                                <div class="pull-right">
                                    <c:if test="${dailySale.upDown eq 'u'}">
                                        <i class="icon-arrow_upward stats-icon"></i>
                                    </c:if>
                                    <c:if test="${dailySale.upDown eq 'd'}">
                                        <i class="icon-arrow_downward stats-icon"></i>
                                    </c:if>
                                    <c:if test="${dailySale.upDown eq 'n'}">
                                        <i class="icon-arrow-right stats-icon"></i>
                                    </c:if>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <div class="panel panel-white stats-widget">
                            <div class="panel-body">
                                <div class="pull-left">
                                    <c:if test="${userCount.userCountTbJoiners eq 0}">
                                        <span class="stats-number">0</span>
                                    </c:if>
                                    <c:if test="${userCount.userCountTbJoiners ne 0}">
                                        <span class="stats-number">+${userCount.userCountTbJoiners}</span>
                                    </c:if>
                                    <p class="stats-info">신규 회원</p>
                                </div>
                                <div class="pull-right">
                                    <c:if test="${userCount.joinUpDown eq 'n'}">
                                        <i class="icon-arrow-right stats-icon"></i>
                                    </c:if>
                                    <c:if test="${userCount.joinUpDown eq 'u'}">
                                        <i class="icon-arrow_upward stats-icon"></i>
                                    </c:if>
                                    <c:if test="${userCount.joinUpDown eq 'd'}">
                                        <i class="icon-arrow_downward stats-icon"></i>
                                    </c:if>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <div class="panel panel-white stats-widget">
                            <div class="panel-body">
                                <div class="pull-left">
                                    <span class="stats-number">${userCount.userCountTbVisitors}</span>
                                    <p class="stats-info">일일 방문자</p>
                                </div>
                                <div class="pull-right">
                                    <c:if test="${userCount.visitUpDown eq 'n'}">
                                        <i class="icon-arrow-right stats-icon"></i>
                                    </c:if>
                                    <c:if test="${userCount.visitUpDown eq 'u'}">
                                        <i class="icon-arrow_upward stats-icon"></i>
                                    </c:if>
                                    <c:if test="${userCount.visitUpDown eq 'd'}">
                                        <i class="icon-arrow_downward stats-icon"></i>
                                    </c:if>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- !Row -->
                <!-- Row -->
                <div class="row">
                    <div class="col-lg-6 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">주간 매출</h4>
                            </div>
                            <div class="panel-body">
                                <canvas id="sales_chart_week"></canvas>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">주간 방문자</h4>
                            </div>
                            <div class="panel-body">
                                <canvas id="visit_chart_week"></canvas>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- !Row -->
                <!-- Row -->
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">재고현황</h4>
                            </div>
                            <div class="panel-body">
                                <div class="table-responsive">
                                    <table id="stockProductTable" class="display table" style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>#</th>
                                            <th>상품코드</th>
                                            <th>상품명</th>
                                            <th>판매개시일</th>
                                            <th>현재수량</th>
                                            <th>통보수량</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach var="stock" items="${dashboardStockList}">
                                            <tr>
                                                <td>${stock.rowNumber}</td>
                                                <td>${stock.productTbCode}</td>
                                                <td>${stock.pdSaleTbProductName}</td>
                                                <td>${stock.pdSaleTbStartDay}</td>
                                                <td><span class="label label-danger">${stock.pdSaleTbRemainingAmount}</span></td>
                                                <td>${stock.pdSaleTbLimitAmount}</td>
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
                <!-- Row -->
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">유통기한 임박상품</h4>
                            </div>
                            <div class="panel-body">
                                <div class="table-responsive">
                                    <table id="expirationProductTable" class="display table" style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>#</th>
                                            <th>상품코드</th>
                                            <th>상품명</th>
                                            <th>판매개시일</th>
                                            <th>유통기한</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach var="expire" items="${dashboardExpireList}">
                                            <tr>
                                                <td>${expire.rowNumber}</td>
                                                <td>${expire.productTbCode}</td>
                                                <td>${expire.pdSaleTbProductName}</td>
                                                <td>${expire.pdSaleTbStartDay}</td>
                                                <td><span class="label label-danger">${expire.pdSaleTbExpireDay}</span></td>
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
                <!-- Row -->
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">주간 주문현황</h4>
                            </div>
                            <div class="panel-body">
                                <div class="table-responsive">
                                    <table id="orderTable" class="display table" style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>주문번호</th>
                                            <th>주문상품</th>
                                            <th>주문자명</th>
                                            <th>주문금액</th>
                                            <th>주문일자</th>
                                            <th>주문상태</th>
                                        </tr>
                                        </thead>
                                        <tfoot>
                                        <tr>
                                            <th>주문번호</th>
                                            <th>주문상품</th>
                                            <th>주문자명</th>
                                            <th>주문금액</th>
                                            <th>주문일자</th>
                                            <th>주문상태</th>
                                        </tr>
                                        </tfoot>
                                        <tbody>
                                        <c:forEach var="orderProduct" items="${dashboardOrderList}">
                                            <tr>
                                                <td>${orderProduct.pdOrderTbNo}</td>
                                                <td>${orderProduct.pdSaleTbProductName}</td>
                                                <td>${orderProduct.customerTbName}</td>
                                                <td>${orderProduct.pdOrderTbPayment}</td>
                                                <td>${orderProduct.pdOrderTbOrderDate}</td>
                                                <c:choose>
                                                    <c:when test="${orderProduct.pdOrderTbState eq 'W'}">
                                                        <td><span class="label label-warning">결제대기</span></td>
                                                    </c:when>
                                                    <c:when test="${orderProduct.pdOrderTbState eq 'P'}">
                                                        <td><span class="label label-info">결제완료</span></td>
                                                    </c:when>
                                                    <c:when test="${orderProduct.pdOrderTbState eq 'D'}">
                                                        <td><span class="label label-nowGo">배송중</span></td>
                                                    </c:when>
                                                    <c:when test="${orderProduct.pdOrderTbState eq 'A'}">
                                                        <td><span class="label label-success">배송완료</span></td>
                                                    </c:when>
                                                    <c:when test="${orderProduct.pdOrderTbState eq 'C'}">
                                                        <td><span class="label label-danger">결제취소</span></td>
                                                    </c:when>
                                                    <c:otherwise><td></td></c:otherwise>
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
            </div><!-- Main Wrapper -->
            <jsp:include page="include/page-footer.jsp"/>
        </div><!-- /Page Inner -->
        <jsp:include page="include/right-sidebar.jsp"/>
    </div><!-- /Page Content -->
</div><!-- /Page Container -->



<script>
    function chartGo() {
        new Chart(document.getElementById("sales_chart_week"), {
            "type": "line",
            "data": {
                "labels": ["1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일", "15일"],
                "datasets": [{
                    "label": "방문자 수",
                    "data": [5000, 2000, 3000, 4000, 5000, 500, 3600, 3210, 8000, 2000, 10000, 12000, 1000, 2000, 3000],
                    "fill": false,
                    "borderColor": "rgb(93,168,203)",
                    "lineTension": 0.2
                }]
            },
            "options": {}
        });
        new Chart(document.getElementById("visit_chart_week"), {
            "type": "line",
            "data": {
                "labels": ["1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"],
                "datasets": [{
                    "label": "방문자 수",
                    "data": [5000, 2000, 3000, 4000, 5000, 500, 3600, 3210, 8000, 2000, 10000, 12000],
                    "fill": false,
                    "borderColor": "rgb(93,168,203)",
                    "lineTension": 0.2
                }]
            },
            "options": {}
        });



    }
</script>

<jsp:include page="include/scripts-load.jsp"/>


</body>
</html>
