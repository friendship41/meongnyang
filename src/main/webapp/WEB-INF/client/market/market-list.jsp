<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../include/header.jsp" />


<!-- Start Bradcaump area -->
<div class="ht__bradcaump__area"
	style="background: rgba(0, 0, 0, 0) url(/resources/client/images/bg/market.jpg) no-repeat scroll center center/cover;">
	<div class="ht__bradcaump__wrap">
		<div class="container">
			<div class="row">
				<div class="col-xs-12">
					<div class="bradcaump__inner">
						<nav class="bradcaump-inner">
							<a class="breadcrumb-item" href="index.html">Home</a> <span
								class="brd-separetor"><i class="zmdi zmdi-chevron-right"></i></span>
							<span class="breadcrumb-item active">Market</span>
						</nav>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<hr>
<!-- End Bradcaump area -->
<!-- Start Blog Area -->
<!-- 구매 판매 버튼 추가 -->

<section class="htc__blog__area bg__white ptb--100">
	<div class="container">
		<div class="row">
			<div class="ht__blog__wrap blog--page clearfix">
				<div class="htc__grid__top__market__list">
					<div class="htc__select__option">
						<select class="ht__select" id="selector">
							<option value="all">전체</option>
							<option value="buy">구매</option>
							<option value="sell">판매</option>
						</select>
					</div>
				<div class="write__market__list">
					<a href="/marketMap.do">내 주변 검색</a>
					<a href="/market-form.do">글쓰기</a>
				</div>
				</div>
				<hr>
				<!-- Start Single Blog -->
				<c:forEach items="${marketList}" var="market">
					<div class="col-md-6 col-lg-4 col-sm-12 col-xs-12">
						<div class="blog">
							<c:if test="${market.marketTbImgPath == null}">
								<div class="blog__thumb">
									<a href="/market-read.do?marketTbNo=${market.marketTbNo}">
										<img src="/resources/image/market/unnamed.png" alt="maket images"
										width="400" height="287">
									</a>
								</div>
							</c:if>
							<c:if test="${market.marketTbImgPath != null}">
								<div class="blog__thumb">
									<a href="/market-read.do?marketTbNo=${market.marketTbNo}">
										<img src="${market.marketTbImgPath}" alt="maket images"
										width="400" height="287">
									</a>
								</div>
							</c:if>
							<div class="blog__details">
								<div class="bl__date">
									<span>${market.marketTbRegDate}</span>
								</div>
								<h2>
									<a href="/market-read.do?marketTbNo=${market.marketTbNo}">${market.marketTbTitle}</a>
								</h2>
								<div class="blog__btn">
									<a href="/market-read.do?marketTbNo=${market.marketTbNo}">더보기</a>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>
				<!-- End Single Blog -->
			</div>
		</div>
		<!-- Start PAgenation -->
		<div class="row">
			<div class="col-xs-12">
				<ul class="htc__pagenation">
				<c:if test="${paging.prev == true}">
					<li><a href="/market-list.do?currentPage=${paging.startPage - paging.pageBlock}"><i class="zmdi zmdi-chevron-left"></i></a></li>
					</c:if>
					<c:forEach var="i" begin="${paging.startPage}" end="${paging.endPage}" >
					<c:if test="${paging.currentPage eq i}">
					<li class="active"><a href="/market-list.do?currentPage=${i}">${i}</a></li>					
					</c:if>
					<c:if test="${paging.currentPage ne i}">
					<li><a href="/market-list.do?currentPage=${i}">${i}</a></li>										
					</c:if>
					</c:forEach>
					<c:if test="${paging.next == true}">
					<li><a href="/market-list.do?currentPage=${paging.endPage + 1}"><i class="zmdi zmdi-chevron-right"></i></a></li>
					</c:if>
				</ul>
			</div>
		</div>
		<!-- End PAgenation -->
	</div>
</section>
<!-- End Blog Area -->
<jsp:include page="../include/footer.jsp" />

<script>
$(function() {

	$(document).ready(function() {
	
		if("${selector}" == "S"){
			$("#selector").val("sell");
		} else if ("${selector}" == "B") {
			$("#selector").val("buy");
		}
	});
	
	$("#selector").change(function() {

		document.location.href="/market-list.do?marketTbSellOrBuy=" + this.value;
	});
	
})
</script>
