<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 로그인이 뜨는 모달부분 -->
<script src="//developers.kakao.com/sdk/js/kakao.min.js"></script>
<c:choose>
<c:when test="${loginCheckSubmit eq false}">
<script type="text/javascript"> 
   alert("로그인 실패 하셨습니다.")
</script>
</c:when>
<c:when test="${mailSubmit eq false}">
<script type="text/javascript"> 
   alert("인증 메일이 발송되었습니다.")
   
</script>
</c:when>
</c:choose>
<div class="modal fade" id="myModal88" tabindex="-1" role="dialog" aria-labelledby="myModal88"
     aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
            
               <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
            
               
            
                <h4 class="modal-title" id="myModalLabel">로그인 / 회원가입</h4>
            </div>
            <div class="modal-body modal-body-sub">
                <div class="row">
                    <div class="col-md-8 modal_body_left modal_body_left1"
                         style="border-right: 1px dotted #C2C2C2;padding-right:3em;">
                        <div class="sap_tabs">
                            <div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
                                <ul>
                                    <li class="resp-tab-item" aria-controls="tab_item-0"><span>Login</span></li>
                                    <li class="resp-tab-item" aria-controls="tab_item-1"><span>Join us</span></li>
                                </ul>
                                <div class="tab-1 resp-tab-content" aria-labelledby="tab_item-0">
                                    <div class="facts">
                                        <div class="register">
                                            <form name="loginForm" action="/login.do" method="post"><!-- 로그인 -->
                                                <input name="customerTbEmail" placeholder="Email Address" type="text" required="">
                                                <input name="customerTbPassword" placeholder="Password" type="password"
                                                       required="">
                                                <div class="sign-up">
                                                   <input type="submit" value="Sign in" onclick="loginCheck()"/>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                                <div class="tab-2 resp-tab-content" aria-labelledby="tab_item-1">
                                    <div class="facts">
                                        <div class="register">
                                            <form name="registryForm" action="registry.do" method="post"><!-- 회원가입 -->
                                                <input placeholder="Name" name="customerTbName" type="text" required="">
                                                <input placeholder="Email Address" name="customerTbEmail" type="email"
                                                       required="">
                                                <input placeholder="Password" name="customerTbPassword" type="password"
                                                       required="" id="password1">
                                                <input placeholder="Confirm Password" name="Password" type="password"
                                                       required="" id="password2">
                                                <div class="sign-up">
                                                
                                                
                                                   <input type="submit" value="Create Account" id="CreateAccount" onclick="registryCheck()"/>
                                               
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div id="OR" class="hidden-xs">OR</div>
                    </div>
                    <div class="col-md-4 modal_body_right modal_body_right1">
                        <div class="row text-center sign-with">
                            <div class="col-md-12">
                                <h3 class="other-nw">Sign in with</h3>
                            </div>
                            <div class="col-md-12">
                                <ul class="social">
                                    <li class="social_facebook"><a href="#" class="entypo-facebook"></a></li>
                                    <li class="social_dribbble"><a href="#" class="entypo-dribbble"></a></li>
                                    <li class="social_twitter"><a href="#" id="kakao-login-btn" class="entypo-twitter"></a></li>
                                    <li class="social_behance"><a href="#" class="entypo-behance"></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script type='text/javascript'>
        //<![CDATA[
        // 사용할 앱의 JavaScript 키를 설정해 주세요.
        Kakao.init('사용자키값');
        // 카카오 로그인 버튼을 생성합니다.
        Kakao.Auth.createLoginButton({
            container: '#kakao-login-btn',
            success: function (authObj) {
                alert(JSON.stringify(authObj));
            },
            fail: function (err) {
                alert(JSON.stringify(err));
            }
        });
      //]]>
    </script>


<script type="text/javascript">
   function registryCheck() {
      var pw1 = document.getElementById('password1').value;
      var pw2 = document.getElementById('password2').value;
      if(pw1 != pw2) {
         alert("비밀번호가 일치하지 않습니다.");
      }
   }
   function loginCheck() {
      var loginForm = document.loginForm;
      var userId = loginForm.customerTbEmail.value;
      var password = loginForm.customerTbPassword.value;
      
      if(!userId || !password) {
         alert("모두 입력해주세요")
      } else {
         loginForm.submit();
      }
   }
   
   
</script>
