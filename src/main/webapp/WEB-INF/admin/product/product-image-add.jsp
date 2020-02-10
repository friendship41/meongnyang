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
                <h3 class="breadcrumb-header">이미지 추가</h3>
            </div>
            <!-- Main Wrapper -->
            <div id="main-wrapper">
                <!-- Row -->
                <div class="row">
                    <div class="col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-body">
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <label for="productName" class="col-sm-2 control-label">상품명</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" id="productName">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">등록된 이미지</label>
                                        <div class="col-sm-10">
                                            <div class="insert-image">
                                                <img src="dogcat.png" width="50" height="100">
                                                <button type="button" class="btn btn-danger">삭제</button>
                                            </div>
                                            <div class="insert-image">
                                                <img src="dogcat.png" width="50" height="100">
                                                <button type="button" class="btn btn-danger">삭제</button>
                                            </div>
                                            <div class="insert-image">
                                                <img src="dogcat.png" width="50" height="100">
                                                <button type="button" class="btn btn-danger">삭제</button>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">상품이미지</label>
                                        <div class="col-sm-10">
                                            <div class="panel panel-white">
                                                <div class="panel-heading clearfix">
                                                    <h4 class="panel-title">Plupload</h4>
                                                </div>
                                                <div class="panel-body">
                                                    <div id="uploader">
                                                        <p>Your browser doesn't have Flash, Silverlight or HTML5 support.</p>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-2"></div>
                                    <div class="col-md-10">
                                        <button class="btn btn-primary">이미지 등록</button>
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


<!-- Javascripts -->
<jsp:include page="../include/scripts-load.jsp"/>

</body>
</html>