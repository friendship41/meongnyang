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
													<!-- 	<form class="form-horizontal" action="javascript:void(0);">
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
														</form> -->
														<div class="table-responsive">
															<table id="dateSaleTable" class="display table" style="width: 100%; cellspacing: 0;">
																<thead>
																	<tr>
																		<th>일자(일)</th>
																		<th>총매출(원)</th>
																		<th>원가(원)</th>
																		<th>배송비(원)</th>
																		<th>포인트소모(점)</th>
																		<th>순이익(원)</th>
																	</tr>
																</thead>
																<tfoot id="dataSaleTableFoot">
																	<tr>
																		<th></th>
																		<th></th>
																		<th></th>
																		<th></th>
																		<th></th>
																		<th></th>
																	</tr>
																</tfoot>
																<tbody id="dataSaleTableBody">
																	<tr>
																		<td></td>
																		<td></td>
																		<td></td>
																		<td></td>
																		<td></td>
																		<td></td>
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
																			<input type="text" id="categorySalesStartDate" name="startDate" class="date-picker text-center form-control" placeholder="01/01/2020">
																		</div>
																		<div class="col-md-1">
																			<label class="text-center center-block">~</label>
																		</div>
																		<div class="col-md-4">
																			<input type="text" id="categorySalesEndDate" name="endDate" class="date-picker text-center form-control" placeholder="01/15/2020" style="margin-bottom: 14px;">
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
													<!-- <div class="col-md-6">
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
													</div> -->
													<div class="col-lg-12 col-md-12" style="margin-top: 80px">
														<!-- <form class="form-horizontal" action="javascript:void(0);">
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
														</form> -->
														<div class="table-responsive">
															<table id="categorySaleTable" class="display table"	style="width: 100%; cellspacing: 0;">
																<thead>
																	<tr>
																		<th>카테고리</th>
																		<th>총매출(원)</th>
																		<th>원가(원)</th>
																		<th>배송비(원)</th>
																		<th>포인트소모(점)</th>
																		<th>순이익(원)</th>
																	</tr>
																</thead>
																<tfoot id="categorySaleTableFoot">
																	<tr>
																		<th></th>
																		<th></th>
																		<th></th>
																		<th></th>
																		<th></th>
																		<th></th>
																	</tr>
																</tfoot>
																<tbody id="categorySaleTableBody">
																	<tr>
																		<td></td>
																		<td></td>
																		<td></td>
																		<td></td>
																		<td></td>
																		<td></td>
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
																			<input type="text" id="dailySalesPriceStartDate" name="startDate" class="date-picker text-center form-control" placeholder="01/01/2020">
																		</div>
																		<div class="col-md-1">
																			<label class="text-center center-block">~</label>
																		</div>
																		<div class="col-md-4">
																			<input type="text" id="dailySalesPriceEndDate" name="endDate" class="date-picker text-center form-control" placeholder="01/15/2020" style="margin-bottom: 14px;">
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
																			<input type="text" id="dailySalesPriceStartMonth" name="startMonth" class="date-picker text-center form-control" placeholder="01/01/2020">
																		</div>
																		<div class="col-md-1">
																			<label class="text-center center-block">~</label>
																		</div>
																		<div class="col-md-4">
																			<input type="text" id="dailySalesPriceEndMonth" name="endMonth" class="date-picker text-center form-control" placeholder="01/15/2020" style="margin-bottom: 14px;">
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
														<!-- <form class="form-horizontal" action="javascript:void(0);">
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
														</form> -->
														<div class="table-responsive">
															<table id="priceSaleTable" class="display table" style="width: 100%; cellspacing: 0;">
																<thead>
																	<tr>
																		<th>범주</th>
																		<th>매출(원)</th>
																		<th>원가(원)</th>
																		<th>판매량(개)</th>
																		<th>비고</th>
																		<th>비고</th>
																	</tr>
																</thead>
																<tfoot id="priceSaleTableFoot">
																	<tr>
																		<th></th>
																		<th></th>
																		<th></th>
																		<th></th>
																		<th></th>
																		<th></th>
																	</tr>
																</tfoot>
																<tbody id="priceSaleTableBody">
																	<tr>
																		<td></td>
																		<td></td>
																		<td></td>
																		<td></td>
																		<td></td>
																		<td></td>
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
																			<input type="text" id="regionSalesStartDate" name="startDate" class="date-picker text-center form-control" placeholder="01/01/2020">
																		</div>
																		<div class="col-md-1">
																			<label class="text-center center-block">~</label>
																		</div>
																		<div class="col-md-4">
																			<input type="text" id="regionSalesEndDate" name="endDate" class="date-picker text-center form-control" placeholder="01/15/2020" style="margin-bottom: 14px;">
																		</div>
																		<div class="col-md-1">
																			<button id="dailySalesRegion" class="btn btn-success center-block" style="margin-bottom: 14px;">조회</button>
																		</div>
																	</div>
																</div>
															</div>
														</form>
														<canvas id="region_sales_chart_day"></canvas>
													</div>
													<!-- <div class="col-md-6">
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
													</div> -->
													<div class="col-lg-12 col-md-12" style="margin-top: 80px">
														<!-- <form class="form-horizontal" action="javascript:void(0);">
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
														</form> -->
														<div class="table-responsive">
															<table id="regionSaleTable" class="display table"
																style="width: 100%; cellspacing: 0;">
																<thead>
																	<tr>
																		<th>지역</th>
																		<th>총매출(원)</th>
																		<th>원가(원)</th>
																		<th>배송비(원)</th>
																		<th>포인트소모(점)</th>
																		<th>순이익(원)</th>
																	</tr>
																</thead>
																<tfoot id="regionSaleTableFoot">
																	<tr>
																		<th>지역</th>
																		<th>총매출</th>
																		<th>원가</th>
																		<th>배송비</th>
																		<th>포인트소모</th>
																		<th>순이익</th>
																	</tr>
																</tfoot>
																<tbody id="regionSaleTableBody">
																	<tr>
																		<td></td>
																		<td></td>
																		<td></td>
																		<td></td>
																		<td></td>
																		<td></td>
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
        monthlySales(null);
        categorySales();
        dailySalesPrice();
        monthlySalesPrice();
        regionSales();
        
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
	 		.done(function(map) {
 				new Chart(document.getElementById("sales_chart_day"), map.chart);
 				
 				var dailySales = map.dailySales;
				
 				var str = "";
 				var totPayment = 0;
 				var totReceive = 0;
 				var totDelive = 0;
 				var totPoint = 0;
 				
 				$(dailySales).each(function() {
					var profit = this.pdOrderTbPaymentSum - this.pdSaleTbReceivedPrice - this.pdOrderTbDeliveryFee;
					
					totPayment += this.pdOrderTbPaymentSum;
					totReceive += this.pdSaleTbReceivedPrice;
	 				totDelive += this.pdOrderTbDeliveryFee;
	 				totPoint += this.pdOrderTbUsedPoint;
	 				
					str += '<tr><td>' + this.pdOrderTbPaymentDateStr + '</td>';
					str += '<td>' + this.pdOrderTbPaymentSum + '</td>';
					str += '<td>' + this.pdSaleTbReceivedPrice + '</td>';
					str += '<td>' + this.pdOrderTbDeliveryFee + '</td>';
					str += '<td>' + this.pdOrderTbUsedPoint + '</td>';
					str += '<td>' + profit + '</td>'
					str += '</tr>';
					
				});	
 				
 				var str2 = "";
 				str2 += '<tr><th>총 합</th>'
			    +  '<th>' + totPayment + '</th>'
			    +  '<th>' + totReceive + '</th>'
			    +  '<th>' + totDelive + '</th>'
			    +  '<th>' + totPoint + '</th>'
			    +  '<th>' + (totPayment - totReceive - totDelive) + '</th>'
			    + '</tr>';
 				
				$("#dataSaleTable").DataTable().clear().destroy();				 
				$("#dataSaleTableFoot").empty();
				$("#dataSaleTableBody").empty();
				$("#dataSaleTableFoot").html(str2);
				$("#dataSaleTableBody").html(str);
	            $("#dataSaleTable").DataTable();
			   					
	 		});
		}
	 	
		function monthlySales(event) {
				
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
 				
 				new Chart(document.getElementById("sales_chart_month"), json.chart);
				if(event != null){
					var salesMonthly = json.salesMonthly;
					
	 				var str = "";
	 				var totPayment = 0;
	 				var totReceive = 0;
	 				var totDelive = 0;
	 				var totPoint = 0;
	 				
	 				$(salesMonthly).each(function() {
						var profit = this.pdOrderTbPaymentSum - this.pdSaleTbReceivedPrice - this.pdOrderTbDeliveryFee;
						
						totPayment += this.pdOrderTbPaymentSum;
						totReceive += this.pdSaleTbReceivedPrice;
		 				totDelive += this.pdOrderTbDeliveryFee;
		 				totPoint += this.pdOrderTbUsedPoint;
		 				
						str += '<tr><td>' + this.pdOrderTbPaymentDateStr + '</td>';
						str += '<td>' + this.pdOrderTbPaymentSum + '</td>';
						str += '<td>' + this.pdSaleTbReceivedPrice + '</td>';
						str += '<td>' + this.pdOrderTbDeliveryFee + '</td>';
						str += '<td>' + this.pdOrderTbUsedPoint + '</td>';
						str += '<td>' + profit + '</td>'
						str += '</tr>';
						
					});	
	 				
	 				var str2 = "";
	 				str2 += '<tr><th>총 합</th>'
				    +  '<th>' + totPayment + '</th>'
				    +  '<th>' + totReceive + '</th>'
				    +  '<th>' + totDelive + '</th>'
				    +  '<th>' + totPoint + '</th>'
				    +  '<th>' + (totPayment - totReceive - totDelive) + '</th>'
				    + '</tr>';
	 				
					$("#dataSaleTable").DataTable().clear().destroy();				 
					$("#dataSaleTableFoot").empty();
					$("#dataSaleTableBody").empty();
					$("#dataSaleTableFoot").html(str2);
					$("#dataSaleTableBody").html(str);
		            $("#dataSaleTable").DataTable();
				}
	 		});
		}
	 	
		function categorySales() {
			
	 		var startDate = $("#categorySalesStartDate").val();
	 		var endDate = $("#categorySalesEndDate").val();
	 		
	 		var goUrl = "/salesCategory.ado?startDate="+startDate+"&endDate="+endDate;
	 		
	 		$.ajax({
	 			type: "GET",
	 			url: goUrl,
	 			data:{},
	 			dataType: "json"
	 		})
	 		.done(function(data) {
	 			
 				new Chart(document.getElementById("category_sales_chart_day"), data.chart);
 				var categorySales = data.categorySales;
				
 				var str = "";
 				var totPayment = 0;
 				var totReceive = 0;
 				var totDelive = 0;
 				var totPoint = 0;
 				
 				$(categorySales).each(function() {
					var profit = this.ordersDetailTbPriceSum - this.pdSaleTbReceivedPrice - this.pdOrderTbDeliveryFee;
					
					totPayment += this.ordersDetailTbPriceSum;
					totReceive += this.pdSaleTbReceivedPrice;
	 				totDelive += this.pdOrderTbDeliveryFee;
	 				totPoint += this.pdOrderTbUsedPoint;
	 				
					str += '<tr><td>' + this.productCategoryTbParent+"-"+this.productCategoryTbSub + '</td>';
					str += '<td>' + this.ordersDetailTbPriceSum + '</td>';
					str += '<td>' + this.pdSaleTbReceivedPrice + '</td>';
					str += '<td>' + this.pdOrderTbDeliveryFee + '</td>';
					str += '<td>' + this.pdOrderTbUsedPoint + '</td>';
					str += '<td>' + profit + '</td>'
					str += '</tr>';
					
				});	
 				
 				var str2 = "";
 				str2 += '<tr><th>총 합</th>'
			    +  '<th>' + totPayment + '</th>'
			    +  '<th>' + totReceive + '</th>'
			    +  '<th>' + totDelive + '</th>'
			    +  '<th>' + totPoint + '</th>'
			    +  '<th>' + (totPayment - totReceive - totDelive) + '</th>'
			    + '</tr>';
 				
				$("#categorySaleTable").DataTable().clear().destroy();				 
				$("#categorySaleTableFoot").empty();
				$("#categorySaleTableBody").empty();
				$("#categorySaleTableFoot").html(str2);
				$("#categorySaleTableBody").html(str);
	            $("#categorySaleTable").DataTable();
	 		});
		}
		
		function regionSales() {
			
	 		var startDate = $("#regionSalesStartDate").val();
	 		var endDate = $("#regionSalesEndDate").val();
	 		
	 		var goUrl = "/salesRegion.ado?startDate="+startDate+"&endDate="+endDate;
	 		
	 		$.ajax({
	 			type: "GET",
	 			url: goUrl,
	 			data:{},
	 			dataType: "json"
	 		})
	 		.done(function(data) {
	 			
 				new Chart(document.getElementById("region_sales_chart_day"), data.chart);
 				var regionSales = data.regionSales;
				
 				var str = "";
 				var totPayment = 0;
 				var totReceive = 0;
 				var totDelive = 0;
 				var totPoint = 0;
 				
 				$(regionSales).each(function() {
					var profit = this.pdOrderTbPaymentSum - this.pdSaleTbReceivedPrice - this.pdOrderTbDeliveryFee;
					
					totPayment += this.pdOrderTbPaymentSum;
					totReceive += this.pdSaleTbReceivedPrice;
	 				totDelive += this.pdOrderTbDeliveryFee;
	 				totPoint += this.pdOrderTbUsedPoint;
	 				
					str += '<tr><td>' + this.pdOrderTbAdCity+ '</td>';
					str += '<td>' + this.pdOrderTbPaymentSum + '</td>';
					str += '<td>' + this.pdSaleTbReceivedPrice + '</td>';
					str += '<td>' + this.pdOrderTbDeliveryFee + '</td>';
					str += '<td>' + this.pdOrderTbUsedPoint + '</td>';
					str += '<td>' + profit + '</td>'
					str += '</tr>';
					
				});	
 				
 				var str2 = "";
 				str2 += '<tr><th>총 합</th>'
			    +  '<th>' + totPayment + '</th>'
			    +  '<th>' + totReceive + '</th>'
			    +  '<th>' + totDelive + '</th>'
			    +  '<th>' + totPoint + '</th>'
			    +  '<th>' + (totPayment - totReceive - totDelive) + '</th>'
			    + '</tr>';
 				
				$("#regionSaleTable").DataTable().clear().destroy();				 
				$("#regionSaleTableFoot").empty();
				$("#regionSaleTableBody").empty();
				$("#regionSaleTableFoot").html(str2);
				$("#regionSaleTableBody").html(str);
	            $("#regionSaleTable").DataTable();
	 		});
		}
		
	 	$("#dailySales").on('click', function() {
			dailySales();
		})	
		
	 	$("#monthlySales").on('click', function() {
	 		monthlySales(this);
		})
		
		$("#dailySalesCategory").on('click', function() {
			categorySales();
		})
		
		$("#dailySalesRegion").on('click', function() {
			regionSales();
		})
	    
});
</script>
</body>
</html>
