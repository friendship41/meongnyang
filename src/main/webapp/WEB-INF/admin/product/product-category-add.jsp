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
                <h3 class="breadcrumb-header">카테고리 추가</h3>
            </div>
            <!-- Main Wrapper -->
            <div id="main-wrapper">
                <!-- Row -->
                <div class="row">
                    <div class="col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-body">

                                <form class="form-horizontal" id="formToController" action="productCategoryInsert.ado" method="post">
                                    <input type="hidden" name="productCategoryTbNo" id="productCategoryTbNo" value="0">
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">카테고리</label>
                                        <div class="col-sm-10">
                                            <select style="margin-bottom:15px;" class="form-control" id="categorySelectBox">
                                                <option value="thisIsInsert">카테고리 추가할시 선택해주세요</option>
                                                <c:forEach var="category" items="${productCategoryList}">
                                                    <option value="${category.productCategoryTbNo}">${category.productCategoryTbParent}-${category.productCategoryTbMedian}-${category.productCategoryTbSub}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="productCategoryTbParent" class="col-sm-2 control-label">최상위 카테고리</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" id="productCategoryTbParent" name="productCategoryTbParent" required>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">중위 카테고리</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" id="productCategoryTbMedian" name="productCategoryTbMedian" required>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">최하위 카테고리</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" id="productCategoryTbSub" name="productCategoryTbSub" required>
                                        </div>
                                    </div>
                                    <div class="col-md-2"></div>
                                    <div class="col-md-10" id="formButtonsHere">
                                        <button id="categorySubmitButton" class="btn btn-primary">카테고리 등록</button>
                                        <a href="#" class="btn btn-primary" id="deleteCategoryBtn">카테고리 삭제</a>
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

<!-- 기본 jQuery -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script><script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
    $(document).ready(function () {
        $("#deleteCategoryBtn").hide();

        $("#categorySelectBox").change(function () {
            var selectedValue = $("#categorySelectBox option:selected").val();
            console.log(selectedValue);
            if(selectedValue === 'thisIsInsert')
            {
                $("#categorySubmitButton").html('카테고리 추가');
                $("#deleteCategoryBtn").hide();
                $("#productCategoryTbNo").attr("value", 0);
                $("#productCategoryTbParent").removeAttr("value");
                $("#productCategoryTbMedian").removeAttr("value");
                $("#productCategoryTbSub").removeAttr("value");
                $("#formToController").attr("action", "productCategoryInsert.ado");
            }
            else
            {
                var ajaxUrl = "/productCategorySingleAjax.ado?productCategoryTbNo="+selectedValue;
                $.ajax({
                    url: ajaxUrl,
                    type: "GET",
                    data: {},
                    dataType: "json"
                })
                    .done(function(json) {
                        console.log(json);
                        $("#productCategoryTbNo").attr("value", json.productCategoryTbNo);
                        $("#productCategoryTbParent").attr("value", json.productCategoryTbParent);
                        $("#productCategoryTbMedian").attr("value", json.productCategoryTbMedian);
                        $("#productCategoryTbSub").attr("value", json.productCategoryTbSub);
                        $("#categorySubmitButton").html('카테고리 수정');
                        $("#deleteCategoryBtn").show();
                        var deleteUrl = "/productCategoryDelete.ado?productCategoryTbNo="+json.productCategoryTbNo;
                        $("#deleteCategoryBtn").attr("href", deleteUrl);
                        $("#formToController").attr("action", "productCategoryUpdate.ado");
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