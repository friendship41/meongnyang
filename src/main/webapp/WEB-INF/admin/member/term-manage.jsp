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
                    <div class="col-lg-12 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">정책 현황</h4>
                            </div>
                            <div class="panel-body">
                                <div class="table-responsive">
                                    <table id="readCountProductTable" class="display table"
                                           style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>약관번호</th>
                                            <th>약관명</th>
                                            <th>필수여부</th>
                                            <th>등록/수정일</th>
                                            <th>만료일</th>
                                        </tr>
                                        </thead>
                                        <tfoot>
                                        <tr>
                                            <th>약관번호</th>
                                            <th>약관명</th>
                                            <th>필수여부</th>
                                            <th>등록/수정일</th>
                                            <th>만료일</th>
                                        </tr>
                                        </tfoot>
                                        <tbody>
                                        <tr>
                                            <td>1조1항</td>
                                            <td><a class="f-bold" href="term-write.html">총칙</a></td>
                                            <td>Y</td>
                                            <td>20/02/01</td>
                                            <td>21/02/01</td>
                                        </tr>
                                        <tr>
                                            <td>1조2항</td>
                                            <td><a class="f-bold" href="term-write.html">쇼핑</a></td>
                                            <td>Y</td>
                                            <td>20/02/01</td>
                                            <td>21/02/01</td>
                                        </tr>
                                        <tr>
                                            <td>1조3항</td>
                                            <td><a class="f-bold" href="term-write.html">개인정보</a></td>
                                            <td>Y</td>
                                            <td>20/02/01</td>
                                            <td>21/02/01</td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <div>
                                <button class="btn btn-primary">신규 약관 작성</button>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- !Row -->
            </div><!-- Main Wrapper -->
            <div class="page-footer">
                <p>메인프로젝트 뭐멍냥 <i class="fa fa-heart"></i> by team4</p>
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
