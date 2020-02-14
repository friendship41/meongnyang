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
<!-- End Bradcaump area -->
<!-- cart-main-area start -->
<div class="checkout-wrap ptb--100">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="htc__blog__details__wrap">
					<div class="ht__comment__form">
						<h4 class="title__line--5">글수정하기</h4>
						<form class="form-horizontal" method="post"	action="/market-update.do" enctype="multipart/form-data">
							<input type="hidden" name="marketTbNo" value="${market.marketTbNo}">
							<div class="form-group">
								<label for="selector" class="col-sm-2 control-label"></label>
								<div class="col-sm-8">
									<select name="marketTbSellOrBuy" id="selector" class="form-control1">
											<option value="sell">판매</option>
											<option value="buy">구매</option>
									</select>
								</div>
							</div>
							<div class="form-group">
								<label for="smallinput"	class="col-sm-2 control-label label-input-sm">이름</label>
								<div class="col-sm-8">
									<input type="text" value="">
								</div>
							</div>
							<div class="form-group">
								<label for="email" class="col-sm-2 control-label label-input-sm">이메일</label>
								<div class="col-sm-8">
									<input type="email" id="email">
								</div>
							</div>
							<div class="form-group">
								<label for="filename" class="col-sm-2 control-label label-input-sm">첨부파일</label>
								<div class="col-sm-8">
									<input name="uploadFile" type="file" id="filename">이미지를 수정하시려면 파일을 추가해주세요.
								</div>
							</div>
							<div class="form-group">
								<label for="message" class="col-sm-2 control-label">제목</label>
								<div class="col-sm-8">
									<input type="text" name="marketTbTitle"
										value="${market.marketTbTitle }">
								</div>
							</div>
							<div class="form-group">
								<label for="message" class="col-sm-2 control-label">내용</label>
								<div class="col-sm-8">
									<textarea name="marketTbContent" id="message">${market.marketTbContent }</textarea>
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-2"></div>
								<div class="ht__comment__btn--2 mt--50 col-sm-8">
									<input type="submit" class="fr__btn" value="등록"> <input type="button" onclick="location.href='/market-list.do'"	class="fr__btn" value="취소">
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- cart-main-area end -->


<jsp:include page="../include/footer.jsp" />


<script>
$(document).ready(function() {

	if('${market.marketTbSellOrBuy}' == 'S'){
		$("select option[value=sell]").prop("selected","true");		
	} else if('${market.marketTbSellOrBuy}' == 'B'){
		$("select option[value=buy]").prop("selected","true");	
	}
});

</script>