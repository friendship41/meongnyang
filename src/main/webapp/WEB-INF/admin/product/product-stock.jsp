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
                <h3 class="breadcrumb-header">재고관리</h3>
            </div>
            <div id="main-wrapper">
                <!-- Row -->
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">재고현황</h4>
                            </div>
                            <div class="panel-body">
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                            <div class="row">
                                                <div class="col-md-4">
                                                    <input type="text" class="date-picker text-center form-control"
                                                           placeholder="01/01/2020">
                                                </div>
                                                <div class="col-md-1">
                                                    <label class="text-center center-block">~</label>
                                                </div>
                                                <div class="col-md-4">
                                                    <input type="text" class="date-picker text-center form-control"
                                                           placeholder="01/15/2020" style="margin-bottom:14px;">
                                                </div>
                                                <div class="col-md-1">
                                                    <button type="submit" class="btn btn-success center-block"
                                                            style="margin-bottom:14px;">조회
                                                    </button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <div class="table-responsive">
                                    <table id="stockProductTable" class="display table" style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>#</th>
                                            <th>상품코드</th>
                                            <th>상품명</th>
                                            <th>현재수량</th>
                                            <th>통보수량</th>
                                            <th>신규입고수량</th>
                                            <th></th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td>1</td>
                                            <td>000001</td>
                                            <td>개밥</td>
                                            <td><span class="label label-danger">4</span></td>
                                            <td>5</td>
                                            <td><input type="number" class="form-control"></td>
                                            <td><button class="btn btn-primary">수정</button></td>
                                        </tr>
                                        <tr>
                                            <td>2</td>
                                            <td>000002</td>
                                            <td>냥이밥</td>
                                            <td><span class="label label-danger">7</span></td>
                                            <td>10</td>
                                            <td><input type="number" class="form-control"></td>
                                            <td><button class="btn btn-primary">수정</button></td>
                                        </tr>
                                        <tr>
                                            <td>1</td>
                                            <td>000001</td>
                                            <td>강아지옷1</td>
                                            <td><span class="label label-success">50</span></td>
                                            <td>10</td>
                                            <td><input type="number" class="form-control"></td>
                                            <td><button class="btn btn-primary">수정</button></td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- !Row -->
                <!-- Row -->
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">유통기한 임박상품</h4>
                            </div>
                            <div class="panel-body">
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                            <div class="row">
                                                <div class="col-md-4">
                                                    <input type="text" class="date-picker text-center form-control"
                                                           placeholder="01/01/2020">
                                                </div>
                                                <div class="col-md-1">
                                                    <label class="text-center center-block">~</label>
                                                </div>
                                                <div class="col-md-4">
                                                    <input type="text" class="date-picker text-center form-control"
                                                           placeholder="01/15/2020" style="margin-bottom:14px;">
                                                </div>
                                                <div class="col-md-1">
                                                    <button type="submit" class="btn btn-success center-block"
                                                            style="margin-bottom:14px;">조회
                                                    </button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <div class="table-responsive">
                                    <table id="expirationProductTable" class="display table" style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>#</th>
                                            <th>상품코드</th>
                                            <th>상품명</th>
                                            <th>유통기한</th>
                                            <th>폐기처리</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td>1</td>
                                            <td>000001</td>
                                            <td>개밥</td>
                                            <td><span class="label label-danger">20/02/05</span></td>
                                            <td><button class="btn btn-danger">폐기</button></td>
                                        </tr>
                                        <tr>
                                            <td>2</td>
                                            <td>000002</td>
                                            <td>냥이밥</td>
                                            <td><span class="label label-warning">20/05/04</span></td>
                                            <td><button class="btn btn-danger">폐기</button></td>
                                        </tr>
                                        <tr>
                                            <td>3</td>
                                            <td>000003</td>
                                            <td>동물밥</td>
                                            <td><span class="label label-success">21/12/25</span></td>
                                            <td><button class="btn btn-danger">폐기</button></td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- !Row -->
            </div>
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
