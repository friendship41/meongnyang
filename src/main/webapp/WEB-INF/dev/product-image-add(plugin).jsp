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
                                <form id="imageUploadForm" class="form-horizontal" action="product-image-upload.ado" method="post">
                                    <div class="form-group">
                                        <label for="productName" class="col-sm-2 control-label">상품명</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" id="productName" readonly>
                                        </div>
                                    </div>
                                    <c:forEach var="productImage" items="${productImageList}">
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">등록된 이미지</label>
                                            <div class="col-sm-10">
                                                <span class="insert-image" style="margin-right: 100px">
                                                    <img src="${productImage.pdImageTbPath}" width="50" height="100">
                                                    <a href="#" class="btn btn-danger">삭제</a>
                                                </span>
                                            </div>
                                        </div>
                                    </c:forEach>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">상품이미지</label>
                                        <div class="col-sm-10">
                                            <div class="panel panel-white">
                                                <div class="panel-heading clearfix">
                                                    <h4 class="panel-title">Plupload</h4>
                                                </div>
                                                <div class="panel-body">
                                                    <div id="imageUploader">
                                                        <p>Your browser doesn't have Flash, Silverlight or HTML5 support.</p>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-2"></div>
                                        <div class="col-md-10" id="formButtonsHere">
                                            <button id="imgUploadButton" class="btn btn-primary">이미지 등록</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>

                </div>
                <!-- !Row -->
            </div>
            <!-- !Main Wrapper -->
            <div class="page-footer">
                <p>메인프로젝트 오늘뭐멍냥 <i class="fa fa-heart"></i> by team4</p>
            </div>
        </div>
        <!-- /Page Inner -->
        <jsp:include page="../include/right-sidebar.jsp"/>
    </div>
    <!-- /Page Content -->
</div>
<!-- /Page Container -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script><script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
    $(document).ready(function () {
        //상품이미지업로더
        var uploder = $("#imageUploader").pluploadQueue({
            // General settings
            runtimes : 'html5,flash,silverlight,html4',
            url : "/product-image-upload.ado",

            rename : true,
            dragdrop: true,
            unique_names : false,
            multipart: true,
            file_data_name: "uploadedImage",

            filters : {
                // Maximum file size
                max_file_size : '10mb',
                // Specify what files to browse for
                mime_types: [
                    {title : "Image files", extensions : "jpg,gif,png"},
                    {title : "Zip files", extensions : "zip"}
                ]
            },

            views : {
                list : true,
                thumbs : true, // Show thumbs
                active : 'thumbs'
            },

            // Flash settings
            flash_swf_url : 'static/plupload/js/Moxie.swf',
            // Silverlight settings
            silverlight_xap_url : 'static/plupload/js/Moxie.xap'
        });

        $(".plupload_start").remove();

        $("#imageUploadForm").submit(function (e) {
            if($('#imageUploader').pluploadQueue('getFile').length > 0)
            {
                alert("asd");
                $('#imageUploader').on('complete', function () {
                    $('#imageUploadForm')[0].submit();
                });
                $('#imageUploader').pluploadQueue('start');
            }
            else
            {
                alert('적어도 하나의 파일이 필요합니다');
            }
            return false;
        });
    });
</script>

<!-- Javascripts -->
<jsp:include page="../include/scripts-load.jsp"/>

</body>
</html>