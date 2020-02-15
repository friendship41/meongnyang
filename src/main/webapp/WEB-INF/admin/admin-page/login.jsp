<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-09
  Time: 오후 6:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="kor">
<jsp:include page="../include/head.jsp"/>
<c:choose>


<c:when test="${loginCheckSubmit eq false }">
<script type="text/javascript">
	alert("로그인 실패하셨습니다.");
</script>
</c:when>
</c:choose>
<body>

<!-- Page Container -->
<div class="page-container">
    <!-- Page Inner -->
    <div class="page-inner login-page">
        <div id="main-wrapper" class="container-fluid">
        
            <div class="row">
            <div class="col-sm-6 col-md-3 login-box">
                
                    <h4 class="login-title">Sign in to your account</h4>
                    <form action="index.ado" method="post">
                        <div class="form-group">
                            <label for="exampleInputEmail1">Email address</label>
                            <input type="email" class="form-control" id="exampleInputEmail1" name="adminsTbId">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputPassword1">Password</label>
                            <input type="password" class="form-control" id="exampleInputPassword1" name="adminsTbPassword">
                        </div>
                        <button class="btn btn-primary" type="submit">로그인</button><br>
                    </form>
                    
                </div>
            </div>
        </div>
        
    </div>
    <!-- /Page Content -->
    <div class="col-sm-10 col-md-10 col-lg-10"> 
    <!-- img태그 넣기 -->
        <img src="/resources/images/adminLoginPage.png" style="width: 1030px; height: 200px;">
	</div>
</div>




<!-- /Page Container -->


<jsp:include page="../include/scripts-load.jsp"/>
</body>
</html>




