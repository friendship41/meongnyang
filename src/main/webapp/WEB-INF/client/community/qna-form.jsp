<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp"/>
		<!-- Start Bradcaump area -->
		<div class="ht__bradcaump__area"
			style="background: rgba(0, 0, 0, 0) url(/resources/client/images/bg/qna.jpg) no-repeat scroll center center/cover;">
			<div class="ht__bradcaump__wrap">
				<div class="container">
					<div class="row">
						<div class="col-xs-12">
							<div class="bradcaump__inner">
								<nav class="bradcaump-inner">
									<a class="breadcrumb-item" href="index.html">Home</a> <span
										class="brd-separetor"><i
										class="zmdi zmdi-chevron-right"></i></span> <span
										class="breadcrumb-item active">Q&A</span>
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
                    <div class="col-lg-3">
                        <div class="htc__product__leftsidebar">
                            <div class="htc__category">
                                <h4 class="title__line--4">Community</h4>
                                <ul class="ht__cat__list">
                                    <li><a href="#">공지</a></li>
                                    <li><a href="#">FAQ</a></li>
                                    <li><a href="qna-list.do">Q&A</a></li>
                                    <li><a href="#">Review</a></li>
                                    <li><a href="#">Contact</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                     <div class="col-lg-8">
                     	<div class="htc__blog__details__wrap">
							<div class="ht__comment__form">
                                <h4 class="title__line--5">글쓰기</h4>
                                
                                  <form class="form-horizontal">
                                  <input type="hidden" id="YN" name="qnaTbSecret">
                                  <input type="hidden" name="pdSaleTbNo" ><!-- 상품번호 value값 추가 -->
                                  <input type="hidden" name="customerTbNo" value="${sessionScope.customer.customerTbNo }">
										<div class="form-group">
											<label for="checkbox" class="col-sm-2 control-label"></label>
												<div class="col-sm-8">
													<div class="checkbox"><label><input type="checkbox" id="CHECK_YN" name="CHECK_YN"> 비밀글</label></div>													
												</div>
										</div>
										<div class="form-group">
											<label for="qnaTypeTbName" class="col-sm-2 control-label"></label>
										<div class="col-sm-8">
										
									<select name="qnaTypeTbName" id="qnaTypeTbname" class="form-control1">
										<option value="thisIsSelect">선택하세요</option>
										<c:forEach var="category" items="${qnaCategoryList }">
											<option value="${category.qnaTypeTbNo }">${category.qnaTypeTbName }</option>
										</c:forEach>
											</select>
										</div>
										</div>
										<div class="form-group">
											<label for="smallinput" class="col-sm-2 control-label label-input-sm">이름</label>
												<div class="col-sm-8">
												 	<input type="text" placeholder="Name *" name="qnaTbTitle">
												</div>
										</div>
										<div class="form-group">
											<label for="email" class="col-sm-2 control-label label-input-sm">이메일</label>
												<div class="col-sm-8">
												 	<input type="email" id="email" placeholder="Email *" value="${sessionScope.customer.customerTbEmail }" readonly>
												</div>													<!-- 세션을 갖고 있기때문에 가능하다. value로 띄어지는지 확인 -->
										</div>
										<div class="form-group">
											 <label for="message" class="col-sm-2 control-label">내용</label>
													<div class="col-sm-8"><textarea id="message" placeholder="Context *" name="qnaTbContent"></textarea></div>	
										</div>
										<div class="form-group">
										<div align="center" class="ht__comment__btn--2 mt--50 col-sm-10">
                                    		<a class="fr__btns" href="qna-insert.do">확인</a>
                                    		<a class="fr__btns" href="qna-list.do">취소</a>
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
		
<jsp:include page="../include/footer.jsp"/>
<!-- script -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
$("#CHECK_YN").change(
		function() {
			if($("#CHECK_YN").is(":checked")) {
				$("YN").val('Y');
			} else {
				$("YN").val('N')
			}
		}
		);
</script>



