<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

 <script type="text/JavaScript" src="http://code.jquery.com/jquery-1.7.min.js"></script>

	<script type="text/JavaScript" src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>

<jsp:include page="../include/header.jsp" />

        <!-- Start Bradcaump area -->
        <div class="ht__bradcaump__area" style="background: rgba(0, 0, 0, 0) url(resources/client/images/bg/myinfo.jpg) no-repeat scroll center center / cover ;">
            <div class="ht__bradcaump__wrap">
                <div class="container">
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="bradcaump__inner">
                                <nav class="bradcaump-inner">
                                  <a class="breadcrumb-item" href="index.html">Home</a>
                                  <span class="brd-separetor"><i class="zmdi zmdi-chevron-right"></i></span>
                                  <span class="breadcrumb-item active">checkout</span>
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
                            <h4 class="title__line--4">My Page</h4>
                            <ul class="ht__cat__list">
                                <li><a href="/orderList.do">주문내역</a></li>
                                <li><a href="/wishlistSelect.do">wishlist</a></li>
                                <li><a href="/myinfo.do">내정보</a></li>
                                <li><a href="/logout.do">Logout</a></li>
                            </ul>
                        </div>
                    </div>
                </div>

                <!-- Start comment Form --> 
				
                <div class="col-lg-8">
                <form id="formToController" action="myinfo-address-insert.do" method="post">
            	<input type="hidden" name="customerTbNo" value="${sessionScope.customer.customerTbNo }"> <!-- sessionScope.customer.customerTbNo -->
            	<input type="hidden" name="cmAddressTbPhone" value="010">
            	
                    <div class="ht__comment__form">
                        <h4 class="title__line--5">배송지 목록</h4>
                        <div class="ht__comment__form__inner">
                            <div class="comment__form">
                                <script src="https://ssl.daumcdn.net/dmaps/map_js_init/postcode.v2.js"></script>
                                <select class="ht__select" id="selectBox" name="cmAddressTbNo">
                                	<option id="addOption" value="-1">선택하세요</option>
                                	<c:forEach var="address" items="${myinfoAddressList }">
 										<option value="${address.cmAddressTbNo }">${address.cmAddressTbNickname }</option>
 									</c:forEach>
                                </select>
                                <input type="text" placeholder="우편 번호 * " name="cmAddressTbPostcode" id="cmAddressTbPostcode">
                                <input type="text" placeholder=" 주소 *" name="cmAddressTbAddress1" id="cmAddressTbAddress1">
                                <input type="text" placeholder="상세 주소 *" name="cmAddressTbAddress2" id="cmAddressTbAddress2">
                                <input type="text" placeholder="주소 별칭 *" name="cmAddressTbNickname" id="cmAddressTbNickname">
                                <div class="ht__comment__btn--2 mt--30">
                                	<button id="modifySubmitButton" class="fr__btn" type="button" onclick="addressCheck()">추가</button>
                                    <a class="fr__btn" href="#" id="deleteBtn">삭제</a>
                                </div>
                            </div>
                            <div class="ht__comment__btn--2 mt--30">
                               <input type="button" onClick="openDaumZipAddress();" value="주소 찾기"/>
                               <br>
                           </div>
                       </div>
                   </div>
                   </form>
                   <div class="ht__comment__form">
                    <form action="/myinfo-update-password.do" id="passwordForm" method="post">
                    <h4 class="title__line--5">비밀번호 변경</h4>

                    <div class="ht__comment__form__inner">
                        <div class="comment__form">
                            <input type="password" id="customerTbPassword" placeholder="현재 비밀번호 *" name="customerTbPassword" maxlength="15">
                            <input type="password" id="newPassword1" placeholder="새 비밀번호 *" name="newPassword1" maxlength="15">
                            <input type="password" id="newPassword2" placeholder="비밀번호 확인" name="newPassword2" maxlength="15">
                        </div>   
                    </div>
                    <div class="ht__comment__btn--2 mt--30">
                        <button type="button" class="fr__btn" onclick="passwordCheck()">수정</button>
                    </div>
                    </form> 
                    <div class="ht__comment__form">
                        <h4 class="title__line--5">연락처 등록 및 수정</h4>
                        <form action="/myinfo-update-phone.do" id="phoneForm" method="POST">
                        <div class="ht__comment__form__inner">
                            <div class="comment__form">
                            	<input type="text" id="customerTbPhone" placeholder="연락처를 입력하세요 (-생략해주세요)" name="customerTbPhone" maxlength="11">
                            </div>
                        </div>	
                        <div class="ht__comment__btn--2 mt--30">
                            <button type="button" class="fr__btn" onclick="phoneCheck()">등록</button>
                        </div>
                        </form>	    
                    </div>
                   	<!-- 
                   	
                   	select
                   	
                   	 -->
                   	<form action="/myinfo-update-termsAgree.do" method="post">
                   	<div class="ht__comment__form">
                   		<h4 class="title__line--5">광고성 정보제공동의 / 이메일수신동의</h4>
                   	<c:if test="${termsAgreeVO.termsAgreeTbConsentStatus eq 'Y'}">
                   	<input type="radio" name="termsAgreeTbConsentStatus" value="Y" style="width:20px; height:20px; border:1px;" checked>동의&nbsp;&nbsp;&nbsp;
                   	<input type="radio" name="termsAgreeTbConsentStatus" value="N" style="width:20px; height:20px; border:1px;">비동의
                   	</c:if>
                   	<c:if test="${termsAgreeVO.termsAgreeTbConsentStatus eq 'N'}">
                   	<input type="radio" name="termsAgreeTbConsentStatus" value="Y" style="width:20px; height:20px; border:1px;" >동의&nbsp;&nbsp;&nbsp;
                   	<input type="radio" name="termsAgreeTbConsentStatus" value="N" style="width:20px; height:20px; border:1px;" checked>비동의
                   	</c:if>
                   	<c:if test="${termsAgreeVO.termsAgreeTbConsentStatus eq null}">
                   	<input type="radio" name="termsAgreeTbConsentStatus" value="Y" style="width:20px; height:20px; border:1px;" >동의&nbsp;&nbsp;&nbsp;
                   	<input type="radio" name="termsAgreeTbConsentStatus" value="N" style="width:20px; height:20px; border:1px;" >비동의
                   	</c:if>
                   		<div class="ht__comment__btn--2 mt--30">
                            <button type="submit" class="fr__btn">수정</button>
                        </div>	
                   	</div>
                   	</form>
                    <form action="/myinfo-delete-customer.do" method="POST">
                    <div class="ht__comment__form">
                        <h4 class="title__line--5">회원 탈퇴</h4>
                        <div class="ht__comment__form__inner">
                            <div class="comment__form">
                                <input type="password" placeholder="현재 비밀번호 *" name="customerTbPassword">
                            </div> 
                        </div>
                        <div class="ht__comment__btn--2 mt--30">
                            <button class="fr__btn" type="submit">탈퇴</button>
                        </div>
                    </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- cart-main-area end -->
