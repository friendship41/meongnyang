<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-09
  Time: 오후 9:34
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
                <h3 class="breadcrumb-header">매출 분석</h3>
            </div>
            <div id="main-wrapper">
                <!-- Row -->
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">매출 분석(검색)</h4>
                            </div>
                            <div class="panel-body">
                                <form class="form-horizontal" style="margin-bottom: 100px">
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">기간</label>
                                        <div class="col-sm-10">
                                            <div class="row">
                                                <div class="col-md-2">
                                                    <input type="text" class="form-control date-picker">
                                                </div>
                                                <div class="col-md-1 text-center">~</div>
                                                <div class="col-md-2">
                                                    <input type="text" class="form-control date-picker">
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">카테고리 선택</label>
                                        <div class="col-sm-10">
                                            <select style="margin-bottom:15px;" class="form-control">
                                                <option>1</option>
                                                <option>2</option>
                                                <option>3</option>
                                                <option>4</option>
                                                <option>5</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">지역 선택</label>
                                        <div class="col-sm-10">
                                            <select style="margin-bottom:15px;" class="form-control">
                                                <option>1</option>
                                                <option>2</option>
                                                <option>3</option>
                                                <option>4</option>
                                                <option>5</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">판매가격</label>
                                        <div class="col-sm-10">
                                            <div class="row">
                                                <div class="col-md-2">
                                                    <input type="text" class="form-control">
                                                </div>
                                                <div class="col-md-1 text-center">~</div>
                                                <div class="col-md-2">
                                                    <input type="text" class="form-control">
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-sm-2"></div>
                                        <div class="col-sm-10">
                                            <button type="submit" class="btn btn-primary">검색</button>
                                        </div>
                                    </div>
                                </form>
                                <div class="table-responsive">
                                    <table id="saleAnalysisTable" class="display table"
                                           style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>글번호</th>
                                            <th>제목</th>
                                            <th>글쓴이</th>
                                            <th>작성일</th>
                                            <th>조회수</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td>1</td>
                                            <td><span class="label label-warning" style="margin-right: 10px">Q</span><a class="f-bold" href="shoppingmall-qna-read.html">질문입니다</a></td>
                                            <td>사용자1</td>
                                            <td>20/02/01</td>
                                            <td>5000</td>
                                        </tr>
                                        <tr>
                                            <td>2</td>
                                            <td><span class="label label-success" style="margin-right: 10px">A</span><a class="f-bold" href="shoppingmall-qna-read.html">답변입니다</a></td>
                                            <td>관리자</td>
                                            <td>20/03/01</td>
                                            <td>3000</td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
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
