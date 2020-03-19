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

<div id="orderModalDiv" class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog"
     aria-labelledby="myLargeModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="orderModalTitle"></h4>
            </div>
            <div class="modal-body">
                <div class="col-md-4" style="padding-left:0;">
                    <h3 class="m-b-md m-t-xxs"><b id="modalOrderCode">주문번호</b></h3>
                </div>
                <div class="col-md-8 text-right" style="padding-right:0;">
                </div>
                <div class="col-md-12" style="padding-left:0;">
                    <hr>
                </div>
                <div class="col-md-12" style="padding-left:0;padding-right:0;">
                    <table class="table table-striped">
                        <thead>
                        <tr>
                            <th>상품명</th>
                            <th>수량</th>
                            <th>가격</th>
                        </tr>
                        </thead>
                        <tbody id="modalTableBody">
                        </tbody>
                    </table>
                </div>
                <div class="col-md-8" style="padding-left:0;">
                    <br><br><br><br><br><br><br><br><br><br><br><br>
                    <p id="modalAddress">주소오오</p>
                    <p id="modalReceiveP">수령자아아아</p>
                </div>
                <div class="col-md-4" style="padding-right:0;">
                    <div class="text-right">
                        <h4 class="no-m m-t-sm">소 계</h4>
                        <h2 id="modalSubTotal" class="no-m">$7282</h2>
                        <hr>
                        <h4 class="no-m m-t-sm">배송비</h4>
                        <h2 class="no-m">2500 원</h2>
                        <hr>
                        <h4 class="no-m m-t-md text-success">총 결제금액</h4>
                        <h1 id="modalTotal" class="no-m text-success">$7522</h1>
                        <hr>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
            </div>
        </div>
    </div>
</div>

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
                                    <table id="deliveryTable" class="display table"
                                           style="width: 100%; cellspacing: 0;">
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
                                                <td><a href="javascript:orderModal('${singleOrder.pdOrderTbNo}')"
                                                       onmouseover="this.style.color='#0f89df'"
                                                       onmouseout="this.style.color='#3D464C'">${singleOrder.pdOrderTbNo}</a>
                                                </td>
                                                <td>${singleOrder.customerTbName}</td>
                                                <td>${singleOrder.pdOrderTbOrderDate}</td>
                                                <c:choose>
                                                    <c:when test="${singleOrder.pdOrderTbState eq 'W'}">
                                                        <td><span class="label label-warning">결제대기</span></td>
                                                        <td><span onclick="deleteOrder('${singleOrder.pdOrderTbNo}')"
                                                                  class="btn btn-danger">삭제</span></td>
                                                    </c:when>
                                                    <c:when test="${singleOrder.pdOrderTbState eq 'P'}">
                                                        <td><span class="label label-info">결제완료</span></td>
                                                        <td><span
                                                                onclick="updateState('${singleOrder.pdOrderTbNo}','D')"
                                                                class="btn btn-primary">배송시작</span></td>
                                                    </c:when>
                                                    <c:when test="${singleOrder.pdOrderTbState eq 'D'}">
                                                        <td><span class="label label-nowGo">배송중</span></td>
                                                        <td><span
                                                                onclick="updateState('${singleOrder.pdOrderTbNo}','A')"
                                                                class="btn btn-default">배송완료</span></td>
                                                    </c:when>
                                                    <c:when test="${singleOrder.pdOrderTbState eq 'A'}">
                                                        <td><span class="label label-success">배송완료</span></td>
                                                        <td></td>
                                                    </c:when>
                                                    <c:when test="${singleOrder.pdOrderTbState eq 'R'}">
                                                        <td><span class="label label-danger">환불요청</span></td>
                                                        <td><span
                                                                onclick="updateState('${singleOrder.pdOrderTbNo}','C')"
                                                                class="btn btn-danger">환불처리</span></td>
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
    function orderModal(orderNo) {
        $("#orderModalDiv").modal();

        var ajaxUrl = "/orderDetailAjax.ado?pdOrderTbNo="+orderNo;
        $.ajax({
            url: ajaxUrl,
            type: "GET",
            data: {},
            dataType: "json"
        })
            .done(function(json) {
                console.log(json);
                settingModal(json);
            })
            .fail(function (xhr, status, errorThrown) {
                alert(errorThrown);
            });
    }

    function settingModal(json){
        var detailList = json.detailList;
        var orderInfo = json.orderInfo;

        $("#modalOrderCode").text('주문번호: '+orderInfo.pdOrderTbNo);

        var tableBodyHTML = '';
        var subtotal = 0;

        for(var i=0; i<detailList.length; i++)
        {
            var singleOrderitem = detailList[i];

            tableBodyHTML += '<tr>\n' +
                '                            <td>'+singleOrderitem.pdSaleTbProductName+'</td>\n' +
                '                            <td>'+singleOrderitem.ordersDetailTbAmount+'</td>\n' +
                '                            <td>'+singleOrderitem.ordersDetailTbPrice+' 원</td>\n' +
                '                        </tr>'

            var singleprice = singleOrderitem.ordersDetailTbPrice;
            singleprice *= 1;
            subtotal += singleprice;
        }
        $("#modalTableBody").empty();
        $("#modalTableBody").append(tableBodyHTML);

        $("#modalSubTotal").text(subtotal+' 원');
        $("#modalTotal").text(orderInfo.pdOrderTbPayment+' 원');

        $("#modalAddress").text(orderInfo.pdOrderTbAddress);
        $("#modalReceiveP").text(orderInfo.pdOrderTbReceiver);
    }

    $(document).ready(function () {
        $("#deliveryTable").DataTable();
    });

    function deleteOrder(orderNum) {
        var url = '/deleteProductOrder.ado?pdOrderTbNo=' + orderNum;
        location.href = url;
    }

    function updateState(orderNum, stateTo) {
        var url = '/updateProductOrder.ado?pdOrderTbNo=' + orderNum + '&pdOrderTbState=' + stateTo;
        location.href = url;
    }
</script>

<!-- Javascripts -->
<jsp:include page="../include/scripts-load.jsp"/>
</body>
</html>
