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
                <h3 class="breadcrumb-header">판매 등록</h3>
            </div>
            <!-- Main Wrapper -->
            <div id="main-wrapper">
                <!-- Row -->
                <div class="row">
                    <div class="col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-body">
                                <form class="form-horizontal" action="insertProductSale.ado" method="post">
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">제품코드</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" name="productTbCode" value="${product.productTbCode}" readonly required>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">이름</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" name="pdSaleTbProductName" value="${product.productTbName}" readonly>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">프로모션코드</label>
                                        <div class="col-sm-10">
                                            <select id="promotionSelectBox" class="form-control" name="promotionTbCode">
                                                <option value="-1">선택 없음</option>
                                                <c:forEach var="promotion" items="${promotionList}">
                                                    <option value="${promotion.promotionTbCode}">${promotion.promotionTbName}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">입고가격</label>
                                        <div class="col-sm-10">
                                            <input type="number" class="form-control" name="pdSaleTbReceivedPrice" required>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">판매가격</label>
                                        <div class="col-sm-10">
                                            <input type="number" class="form-control" name="pdSaleTbSalesPrice" required>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">입고수량</label>
                                        <div class="col-sm-10">
                                            <input type="number" class="form-control" name="pdSaleTbReceivedAmount" required>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">통보수량</label>
                                        <div class="col-sm-10">
                                            <input type="number" class="form-control" name="pdSaleTbLimitAmount" required>
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
                                            <input type="text" class="form-control date-picker" name="pdSaleTbExpireDay" id="inputPdSaleTbExpireDay">
                                        </div>
                                    </div>
                                    <!-- 옷이면 사이즈 먹거리면 용량 -->
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">사이즈/용량</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" name="pdSaleTbSize" placeholder="S/M/L, xxg, xxKg" required>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">할인율</label>
                                        <div class="col-sm-10">
                                            <input type="text" id="discountInput" class="form-control" name="pdSaleTbDiscountRate" placeholder="2자리 할인율을 적어주세요" required>
                                        </div>
                                    </div>

                                    <div class="col-md-2"></div>
                                    <div class="col-md-10">
                                        <button type="submit" class="btn btn-primary">판매등록</button>
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

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script><script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
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
    }

    $(document).ready(function () {
        var repCheck = ${repCheck};
        if(repCheck ===false)
        {
            alert("대표이미지가 설정되지 않았습니다.");
            history.back();
        }

        $("#promotionSelectBox").change(function () {
            var selectedValue = $("#promotionSelectBox option:selected").val();
            console.log(selectedValue);
            if(selectedValue === '-1')
            {
                $("#discountInput").attr("value","");
                $("#saleStartDateInput").attr("value","");
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
                        console.log(json);
                        $("#discountInput").attr("value", json.promotionTbDiscountRate);
                        $("#saleStartDateInput").attr("value", json.promotionTbStartDate);
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
