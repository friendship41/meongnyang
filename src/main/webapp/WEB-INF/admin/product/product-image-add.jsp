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
                <h3 class="breadcrumb-header">이미지 추가</h3>
            </div>
            <!-- Main Wrapper -->
            <div id="main-wrapper">
                <!-- Row -->
                <div class="row">
                    <div class="col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-body">
                                <form id="imageUploadForm" class="form-horizontal" action="productImageUpload.ado" method="post" enctype="multipart/form-data">
                                    <div class="form-group">
                                        <label for="productName" class="col-sm-2 control-label">상품명</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" id="productName" value="${product.productTbName}" readonly>
                                        </div>
                                    </div>
                                    <div class="form-group" id="getImageHere">
                                        <input type="hidden" name="productTbCode" value="${productCode}">
                                        <label class="col-sm-2 control-label">등록된 이미지</label>
                                        <c:forEach var="productImage" items="${productImageList}">
                                            <div class="col-sm-2"></div>
                                            <c:if test="${productImage.pdImageTbRepresentative eq 'Y'}">
                                                <div class="col-sm-10" id="imgDiv-${productImage.pdImageTbNo}" style="background-image: linear-gradient(to right, transparent, #505050);border-radius: 2em;">
                                                    <div class="insert-image">
                                                        <img src="${productImage.pdImageTbPath}" width="150" height="200">
                                                        <span id="deleteImgBtn-${productImage.pdImageTbNo}" onclick="deleteImageProc(${productImage.pdImageTbNo})" class="btn btn-danger" style="position: absolute;top: 90px;right: 50px;">삭제</span>
                                                    </div>
                                                </div>
                                            </c:if>
                                            <c:if test="${productImage.pdImageTbRepresentative eq 'N'}">
                                                <div class="col-sm-10" id="imgDiv-${productImage.pdImageTbNo}">
                                                    <div class="insert-image">
                                                        <img src="${productImage.pdImageTbPath}" width="150" height="200">
                                                        <span id="deleteImgBtn-${productImage.pdImageTbNo}" onclick="deleteImageProc(${productImage.pdImageTbNo})" class="btn btn-danger" style="position: absolute;top: 70px;right: 50px;">삭제</span>
                                                        <span id="setRepImgBtn-${productImage.pdImageTbNo}" onclick="updateImageRep(${productImage.pdImageTbNo})" class="btn btn-danger" style="position: absolute;top: 130px;right: 50px;">대표설정</span>
                                                    </div>
                                                </div>
                                            </c:if>
                                        </c:forEach>
                                    </div>
                                    <div class="form-group">
                                        <label for="uploadFile" class="col-sm-2 control-label">이미지 추가</label>
                                        <div class="col-sm-10">
                                            <div class="input-group">
                                                <input type="file" id="uploadFile" name="uploadedImage" required>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-2"></div>
                                    <div class="col-md-10" id="formButtonsHere">
                                        <button id="imgUploadButton" class="btn btn-primary">이미지 등록</button>
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
<!-- Javascripts -->
<jsp:include page="../include/scripts-load.jsp"/>

<script>
    $(document).ready(function () {
        var resultMessage = '${resultMessage}';
        if(resultMessage === 'moreThan3')
        {
            alert("사진은 최대 3장까지 가능합니다");
        }
    });

    function autoRefresh_div()
    {
        $("#getImageHere").load(window.location+ ' #getImageHere');
    }
    setInterval('autoRefresh_div()', 5000); // 5초 후에 div 새로 고침

    function deleteImageProc(imgNum) {
        var ajaxUrl = "/productImageDelete.ado?pdImageTbNo="+imgNum;
        $.ajax({
            url: ajaxUrl,
            type: "GET",
            data: {},
            dataType: "json"
        })
            .done(function(json) {
                //console.log(json);
                if(json.deleteState === "deleteSucess")
                {
                    var tempp =  "imgDiv-"+json.imgno;
                    $("#"+tempp).remove();
                }
            })
            .fail(function (xhr, status, errorThrown) {
                alert(errorThrown);
            });
    }

    function updateImageRep(imgNum) {
        var ajaxUpdateRepUrl = "/productImageUpdateRep.ado?pdImageTbNo="+imgNum+"&productTbCode=${productCode}";
        $.ajax({
            url: ajaxUpdateRepUrl,
            type: "GET",
            data: {},
            dataType: "json"
        })
            .done(function(json) {
                //console.log(json);
                if(json.updateRepState === "updateSucess")
                {
                    if(json.pastRepImgNo !== '-1')
                    {
                        var beforeRep = "imgDiv-"+json.pastRepImgNo;
                        $("#"+beforeRep).removeAttr("style");
                        var befDeleteBtn = "deleteImgBtn-"+json.pastRepImgNo;
                        $("#"+befDeleteBtn).attr("style", "position: absolute;top: 70px;right: 50px;");
                        var setRephtml = '<span id="setRepImgBtn-'+json.pastRepImgNo+'"onclick="updateImageRep('+json.pastRepImgNo+')" class="btn btn-danger" style="position: absolute;top: 130px;right: 50px;">대표설정</span>';
                        $("#"+befDeleteBtn).after(setRephtml);
                    }

                    var nowRep =  "imgDiv-"+json.repImgNo;
                    $("#"+nowRep).attr("style", "background-image: linear-gradient(to right, transparent, #505050);border-radius: 2em;");
                    var nowDeleteBtn = "deleteImgBtn-"+json.repImgNo;
                    $("#"+nowDeleteBtn).attr("style","position: absolute;top: 90px;right: 50px;");
                    var nowSetRepBtn = "setRepImgBtn-"+json.repImgNo;
                    $("#"+nowSetRepBtn).remove();
                }
            })
            .fail(function (xhr, status, errorThrown) {
                alert(errorThrown);
            });
    }
</script>

</body>
</html>