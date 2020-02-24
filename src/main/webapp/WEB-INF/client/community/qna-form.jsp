<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
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

                        <form class="form-horizontal" action="qna-form.do" method="post">
                            <input type="hidden" id="YN" name="qnaTbSecret" value="N">
                            <input type="hidden" name="pdSaleTbNo" value="${insertInfo.pdSaleTbNo}"><!-- 상품번호 value값 추가 -->
                            <input type="hidden" name="pdOrderTbNo" value="${insertInfo.pdOrderTbNo}"><!-- order번호 -->
                            <div class="form-group">
                                <label for="CHECK_YN" class="col-sm-2 control-label"></label>
                                <div class="col-sm-8">
                                    <div class="checkbox"><label><input type="checkbox" id="CHECK_YN">비밀글</label></div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="qnaTypeTbName" class="col-sm-2 control-label"></label>
                                <div class="col-sm-8">
                                    <select name="qnaTypeTbNo" id="qnaTypeTbname" class="form-control1">
                                        <c:forEach var="category" items="${qnaCategoryList }">
											<c:if test="${category.qnaTypeTbNo eq insertInfo.qnaTypeTbNo}">
												<option value="${category.qnaTypeTbNo }" selected>${category.qnaTypeTbName }</option>
											</c:if>
											<c:if test="${category.qnaTypeTbNo ne insertInfo.qnaTypeTbNo}">
												<option value="${category.qnaTypeTbNo }">${category.qnaTypeTbName }</option>
											</c:if>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="qnaTbTitle" class="col-sm-2 control-label label-input-sm">제목</label>
                                <div class="col-sm-8">
                                    <input type="text" placeholder="Title *" name="qnaTbTitle" id="qnaTbTitle">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="email" class="col-sm-2 control-label label-input-sm">이메일</label>
                                <div class="col-sm-8">
                                    <input type="text" id="email" placeholder="Email *" value="${sessionScope.customer.customerTbEmail}" readonly>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="qnaTbContent" class="col-sm-2 control-label">내용</label>
                                <div class="col-sm-8"><textarea id="qnaTbContent" placeholder="Context *" name="qnaTbContent"><c:if test="${insertInfo.pdSaleTbNo ne null}">제품판매코드: ${insertInfo.pdSaleTbNo}</c:if><c:if test="${insertInfo.pdOrderTbNo ne null}">주문상품번호: ${insertInfo.pdOrderTbNo}</c:if></textarea></div>
                            </div>
                            <div class="form-group">
                                <div align="center" class="ht__comment__btn--2 mt--50 col-sm-10">
                                    <button class="fr__btns" type="submit">작성</button>
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
    $("#CHECK_YN").click(
        function () {
            if ($("#CHECK_YN").is(":checked")) {
                $("#YN").val('Y');
            } else {
                $("#YN").val('N');
            }
        }
    );


</script>
<c:choose>
    <c:when test="${inputFail eq false }">
        <script type="text/javascript">
            alert("빈칸으로 제출할 수 없습니다.");
        </script>
    </c:when>
</c:choose>	


