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
                <h3 class="breadcrumb-header">판매 재등록</h3>
            </div>
            <!-- Main Wrapper -->
            <div id="main-wrapper">
                <!-- Row -->
                <div class="row">
                    <div class="col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-body">
                                <form class="form-horizontal" action="restartSaleProduct.ado" method="post">
                                    <input type="hidden" name="pdSaleTbNo" value="${productSale.pdSaleTbNo}">
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">이름</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" name="pdSaleTbProductName" value="${productSale.pdSaleTbProductName}" readonly>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">프로모션코드</label>
                                        <div class="col-sm-10">
                                            <select id="promotionSelectBox" class="form-control" name="promotionTbCode">
                                                <option value="-1">선택 없음</option>
                                                <c:forEach var="promotion" items="${promotionList}">
                                                    <c:choose>
                                                        <c:when test="${promotion.promotionTbCode eq productSale.promotionTbCode}">
                                                            <option value="${promotion.promotionTbCode}" selected>${promotion.promotionTbName}</option>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <option value="${promotion.promotionTbCode}">${promotion.promotionTbName}</option>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">입고가격</label>
                                        <div class="col-sm-10">
                                            <input type="number" class="form-control" name="pdSaleTbReceivedPrice" value="${productSale.pdSaleTbReceivedPrice}" required>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">판매가격</label>
                                        <div class="col-sm-10">
                                            <input type="number" class="form-control" name="pdSaleTbSalesPrice" value="${productSale.pdSaleTbSalesPrice}" required>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">수량</label>
                                        <div class="col-sm-10">
                                            <input type="number" class="form-control" name="pdSaleTbRemainingAmount" value="${productSale.pdSaleTbRemainingAmount}" readonly required>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">통보수량</label>
                                        <div class="col-sm-10">
                                            <input type="number" class="form-control" name="pdSaleTbLimitAmount" value="${productSale.pdSaleTbLimitAmount}" required>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">판매개시일</label>
                                        <div class="col-sm-10">
                                            <input type="text" id="saleStartDateInput" class="form-control date-picker" name="pdSaleTbStartDay" required>
                                        </div>
                                    </div>
                                    <!-- 먹거리면 유통기한 -->
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">유통기한</label>
                                        <div class="col-sm-10">
                                            <input id="inputPdSaleTbExpireDay" type="text" class="form-control date-picker" name="pdSaleTbExpireDay" value="${productSale.pdSaleTbExpireDay}">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">할인율</label>
                                        <div class="col-sm-10">
                                            <input type="number" id="discountInput" class="form-control" name="pdSaleTbDiscountRate" placeholder="2자리 할인율을 적어주세요" value='${productSale.pdSaleTbDiscountRate}' required>
                                        </div>
                                    </div>
                                    <div class="col-md-2"></div>
                                    <div class="col-md-10">
                                        <button class="btn btn-primary">판매재등록</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>

                </div>
                <!-- !Row -->
            </div>
            <!-- !Main Wrapper -->
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
    $("form").on("submit", function() {
        inputCheck();
    });

    function inputCheck(){
        var expire = $("#inputPdSaleTbExpireDay").val();
        if(expire === '' || expire === null)
        {
            $("#inputPdSaleTbExpireDay").remove();
        }
        var discountInput = $("#discountInput").val();
        if(discountInput === '' || discountInput === null)
        {
            $("#discountInput").attr("value", 0);
        }
    }

    $(document).ready(function () {
        $("#promotionSelectBox").change(function () {
            var selectedValue = $("#promotionSelectBox option:selected").val();
            //console.log(selectedValue);
            if(selectedValue === '-1')
            {
                $("#discountInput").attr("value","0");
            }
            else
            {
                var ajaxUrl = "/promotionSelectAjax.ado?promotionTbCode="+selectedValue;
                $.ajax({
                    url: ajaxUrl,
                    type: "GET",
                    data: {},
                    dataType: "json"
                })
                    .done(function(json) {
                        //console.log(json);
                        $("#discountInput").attr("value", json.promotionTbDiscountRate);
                    })
                    .fail(function (xhr, status, errorThrown) {
                        alert(errorThrown);
                    });
            }
        });
    })
</script>
<!-- Javascripts -->
<jsp:include page="../include/scripts-load.jsp"/>

</body>
</html>
