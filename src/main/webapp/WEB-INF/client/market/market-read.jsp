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
							<a href="#" onclick="deleteMarket()">글삭제</a> <a href="market-update.do?marketTbNo=${market.marketTbNo}">글수정</a>
						</div>
						<%-- </c:if> --%>
						<br>
						<pre>${market.marketTbContent }</pre>
					</div>
					<!-- Start Comment Area -->
					<div class="htc__comment__area">
						<h4 class="title__line--5">HAVE ${commentCnt} COMMENTS</h4>
						<div class="ht__comment__content" id="comment-content">
							<!-- Start Single Comment -->
						<!-- 	<div class="comment">
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
							</div> -->
							<!-- End Single Comment -->
							<!-- Start Single Comment -->
						<!-- 	<div class="comment comment--reply">
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
							</div> -->
							<!-- End Single Comment -->
						</div>
					</div>
					<!-- End Comment Area -->
					<!-- Start comment Form -->
					<div class="ht__comment__form">
						<form id="commentform">
						<input type="hidden" id="marketTbNo" value="${market.marketTbNo}">
						<input type="hidden" id="customerTbNo" value="${customer.customerTbNo}">
						<h4 class="title__line--5">댓글 쓰기</h4>
						<div class="ht__comment__form__inner">
							<div class="comment__form">
								<input type="text" placeholder="이름 *" readonly="readonly" value="${customer.customerTbName}">
								<input type="email" placeholder="이메일 *" readonly="readonly" value="${customer.customerTbEmail}">
							</div>
							<div class="comment__form message">
								<textarea name="marketCommentTbContent" id="marketCommentTbContent" placeholder="내용"></textarea>
							</div>
						</div>
						</form>
			<%-- 			<c:if test="${customer != null}"> --%>
						<div class="ht__comment__btn--2 mt--30">
							<a href="javascript:void(0);" class="fr__btn" id="addcomment-btn">댓글 등록</a>
						</div>
						<%-- </c:if> --%>
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
<script>
function deleteMarket() {
	alert("정말로 삭제 하시겠습니까? ");
	document.location.href="market-delete.do?marketTbNo=" + ${market.marketTbNo};
}