<c:choose>
    <c:when test="${passwordDelete eq false }">
    <script type="text/javascript">
    	alert("password가 일치하지 않습니다.");
    </script>
    </c:when>
    <c:when test="${passwordCheck eq false }">
    <script type="text/javascript">
    	alert("비밀번호 확인이 일치하지 않습니다.");
    </script>
    </c:when>
    <c:when test="${realPasswordCheck eq false }">
    <script type="text/javascript">
    	alert("password가 일치하지 않습니다.");
    </script>
    </c:when>
    <c:when test="${ passwordsuccess eq false }">
    <script type="text/javascript">
    	alert("password가 성공적으로 변경되었습니다.");
    </script>
   </c:when>
    </c:choose>

<jsp:include page="../include/footer.jsp" />
<!--jQuery -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(document).ready(function () {
		$("#deleteBtn").hide();
		
        $("#selectBox").change(function () {
            var selectedValue = $("#selectBox option:selected").val();
           	console.log(selectedValue);
            if(selectedValue === 'thisIsSelect')
            {
                $("#addOption").attr("value", -1);
				$("#modifySubmitButton").html('추가');
                $("#deleteBtn").hide();
                $("#cmAddressTbPostcode").removeAttr("value");
                $("#cmAddressTbAddress1").removeAttr("value");
                $("#cmAddressTbAddress2").removeAttr("value");
                $("#cmAddressTbNickname").removeAttr("value");
                $("#formToController").attr("action", "myinfo-address-insert.do");
            }
            else
            {
            	
            	console.log(selectedValue);
                var ajaxUrl = "/myinfo-address-single-ajax.do?cmAddressTbNo="+selectedValue;
                $.ajax({
                    url: ajaxUrl,
                    type: "GET",
                    data: {},
                    dataType: "json"
                })
                    .done(function(json) {
                        console.log(json);

                        $("#addOption").attr("value", 'thisIsSelect');
                        $("#cmAddressTbNo").attr("value", json.cmAddressTbNo);
                        $("#cmAddressTbPostcode").attr("value", json.cmAddressTbPostcode);
 						$("#cmAddressTbAddress1").attr("value", json.cmAddressTbAddress1);
 						$("#cmAddressTbAddress2").attr("value", json.cmAddressTbAddress2);
 						$("#cmAddressTbNickname").attr("value", json.cmAddressTbNickname);
                        $("#modifySubmitButton").html('수정');
                        $("#deleteBtn").show();
                        var deleteUrl = "/myinfo-address-delete.do?cmAddressTbNo="+json.cmAddressTbNo;
                        $("#deleteBtn").attr("href", deleteUrl);
                        $("#formToController").attr("action", "myinfo-address-update.do");
                    })
                    .fail(function (xhr, status, errorThrown) {
                        alert(errorThrown);
                    });
            }
        });
    })
     function openDaumZipAddress() {
            new daum.Postcode({
            	
                oncomplete:function(data) {
                    $("#cmAddressTbPostcode").val(data.zonecode);
                    $("#cmAddressTbAddress1").val(data.address);
                    $("#cmAddressTbAddress2").focus();
                }
            }).open();
        }
	
	function phoneCheck() {
	var phone = $("#customerTbPhone").val();
	var phoneSu = phone.length;
	console.log(phoneSu);
	if(phoneSu < 11) {
		alert("전화번호를 다시한번 확인해주세요.");	
	} else if(phone.indexOf("-") != -1) {
		alert("-를 제거해주세요");	
	} else {
		$("#phoneForm").submit();
	}

	}
	
	function passwordCheck() {
		var password = $("#customerTbPassword").val();
		var password1 = $("#newPassword1").val();
		var password2 = $("#newPassword2").val();
	
		var passwordSu = password.length;
		var password1Su = password1.length;
		var password2Su = password2.length;
		
		if(passwordSu == 0) {
			alert("비밀번호를 입력해주세요");
		} else if(password1Su == 0) {
			alert("새로운 비밀번호를 입력해주세요");
		} else if(password2Su == 0){
			alert("새로운 비밀번호를 입력해주세요");
		} else {
			$("#passwordForm").submit();
		}
	}
	
	function addressCheck() {
		var postcode = $("#cmAddressTbPostcode").val();
		var address1 = $("#cmAddressTbAddress1").val();
		var address2 = $("#cmAddressTbAddress2").val();
		var nickname = $("#cmAddressTbNickname").val();
		
		var postcodeSu = postcode.length;
		var address1Su = address1.length;
		var address2Su = address2.length;
		var nicknameSu = nickname.length;
		
		if(postcodeSu == 0) {
			alert("postcode를 입력해주세요");
		} else if(address1Su == 0) {
			alert("주소를 입력해주세요.");
		} else if(address2Su == 0) {
			alert("상세주소를 입력해주세요.");
		} else if(nicknameSu == 0) {
			alert("주소별명을 입력해주세요.");
		} else {
			$("#formToController").submit();
		}
	}
	
</script>