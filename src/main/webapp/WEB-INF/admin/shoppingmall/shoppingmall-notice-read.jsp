<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-09
  Time: 오후 9:38
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
                <h3 class="breadcrumb-header">공지</h3>
            </div>
            <div id="main-wrapper">
                <!-- Row -->
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-body">
                                <form class="form-horizontal" action="shoppingmall-notice-read.ado" method="post">
                                    <div class="form-group">
                                        <label for="noticeNum" class="col-sm-2 control-label">글번호</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" id="noticeNum" name="noticeTbNo" value="${adminNoticeVO.noticeTbNo}" readonly>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="noticeTitle" class="col-sm-2 control-label">제목</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" id="noticeTitle" name="noticeTbTitle" value="${adminNoticeVO.noticeTbTitle}">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="noticeWriter" class="col-sm-2 control-label">글쓴이</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" id="noticeWriter" name="adminsTbId" value="${adminNoticeVO.adminsTbId}" readonly>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">작성일</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" name="noticeTbRegDate" value="${adminNoticeVO.noticeTbRegDate}" readonly>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="noticeContent" class="col-sm-2 control-label">내용</label>
                                        <div class="col-sm-10">
                                            <textarea rows="10" class="form-control" id="noticeContent" name="noticeTbContent">${adminNoticeVO.noticeTbContent}</textarea>
                                        </div>
                                    </div>
                                    <div class="form-group" style="margin-top: 50px">
                                        <div class="col-sm-2"></div>
                                        <div class="col-sm-2">
                                            <button type="submit" class="btn btn-primary">수정</button>
                                            <a class="btn btn-primary" href="shoppingmall-notice-delete.ado?noticeTbNo=${adminNoticeVO.noticeTbNo}">삭제</a>
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
</body>
</html>
