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
                <h3 class="breadcrumb-header">재고관리</h3>
            </div>
            <div id="main-wrapper">
                <!-- Row -->
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">재고현황</h4>
                            </div>
                            <div class="panel-body">
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                            <div class="row">
                                                <div class="col-md-12">
                                                    <h5>판매 개시일 검색</h5>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col-md-4">
                                                    <input type="text" id="stockFromInput" class="date-picker text-center form-control"
                                                           placeholder="01/01/2020">
                                                </div>
                                                <div class="col-md-1">
                                                    <label class="text-center center-block">~</label>
                                                </div>
                                                <div class="col-md-4">
                                                    <input type="text" id="stockToInput" class="date-picker text-center form-control"
                                                           placeholder="01/15/2020" style="margin-bottom:14px;">
                                                </div>
                                                <div class="col-md-1">
                                                    <span class="btn btn-success" onclick="searchStock()" style="margin-bottom:14px;">조회</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <div class="table-responsive">
                                    <table id="stockProductTable" class="display table"
                                           style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>#</th>
                                            <th>상품코드</th>
                                            <th>상품명</th>
                                            <th>판매개시일</th>
                                            <th>현재수량</th>
                                            <th>통보수량</th>
                                            <th>신규입고수량</th>
                                        </tr>
                                        </thead>
                                        <tbody id="stockTableBody">
                                        <tr>
                                            <td></td>
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
                                <h4 class="panel-title">유통기한 임박상품</h4>
                            </div>
                            <div class="panel-body">
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                            <div class="row">
                                                <div class="col-md-12">
                                                    <h5>유통기한 검색</h5>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col-md-4">
                                                    <input type="text" id="expireFromInput" class="date-picker text-center form-control"
                                                           placeholder="01/01/2020">
                                                </div>
                                                <div class="col-md-1">
                                                    <label class="text-center center-block">~</label>
                                                </div>
                                                <div class="col-md-4">
                                                    <input type="text" id="expireToInput" class="date-picker text-center form-control"
                                                           placeholder="01/15/2020" style="margin-bottom:14px;">
                                                </div>
                                                <div class="col-md-1">
                                                    <span onclick="searchExpireDate()" class="btn btn-success" style="margin-bottom:14px;">조회</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <div class="table-responsive">
                                    <table id="expirationProductTable" class="display table"
                                           style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>#</th>
                                            <th>상품코드</th>
                                            <th>상품명</th>
                                            <th>판매개시일</th>
                                            <th>유통기한</th>
                                            <th>폐기처리</th>
                                        </tr>
                                        </thead>
                                        <tbody id="expireDayTableBody">
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
            </div>
            <!-- Main Wrapper -->
            <jsp:include page="../include/page-footer.jsp"/>
        </div>
        <!-- /Page Inner -->
        <jsp:include page="../include/right-sidebar.jsp"/>
    </div>
</div>


