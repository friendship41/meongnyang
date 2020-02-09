<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-09
  Time: 오후 9:39
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
                <h3 class="breadcrumb-header">Q&A 답변작성</h3>
            </div>
            <div id="main-wrapper">
                <!-- Row -->
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-body">
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <label for="qnaNum" class="col-sm-2 control-label">글번호</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" id="qnaNum" readonly>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="qnaTitle" class="col-sm-2 control-label">제목</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" id="qnaTitle">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="qnaWriter" class="col-sm-2 control-label">글쓴이</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" id="qnaWriter" readonly>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">작성일</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control date-picker" readonly>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="qnaContent" class="col-sm-2 control-label">내용</label>
                                        <div class="col-sm-10">
                                            <textarea rows="10" class="form-control" id="qnaContent"></textarea>
                                        </div>
                                    </div>
                                    <div class="form-group" style="margin-top: 50px">
                                        <div class="col-sm-2"></div>
                                        <div class="col-sm-10">
                                            <button type="submit" class="btn btn-primary">답변작성</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- !Row -->
            </div><!-- Main Wrapper -->
            <div class="page-footer">
                <p>메인프로젝트 뭐먹냥 <i class="fa fa-heart"></i> by team4</p>
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
