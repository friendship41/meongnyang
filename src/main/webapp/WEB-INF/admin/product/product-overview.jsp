<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-09
  Time: 오후 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                                <h4 class="panel-title">주문현황</h4>
                            </div>
                            <div class="panel-body">
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                            <div class="row">
                                                <div class="col-md-4">
                                                    <input id="productOrderDayFrom" type="text" class="date-picker text-center form-control" placeholder="01/01/2020">
                                                </div>
                                                <div class="col-md-1">
                                                    <label class="text-center center-block">~</label>
                                                </div>
                                                <div class="col-md-4">
                                                    <input id="productOrderDayTo" type="text" class="date-picker text-center form-control" placeholder="01/15/2020" style="margin-bottom:14px;">
                                                </div>
                                                <div class="col-md-1">
                                                    <span onclick="getProductOrderTable()" class="btn btn-success" style="margin-bottom:14px;">조회</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
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
                                        <tbody id="orderTableBody">
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
                <!-- row -->
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">판매 상품현황</h4>
                            </div>
                            <div class="panel-body">
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                            <div class="row">
                                                <div class="col-md-4">
                                                    <input id="productSaleDayFromInput" type="text" class="date-picker text-center form-control"
                                                           placeholder="01/01/2020">
                                                </div>
                                                <div class="col-md-1">
                                                    <label class="text-center center-block">~</label>
                                                </div>
                                                <div class="col-md-4">
                                                    <input id="productSaleDayToInput" type="text" class="date-picker text-center form-control"
                                                           placeholder="01/15/2020" style="margin-bottom:14px;">
                                                </div>
                                                <div class="col-md-1">
                                                    <span onclick="getProductSaleTable()" class="btn btn-success" style="margin-bottom:14px;">조회</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <div class="table-responsive">
                                    <table id="onSaleProductTable" class="display table"
                                           style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>상품번호</th>
                                            <th>상품이름</th>
                                            <th>프로모션적용여부</th>
                                            <th>판매가격</th>
                                            <th>할인율</th>
                                            <th>잔량</th>
                                            <th>평점</th>
                                            <th>상품내리기</th>
                                            <th>배너여부</th>
                                            <th>배너등록</th>
                                        </tr>
                                        </thead>
                                        <tbody id="onSaleProductTableBody">
                                        <tr>
                                            <td></td>
                                            <td></td>
                                            <td></td>
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
                    <div class="col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">인기상품현황</h4>
                            </div>
                            <div class="panel-body">
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                            <div class="row">
                                                <div class="col-md-4">
                                                    <input type="text" class="date-picker text-center form-control"
                                                           placeholder="01/01/2020">
                                                </div>
                                                <div class="col-md-1">
                                                    <label class="text-center center-block">~</label>
                                                </div>
                                                <div class="col-md-4">
                                                    <input type="text" class="date-picker text-center form-control"
                                                           placeholder="01/15/2020" style="margin-bottom:14px;">
                                                </div>
                                                <div class="col-md-1">
                                                    <button type="submit" class="btn btn-success center-block"
                                                            style="margin-bottom:14px;">조회
                                                    </button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <div id="grid-gallery" class="grid-gallery">
                                    <section class="grid-wrap">
                                        <ul class="grid">
                                            <li class="grid-sizer"></li>
                                            <li>
                                                <figure>
                                                    <img src="http://via.placeholder.com/674x800" alt="img03"/>
                                                    <figcaption><h3>Brunch semiotics</h3>
                                                        <p>Ex disrupt cray yr, butcher pour-over magna umami kitsch
                                                            before they sold out commodo.</p></figcaption>
                                                </figure>
                                            </li>
                                            <li>
                                                <figure>
                                                    <img src="http://via.placeholder.com/674x800" alt="img03"/>
                                                    <figcaption><h3>Brunch semiotics</h3>
                                                        <p>Ex disrupt cray yr, butcher pour-over magna umami kitsch
                                                            before they sold out commodo.</p></figcaption>
                                                </figure>
                                            </li>
                                            <li>
                                                <figure>
                                                    <img src="http://via.placeholder.com/674x800" alt="img03"/>
                                                    <figcaption><h3>Brunch semiotics</h3>
                                                        <p>Ex disrupt cray yr, butcher pour-over magna umami kitsch
                                                            before they sold out commodo.</p></figcaption>
                                                </figure>
                                            </li>
                                            <li>
                                                <figure>
                                                    <img src="http://via.placeholder.com/674x800" alt="img03"/>
                                                    <figcaption><h3>Brunch semiotics</h3>
                                                        <p>Ex disrupt cray yr, butcher pour-over magna umami kitsch
                                                            before they sold out commodo.</p></figcaption>
                                                </figure>
                                            </li>
                                        </ul>
                                    </section>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- !Row -->
                <!-- row -->
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">전체상품 현황</h4>
                            </div>
                            <div class="panel-body">
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                            <div class="row">
                                                <div class="col-md-12">
                                                    <h5>상품 등록일 검색</h5>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col-md-4">
                                                    <input id="allProductDayFrominput" type="text" class="date-picker text-center form-control"
                                                           placeholder="01/01/2020">
                                                </div>
                                                <div class="col-md-1">
                                                    <label class="text-center center-block">~</label>
                                                </div>
                                                <div class="col-md-4">
                                                    <input id="allProductDayToinput" type="text" class="date-picker text-center form-control"
                                                           placeholder="01/15/2020" style="margin-bottom:14px;">
                                                </div>
                                                <div class="col-md-1">
                                                    <span onclick="getProductAllTable()" class="btn btn-success" style="margin-bottom:14px;">조회</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <div class="table-responsive">
                                    <table id="holdProductTable" class="display table" style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>상품번호</th>
                                            <th>카테고리</th>
                                            <th>상품이름</th>
                                            <th>이미지등록여부</th>
                                            <th>판매등록여부</th>
                                            <th>판매등록</th>
                                        </tr>
                                        </thead>
                                        <tbody id="holdProductTableBody">
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
    <!-- /Page Content -->
