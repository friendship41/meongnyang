<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-09
  Time: 오후 9:38
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
                <h3 class="breadcrumb-header">공지 현황</h3>
            </div>
            <!-- Main Wrapper -->
            <div id="main-wrapper">
                <!-- Row -->
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">공지 게시판</h4>
                            </div>
                            <div class="panel-body">
                                <div class="table-responsive">
                                    <table id="noticeTable" class="display table"
                                           style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>글번호</th>
                                            <th>제목</th>
                                            <th>글쓴이</th>
                                            <th>작성일</th>
                                        </tr>
                                        </thead>
                                        <tfoot>
                                        <tr>
                                            <th>글번호</th>
                                            <th>제목</th>
                                            <th>글쓴이</th>
                                            <th>작성일</th>
                                        </tr>
                                        </tfoot>
                                        <tbody>
                                        <c:forEach var="noticeList" items="${adminNoticeList}">
                                            <tr>
                                                <td>${noticeList.noticeTbNo}</td>
                                                <td><a class="f-bold" href="/shoppingmall-notice-read.ado?noticeTbNo=${noticeList.noticeTbNo}">${noticeList.noticeTbTitle}</a></td>
                                                <td>${noticeList.adminsTbId}</td>
                                                <td>${noticeList.noticeTbRegDate}</td>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>
                                    <div>
                                        <button class="btn btn-primary" onclick="location.href='/shoppingmall-notice-write.ado'">
                                            공지 작성
                                        </button>
                                    </div>
                                </div>
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
</body>
</html>