//start jqury
$(function() {
	var marketNo = $("#marketTbNo").val();
	var state = false;
	
	getComment();
	
	//코멘트 불러오기
	function getComment() {
		
		$.getJSON("/commentList.do?marketTbNo=" + marketNo, function(data) {
			console.log(data);
			var str = "";
			
			$(data).each(function() {
				if (this.marketCommentTbStep === 0){
				str += '<div class="comment">'		
				} else if (this.marketCommentTbStep >= 1){
					str += '<div class="comment comment--reply">'
				}
					str += '<div class="ht__comment__details">'
					+ '<input type="hidden" name="marketCommentTbRef" value="'+ this.marketCommentTbRef+'" >'
					+ '<input type="hidden" name="marketCommentTbStep" value="'+ this.marketCommentTbStep+'">'
					+ '<input type="hidden" name="marketCommentTbNo" value="'+ this.marketCommentTbNo+'">'
					+ '<div class="ht__comment__title">'
					if(this.marketCommentTbState === 'N'){
						str += '<h2><a href="#">' + this.customerTbName + '</a></h2>'
						+ '<div class="reply__btn"><a href="javascript:void(0);" name="replyBtn" style="margin-left:10px;">reply</a></div>'
						+ '<div class="reply__btn"><a href="javascript:void(0);" name="updateBtn" style="margin-left:10px;">update</a></div>'
						+ '<div class="reply__btn"><a href="javascript:void(0);" name="deleteBtn" style="margin-left:10px;">delete</a></div>'
						+ '</div>'
						+ '<span>' + this.marketCommentTbRegDate + '</span>'	
					} else if(this.marketCommentTbState === 'D'){
						str += '<h2> </h2>'
						+ '<div class="reply__btn"></div>'
						+ '<div class="reply__btn"></div>'
						+ '<div class="reply__btn"></div>'
						+ '</div>'
						+ '<span></span>'	
						}
			    	str += '<p>' + this.marketCommentTbContent + '</p>'
					+ '</div></div>'
					+ '<hr>';
			});
			$("#comment-content").html(str);
		});
		
	}
	
	//코멘트 저장하기
	$("#addcomment-btn").click(function(e) {
		
		const cusNo = $("#customerTbNo").val();
		const comment = $("#marketCommentTbContent").val();
		
		const clientMarketComment = {
			marketTbNo : marketNo,
			marketCommentTbContent : comment,
			customerTbNo : cusNo
		};
		
		$.ajax({
			type: "POST", //서버에 전송하는 HTTP요청 방식
            url: "/insertComment.do", //서버 요청 URI
            headers: {
               "Content-Type": "application/json"
            }, //요청 헤더 정보
            dataType: "text", //응답받을 데이터의 형태
            data: JSON.stringify(clientMarketComment), //서버로 전송할 데이터
            success: function(result) { //함수의 매개변수는 통신성공시의 데이터가 저장될 곳.
               if(result === "insertSuccess") {
                  getComment();
                  $("#marketCommentTbContent").val("");
               } else {
                  alert("댓글등록 실패");
               }
            }, //통신 성공시 처리할 내용들을 함수 내부에 작성.
            error: function() {
               console.log("통신 실패!");
            } //통신 실패 시 처리할 내용들을 함수 내부에 작성.
		});
	});
	
	//코맨트 삭제
	$(document).on("click", "a[name='deleteBtn']", function(e) {
		
		var commentNo = $(this).parent().parent().parent().children("input[name='marketCommentTbNo']").val();
		console.log(commentNo);
		var state = "D";
		
		var clientMarketComment = {
			marketCommentTbNo : commentNo,
			marketCommentTbState : state
		};
		
		$.ajax({
			type: "POST",
			url: "/deleteReply.do",
			headers: {
	        	"Content-Type": "application/json"
	        },
	        dataType: "text",
			data: JSON.stringify(clientMarketComment),
			success: function(result) {
				if(result === "deleteSuccess"){
					getComment();
				} else{
					alert("삭제 실패");
				}
			},
			error: function(){
				console.log("통신실패");
			}
		});
	});
	
	//대댓글 작성창
	$(document).on("click", "a[name='replyBtn']", function() {
		
		if(!state){
		var ref = $(this).parent().parent().parent().children("input[name='marketCommentTbRef']").val();
		console.log(ref);
		var step = $(this).parent().parent().parent().children("input[name='marketCommentTbStep']").val();
		console.log(step);
		
		var replyAdd = $(this).parent().parent().next().next();
		var str = "";
		
		str += '<div class="ht__comment__form">'
			+ '<form id="commentreplyform">'
			+ '<input type="hidden" name="marketTbNo" value="${market.marketTbNo}">'
			+ '<input type="hidden" name="customerTbNo" value="${customer.customerTbNo}">'
			+ '<input type="hidden" name="commentTbRef" value="'+ref+'">'
			+ '<input type="hidden" name="commentTbStep" value="'+step+'">'
			+ '<h4 class="title__line--5">Add Reply</h4>'
			+ '<div class="ht__comment__form__inner">'
			+ '<div class="comment__form">'
			+ '<input type="text" placeholder="이름 *" readonly="readonly" value="${customer.customerTbName}">'
			+ '<input type="email" placeholder="이메일 *" readonly="readonly" value="${customer.customerTbEmail}">'
			+ '</div>'
			+ '<div class="comment__form message">'
			+ '<textarea name="commentReplyContent" id="commentReplyContent" placeholder="내용"></textarea>'
			+ '</div></div></form>'
			+ '<div class="ht__comment__btn--2 mt--30">'
			+ '<a href="javascript:void(0);" class="fr__btn" id="addreply-btn">댓글 등록</a></div></div>';

			replyAdd.after(str);
			$(this).parent().html('<a href="javascript:void(0);" name="cancle">cancle</a>');
			state = true;
		} else {
			alert("열려있는 reply 입력창을 닫아주세요.");
		}
	});
	
	//대댓글 작성창 없애기
	$(document).on("click","a[name='cancle']",function cancle(){
		var replyAdd = $(this).parent().parent().next().next().next();
       	replyAdd.remove();
       	$(this).parent().html('<a href="javascript:void(0);" name="replyBtn">reply</a>');
    });
	
	//대댓글 저장하기
	$(document).on("click", "#addreply-btn",function(e) {
		
		const cusNo = "${customer.customerTbNo}";
		const comment = $("#commentReplyContent").val();
		const ref = $("input[name='commentTbRef']").val();
		const step = $("input[name='commentTbStep']").val();
		console.log(cusNo);
		console.log(comment);
		console.log(ref);
		console.log(step);
		
		const clientMarketComment = {
			marketTbNo : marketNo,
			marketCommentTbContent : comment,
			marketCommentTbRef : ref,
			marketCommentTbStep : step,
			customerTbNo : cusNo
		};
		
		$.ajax({
			type: "POST", //서버에 전송하는 HTTP요청 방식
            url: "/insertReply.do", //서버 요청 URI
            headers: {
               "Content-Type": "application/json"
            }, //요청 헤더 정보
            dataType: "text", //응답받을 데이터의 형태
            data: JSON.stringify(clientMarketComment), //서버로 전송할 데이터
            success: function(result) { //함수의 매개변수는 통신성공시의 데이터가 저장될 곳.
               if(result === "replyInsertSuccess") {
                  getComment();
                  cancle();
               } else {
                  alert("댓글등록 실패");
               }
            }, //통신 성공시 처리할 내용들을 함수 내부에 작성.
            error: function(request,status,error) {
            	
               console.log("통신 실패!");
            } //통신 실패 시 처리할 내용들을 함수 내부에 작성.
		});
	});
	
		
}); //end jqury
</script>