</div>
<!-- /Page Container -->

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
    function getProductOrderTable() {
        var dayFrom = $("#productOrderDayFrom").val();
        var dayTo = $("#productOrderDayTo").val();
        var url = "/productOrderOverviewAjax.ado?dayFrom="+dayFrom+"&dayTo="+dayTo;
        getDataFromServerAjax(url, 'productOrderTable');
    }

    function getProductAllTable()
    {
        var dayFrom = $("#allProductDayFrominput").val();
        var dayTo = $("#allProductDayToinput").val();
        var url = "/productAllTableAjax.ado?dayFrom="+dayFrom+"&dayTo="+dayTo;
        getDataFromServerAjax(url, 'productTable');
    }

    function getProductSaleTable() {
        var dayFrom = $("#productSaleDayFromInput").val();
        var dayTo = $("#productSaleDayToInput").val();
        var url = "/productSaleOverviewAjax.ado?dayFrom="+dayFrom+"&dayTo="+dayTo;
        getDataFromServerAjax(url, 'productSaleTable');
    }

    function updateProductBannerState(productTbCode, toStateYN) {
        var url = "/updateProductBannerStateAjax.ado?productTbCode="+productTbCode+"&productTbBannerState="+toStateYN;
        getDataFromServerAjax(url, 'updateBannerState')
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
                    if(toWhere === 'productTable')
                    {
                        settingProductAllTable(json);
                    }
                    else if(toWhere === 'productSaleTable')
                    {
                        settingProductSaleTable(json);
                    }
                    else if(toWhere === 'stopSale')
                    {
                        settingStopSaleResult(json);
                    }
                    else if(toWhere === 'updateBannerState')
                    {
                        getProductSaleTable();
                    }
                    else if(toWhere === 'productOrderTable')
                    {
                        settingProductOrderTable(json);
                    }
                }
            })
            .fail(function (xhr, status, errorThrown) {
                alert(errorThrown);
            });
    }

    function settingProductOrderTable(json) {
        var productOrderHTML = "";

        for(var i=0; i<json.length; i++)
        {
            var singleOrder = json[i];

            var cnt = singleOrder.orderProductCount;
            cnt *= 1;
            cnt--;

            var orderDate = new Date(singleOrder.pdOrderTbOrderDate).yyyymmdd();

            var orderState = singleOrder.pdOrderTbState;

            productOrderHTML += '<tr>';
            productOrderHTML += '<td>'+singleOrder.pdOrderTbNo+'</td>';
            if(cnt === 0)
            {
                productOrderHTML += '<td>'+singleOrder.pdSaleTbProductName+'</td>';
            }
            else
            {
                productOrderHTML += '<td>'+singleOrder.pdSaleTbProductName+' 외 '+cnt+'종'+'</td>';
            }
            productOrderHTML += '<td>'+singleOrder.customerTbName+'</td>';
            productOrderHTML += '<td>'+singleOrder.pdOrderTbPayment+'</td>';
            productOrderHTML += '<td>'+orderDate+'</td>';

            productOrderHTML += '<td>';
            if(orderState === 'W')
            {
                productOrderHTML += '<span class="label label-warning">결제대기</span>';
            }
            else if(orderState === 'P')
            {
                productOrderHTML += '<span class="label label-info">결제완료</span>';
            }
            else if(orderState === 'D')
            {
                productOrderHTML += '<span class="label label-nowGo">배송중</span>';
            }
            else if(orderState === 'A')
            {
                productOrderHTML += '<span class="label label-success">배송완료</span>';
            }
            else if(orderState === 'C')
            {
                productOrderHTML += '<span class="label label-danger">결제취소</span>';
            }

            productOrderHTML += '</td>';
            productOrderHTML += '</tr>';


            $("#orderTable").DataTable().clear().destroy();
            $("#orderTableBody").empty();
            $("#orderTableBody").append(productOrderHTML);
            $("#orderTable").DataTable();
        }
    }

    function settingProductAllTable(json) {
        var productAllHTML = "";

        for(var i=0; i<json.length; i++)
        {
            var productSingle = json[i];

            productAllHTML += "<tr>";
            productAllHTML += "<td>"+productSingle.productTbCode+"</td>";
            productAllHTML += "<td>"+productSingle.productCategoryTbParent+"-"+productSingle.productCategoryTbMedian+"-"+productSingle.productCategoryTbSub+"</td>";
            productAllHTML += "<td><a href=\"updateProduct.ado?productTbCode="+productSingle.productTbCode+"\" style=\"color: #0a6aa1; font-weight: bold;\">"+productSingle.productTbName+"</a></td>";
            productAllHTML += '<td><a href="productImageAdd.ado?productTbCode='+productSingle.productTbCode+'&resultMessage=none" class="btn btn-default btn-xs">'+productSingle.productImageCount+'</a></td>';
            productAllHTML += '<td>'+productSingle.productSaleCount+'</td>';
            productAllHTML += "<td><button class=\"btn btn-success\" onclick=\"location.href='/insertProductSale.ado?productTbCode="+productSingle.productTbCode+"'\">판매등록</button></td>";
            productAllHTML += "</tr>";
        }
        $("#holdProductTable").DataTable().clear().destroy();
        $("#holdProductTableBody").empty();
        $("#holdProductTableBody").append(productAllHTML);
        $("#holdProductTable").DataTable();
    }

    function settingProductSaleTable(json) {
        var productSaleHTML = "";

        for(var i=0; i<json.length; i++)
        {
            var productSaleSingle = json[i];

            productSaleHTML += '<tr>';
            productSaleHTML += '<td>'+productSaleSingle.productTbCode+'</td>';
            productSaleHTML += '<td>'+productSaleSingle.pdSaleTbProductName+'</td>';
            if(productSaleSingle.promotionTbCode === 0)
            {
                productSaleHTML += '<td>적용안됨</td>';
            }
            else
            {
                productSaleHTML += '<td>적용됨</td>';
            }
            productSaleHTML += '<td>'+productSaleSingle.pdSaleTbSalesPrice+'</td>';
            productSaleHTML += '<td>'+productSaleSingle.pdSaleTbDiscountRate+'%</td>';
            productSaleHTML += '<td>'+productSaleSingle.pdSaleTbRemainingAmount+'</td>';
            productSaleHTML += '<td>'+productSaleSingle.pdSaleTbRating+'</td>';
            if(productSaleSingle.pdSaleTbState === 'Y')
            {
                productSaleHTML += '<td><button id="productSaleBtn'+productSaleSingle.pdSaleTbNo+'" class="btn btn-primary" onclick="stopSale('+productSaleSingle.pdSaleTbNo+')">판매중지</button></td>';
            }
            else
            {
                productSaleHTML += '<td><button id="productSaleBtn'+productSaleSingle.pdSaleTbNo+'" class="btn btn-primary" onclick="location.href=\'restartSaleProduct.ado?pdSaleTbNo='+productSaleSingle.pdSaleTbNo+'\'">판매재등록</button></td>';
            }
            if(productSaleSingle.productTbBannerState === 'N')
            {
                productSaleHTML += '<td>미등록</td>';
                productSaleHTML += '<td><button class="btn btn-success" onclick="updateProductBannerState(\''+productSaleSingle.productTbCode+'\',\'Y\''+')">배너등록</button></td>';
            }
            else
            {
                productSaleHTML += '<td>등록됨</td>';
                productSaleHTML += '<td><button class="btn btn-danger" onclick="updateProductBannerState(\''+productSaleSingle.productTbCode+'\',\'N\''+')">배너해제</button></td>';
            }
            productSaleHTML += '</tr>';
        }
        $("#onSaleProductTable").DataTable().clear().destroy();
        $("#onSaleProductTableBody").empty();
        $("#onSaleProductTableBody").append(productSaleHTML);
        $("#onSaleProductTable").DataTable({
            scrollX: true,
        });
    }

    function stopSale(pdSaleTbNo){
        var url = "/stopSaleProductAjax.ado?pdSaleTbNo="+pdSaleTbNo;
        getDataFromServerAjax(url,"stopSale");
    }

    function settingStopSaleResult(json){
        var saleBtn = "productSaleBtn"+json.pdSaleTbNo;
        console.log(saleBtn);
        $("#onSaleProductTable").DataTable().destroy();
        document.getElementById(saleBtn).setAttribute("onclick", "location.href='restartSaleProduct.ado?pdSaleTbNo="+json.pdSaleTbNo+"'");
        document.getElementById(saleBtn).innerText = "판매재등록";
        //document.getElementById(saleTd).innerHTML = '<button class="btn btn-primary" onclick="location.href=\'restartSaleProduct.ado?pdSaleTbNo='+json.pdSaleTbNo+'\'">판매재등록</button>';
        $("#onSaleProductTable").DataTable();
    }


    $(document).ready(function () {
        $("#allProductDayFrominput").attr("value", getMonthAgoDate(6).yyyymmdd());
        $("#allProductDayToinput").attr("value", new Date().yyyymmdd());
        getProductAllTable();

        $("#productSaleDayFromInput").attr("value", getMonthAgoDate(6).yyyymmdd());
        $("#productSaleDayToInput").attr("value", new Date().yyyymmdd());
        getProductSaleTable();

        $("#productOrderDayFrom").attr("value", getMonthAgoDate(6).yyyymmdd());
        $("#productOrderDayTo").attr("value", new Date().yyyymmdd());
        getProductOrderTable();
    })
</script>
<!-- Javascripts -->
<jsp:include page="../include/scripts-load.jsp"/>
</body>
</html>
