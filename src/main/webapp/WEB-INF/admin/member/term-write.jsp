<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-09
  Time: 오후 7:22
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
                <h3 class="breadcrumb-header">정책 관리</h3>
            </div>
            <div id="main-wrapper">
                <!-- Row -->
                <div class="row">
                    <div class="col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">약관 작성/수정</h4>
                            </div>
                            <div class="panel-body">
                                <form class="form-horizontal" action="term-write.ado" method="post">
                   	                <input type="hidden" name="adminsTbId" value="${sessionScope.adminId}">                                   
                                    <div class="form-group">
                                        <label for="termNumber" class="col-sm-2 control-label">약관번호</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" name="termsTbNo" id="termNumber">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="termName" class="col-sm-2 control-label">약관명</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" name="termsTbTitle" id="termName">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="termDetail" class="col-sm-2 control-label">약관상세</label>
                                        <div class="col-sm-10">
                                            <textarea rows="10" class="form-control" name="termsTbContent" id="termDetail"></textarea>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">필수여부</label>
                                        <div class="col-sm-10">
                                            <div class="checkbox">
                                                <label>
                                                    <input type="checkbox" name="termsTbNecessary" value="true" >필수
                                                </label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">만료일</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control date-picker" name="termsTbExpireDate">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">정책적용일</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control date-picker" name="termsTbApplyDate">
                                        </div>
                                    </div>
                                    <div class="form-group" style="margin-top: 50px">
                                        <div class="col-sm-2"></div>
                                        <div class="col-sm-10">
                                            <button type="submit" class="btn btn-primary">작성</button>
                                          
                                        </div>
                                    </div>
                                </form>
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


<!-- Javascripts -->
<jsp:include page="../include/scripts-load.jsp"/>

