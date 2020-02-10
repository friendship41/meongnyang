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
                <h3 class="breadcrumb-header">판매 등록</h3>
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
                                        <label class="col-sm-2 control-label">제품코드</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" readonly>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">이름</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" readonly>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">프로모션코드</label>
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
                                            <input type="text" class="form-control">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">수량</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">판매개시일</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control date-picker">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">입고가격</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control">
                                        </div>
                                    </div>
                                    <!-- 먹거리면 유통기한 -->
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">유통기한</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control date-picker">
                                        </div>
                                    </div>
                                    <!-- 옷이면 사이즈 먹거리면 용량 -->
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">사이즈</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">통보수량</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control">
                                        </div>
                                    </div>

                                    <div class="col-md-2"></div>
                                    <div class="col-md-10">
                                        <button class="btn btn-primary">판매등록</button>
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
