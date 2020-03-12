<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-09
  Time: 오후 6:54
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
                <h3 class="breadcrumb-header">상품 분석</h3>
            </div>
            <div id="main-wrapper">
                <!-- Row -->
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">새 프로모션 등록</h4>
                            </div>
                            <div class="panel-body">
                                <form class="form-horizontal" action="promotion-write.ado" method="post">
                                    <div class="form-group">
                                        <label for="promotionName" class="col-sm-2 control-label">프로모션 이름</label>
                                        <div class="col-sm-10">
                                            <input name="promotionTbName" type="text" class="form-control" id="promotionName">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="promotionDetail" class="col-sm-2 control-label">프로모션 내용</label>
                                        <div class="col-sm-10">
                                            <textarea name="promotionTbContent" rows="10" class="form-control" id="promotionDetail"></textarea>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">시작일</label>
                                        <div class="col-sm-10">
                                            <input name="promotionTbStartDate" type="text" class="form-control date-picker">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">종료일</label>
                                        <div class="col-sm-10">
                                            <input name="promotionTbEndDate" type="text" class="form-control date-picker">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="allProductDiscount" class="col-sm-2 control-label">전체 할인율</label>
                                        <div class="col-sm-10">
                                            <input name="promotionTbDiscountRate" type="number" class="form-control" id="allProductDiscount">
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
</body>
</html>
