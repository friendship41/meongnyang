<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
                                <li><a href="#">주문내역</a></li>
                                <li><a href="#">wishlist</a></li>
                                <li><a href="#">내정보</a></li>
                                <li><a href="/logout.do">Logout</a></li>
                            </ul>
                        </div>
                    </div>
                </div>

                <!-- Start comment Form --> <!--여기부터다시수정하면됨!!!!!-->
				
                <div class="col-lg-8">
                <form id="formToController" action="myinfo-address-insert.do" method="post">
            	<input type="hidden" name="customerTbNo" id="customerTbNo" value="0">
                    <div class="ht__comment__form">
                    	
                        <h4 class="title__line--5">배송지 목록</h4>
                        <div class="ht__comment__form__inner">
                            <div class="comment__form">
                                <script src="https://ssl.daumcdn.net/dmaps/map_js_init/postcode.v2.js"></script>
                                
                                <select class="ht__select" id="selectBox">
                                	<option value="thisIsInsert">선택하세요</option>
                                	<c:forEach var="address" items="${cmAddressList }">
 									<option value="${cmAddressTbNo }">${cmAddressTbPostcode } -${cmAddressTbAddress1 }</option>
 									</c:forEach>
                                    
                                </select>
                                <input id="postcode3" value="" type="text" placeholder="" name="cmAddressTbPostcode">
                                <input id="postcode1" value="" type="text" placeholder=" 주소 *" name="cmAddressTbAddress1">
                                <input id="postcode2" value="" type="text" placeholder="상세 주소 *" name="cmAddressTbAddress2">
                                <div class="ht__comment__btn--2 mt--30">
                                	<a class="fr__btn" href="#" id="modifyBtn">수정</a>
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
                    <h4 class="title__line--5">비밀번호 변경</h4>
                    <form action="/myinfo-update-password.do" method="POST">
                    <div class="ht__comment__form__inner">
                        <div class="comment__form">
                            <input type="password" placeholder="현재 비밀번호 *" name="customerTbPassword">
                            <input type="password" placeholder="새 비밀번호 *" name="newPassword1">
                            <input type="password" placeholder="비밀번호 확인" name="newPassword2">
                        </div>   
                    </div>
                    <div class="ht__comment__btn--2 mt--30">
                        <button class="fr__btn" type="submit">수정</button>
                    </div>
                    </form> 
                    <div class="ht__comment__form">
                        <h4 class="title__line--5">연락처 등록 및 수정</h4>
                        <form action="/myinfo-update-phone.do" method="POST">
                        <div class="ht__comment__form__inner">
                           
                            <div class="comment__form">
                            	<input type="text" placeholder="연락처를 입력하세요 (-생략해주세요)" name="customerTbPhone">
                            </div>
                        </div>
                        	
                        <div class="ht__comment__btn--2 mt--30">
                            <button class="fr__btn" type="submit">등록</button>
                        </div>
                        </form>	    
                    </div>
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


<jsp:include page="../include/footer.jsp" />
<!--jQuery -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script><script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
    $(document).ready(function () {

        $("#deleteBtn").hide();

        $("#selectBox").change(function () {
            var selectedValue = $("#selectBox option:selected").val();
            
            if(selectedValue === 'thisIsInsert')
            {
                $("#modifyBtn").html('추가');
                $("#deleteBtn").hide();
                $("#customerTbNo").attr("value", 0);
                $("#cmAddressTbAddress1").removeAttr("value");
                $("#cmAddressTbAddress2").removeAttr("value");
                $("#formToController").attr("action", "myinfo-address-insert.do");
            }
            else
            {
                var ajaxUrl = "/myinfo-address-single-ajax.do?cmAddrssTbNo="+selectedValue;
                $.ajax({
                    url: ajaxUrl,
                    type: "GET",
                    data: {},
                    dataType: "json"
                })
                    .done(function(json) {
                        console.log(json);
                        $("#cmADdrssTbNo").attr("value", json.cmAddrssTbNo);
 						$("#cmAddressTbAddress1").attr("value", json.cmAddressTbAddress1);
 						$("#cmAddressTbAddress2").attr("value", json.cmAddressTbAddress2);
                        $("#modifyBtn").html('수정');
                        $("#deleteBtn").show();
                        var deleteUrl = "/myinfo-address-delete.ado?cmAddrssTbNo="+json.cmAddressTbNo;
                        $("#deleteBtn").attr("href", deleteUrl);
                        $("#formToController").attr("action", "myinfo-address-update.ado");
                    })
                    .fail(function (xhr, status, errorThrown) {
                        alert(errorThrown);
                    });
            }
        });
    })
</script>