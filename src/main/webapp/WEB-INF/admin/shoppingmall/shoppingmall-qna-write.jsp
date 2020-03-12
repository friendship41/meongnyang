<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-09
  Time: 오후 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="kor">
<jsp:include page="../include/head.jsp"/>
<body>

<!-- Page Container -->
<div class="page-container">
    <!-- Page Sidebar -->
    <jsp:include page="../include/page-sidebar.jsp"/>
    <!-- /Page Sidebar -->

    <!-- Page Content -->
    <div class="page-content">
        <!-- Page Header -->
        <jsp:include page="../include/page-header.jsp"/>
        <!-- /Page Header -->
        <!-- Page Inner -->
        <div class="page-inner">
            <div class="page-title">
                <h3 class="breadcrumb-header">Q&A 답변작성</h3>
            </div>
            <div id="main-wrapper">
                <!-- Row -->
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-body">
                                <form class="form-horizontal" id="qna-write" action="shoppingmall-qna-write.ado" method="post">
                                    <input type="hidden" name="qnaTbRef" value="${insertInfo.qnaTbRef }">
                                    <input type="hidden" name="qnaTbStep" value="${insertInfo.qnaTbStep }">
                                    <input type="hidden" name="qnaTbDepth" value="${insertInfo.qnaTbDepth }">
                                    <input type="hidden" name="qnaTbSecret" value="${insertInfo.qnaTbSecret }">
                                    <input type="hidden" name="pdSaleTbNo" value="${insertInfo.pdSaleTbNo}"><!-- 상품번호 value값 추가 -->
                            		<input type="hidden" name="pdOrderTbNo" value="${insertInfo.pdOrderTbNo}"><!-- order번호 -->
                            		<input type="hidden" name="adminsTbId" value="${sessionScope.adminId }">
                            		<input type="hidden" name="customerTbNo" value="${insertInfo.customerTbNo }">
                                    
                                    <div class="form-group">
                                        <label for="qnaTbTitle" class="col-sm-2 control-label">제목</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" id="qnaTbTitle" name="qnaTbTitle" >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="qnaWriter" class="col-sm-2 control-label">글쓴이</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" id="qnaTbWriter" value="${sessionScope.adminId }" readonly>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">작성일</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control date-picker" id="datePickerSysdate" readonly>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="qnaTbContent" class="col-sm-2 control-label">내용</label>
                                        <div class="col-sm-10">
                                            <textarea rows="10" class="form-control" id="qnaTbContent" name="qnaTbContent"></textarea>
                                        </div>
                                    </div>
                                    <div class="form-group" style="margin-top: 50px">
                                        <div class="col-sm-2"></div>
                                        <div class="col-sm-10">
                                            <button type="button" class="btn btn-primary" onclick="textareaCheck()">답변작성</button>
                                            
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- !Row -->
            </div><!-- Main Wrapper -->
            <jsp:include page="../include/page-footer.jsp"/>
        </div>
        <!-- /Page Inner -->
        <jsp:include page="../include/right-sidebar.jsp"/>
    </div>
    <!-- /Page Content -->
</div>
<!-- /Page Container -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script><script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		
		$("#datePickerSysdate").attr("value", new Date().yyyymmdd());
		
	});
	
	function textareaCheck() {
		var textArea = $("#qnaTbContent").val();
		var textAreaSu = textArea.length;
		
		if(textAreaSu == 0 ) {
			alert("글을 입력해주세요.");
		} else {
			$("#qna-write").submit();
		}
	}
	
</script>
<!-- Javascripts -->
<jsp:include page="../include/scripts-load.jsp"/>
</body>
</html>
