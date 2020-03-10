<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-09
  Time: 오후 9:22
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
                <h3 class="breadcrumb-header">이벤트 시작/종료</h3>
            </div>
            <!-- Main Wrapper -->
            <div id="main-wrapper">
                <!-- Row -->
                <div class="row">
                    <div class="col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-body">

                                <form class="form-horizontal" id="formToController" action="insertEvent.ado" method="post" enctype="multipart/form-data">

                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">룰렛 칸 갯수</label>
                                        <div class="col-sm-10">
                                            <select style="margin-bottom:15px;" class="form-control" id="rouletteSelectBox" name="rouletteSize">
                                                <option value="2" selected>2</option>
                                                <option value="4">4</option>
                                                <option value="6">6</option>
                                                <option value="8">8</option>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="col-md-2"></div>
                                    <div id="exImgDiv2" class="col-md-10">
                                        <img src="/resources/admin/images/roulette-2.png" width="600" height="400">
                                    </div>
                                    <div id="exImgDiv4" class="col-md-10">
                                        <img src="/resources/admin/images/roulette-4.png" width="600" height="400">
                                    </div>
                                    <div id="exImgDiv6" class="col-md-10">
                                        <img src="/resources/admin/images/roulette-6.png" width="600" height="400">
                                    </div>
                                    <div id="exImgDiv8" class="col-md-10">
                                        <img src="/resources/admin/images/roulette-8.png" width="600" height="400">
                                    </div>

                                    <div id="inputDiv">
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">1번 칸 포인트</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" name="inp1" required>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">2번 칸 포인트</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" name="inp2" required>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label for="uploadFile" class="col-sm-2 control-label">룰렛 이미지</label>
                                        <div class="col-sm-10">
                                            <div class="input-group">
                                                <input type="file" id="uploadFile" name="uploadFile" required>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-md-2"></div>
                                    <div class="col-md-10" id="formButtonsHere">
                                        <button type="submit" class="btn btn-primary">이벤트 시작</button>
                                    </div>
                                </form>
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

<!-- 기본 jQuery -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
    $(document).ready(function () {
        $("#exImgDiv4").hide();
        $("#exImgDiv6").hide();
        $("#exImgDiv8").hide();


        $("#rouletteSelectBox").change(function () {
            var selectedValue = $("#rouletteSelectBox option:selected").val();
            console.log(selectedValue);
            $("#inputDiv").empty();
            var inputHTML = '';
            for(var i=1; i<=selectedValue; i++)
            {
                inputHTML += '<div class="form-group">';
                inputHTML += '<label class="col-sm-2 control-label">'+i+'번 칸 포인트</label>';
                inputHTML += '<div class="col-sm-10">';
                inputHTML += '<input type="text" class="form-control" name="inp'+i+'" required>';
                inputHTML += '</div>';
                inputHTML += '</div>';
            }
            $("#inputDiv").append(inputHTML);


            $("#exImgDiv2").hide();
            $("#exImgDiv4").hide();
            $("#exImgDiv6").hide();
            $("#exImgDiv8").hide();
            var exImgName = '#exImgDiv'+selectedValue;
            $(exImgName).show();
        });
    })
</script>

<!-- Javascripts -->
<jsp:include page="../include/scripts-load.jsp"/>

</body>
</html>