<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function popupClose(){
	
	var chkbox = document.getElementById('agreeCheckbox')
	if(chkbox.checked){
		opener.document.getElementById("agreeCheckNecessary").value = 'Y';
	}else{
		opener.document.getElementById("agreeCheckNecessary").value = 'N';
	}
	
	self.opener=null;
	self.close();
	
}
 
</script>
<meta charset="UTF-8">
<style>
.board_list{width: 500px; margin: 0 auto;}
.board_list tfoot{text-align:center;}
.signUp_agree {text-align: center;}
.signUp_agree_textarea {text-align: center;}
.signUp_agree_textarea textarea {rezise: none;}
.font-size:50px;
</style>
<title>이용약관</title>
</head>
<body>
	
		<table class="board_list">
			<tbody>
				<tr>
					<td colspan="3" class="signUp_agree">이용약관(필수)</td>
				</tr>				    
					<tr>					
						<td colspan="3" class="signUp_agree_textarea">
							<textarea cols="100" rows="30" readonly><c:forEach items="${termsList}" var="termsList">제<c:out value="${termsList.termsTbNo}"/>조&#10;<c:out value="${termsList.termsTbContent}"/>&#10;</c:forEach>
							</textarea>
						</td>					
					</tr>				
				<tr>
					<td colspan="3" class="signUp_agree_checkbox"><input type="checkbox" name="agree" id="agreeCheckbox">약관에 동의(필수)</td>
				</tr>
				<tr>
					<td colspan="3"><input type="button" value="확인" onclick="popupClose()"></td>
				</tr>
			</tbody>
</body>

</html>