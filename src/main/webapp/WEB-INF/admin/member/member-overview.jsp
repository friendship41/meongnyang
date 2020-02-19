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
<body onload="go()">

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
                <h3 class="breadcrumb-header">회원 증감현황</h3>
            </div>
            <div id="main-wrapper">
                <!-- Row -->
                <div class="row">
                    <div class="col-md-12">
                        <h3 class="breadcrumb-header">방문 현황</h3>
                    </div>
                    <div class="col-md-6">
                        <div class="panel panel-white">
                            <div class="panel-body">
                                <div class="panel-heading clearfix">
                                    <h4 class="panel-title">일별 방문자</h4>
                                </div>
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                            <div class="row">
                                                <div class="col-md-4">
                                                    <input type="text" id=datePickerOne class="date-picker text-center form-control" placeholder="01/01/2020">
                                                </div>
                                                <div class="col-md-1">
                                                    <label class="text-center center-block">~</label>
                                                </div>
                                                <div class="col-md-4">
                                                    <input type="text" id=datePickerTwo class="date-picker text-center form-control" placeholder="01/15/2020" style="margin-bottom:14px;">
                                                </div>
                                                <div class="col-md-1">
                                                    <span  onclick="getMemberTabeOne()"  class="btn btn-success center-block" style="margin-bottom:14px;">조회</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <canvas id="visit_chart_day"></canvas>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="panel panel-white">
                            <div class="panel-body">
                                <div class="panel-heading clearfix">
                                    <h4 class="panel-title">월별 방문자</h4>
                                </div>
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                            <div class="row">
                                                <div class="col-md-4">
                                                    <input type="text" id="monthPickerOne" class="date-picker text-center form-control" placeholder="01/01/2019">
                                                </div>
                                                <div class="col-md-1">
                                                    <label class="text-center center-block">~</label>
                                                </div>
                                                <div class="col-md-4">
                                                    <input type="text" id="monthPickerTwo" class="date-picker text-center form-control" placeholder="12/01/2019" style="margin-bottom:14px;">
                                                </div>
                                                <div class="col-md-1">
                                                    <span onclick="getMemberTableTwo()"  class="btn btn-success center-block" style="margin-bottom:14px;">조회</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <canvas id="visit_chart_month"></canvas>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- !Row -->
                <!-- Row -->
                <div class="row">
                    <div class="col-md-12">
                        <h3 class="breadcrumb-header">총 회원 현황</h3>
                    </div>
                    <div class="col-md-6">
                        <div class="panel panel-white">
                            <div class="panel-body">
                                <div class="panel-heading clearfix">
                                    <h4 class="panel-title">일별 회원수</h4>
                                </div>
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                            <div class="row">
                                                <div class="col-md-4">
                                                    <input type="text" id="memberDayPickerOne" class="date-picker text-center form-control" placeholder="01/01/2019">
                                                </div>
                                                <div class="col-md-1">
                                                    <label class="text-center center-block">~</label>
                                                </div>
                                                <div class="col-md-4">
                                                    <input type="text" id="memberDayPickerTwo" class="date-picker text-center form-control" placeholder="12/01/2019" style="margin-bottom:14px;">
                                                </div>
                                                <div class="col-md-1">
                                                    <span onclick="getDayMemberNumber()" class="btn btn-success center-block" style="margin-bottom:14px;">조회</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <canvas id="member_chart_day"></canvas>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="panel panel-white">
                            <div class="panel-body">
                                <div class="panel-heading clearfix">
                                    <h4 class="panel-title">월별 회원수</h4>
                                </div>
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                            <div class="row">
                                                <div class="col-md-4">
                                                    <input type="text" id="monthMemberPickerOne" class="date-picker text-center form-control" placeholder="01/01/2019">
                                                </div>
                                                <div class="col-md-1">
                                                    <label class="text-center center-block">~</label>
                                                </div>
                                                <div class="col-md-4">
                                                    <input type="text" id="monthMemberPickerTwo" class="date-picker text-center form-control" placeholder="12/01/2019" style="margin-bottom:14px;">
                                                </div>
                                                <div class="col-md-1">
                                                    <span onclick="getMonthMemberNumber()" class="btn btn-success center-block" style="margin-bottom:14px;">조회</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <canvas id="member_chart_month"></canvas>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- !Row -->
                <!-- Row -->
                <div class="row">
                    <div class="col-md-12">
                        <h3 class="breadcrumb-header">기간별 회원 증감추이</h3>
                    </div>
                    <div class="col-md-6">
                        <div class="panel panel-white">
                            <div class="panel-body">
                                <div class="panel-heading clearfix">
                                    <h4 class="panel-title">일별 회원증감</h4>
                                </div>
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                            <div class="row">
                                                <div class="col-md-4">
                                                    <input type="text" class="date-picker text-center form-control" placeholder="01/01/2019">
                                                </div>
                                                <div class="col-md-1">
                                                    <label class="text-center center-block">~</label>
                                                </div>
                                                <div class="col-md-4">
                                                    <input type="text" class="date-picker text-center form-control" placeholder="12/01/2019" style="margin-bottom:14px;">
                                                </div>
                                                <div class="col-md-1">
                                                    <button type="submit" class="btn btn-success center-block" style="margin-bottom:14px;">조회</button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <canvas id="join_chart_day"></canvas>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="panel panel-white">
                            <div class="panel-body">
                                <div class="panel-heading clearfix">
                                    <h4 class="panel-title">월별 회원증감</h4>
                                </div>
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                            <div class="row">
                                                <div class="col-md-4">
                                                    <input type="text" class="date-picker text-center form-control" placeholder="01/01/2019">
                                                </div>
                                                <div class="col-md-1">
                                                    <label class="text-center center-block">~</label>
                                                </div>
                                                <div class="col-md-4">
                                                    <input type="text" class="date-picker text-center form-control" placeholder="12/01/2019" style="margin-bottom:14px;">
                                                </div>
                                                <div class="col-md-1">
                                                    <button type="submit" class="btn btn-success center-block" style="margin-bottom:14px;">조회</button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <canvas id="join_chart_month"></canvas>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- !Row -->
                <!-- 상세정보 -->
                <!-- Row -->
                <!--                        <div class="row">-->
                <!--                            <div class="col-md-12">-->
                <!--                                <div class="panel panel-white">-->
                <!--                                    <div class="panel-heading clearfix">-->
                <!--                                        <h4 class="panel-title">상세 회원 증감추이</h4>-->
                <!--                                    </div>-->
                <!--                                    <div class="panel-body">-->
                <!--                                        <div class="panel-group" id="accordion2" role="tablist" aria-multiselectable="true">-->
                <!--                                            <div class="panel panel-primary">-->
                <!--                                                <div class="panel-heading" role="tab" id="headingOne1">-->
                <!--                                                    <h4 class="panel-title">-->
                <!--                                                        <a data-toggle="collapse" data-parent="#accordion2" href="#1" aria-expanded="true" aria-controls="collapseOne">-->
                <!--                                                            기간별 회원 증감추이-->
                <!--                                                        </a>-->
                <!--                                                    </h4>-->
                <!--                                                </div>-->
                <!--                                                <div id="1" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingOne1">-->
                <!--                                                    <div class="panel-body">-->
                <!--                                                        <div class="col-md-6">-->
                <!--                                                            <div class="panel panel-white">-->
                <!--                                                                <div class="panel-body">-->
                <!--                                                                    <div class="panel-heading clearfix">-->
                <!--                                                                        <h4 class="panel-title">지역별 회원 증감추이</h4>-->
                <!--                                                                    </div>-->
                <!--                                                                    <canvas id="join_chart_day"></canvas>-->
                <!--                                                                </div>-->
                <!--                                                            </div>-->
                <!--                                                        </div>-->
                <!--                                                        <div class="col-md-6">-->
                <!--                                                            <div class="panel panel-white">-->
                <!--                                                                <div class="panel-body">-->
                <!--                                                                    <div class="panel-heading clearfix">-->
                <!--                                                                        <h4 class="panel-title">월별 회원 증감추이</h4>-->
                <!--                                                                    </div>-->
                <!--                                                                    <canvas id="join_chart_month"></canvas>-->
                <!--                                                                </div>-->
                <!--                                                            </div>-->
                <!--                                                        </div>-->
                <!--                                                    </div>-->
                <!--                                                </div>-->
                <!--                                            </div>-->
                <!--                                            <div class="panel panel-success">-->
                <!--                                                <div class="panel-heading" role="tab" id="headingTwo2">-->
                <!--                                                    <h4 class="panel-title">-->
                <!--                                                        <a class="collapsed" data-toggle="collapse" data-parent="#accordion2" href="#2" aria-expanded="false" aria-controls="collapseTwo">-->
                <!--                                                            연령별 회원 증감추이-->
                <!--                                                        </a>-->
                <!--                                                    </h4>-->
                <!--                                                </div>-->
                <!--                                                <div id="2" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo2">-->
                <!--                                                    <div class="panel-body">-->
                <!--                                                        <div class="col-md-6">-->
                <!--                                                            <div class="panel panel-white">-->
                <!--                                                                <div class="panel-body">-->
                <!--                                                                    <div class="panel-heading clearfix">-->
                <!--                                                                        <h4 class="panel-title">연령별 가입추이</h4>-->
                <!--                                                                    </div>-->
                <!--                                                                    <canvas id="age_join_chart"></canvas>-->
                <!--                                                                </div>-->
                <!--                                                            </div>-->
                <!--                                                        </div>-->
                <!--                                                        <div class="col-md-6">-->
                <!--                                                            <div class="panel panel-white">-->
                <!--                                                                <div class="panel-body">-->
                <!--                                                                    <div class="panel-heading clearfix">-->
                <!--                                                                        <h4 class="panel-title">연령별 탈퇴추이</h4>-->
                <!--                                                                    </div>-->
                <!--                                                                    <canvas id="age_drop_chart"></canvas>-->
                <!--                                                                </div>-->
                <!--                                                            </div>-->
                <!--                                                        </div>-->
                <!--                                                    </div>-->
                <!--                                                </div>-->
                <!--                                            </div>-->
                <!--                                            <div class="panel panel-danger">-->
                <!--                                                <div class="panel-heading" role="tab" id="headingThree3">-->
                <!--                                                    <h4 class="panel-title">-->
                <!--                                                        <a class="collapsed" data-toggle="collapse" data-parent="#accordion2" href="#3" aria-expanded="false" aria-controls="collapseThree">-->
                <!--                                                            성별별 회원 증감추이-->
                <!--                                                        </a>-->
                <!--                                                    </h4>-->
                <!--                                                </div>-->
                <!--                                                <div id="3" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingThree3">-->
                <!--                                                    <div class="panel-body">-->
                <!--                                                        <div class="col-md-6">-->
                <!--                                                            <div class="panel panel-white">-->
                <!--                                                                <div class="panel-body">-->
                <!--                                                                    <div class="panel-heading clearfix">-->
                <!--                                                                        <h4 class="panel-title">연령별 가입추이</h4>-->
                <!--                                                                    </div>-->
                <!--                                                                    <canvas id="gender_join_chart"></canvas>-->
                <!--                                                                </div>-->
                <!--                                                            </div>-->
                <!--                                                        </div>-->
                <!--                                                        <div class="col-md-6">-->
                <!--                                                            <div class="panel panel-white">-->
                <!--                                                                <div class="panel-body">-->
                <!--                                                                    <div class="panel-heading clearfix">-->
                <!--                                                                        <h4 class="panel-title">연령별 탈퇴추이</h4>-->
                <!--                                                                    </div>-->
                <!--                                                                    <canvas id="gender_drop_chart"></canvas>-->
                <!--                                                                </div>-->
                <!--                                                            </div>-->
                <!--                                                        </div>-->
                <!--                                                    </div>-->
                <!--                                                </div>-->
                <!--                                            </div>-->
                <!--                                        </div>-->
                <!--                                    </div>-->
                <!--                                </div>-->
                <!--                            </div>-->
                <!--                        </div>-->
                <!-- !Row -->
            </div>
            <!-- Main Wrapper -->
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

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script><script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	
	function getMemberTabeOne(){
		
		var date1 = $("#datePickerOne").val();
		var date2 = $("#datePickerTwo").val();
		date1+="";
		date2+="";
		var ajaxUrl = "/memberOverviewAjax.ado?StartDate="+date1+"&EndDate="+date2;
		
		$.ajax({
		
			url: ajaxUrl,
			type: "GET",
			data: {},
			dataType: "json"
		
		})
		
		.done(function (json){
			console.log(json);
			new Chart(document.getElementById("visit_chart_day"),json);
			
		})
		.fail(function (xhr, status, errorThrown){
			alert(errorThrown);	
		});
		
			
		}
	
	
	function getMemberTableTwo(){
		
		var date1 = $("#monthPickerOne").val();
		var date2 = $("#monthPickerTwo").val();
		date1+="";
		date2+="";
		var ajaxUrl = "/memberOverviewTwoAjax.ado?StartDate="+date1+"&EndDate="+date2;
		
		$.ajax({
		
			url: ajaxUrl,
			type: "GET",
			data: {},
			dataType: "json"
		
		})
		
		.done(function (json){
			console.log(json);
			new Chart(document.getElementById("visit_chart_month"),json);
			
		})
		.fail(function (xhr, status, errorThrown){
			alert(errorThrown);	
		});
	}
	

	function getDayMemberNumber(){
		
		var date1 = $("#memberDayPickerOne").val();
		var date2 = $("#memberDayPickerTwo").val();
		date1+="";
		date2+="";
		var ajaxUrl = "/memberOverviewThreeAjax.ado?StartDate="+date1+"&EndDate="+date2;
		
		$.ajax({
		
			url: ajaxUrl,
			type: "GET",
			data: {},
			dataType: "json"
		
		})
		
		.done(function (json){
			console.log(json);
			new Chart(document.getElementById("member_chart_day"),json);
			
		})
		.fail(function (xhr, status, errorThrown){
			alert(errorThrown);	
		});
	}
	
