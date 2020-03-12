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
                                                    <span  onclick="getMemberTabeOne()"  class="btn btn-success" style="margin-bottom:14px;">조회</span>
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
                                                    <span onclick="getMemberTableTwo()"  class="btn btn-success" style="margin-bottom:14px;">조회</span>
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
                                                    <span onclick="getDayMemberNumber()" class="btn btn-success" style="margin-bottom:14px;">조회</span>
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
                                                    <span onclick="getMonthMemberNumber()" class="btn btn-success" style="margin-bottom:14px;">조회</span>
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
                                                    <input type="text" id="dayIncDecPickerOne" class="date-picker text-center form-control" placeholder="01/01/2019">
                                                </div>
                                                <div class="col-md-1">
                                                    <label class="text-center center-block">~</label>
                                                </div>
                                                <div class="col-md-4">
                                                    <input type="text" id="dayIncDecPickerTwo" class="date-picker text-center form-control" placeholder="12/01/2019" style="margin-bottom:14px;">
                                                </div>
                                                <div class="col-md-1">
                                                    <span onclick="getDayIncDec()" class="btn btn-success" style="margin-bottom:14px;">조회</span>
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
                                                    <input type="text" id="monthInDecPickerOne" class="date-picker text-center form-control" placeholder="01/01/2019">
                                                </div>
                                                <div class="col-md-1">
                                                    <label class="text-center center-block">~</label>
                                                </div>
                                                <div class="col-md-4">
                                                    <input type="text" id="monthInDecPickerTwo" class="date-picker text-center form-control" placeholder="12/01/2019" style="margin-bottom:14px;">
                                                </div>
                                                <div class="col-md-1">
                                                    <span onclick="getMonthInDec()" class="btn btn-success" style="margin-bottom:14px;">조회</span>
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
            </div>
            <!-- Main Wrapper -->
            <jsp:include page="../include/page-footer.jsp"/>
        </div>
        <!-- /Page Inner -->
        <jsp:include page="../include/right-sidebar.jsp"/>
    </div>
    <!-- /Page Content -->
</div>
<!-- /Page Container -->

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script><script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		
		var twoWeekAgo = new Date(new Date().setDate(new Date().getDate()-15));
		var oneDayAgo = new Date(new Date().setDate(new Date().getDate()-1));
		
		$("#datePickerOne").attr("value", twoWeekAgo.yyyymmdd());
		$("#datePickerTwo").attr("value", oneDayAgo.yyyymmdd());
		
		$("#monthPickerOne").attr("value", getMonthAgoDate(6).yyyymmdd());
		$("#monthPickerTwo").attr("value", new Date().yyyymmdd());
		
		$("#memberDayPickerOne").attr("value", twoWeekAgo.yyyymmdd());
		$("#memberDayPickerTwo").attr("value", oneDayAgo.yyyymmdd());
		
		$("#monthMemberPickerOne").attr("value", getMonthAgoDate(6).yyyymmdd());
		$("#monthMemberPickerTwo").attr("value", new Date().yyyymmdd());
		
		$("#dayIncDecPickerOne").attr("value", twoWeekAgo.yyyymmdd());
		$("#dayIncDecPickerTwo").attr("value", oneDayAgo.yyyymmdd());
		
		$("#monthInDecPickerOne").attr("value", getMonthAgoDate(6).yyyymmdd());
		$("#monthInDecPickerTwo").attr("value", new Date().yyyymmdd());
		
		
		getMemberTabeOne();
		getMemberTableTwo();
		getDayMemberNumber();
		getMonthMemberNumber();
		getDayIncDec();
		getMonthInDec();
		
	})

	function getMemberTabeOne() {

		var date1 = $("#datePickerOne").val();
		var date2 = $("#datePickerTwo").val();
		date1 += "";
		date2 += "";
		var ajaxUrl = "/memberOverviewAjax.ado?StartDate=" + date1
				+ "&EndDate=" + date2;

		$.ajax({

			url : ajaxUrl,
			type : "GET",
			data : {},
			dataType : "json"

		})

		.done(function(json) {
			//console.log(json);
			new Chart(document.getElementById("visit_chart_day"), json);

		}).fail(function(xhr, status, errorThrown) {
			alert(errorThrown);
		});

	}

	function getMemberTableTwo() {

		var date1 = $("#monthPickerOne").val();
		var date2 = $("#monthPickerTwo").val();
		date1 += "";
		date2 += "";
		var ajaxUrl = "/memberOverviewTwoAjax.ado?StartDate=" + date1
				+ "&EndDate=" + date2;

		$.ajax({

			url : ajaxUrl,
			type : "GET",
			data : {},
			dataType : "json"

		})

		.done(function(json) {
			//console.log(json);
			new Chart(document.getElementById("visit_chart_month"), json);

		}).fail(function(xhr, status, errorThrown) {
			alert(errorThrown);
		});
	}

	function getDayMemberNumber() {

		var date1 = $("#memberDayPickerOne").val();
		var date2 = $("#memberDayPickerTwo").val();
		date1 += "";
		date2 += "";
		var ajaxUrl = "/memberOverviewThreeAjax.ado?StartDate=" + date1
				+ "&EndDate=" + date2;

		$.ajax({

			url : ajaxUrl,
			type : "GET",
			data : {},
			dataType : "json"

		})

		.done(function(json) {
			//console.log(json);
			new Chart(document.getElementById("member_chart_day"), json);

		}).fail(function(xhr, status, errorThrown) {
			alert(errorThrown);
		});
	}

	function getMonthMemberNumber() {

		var date1 = $("#monthMemberPickerOne").val();
		var date2 = $("#monthMemberPickerTwo").val();
		date1 += "";
		date2 += "";
		var ajaxUrl = "/memberOverviewFourAjax.ado?StartDate=" + date1
				+ "&EndDate=" + date2;

		$.ajax({

			url : ajaxUrl,
			type : "GET",
			data : {},
			dataType : "json"

		})

		.done(function(json) {
			//console.log(json);
			new Chart(document.getElementById("member_chart_month"), json);

		}).fail(function(xhr, status, errorThrown) {
			alert(errorThrown);
		});
	}

	function getDayIncDec() {

		var date1 = $("#dayIncDecPickerOne").val();
		var date2 = $("#dayIncDecPickerTwo").val();
		date1 += "";
		date2 += "";
		var ajaxUrl = "/memberOverviewDayAjax.ado?StartDate=" + date1
				+ "&EndDate=" + date2;

		$.ajax({

			url : ajaxUrl,
			type : "GET",
			data : {},
			dataType : "json"

		})

		.done(function(json) {
			//console.log(json);
			new Chart(document.getElementById("join_chart_day"), json);

		}).fail(function(xhr, status, errorThrown) {
			alert(errorThrown);
		});
	}

	function getMonthInDec() {

		var date1 = $("#monthInDecPickerOne").val();
		var date2 = $("#monthInDecPickerTwo").val();
		date1 += "";
		date2 += "";
		var ajaxUrl = "/memberOverviewMonthAjax.ado?StartDate=" + date1
				+ "&EndDate=" + date2;

		$.ajax({

			url : ajaxUrl,
			type : "GET",
			data : {},
			dataType : "json"

		})

		.done(function(json) {
			//console.log(json);
			new Chart(document.getElementById("join_chart_month"), json);

		}).fail(function(xhr, status, errorThrown) {
			alert(errorThrown);
		});
	}
</script>

<!-- Javascripts -->
<jsp:include page="../include/scripts-load.jsp"/>
</body>
</html>