<!-- /Page Content -->
</div>
<!-- /Page Container -->

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script><script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
    function searchStock() {
        var stockAjaxParam = "/productStockListAjax.ado?dayFrom="+new Date($("#stockFromInput").val()).yyyymmdd()+"&dayTo="+new Date($("#stockToInput").val()).yyyymmdd();
        getDataFromServerAjax(stockAjaxParam, 'stock');
    }

    function searchExpireDate() {
        var expireAjaxParam = "/productExpireListAjax.ado?dayFrom="+new Date($("#expireFromInput").val()).yyyymmdd()+"&dayTo="+new Date($("#expireToInput").val()).yyyymmdd();
        getDataFromServerAjax(expireAjaxParam, 'expire');
    }

    function getDataFromServerAjax(urlTo, toWhere) {
        $.ajax({
            url: urlTo,
            type: "GET",
            data: {},
            dataType: "json"
        })
            .done(function(json) {
                //console.log(json);
                if(json.length === 0)
                {
                    alert("조회된 데이터가 없습니다.");
                }
                else
                {
                    if(toWhere === 'stock')
                    {
                        settingStockTable(json);
                    }
                    else if (toWhere === 'expire')
                    {
                        settingExpireTable(json);
                    }
                }
            })
            .fail(function (xhr, status, errorThrown) {
                alert(errorThrown);
            });
    }

    function settingStockTable(json)
    {
        var stockHTML = "";

        for(var i=0; i<json.length; i++)
        {
            var stockList = json[i];

            stockHTML += '<tr>';
            stockHTML += '<td>'+stockList.rowNumber+'</td>';
            stockHTML += '<td>'+stockList.productTbCode+'</td>';
            stockHTML += '<td>'+stockList.pdSaleTbProductName+'</td>';
            stockHTML += '<td>'+new Date(stockList.pdSaleTbStartDay).yyyymmdd()+'</td>';
            var remain = stockList.pdSaleTbRemainingAmount;
            var limit = stockList.pdSaleTbLimitAmount;
            if(remain - limit > 0)
            {
                stockHTML += '<td id="nowStock'+stockList.pdSaleTbNo+'"><span id="nowStockSpan'+stockList.pdSaleTbNo+'" class="label label-success">'+remain+'</span></td>';
            }
            else
            {
                stockHTML += '<td id="nowStock'+stockList.pdSaleTbNo+'"><span id="nowStockSpan'+stockList.pdSaleTbNo+'" class="label label-danger">'+remain+'</span></td>';
            }
            stockHTML += '<td id="limitStock'+stockList.pdSaleTbNo+'">'+stockList.pdSaleTbLimitAmount+'</td>';
            stockHTML += '<td><div class="row"><div class="col-lg-8 col-md-6 col-sm-3"><input id="productStockInput'+stockList.pdSaleTbNo+'" type="number" class="form-control"></div><button onclick="updateProductStock('+stockList.pdSaleTbNo+')" class="btn btn-primary">수정</button></div></td>';
            stockHTML += '</tr>';


        }
        $("#stockProductTable").DataTable().clear().destroy();
        $("#stockTableBody").empty();
        $("#stockTableBody").append(stockHTML);
        $("#stockProductTable").DataTable({
            scrollX: true,
        });
    }

    function settingExpireTable(json)
    {
        var expireHTML = "";

        for(var i=0; i<json.length; i++)
        {
            var expireList = json[i];

            // <td><span class="label label-success">21/12/25</span></td>


            expireHTML += '<tr id="expireItem'+expireList.pdSaleTbNo+'">';
            expireHTML += '<td>'+expireList.rowNumber+'</td>';
            expireHTML += '<td>'+expireList.productTbCode+'</td>';
            expireHTML += '<td>'+expireList.pdSaleTbProductName+'</td>';
            expireHTML += '<td>'+new Date(expireList.pdSaleTbStartDay).yyyymmdd()+'</td>';
            var expireDay = new Date(expireList.pdSaleTbExpireDay);
            var remainExpire = (expireDay-new Date())/1000/60/60/24/30;
            if(remainExpire < 1)
            {
                expireHTML += '<td><span class="label label-danger">'+expireDay.yyyymmdd()+'</span></td>';
            }
            else if(remainExpire >= 1 && remainExpire <3)
            {
                expireHTML += '<td><span class="label label-warning">'+expireDay.yyyymmdd()+'</span></td>';
            }
            else
            {
                expireHTML += '<td><span class="label label-success">'+expireDay.yyyymmdd()+'</span></td>';
            }

            expireHTML += '<td><button onclick="disposeProduct('+expireList.pdSaleTbNo+')" class="btn btn-danger">폐기</button></td>';
            expireHTML += '</tr>';


        }
        $("#expirationProductTable").DataTable().clear().destroy();
        $("#expireDayTableBody").empty();
        $("#expireDayTableBody").append(expireHTML);
        $("#expirationProductTable").DataTable();
    }

    function updateProductStock(saleNum) {
        var inputStock = "productStockInput"+saleNum;
        var addNum = document.getElementById(inputStock).value;
        var updateUrl = "/updateProductStockAjax.ado?pdSaleTbNo="+saleNum+"&pdSaleTbReceivedAmount="+addNum;
        $.ajax({
            url: updateUrl,
            type: "GET",
            data: {},
            dataType: "json"
        })
            .done(function(json) {
                //console.log(json);

                if(json.state === "success")
                {
                    $("#stockProductTable").DataTable().destroy();
                    var nowStockBefore = document.getElementById("nowStock"+saleNum).innerText;
                    // console.log(nowStockBefore);
                    nowStockBefore *= 1;
                    addNum *= 1;
                    var nowStockAfter = nowStockBefore+addNum;
                    // console.log(nowStockAfter);
                    var limit = document.getElementById("limitStock"+saleNum).innerText;
                    limit *= 1;
                    if(nowStockAfter > limit)
                    {
                        document.getElementById("nowStockSpan"+saleNum).setAttribute("class","label label-success");
                    }
                    else
                    {
                        document.getElementById("nowStockSpan"+saleNum).setAttribute("class","label label-danger");
                    }
                    document.getElementById("nowStockSpan"+saleNum).innerHTML = nowStockAfter;
                    $("#stockProductTable").DataTable();
                }
            })
            .fail(function (xhr, status, errorThrown) {
                alert(errorThrown);
            });
    }

    function disposeProduct(saleNum) {
        var updateUrl = "/stopSaleProductAjax.ado?pdSaleTbNo="+saleNum;
        $.ajax({
            url: updateUrl,
            type: "GET",
            data: {},
            dataType: "json"
        })
            .done(function(json) {
                //console.log(json);

                $("#expirationProductTable").DataTable().destroy();
                var expireTr = "expireItem"+saleNum;
                var target = document.getElementById(expireTr);
                var parent = document.getElementById("expireDayTableBody");
                parent.removeChild(target);
                $("#expirationProductTable").DataTable();
            })
            .fail(function (xhr, status, errorThrown) {
                alert(errorThrown);
            });
    }

    $(document).ready(function () {
        var twoMonth = getMonthAgoDate(2);

        $("#stockFromInput").attr("value", twoMonth.yyyymmdd());
        $("#stockToInput").attr("value", new Date().yyyymmdd());
        var stockTwoMonthAjaxUrl = "/productStockListAjax.ado?dayFrom="+twoMonth.yyyymmdd()+"&dayTo="+new Date().yyyymmdd();
        getDataFromServerAjax(stockTwoMonthAjaxUrl, 'stock');

        var threeMonthAfter = getMonthAfterDate(3);
        $("#expireFromInput").attr("value", new Date().yyyymmdd());
        $("#expireToInput").attr("value", threeMonthAfter.yyyymmdd());
        var expireTwoMonthAjaxUrl = "/productExpireListAjax.ado?dayFrom="+new Date().yyyymmdd()+"&dayTo="+threeMonthAfter.yyyymmdd();
        getDataFromServerAjax(expireTwoMonthAjaxUrl, 'expire');
    })
</script>
<!-- Javascripts -->
<jsp:include page="../include/scripts-load.jsp"/>
</body>
</html>