function getMonthMemberNumber(){
		
		var date1 = $("#monthMemberPickerOne").val();
		var date2 = $("#monthMemberPickerTwo").val();
		date1+="";
		date2+="";
		var ajaxUrl = "/memberOverviewFourAjax.ado?StartDate="+date1+"&EndDate="+date2;
		
		$.ajax({
		
			url: ajaxUrl,
			type: "GET",
			data: {},
			dataType: "json"
		
		})
		
		.done(function (json){
			console.log(json);
			new Chart(document.getElementById("member_chart_month"),json);
			
		})
		.fail(function (xhr, status, errorThrown){
			alert(errorThrown);	
		});
	}
	
	
	
	
	

    function go() {
        new Chart(document.getElementById("join_chart_day"),{"type":"line","data":{"labels":["1일","2일","3일","4일","5일","6일","7일","8일","9일","10일","11일","12일","13일","14일","15일"],"datasets":[{"label":"회원가입수","data":[5000,2000,3000,4000,5000,500,3600,3210,8000,2000,10000,12000,1000,2000,3000],"fill":false,"borderColor":"rgb(99, 203, 137)","lineTension":0.2},{"label":"회원탈퇴수","data":[1000,500,1000,500,2000,100,600,210,3000,1000,2000,2000,0,1000,2000],"fill":false,"borderColor":"rgb(203,36,45)","lineTension":0.2},{"label":"회원증감","data":[4000,1500,2000,3500,3000,400,3000,3000,5000,1000,8000,10000,1000,1000,1000],"fill":false,"borderColor":"rgb(42,94,203)","lineTension":0.2}]},"options":{}});
        new Chart(document.getElementById("join_chart_month"),{"type":"line","data":{"labels":["1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월"],"datasets":[{"label":"회원가입수","data":[5000,2000,3000,4000,5000,500,3600,3210,8000,2000,10000,12000],"fill":false,"borderColor":"rgb(99, 203, 137)","lineTension":0.2},{"label":"회원탈퇴수","data":[1000,500,1000,500,2000,100,600,210,3000,1000,2000,2000],"fill":false,"borderColor":"rgb(203,36,45)","lineTension":0.2},{"label":"회원증감","data":[4000,1500,2000,3500,3000,400,3000,3000,5000,1000,8000,10000],"fill":false,"borderColor":"rgb(42,94,203)","lineTension":0.2}]},"options":{}});

        new Chart(document.getElementById("member_chart_day"),{"type":"line","data":{"labels":["1일","2일","3일","4일","5일","6일","7일","8일","9일","10일","11일","12일","13일","14일","15일"],"datasets":[{"label":"총 회원 수","data":[5000,2000,3000,4000,5000,500,3600,3210,8000,2000,10000,12000,1000,2000,3000],"fill":false,"borderColor":"rgb(203,137,63)","lineTension":0.2}]},"options":{}});
        new Chart(document.getElementById("member_chart_month"),{"type":"line","data":{"labels":["1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월"],"datasets":[{"label":"총 회원 수","data":[5000,2000,3000,4000,5000,500,3600,3210,8000,2000,10000,12000],"fill":false,"borderColor":"rgb(203,137,63)","lineTension":0.2}]},"options":{}});

        new Chart(document.getElementById("visit_chart_day"),{"type":"line","data":{"labels":["1일","2일","3일","4일","5일","6일","7일","8일","9일","10일","11일","12일","13일","14일","15일"],"datasets":[{"label":"방문자 수","data":[5000,2000,3000,4000,5000,500,3600,3210,8000,2000,10000,12000,1000,2000,3000],"fill":false,"borderColor":"rgb(93,168,203)","lineTension":0.2}]},"options":{}});
        new Chart(document.getElementById("visit_chart_month"),{"type":"line","data":{"labels":["1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월"],"datasets":[{"label":"방문자 수","data":[5000,2000,3000,4000,5000,500,3600,3210,8000,2000,10000,12000],"fill":false,"borderColor":"rgb(93,168,203)","lineTension":0.2}]},"options":{}});
        //
        // new Chart(document.getElementById("age_join_chart"),{"type":"doughnut","data":{"labels":["10대","20대","30대","40대","50대","60대"],"datasets":[{"label":"My First Dataset","data":[300,500,500,400,300,200],"backgroundColor":["rgb(236, 94, 105)","rgb(0, 112, 224)","rgb(241, 194, 5)","rgb(144,241,88)","rgb(101, 80, 55)","rgb(41, 14, 5)"]}]}});
        // new Chart(document.getElementById("age_drop_chart"),{"type":"doughnut","data":{"labels":["10대","20대","30대","40대","50대","60대"],"datasets":[{"label":"My First Dataset","data":[300,500,500,400,300,200],"backgroundColor":["rgb(236, 94, 105)","rgb(0, 112, 224)","rgb(241, 194, 5)","rgb(144,241,88)","rgb(101, 80, 55)","rgb(41, 14, 5)"]}]}});
        //
        // new Chart(document.getElementById("gender_join_chart"),{"type":"doughnut","data":{"labels":["남성","여성"],"datasets":[{"label":"My First Dataset","data":[300,500],"backgroundColor":["rgb(236, 94, 105)","rgb(0, 112, 224)"]}]}});
        // new Chart(document.getElementById("gender_drop_chart"),{"type":"doughnut","data":{"labels":["남성","여성"],"datasets":[{"label":"My First Dataset","data":[300,500],"backgroundColor":["rgb(236, 94, 105)","rgb(0, 112, 224)"]}]}});
    }
</script>

<!-- Javascripts -->
<jsp:include page="../include/scripts-load.jsp"/>
</body>
</html>
