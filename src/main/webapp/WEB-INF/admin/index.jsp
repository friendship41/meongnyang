<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
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
                                    <span class="stats-number">50,000,000</span>
                                    <p class="stats-info">월 매출</p>
                                </div>
                                <div class="pull-right">
                                    <i class="icon-arrow_upward stats-icon"></i>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <div class="panel panel-white stats-widget">
                            <div class="panel-body">
                                <div class="pull-left">
                                    <span class="stats-number">5,000,000</span>
                                    <p class="stats-info">일 매출</p>
                                </div>
                                <div class="pull-right">
                                    <i class="icon-arrow_downward stats-icon"></i>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <div class="panel panel-white stats-widget">
                            <div class="panel-body">
                                <div class="pull-left">
                                    <span class="stats-number">+10,555</span>
                                    <p class="stats-info">신규 회원</p>
                                </div>
                                <div class="pull-right">
                                    <i class="icon-arrow_upward stats-icon"></i>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <div class="panel panel-white stats-widget">
                            <div class="panel-body">
                                <div class="pull-left">
                                    <span class="stats-number">5,000,000</span>
                                    <p class="stats-info">일일 방문자</p>
                                </div>
                                <div class="pull-right">
                                    <i class="icon-arrow_upward stats-icon"></i>
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
                                <h4 class="panel-title">재고 현황</h4>
                            </div>
                            <div class="panel-body">
                                <div class="table-responsive">
                                    <table id="stockProductTable" class="display table" style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>제품 코드</th>
                                            <th>제품 이름</th>
                                            <th>제품수량</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td>000001</td>
                                            <td>강아지 사료</td>
                                            <td>50</td>
                                        </tr>
                                        <tr>
                                            <td>000002</td>
                                            <td>고양이 사료</td>
                                            <td>80</td>
                                        </tr>
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
                                <h4 class="panel-title">유통기한 임박 상품 현황</h4>
                            </div>
                            <div class="panel-body">
                                <div class="table-responsive">
                                    <table id="expirationProductTable" class="display table" style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>제품 코드</th>
                                            <th>제품 이름</th>
                                            <th>제품수량</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td>000001</td>
                                            <td>강아지 사료</td>
                                            <td>50</td>
                                        </tr>
                                        <tr>
                                            <td>000002</td>
                                            <td>고양이 사료</td>
                                            <td>80</td>
                                        </tr>
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
                                <h4 class="panel-title">주문 현황</h4>
                            </div>
                            <div class="panel-body">
                                <div class="table-responsive">
                                    <table id="orderProductTable" class="display table" style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>주문 번호</th>
                                            <th>주문 상품</th>
                                            <th>주문자명</th>
                                            <th>주문금액</th>
                                            <th>주문일자</th>
                                            <th>주문상태</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td>000002</td>
                                            <td>개 사료 외 1종</td>
                                            <td>안창호</td>
                                            <td>150,000</td>
                                            <td>2011/04/25</td>
                                            <td><span class="label label-nowGo">배송중</span></td>
                                        </tr>
                                        <tr>
                                            <td>000003</td>
                                            <td>개 사료 외 1종</td>
                                            <td>안창호</td>
                                            <td>150,000</td>
                                            <td>2011/04/25</td>
                                            <td><span class="label label-nowGo">배송중</span></td>
                                        </tr>
                                        <tr>
                                            <td>000001</td>
                                            <td>켓타워 외 2종</td>
                                            <td>최창호</td>
                                            <td>336,000</td>
                                            <td>2008/11/28</td>
                                            <td><span class="label label-success">배송완료</span></td>
                                        </tr>
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
