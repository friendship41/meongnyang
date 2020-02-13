<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
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
<!-- End Bradcaump area -->
<hr>
<!-- cart-main-area start -->

<div class="checkout-wrap ptb--100">
	<div class="container">
		<!-- row -->
		<div class="row">
			<div class="col-xs-2 col-log-2"></div>
			<div class="col-xs-10 col-lg-10">
				<div>
					<table>
						<tr>
							<td><h6 class="title__line--5" style="font-size: 30px; margin-right: 15px">제목</h6></td>
							<td><h6 class="title__line--5"  style="font-size: 30px">${market.marketTbTitle}</h6></td>
						</tr>
					</table>
				</div>
				<div class="htc__blog__details__wrap">
				<c:if test="${market.marketTbImgPath == null}">
				
				</c:if>
				<c:if test="${market.marketTbImgPath != null}">
					<div class="ht__bl__thumb">
						<img src="${market.marketTbImgPath}" alt="market images"
							width="870" height="450">
					</div>
				</c:if>
				
					<div class="bl__dtl">
						<%-- <c:if test="${market.customerTbNo eq customer.customerTbNo }"> --%>
						<div class="reply__btn">
							<a href="market-delete.do?marketTbNo=${market.marketTbNo}">글삭제</a> <a href="market-update.do?marketTbNo=${market.marketTbNo}">글수정</a>
						</div>
						<%-- </c:if> --%>
						<br>
						<p>${market.marketTbContent }</p>
					</div>
					<!-- Start Comment Area -->
					<div class="htc__comment__area">
						<h4 class="title__line--5">HAVE 2 COMMENTS</h4>
						<div class="ht__comment__content">
							<!-- Start Single Comment -->
							<div class="comment">
								<div class="ht__comment__details">
									<div class="ht__comment__title">
										<h2>
											<a href="#">JOHN NGUYEN</a>
										</h2>
										<div class="reply__btn">
											<a href="#">reply</a>
										</div>
									</div>
									<span>July 15, 2016 at 2:39 am</span>
									<p>Exercitation photo booth stumptown tote bag Banksy, elit
										small batch freegan sed.</p>
								</div>
							</div>
							<!-- End Single Comment -->
							<!-- Start Single Comment -->
							<div class="comment comment--reply">
								<div class="ht__comment__details">
									<div class="ht__comment__title">
										<h2>
											<a href="#">JOHN NGUYEN</a>
										</h2>
										<div class="reply__btn">
											<a href="#">reply</a>
										</div>
									</div>
									<span>July 15, 2016 at 2:39 am</span>
									<p>Exercitation photo booth stumptown tote bag Banksy, elit
										small batch freegan sed.</p>
								</div>
							</div>
							<!-- End Single Comment -->
							<!-- Start Single Comment -->
							<div class="comment">
								<div class="ht__comment__details">
									<div class="ht__comment__title">
										<h2>
											<a href="#">JOHN NGUYEN</a>
										</h2>
										<div class="reply__btn">
											<a href="#">reply</a>
										</div>
									</div>
									<span>July 15, 2016 at 2:39 am</span>
									<p>Exercitation photo booth stumptown tote bag Banksy, elit
										small batch freegan sed.</p>
								</div>
							</div>
							<!-- End Single Comment -->
						</div>
					</div>
					<!-- End Comment Area -->
					<!-- Start comment Form -->
					<div class="ht__comment__form">
						<h4 class="title__line--5">Leave a Comment</h4>
						<div class="ht__comment__form__inner">
							<div class="comment__form">
								<input type="text" placeholder="Name *" readonly="readonly">
								<input type="email" placeholder="Email *" readonly="readonly">
								<input type="text" placeholder="Website">
							</div>
							<div class="comment__form message">
								<textarea name="message" placeholder="Your Comment"></textarea>
							</div>
						</div>
						<div class="ht__comment__btn--2 mt--30">
							<a class="fr__btn" href="#">Send</a>
						</div>
					</div>
					<!-- End comment Form -->
				</div>
			</div>
		</div>
		<!-- !row -->
	</div>
</div>
<!-- cart-main-area end -->


<jsp:include page="../include/footer.jsp" />