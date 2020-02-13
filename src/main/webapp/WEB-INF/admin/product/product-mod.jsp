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
                <h3 class="breadcrumb-header">상품 수정</h3>
            </div>
            <!-- Main Wrapper -->
            <div id="main-wrapper">
                <!-- Row -->
                <div class="row">
                    <div class="col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-body">
                                <form class="form-horizontal" action="updateProduct.ado" method="post" enctype="multipart/form-data">
                                    <input type="hidden" name="productTbCode" value="${product.productTbCode}">
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">카테고리</label>
                                        <div class="col-sm-10">
                                            <select style="margin-bottom:15px;" class="form-control" name="productCategoryTbNo">
                                                <c:forEach var="category" items="${categoryList}">
                                                    <c:choose>
                                                        <c:when test="${category.productCategoryTbNo eq product.productCategoryTbNo}">
                                                            <option value="${category.productCategoryTbNo}" selected>${category.productCategoryTbParent}-${category.productCategoryTbMedian}-${category.productCategoryTbSub}</option>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <option value="${category.productCategoryTbNo}">${category.productCategoryTbParent}-${category.productCategoryTbMedian}-${category.productCategoryTbSub}</option>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="productTbName" class="col-sm-2 control-label">상품명</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" id="productTbName" name="productTbName" value="${product.productTbName}" required>
                                        </div>
                                    </div>
                                    <c:if test="${product.productTbDetail ne null}">
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">상품상세</label>
                                            <div class="col-sm-10">
                                                <img src="${product.productTbDetail}" width="200" height="300">
                                            </div>
                                        </div>
                                    </c:if>
                                    <div class="form-group">
                                        <label for="uploadFile" class="col-sm-2 control-label">상품상세</label>
                                        <div class="col-sm-10">
                                            <div class="input-group">
                                                <input type="file" id="uploadFile" name="uploadFile">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-2"></div>
                                    <div class="col-md-10">
                                        <button class="btn btn-primary">상품수정</button>
                                        <span onclick="deleteProduct()" class="btn btn-primary">상품삭제</span>
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

<!-- Javascripts -->
<jsp:include page="../include/scripts-load.jsp"/>
<script>
    function deleteProduct() {
        var really = confirm("정말로 삭제하시겠습니까?");
        if(really === true)
        {
            location.href = "deleteProduct.ado?productTbCode=${product.productTbCode}";
        }
    }
</script>


</body>
</html>
