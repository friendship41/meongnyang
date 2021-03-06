<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-09
  Time: 오후 9:21
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
                <h3 class="breadcrumb-header">상품 분석</h3>
            </div>
            <div id="main-wrapper">
                <!-- Row -->
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">조회수 대비 판매상품</h4>
                            </div>
                            <div class="panel-body">
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                            <div class="row">
                                                <div class="col-md-4">
                                                    <input id="readcountSaleDayFrom" type="text" class="date-picker text-center form-control" placeholder="01/01/2020">
                                                </div>
                                                <div class="col-md-1">
                                                    <label class="text-center center-block">~</label>
                                                </div>
                                                <div class="col-md-4">
                                                    <input id="readcountSaleDayTo" type="text" class="date-picker text-center form-control" placeholder="01/15/2020" style="margin-bottom:14px;">
                                                </div>
                                                <div class="col-md-1">
                                                    <span onclick="getReadcountSaleTable()" class="btn btn-success" style="margin-bottom:14px;">조회</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <div class="table-responsive">
                                    <table id="readCountProductTable" class="display table" style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>순위</th>
                                            <th>상품번호</th>
                                            <th>카테고리</th>
                                            <th>상품명</th>
                                            <th>조회수</th>
                                            <th>판매건수</th>
                                        </tr>
                                        </thead>
                                        <tfoot>
                                        <tr>
                                            <th>순위</th>
                                            <th>상품번호</th>
                                            <th>카테고리</th>
                                            <th>상품명</th>
                                            <th>조회수</th>
                                            <th>판매건수</th>
                                        </tr>
                                        </tfoot>
                                        <tbody id="readcountSaleTableBody">
                                        <tr>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
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
                                <h4 class="panel-title">반품 랭킹</h4>
                            </div>
                            <div class="panel-body">
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                            <div class="row">
                                                <div class="col-md-4">
                                                    <input id="cancelRankingDayFrom" type="text" class="date-picker text-center form-control" placeholder="01/01/2020">
                                                </div>
                                                <div class="col-md-1">
                                                    <label class="text-center center-block">~</label>
                                                </div>
                                                <div class="col-md-4">
                                                    <input id="cancelRankingDayTo" type="text" class="date-picker text-center form-control" placeholder="01/15/2020" style="margin-bottom:14px;">
                                                </div>
                                                <div class="col-md-1">
                                                    <span onclick="getCancelRankingTable()" class="btn btn-success" style="margin-bottom:14px;">조회</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <div class="table-responsive">
                                    <table id="cancelRankingTable" class="display table" style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>순위</th>
                                            <th>상품번호</th>
                                            <th>카테고리</th>
                                            <th>상품명</th>
                                            <th>반품/환불 수</th>
                                        </tr>
                                        </thead>
                                        <tfoot>
                                        <tr>
                                            <th>순위</th>
                                            <th>상품번호</th>
                                            <th>카테고리</th>
                                            <th>상품명</th>
                                            <th>반품/환불 수</th>
                                        </tr>
                                        </tfoot>
                                        <tbody id="cancelRankingTableBody">
                                        <tr>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
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
                                <h4 class="panel-title">마케팅 대비 판매 실적</h4>
                            </div>
                            <div class="panel-body">
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                            <div class="row">
                                                <div class="col-md-4">
                                                    <select id="promotionSelect">
                                                        <option value="-1" selected>프로모션을 선택해 주세요</option>
                                                        <c:forEach var="promotionSingle" items="${promotionList}">
                                                            <option value="${promotionSingle.promotionTbCode}">${promotionSingle.promotionTbName}</option>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                                <div class="col-md-1">
                                                    <span onclick="getPromotionedProductTable()" class="btn btn-success" style="margin-bottom:14px;">조회</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <div class="table-responsive">
                                    <table id="promotionedProductTable" class="display table" style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>프로모션코드</th>
                                            <th>프로모션명</th>
                                            <th>상품코드</th>
                                            <th>카테고리</th>
                                            <th>상품명</th>
                                            <th>판매량</th>
                                        </tr>
                                        </thead>
                                        <tbody id="promotionedProductTableBody">
                                        <tr>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
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
    function getReadcountSaleTable() {
        var dayFrom = $("#readcountSaleDayFrom").val();
        var dayTo = $("#readcountSaleDayTo").val();
        var url = "/readcountSaleListAjax.ado?dayFrom="+dayFrom+"&dayTo="+dayTo;
        getDataFromServerAjax(url, 'readcountSaleTable');
    }

    function getCancelRankingTable() {
        var dayFrom = $("#cancelRankingDayFrom").val();
        var dayTo = $("#cancelRankingDayTo").val();
        var url = "/productCancelRankingAjax.ado?dayFrom="+dayFrom+"&dayTo="+dayTo;
        getDataFromServerAjax(url, 'cancelRankingTable');
    }

    function getPromotionedProductTable() {
        var promotionCode = $("#promotionSelect option:selected").val();
        promotionCode *= 1;
        if(promotionCode === -1)
        {
            alert('프로모션을 선택해 주세요');
        }
        else
        {
            var url = "/productPromotionedAjax.ado?promotionTbCode="+promotionCode;
            getDataFromServerAjax(url, 'promotionedProductTable');
        }
    }


    function getDataFromServerAjax(urlTo, toWhere) {
        $.ajax({
            url: urlTo,
            type: "GET",
            data: {},
            dataType: "json"
        })
            .done(function(json) {
                console.log(json);
                if(json.length === 0)
                {
                    alert("조회된 데이터가 없습니다.");
                }
                else
                {
                    if(toWhere === 'readcountSaleTable')
                    {
                        settingReadcountSaleTable(json);
                    }
                    else if(toWhere === 'cancelRankingTable')
                    {
                        settingCancelRankingTable(json);
                    }
                    else if(toWhere === 'promotionedProductTable')
                    {
                        settingPromotionedProductTable(json);
                    }
                }
            })
            .fail(function (xhr, status, errorThrown) {
                alert(errorThrown);
            });
    }


    function settingReadcountSaleTable(json) {
        var readcountSaleHTML = "";

        for(var i=0; i<json.length; i++)
        {
            var readcountSaleSingle = json[i];

            readcountSaleHTML += '<tr>';
            readcountSaleHTML += '<td>'+readcountSaleSingle.rnum+'</td>';
            readcountSaleHTML += '<td>'+readcountSaleSingle.productTbCode+'</td>';
            readcountSaleHTML += '<td>'+readcountSaleSingle.productCategoryTbParent+'-'+readcountSaleSingle.productCategoryTbMedian+'-'+readcountSaleSingle.productCategoryTbSub+'</td>';
            readcountSaleHTML += '<td>'+readcountSaleSingle.productTbName+'</td>';
            readcountSaleHTML += '<td>'+readcountSaleSingle.pdSaleTbReadCount+'</td>';
            readcountSaleHTML += '<td>'+readcountSaleSingle.odCnt+'</td>';
            readcountSaleHTML += '</tr>';
        }
        $("#readCountProductTable").DataTable().clear().destroy();
        $("#readcountSaleTableBody").empty();
        $("#readcountSaleTableBody").append(readcountSaleHTML);
        $("#readCountProductTable").DataTable();
    }


    function settingCancelRankingTable(json) {
        var cancelRankingHTML = "";

        for(var i=0; i<json.length; i++)
        {
            var cancelRankingSingle = json[i];

            cancelRankingHTML += '<tr>';
            cancelRankingHTML += '<td>'+cancelRankingSingle.rnum+'</td>';
            cancelRankingHTML += '<td>'+cancelRankingSingle.productTbCode+'</td>';
            cancelRankingHTML += '<td>'+cancelRankingSingle.productCategoryTbParent+'-'+cancelRankingSingle.productCategoryTbMedian+'-'+cancelRankingSingle.productCategoryTbSub+'</td>';
            cancelRankingHTML += '<td>'+cancelRankingSingle.productTbName+'</td>';
            cancelRankingHTML += '<td>'+cancelRankingSingle.cancelCnt+'</td>';
            cancelRankingHTML += '</tr>';

        }
        $("#cancelRankingTable").DataTable().clear().destroy();
        $("#cancelRankingTableBody").empty();
        $("#cancelRankingTableBody").append(cancelRankingHTML);
        $("#cancelRankingTable").DataTable();
    }


    function settingPromotionedProductTable(json) {
        var promotionedProductHTML = "";

        for(var i=0; i<json.length; i++)
        {
            var promotionedProductSingle = json[i];

            promotionedProductHTML += '<tr>';
            promotionedProductHTML += '<td>'+promotionedProductSingle.promotionTbCode+'</td>';
            promotionedProductHTML += '<td>'+promotionedProductSingle.promotionTbName+'</td>';
            promotionedProductHTML += '<td>'+promotionedProductSingle.productTbCode+'</td>';
            promotionedProductHTML += '<td>'+promotionedProductSingle.productCategoryTbParent+'-'+promotionedProductSingle.productCategoryTbMedian+'-'+promotionedProductSingle.productCategoryTbSub+'</td>';
            promotionedProductHTML += '<td>'+promotionedProductSingle.pdSaleTbProductName+'</td>';
            promotionedProductHTML += '<td>'+promotionedProductSingle.saleCnt+'</td>';
            promotionedProductHTML += '</tr>';



        }
        $("#promotionedProductTable").DataTable().clear().destroy();
        $("#promotionedProductTableBody").empty();
        $("#promotionedProductTableBody").append(promotionedProductHTML);
        $("#promotionedProductTable").DataTable();
    }


    $(document).ready(function () {
        $("#readcountSaleDayFrom").attr("value", getMonthAgoDate(6).yyyymmdd());
        $("#readcountSaleDayTo").attr("value", new Date().yyyymmdd());
        getReadcountSaleTable();

        $("#cancelRankingDayFrom").attr("value", getMonthAgoDate(6).yyyymmdd());
        $("#cancelRankingDayTo").attr("value", new Date().yyyymmdd());
        getCancelRankingTable();
    })

</script>


<!-- Javascripts -->
<jsp:include page="../include/scripts-load.jsp"/>
</body>
</html>
