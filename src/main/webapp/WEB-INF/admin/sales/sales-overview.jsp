<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-09
  Time: 오후 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html lang="kor">
<jsp:include page="../include/head.jsp" />
<body>

	<!-- Page Container -->
	<div class="page-container">
		<!-- Page Sidebar -->
		<jsp:include page="../include/page-sidebar.jsp" />
		<!-- /Page Sidebar -->

		<!-- Page Content -->
		<div class="page-content">
			<!-- Page Header -->
			<jsp:include page="../include/page-header.jsp" />
			<!-- /Page Header -->
			<!-- Page Inner -->
			<div class="page-inner">
				<div class="page-title">
					<h3 class="breadcrumb-header">매출 현황</h3>
				</div>
				<div id="main-wrapper">

					<!-- 상세정보 -->
					<!-- Row -->
					<div class="row">
						<div class="col-md-12">
							<div class="panel panel-white">
								<div class="panel-heading clearfix">
									<h4 class="panel-title">매출 현황</h4>
								</div>
								<div class="panel-body">
									<div class="panel-group" id="accordion2" role="tablist"
										aria-multiselectable="true">
										<div class="panel panel-primary">
											<div class="panel-heading" role="tab" id="headingOne1">
												<h4 class="panel-title">
													<a data-toggle="collapse" data-parent="#accordion2" href="#1" aria-expanded="true" aria-controls="collapseOne">기간별 매출 현황 </a>
												</h4>
											</div>
											<div id="1" class="panel-collapse collapse in"
												role="tabpanel" aria-labelledby="headingOne1">
												<div class="panel-body">
													<div class="col-md-6">
														<div class="panel-heading clearfix">
															<h4 class="panel-title">일별 매출</h4>
														</div>
														<form class="form-horizontal" action="javascript:void(0);">
															<div class="form-group">
																<div class="col-sm-10">
																	<div class="row">
																		<div class="col-md-4">
																			<input type="text" id="dailySalesStartDate" name="startDate" class="date-picker text-center form-control" placeholder="01/01/2020">
																		</div>
																		<div class="col-md-1">
																			<label class="text-center center-block">~</label>
																		</div>
																		<div class="col-md-4">
																			<input type="text" id="dailySalesEndDate" name="endDate" class="date-picker text-center form-control" placeholder="01/15/2020" style="margin-bottom: 14px;">
																		</div>
																		<div class="col-md-1">
																			<button id="dailySales" class="btn btn-success center-block" style="margin-bottom: 14px;">조회</button>
																		</div>
																	</div>
																</div>
															</div>
														</form>
														<canvas id="sales_chart_day"></canvas>
													</div>
													<div class="col-md-6">
														<div class="panel-heading clearfix">
															<h4 class="panel-title">월별 매출</h4>
														</div>
														<form class="form-horizontal" action="javascript:void(0);">
															<div class="form-group">
																<div class="col-sm-10">
																	<div class="row">
																		<div class="col-md-4">
																			<input type="text" id="monthlySalesStartDate" name="startMonth" class="date-picker text-center form-control" placeholder="01/01/2020">
																		</div>
																		<div class="col-md-1">
																			<label class="text-center center-block">~</label>
																		</div>
																		<div class="col-md-4">
																			<input type="text" id="monthlySalesEndDate" name="endMonth" class="date-picker text-center form-control" placeholder="01/15/2020" style="margin-bottom: 14px;">
																		</div>
																		<div class="col-md-1">
																			<button id="monthlySales" class="btn btn-success center-block" style="margin-bottom: 14px;">조회</button>
																		</div>
																	</div>
																</div>
															</div>
														</form>
														<canvas id="sales_chart_month"></canvas>
													</div>
													<div class="col-lg-12 col-md-12" style="margin-top: 80px">
														<form class="form-horizontal" action="javascript:void(0);">
															<div class="form-group">
																<div class="col-sm-10">
																	<div class="row">
																		<div class="col-md-4">
																			<input type="text" name="startDate" class="date-picker text-center form-control" placeholder="01/01/2020">
																		</div>
																		<div class="col-md-1">
																			<label class="text-center center-block">~</label>
																		</div>
																		<div class="col-md-4">
																			<input type="text" name="endDate" class="date-picker text-center form-control" placeholder="01/15/2020" style="margin-bottom: 14px;">
																		</div>
																		<div class="col-md-1">
																			<button id="periodSales" class="btn btn-success center-block" style="margin-bottom: 14px;">조회</button>
																		</div>
																	</div>
																</div>
															</div>
														</form>
														<div class="table-responsive">
															<table id="dateSaleTable" class="display table" style="width: 100%; cellspacing: 0;">
																<thead>
																	<tr>
																		<th>기간</th>
																		<th>총매출</th>
																		<th>원가</th>
																		<th>배송비</th>
																		<th>포인트소모</th>
																		<th>순이익</th>
																	</tr>
																</thead>
																<tfoot>
																	<tr>
																		<th>기간</th>
																		<th>총매출</th>
																		<th>원가</th>
																		<th>배송비</th>
																		<th>포인트소모</th>
																		<th>순이익</th>
																	</tr>
																</tfoot>
																<tbody>
																	<tr>
																		<td>000002</td>
																		<td>개 사료 외 1종</td>
																		<td><span class="label label-nowGo">배송중</span></td>
																		<td>안창호</td>
																		<td>2011/04/25</td>
																		<td>150,000</td>
																	</tr>																
																</tbody>
															</table>
														</div>
													</div>
												</div>
											</div>
										</div>
										<div class="panel panel-success">
											<div class="panel-heading" role="tab" id="headingTwo2">
												<h4 class="panel-title">
													<a class="collapsed" data-toggle="collapse" data-parent="#accordion2" href="#2" aria-expanded="false" aria-controls="collapseTwo"> 카테고리별 매출 현황 </a>
												</h4>
											</div>
											<div id="2" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo2">
												<div class="panel-body">
													<div class="col-md-6">
														<div class="panel-heading clearfix">
															<h4 class="panel-title">일별 매출</h4>
														</div>
														<form class="form-horizontal" action="javascript:void(0);">
															<div class="form-group">
																<div class="col-sm-10">
																	<div class="row">
																		<div class="col-md-4">
																			<input type="text" name="startDate" class="date-picker text-center form-control" placeholder="01/01/2020">
																		</div>
																		<div class="col-md-1">
																			<label class="text-center center-block">~</label>
																		</div>
																		<div class="col-md-4">
																			<input type="text" name="endDate" class="date-picker text-center form-control" placeholder="01/15/2020" style="margin-bottom: 14px;">
																		</div>
																		<div class="col-md-1">
																			<button id="dailySalesCategory" class="btn btn-success center-block" style="margin-bottom: 14px;">조회</button>
																		</div>
																	</div>
																</div>
															</div>
														</form>
														<canvas id="category_sales_chart_day"></canvas>
													</div>
													<div class="col-md-6">
														<div class="panel-heading clearfix">
															<h4 class="panel-title">월별 매출</h4>
														</div>
														<form class="form-horizontal" action="javascript:void(0);">
															<div class="form-group">
																<div class="col-sm-10">
																	<div class="row">
																		<div class="col-md-4">
																			<input type="text" name="startMonth" class="date-picker text-center form-control" placeholder="01/01/2020">
																		</div>
																		<div class="col-md-1">
																			<label class="text-center center-block">~</label>
																		</div>
																		<div class="col-md-4">
																			<input type="text" name="endMonth" class="date-picker text-center form-control" placeholder="01/15/2020" style="margin-bottom: 14px;">
																		</div>
																		<div class="col-md-1">
																			<button id="monthlySalesCategory" class="btn btn-success center-block" style="margin-bottom: 14px;">조회</button>
																		</div>
																	</div>
																</div>
															</div>
														</form>
														<canvas id="category_sales_chart_month"></canvas>
													</div>
													<div class="col-lg-12 col-md-12" style="margin-top: 80px">
														<form class="form-horizontal" action="javascript:void(0);">
															<div class="form-group">
																<div class="col-sm-10">
																	<div class="row">
																		<div class="col-md-4">
																			<input type="text" name="startDate" class="date-picker text-center form-control" placeholder="01/01/2020">
																		</div>
																		<div class="col-md-1">
																			<label class="text-center center-block">~</label>
																		</div>
																		<div class="col-md-4">
																			<input type="text" name="endDate" class="date-picker text-center form-control" placeholder="01/15/2020" style="margin-bottom: 14px;">
																		</div>
																		<div class="col-md-1">
																			<button id="periodSalesCategory" class="btn btn-success center-block" style="margin-bottom: 14px;">조회</button>
																		</div>
																	</div>
																</div>
															</div>
														</form>
														<div class="table-responsive">
															<table id="categorySaleTable" class="display table"
																style="width: 100%; cellspacing: 0;">
																<thead>
																	<tr>
																		<th>카테고리</th>
																		<th>총매출</th>
																		<th>원가</th>
																		<th>배송비</th>
																		<th>포인트소모</th>
																		<th>순이익</th>
																	</tr>
																</thead>
																<tfoot>
																	<tr>
																		<th>기간</th>
																		<th>총매출</th>
																		<th>원가</th>
																		<th>배송비</th>
																		<th>포인트소모</th>
																		<th>순이익</th>
																	</tr>
																</tfoot>
																<tbody>
																	<tr>
																		<td>000002</td>
																		<td>개 사료 외 1종</td>
																		<td><span class="label label-nowGo">배송중</span></td>
																		<td>안창호</td>
																		<td>2011/04/25</td>
																		<td>150,000</td>
																	</tr>																	
																</tbody>
															</table>
														</div>
													</div>
												</div>
											</div>
										</div>
										<div class="panel panel-danger">
											<div class="panel-heading" role="tab" id="headingThree3">
												<h4 class="panel-title">
													<a class="collapsed" data-toggle="collapse" data-parent="#accordion2" href="#3" aria-expanded="false" aria-controls="collapseThree"> 가격별 매출 현황 </a>
												</h4>
											</div>
											<div id="3" class="panel-collapse collapse" role="tabpanel"
												aria-labelledby="headingThree3">
												<div class="panel-body">
													<div class="col-md-6">
														<div class="panel-heading clearfix">
															<h4 class="panel-title">일별 매출</h4>
														</div>
														<form class="form-horizontal" action="javascript:void(0);">
															<div class="form-group">
																<div class="col-sm-10">
																	<div class="row">
																		<div class="col-md-4">
																			<input type="text" name="startDate" class="date-picker text-center form-control" placeholder="01/01/2020">
																		</div>
																		<div class="col-md-1">
																			<label class="text-center center-block">~</label>
																		</div>
																		<div class="col-md-4">
																			<input type="text" name="endDate" class="date-picker text-center form-control" placeholder="01/15/2020" style="margin-bottom: 14px;">
																		</div>
																		<div class="col-md-1">
																			<button id="dailySalesPrice" class="btn btn-success center-block"style="margin-bottom: 14px;">조회</button>
																		</div>
																	</div>
																</div>
															</div>
														</form>
														<canvas id="price_sales_chart_day"></canvas>
													</div>
													<div class="col-md-6">
														<div class="panel-heading clearfix">
															<h4 class="panel-title">월별 매출</h4>
														</div>
														<form class="form-horizontal" action="javascript:void(0);">
															<div class="form-group">
																<div class="col-sm-10">
																	<div class="row">
																		<div class="col-md-4">
																			<input type="text" name="startMonth" class="date-picker text-center form-control" placeholder="01/01/2020">
																		</div>
																		<div class="col-md-1">
																			<label class="text-center center-block">~</label>
																		</div>
																		<div class="col-md-4">
																			<input type="text" name="endMonth" class="date-picker text-center form-control" placeholder="01/15/2020" style="margin-bottom: 14px;">
																		</div>
																		<div class="col-md-1">
																			<button id="monthlySalesPrice" class="btn btn-success center-block" style="margin-bottom: 14px;">조회</button>
																		</div>
																	</div>
																</div>
															</div>
														</form>
														<canvas id="price_sales_chart_month"></canvas>
													</div>
													<div class="col-lg-12 col-md-12" style="margin-top: 80px">
														<form class="form-horizontal" action="javascript:void(0);">
															<div class="form-group">
																<div class="col-sm-10">
																	<div class="row">
																		<div class="col-md-4">
																			<input type="text" name="startDate" class="form-control" placeholder="0">
																		</div>
																		<div class="col-md-1">
																			<label class="text-center center-block">~</label>
																		</div>
																		<div class="col-md-4">
																			<input type="text" name="endDate" class="form-control" placeholder="10000" style="margin-bottom: 14px;">
																		</div>
																		<div class="col-md-1">
																			<button id="periodSalesPrice" class="btn btn-success center-block" style="margin-bottom: 14px;">조회</button>
																		</div>
																	</div>
																</div>
															</div>
														</form>
														<div class="table-responsive">
															<table id="priceSaleTable" class="display table"
																style="width: 100%; cellspacing: 0;">
																<thead>
																	<tr>
																		<th>범주</th>
																		<th>총매출</th>
																		<th>총원가</th>
																		<th>총배송비</th>
																		<th>총포인트소모</th>
																		<th>순이익</th>
																	</tr>
																</thead>
																<tfoot>
																	<tr>
																		<th>범주</th>
																		<th>총매출</th>
																		<th>총원가</th>
																		<th>총배송비</th>
																		<th>총포인트소모</th>
																		<th>순이익</th>
																	</tr>
																</tfoot>
																<tbody>
																	<tr>
																		<td>000002</td>
																		<td>개 사료 외 1종</td>
																		<td><span class="label label-nowGo">배송중</span></td>
																		<td>안창호</td>
																		<td>2011/04/25</td>
																		<td>150,000</td>
																	</tr>
																</tbody>
															</table>
														</div>
													</div>
												</div>
											</div>
										</div>
										<div class="panel panel-primary">
											<div class="panel-heading" role="tab" id="headingFour4">
												<h4 class="panel-title">
													<a class="collapsed" data-toggle="collapse" data-parent="#accordion2" href="#4" aria-expanded="false" aria-controls="collapseTwo"> 지역별 매출 현황 </a>
												</h4>
											</div>
											<div id="4" class="panel-collapse collapse" role="tabpanel"
												aria-labelledby="headingFour4">
												<div class="panel-body">
													<div class="col-md-6">
														<div class="panel-heading clearfix">
															<h4 class="panel-title">일별 매출</h4>
														</div>
														<form class="form-horizontal" action="javascript:void(0);">
															<div class="form-group">
																<div class="col-sm-10">
																	<div class="row">
																		<div class="col-md-4">
																			<input type="text" name="startDate" class="date-picker text-center form-control" placeholder="01/01/2020">
																		</div>
																		<div class="col-md-1">
																			<label class="text-center center-block">~</label>
																		</div>
																		<div class="col-md-4">
																			<input type="text" name="endDate" class="date-picker text-center form-control" placeholder="01/15/2020" style="margin-bottom: 14px;">
																		</div>
																		<div class="col-md-1">
																			<button id="dailySalesCity" class="btn btn-success center-block" style="margin-bottom: 14px;">조회</button>
																		</div>
																	</div>
																</div>
															</div>
														</form>
														<canvas id="region_sales_chart_day"></canvas>
													</div>
													<div class="col-md-6">
														<div class="panel-heading clearfix">
															<h4 class="panel-title">월별 매출</h4>
														</div>
														<form class="form-horizontal">
															<div class="form-group">
																<div class="col-sm-10">
																	<div class="row">
																		<div class="col-md-4">
																			<input type="text" name="startMonth" class="date-picker text-center form-control" placeholder="01/01/2020">
																		</div>
																		<div class="col-md-1">
																			<label class="text-center center-block">~</label>
																		</div>
																		<div class="col-md-4">
																			<input type="text" name="endMonth" class="date-picker text-center form-control" placeholder="01/15/2020" style="margin-bottom: 14px;">
																		</div>
																		<div class="col-md-1">
																			<button type="submit" id="mothlySalesCity" class="btn btn-success center-block" style="margin-bottom: 14px;">조회</button>
																		</div>
																	</div>
																</div>
															</div>
														</form>
														<canvas id="region_sales_chart_month"></canvas>
													</div>
													<div class="col-lg-12 col-md-12" style="margin-top: 80px">
														<form class="form-horizontal" action="javascript:void(0);">
															<div class="form-group">
																<div class="col-sm-10">
																	<div class="row">
																		<div class="col-md-4">
																			<input type="text" name="startDate" class="date-picker text-center form-control" placeholder="01/01/2020">
																		</div>
																		<div class="col-md-1">
																			<label class="text-center center-block">~</label>
																		</div>
																		<div class="col-md-4">
																			<input type="text" name="endDate" class="date-picker text-center form-control" placeholder="01/15/2020" style="margin-bottom: 14px;">
																		</div>
																		<div class="col-md-1">
																			<button type="submit" id="periodSalesCity" class="btn btn-success center-block" style="margin-bottom: 14px;">조회</button>
																		</div>
																	</div>
																</div>
															</div>
														</form>
														<div class="table-responsive">
															<table id="regionSaleTable" class="display table"
																style="width: 100%; cellspacing: 0;">
																<thead>
																	<tr>
																		<th>지역</th>
																		<th>총매출</th>
																		<th>원가</th>
																		<th>배송비</th>
																		<th>포인트소모</th>
																		<th>순이익</th>
																	</tr>
																</thead>
																<tfoot>
																	<tr>
																		<th>지역</th>
																		<th>총매출</th>
																		<th>원가</th>
																		<th>배송비</th>
																		<th>포인트소모</th>
																		<th>순이익</th>
																	</tr>
																</tfoot>
																<tbody>
																	<tr>
																		<td>000002</td>
																		<td>개 사료 외 1종</td>
																		<td><span class="label label-nowGo">배송중</span></td>
																		<td>안창호</td>
																		<td>2011/04/25</td>
																		<td>150,000</td>
																	</tr>																	
																</tbody>
															</table>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<!-- !Row -->
				</div>
				<!-- Main Wrapper -->
				<div class="page-footer">
					<p>
						메인프로젝트 뭐먹냥 <i class="fa fa-heart"></i> by team4
					</p>
				</div>
			</div>
			<!-- /Page Inner -->
			<jsp:include page="../include/right-sidebar.jsp" />
		</div>
		<!-- /Page Content -->
	</div>
	<!-- /Page Container -->



	<!-- Javascripts -->
	<jsp:include page="../include/scripts-load.jsp" />	
	<script>
	$(function() {
	
		var twoWeekAgo = new Date(new Date().setDate(new Date().getDate()-15));
		var oneDayAgo = new Date(new Date().setDate(new Date().getDate()-1));
		
		$("input[name='startDate']").attr("value", twoWeekAgo.yyyymmdd());
        $("input[name='endDate']").attr("value", oneDayAgo.yyyymmdd());

        $("input[name='startMonth']").attr("value", getMonthAgoDate(6).yyyymmdd());
        $("input[name='endMonth']").attr("value", new Date().yyyymmdd());
        
        dailySales();
        monthlySales();
        
        
	 	function dailySales() {
				
	 		var startDate = $("#dailySalesStartDate").val();
	 		var endDate = $("#dailySalesEndDate").val();
	 		
	 		var goUrl = "/salesOverviewDay.ado?startDate="+startDate+"&endDate="+endDate;
	 		
	 		$.ajax({
	 			type: "GET",
	 			url: goUrl,
	 			data:{},
	 			dataType: "json"
	 		})
	 		.done(function(json) {
 				console.log(json);
 				new Chart(document.getElementById("sales_chart_day"), json);
	 		});
		}
	 	
		function monthlySales() {
				
	 		var startDate = $("#monthlySalesStartDate").val();
	 		var endDate = $("#monthlySalesEndDate").val();
	 		
	 		var goUrl = "/salesOverviewMonth.ado?startDate="+startDate+"&endDate="+endDate;
	 		
	 		$.ajax({
	 			type: "GET",
	 			url: goUrl,
	 			data:{},
	 			dataType: "json"
	 		})
	 		.done(function(json) {
 				console.log(json);
 				new Chart(document.getElementById("sales_chart_month"), json);
	 		});
		}
	 	
	 	$("#dailySales").on('click', function() {
			dailySales();
		})	
		
	 	$("#monthlySales").on('click', function() {
	 		monthlySales();
		})
	    
	    function chartGo() {	    	
	
	        new Chart(document.getElementById("category_sales_chart_day"), {
	        	"type":"doughnut",
	        	"data": {
	        		"labels":["10대","20대","30대","40대","50대","60대"],
	        		"datasets":[{
	        			"label":"My First Dataset",
	        			"data":[300,500,500,400,300,200],
	        			"backgroundColor":[
	        				"rgb(236, 94, 105)","rgb(0, 112, 224)","rgb(241, 194, 5)","rgb(144,241,88)","rgb(101, 80, 55)","rgb(41, 14, 5)"]}
	        		]}
	        });
	        new Chart(document.getElementById("category_sales_chart_month"),{"type":"doughnut","data":{"labels":["10대","20대","30대","40대","50대","60대"],"datasets":[{"label":"My First Dataset","data":[300,500,500,400,300,200],"backgroundColor":["rgb(236, 94, 105)","rgb(0, 112, 224)","rgb(241, 194, 5)","rgb(144,241,88)","rgb(101, 80, 55)","rgb(41, 14, 5)"]}]}});
	
	        new Chart(document.getElementById("price_sales_chart_day"), {
	            "type": "line",
	            "data": {
	                "labels": ["1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일", "15일"],
	                "datasets": [{
	                    "label": "회원가입수",
	                    "data": [5000, 2000, 3000, 4000, 5000, 500, 3600, 3210, 8000, 2000, 10000, 12000, 1000, 2000, 3000],
	                    "fill": false,
	                    "borderColor": "rgb(99, 203, 137)",
	                    "lineTension": 0.2
	                }, {
	                    "label": "회원탈퇴수",
	                    "data": [1000, 500, 1000, 500, 2000, 100, 600, 210, 3000, 1000, 2000, 2000, 0, 1000, 2000],
	                    "fill": false,
	                    "borderColor": "rgb(203,36,45)",
	                    "lineTension": 0.2
	                }, {
	                    "label": "회원증감",
	                    "data": [4000, 1500, 2000, 3500, 3000, 400, 3000, 3000, 5000, 1000, 8000, 10000, 1000, 1000, 1000],
	                    "fill": false,
	                    "borderColor": "rgb(42,94,203)",
	                    "lineTension": 0.2
	                }]
	            },
	            "options": {}
	        });
	        
	        
	        new Chart(document.getElementById("price_sales_chart_month"), {
	            "type": "line",
	            "data": {
	                "labels": ["1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"],
	                "datasets": [{
	                    "label": "회원가입수",
	                    "data": [5000, 2000, 3000, 4000, 5000, 500, 3600, 3210, 8000, 2000, 10000, 12000],
	                    "fill": false,
	                    "borderColor": "rgb(99, 203, 137)",
	                    "lineTension": 0.2
	                }, {
	                    "label": "회원탈퇴수",
	                    "data": [1000, 500, 1000, 500, 2000, 100, 600, 210, 3000, 1000, 2000, 2000],
	                    "fill": false,
	                    "borderColor": "rgb(203,36,45)",
	                    "lineTension": 0.2
	                }, {
	                    "label": "회원증감",
	                    "data": [4000, 1500, 2000, 3500, 3000, 400, 3000, 3000, 5000, 1000, 8000, 10000],
	                    "fill": false,
	                    "borderColor": "rgb(42,94,203)",
	                    "lineTension": 0.2
	                }]
	            },
	            "options": {}
	        });
	
	        new Chart(document.getElementById("region_sales_chart_day"),{"type":"doughnut","data":{"labels":["10대","20대","30대","40대","50대","60대"],"datasets":[{"label":"My First Dataset","data":[300,500,500,400,300,200],"backgroundColor":["rgb(236, 94, 105)","rgb(0, 112, 224)","rgb(241, 194, 5)","rgb(144,241,88)","rgb(101, 80, 55)","rgb(41, 14, 5)"]}]}});
	        new Chart(document.getElementById("region_sales_chart_month"),{"type":"doughnut","data":{"labels":["10대","20대","30대","40대","50대","60대"],"datasets":[{"label":"My First Dataset","data":[300,500,500,400,300,200],"backgroundColor":["rgb(236, 94, 105)","rgb(0, 112, 224)","rgb(241, 194, 5)","rgb(144,241,88)","rgb(101, 80, 55)","rgb(41, 14, 5)"]}]}});
	
	    }

});
</script>
</body>
</html>
