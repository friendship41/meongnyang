<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-09
  Time: 오후 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <h3 class="breadcrumb-header">Q&A</h3>
            </div>
            <div id="main-wrapper">
                <!-- Row -->
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-body">
                                <form class="form-horizontal" id="mainForm" action="qna-write.ado" method="post">
                                <input type="hidden" name="qnaTbNo" value="${adminQnaVO.qnaTbNo}">
                				
                				
                                    <div class="form-group">
                                        <label for="qnaNum" class="col-sm-2 control-label">글번호</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" id="qnaTbNo" name="qnaTbNo" value="${adminQnaVO.qnaTbNo }" readonly>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="qnaTitle" class="col-sm-2 control-label">제목</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" id="qnaTbTitle" name="qnaTbTitle" value="${adminQnaVO.qnaTbTitle }" readonly>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="qnaWriter" class="col-sm-2 control-label">글쓴이</label>
                                        <div class="col-sm-10">
                                        	<c:if test="${adminQnaVO.adminsTbId eq null }">
                                           <input type="text" class="form-control" id="customerTbName" name="customerTbName" value="${adminQnaVO.customerTbName }" readonly>
                                           </c:if>
                                           <c:if test="${adminQnaVO.adminsTbId ne null }">
                                           <input type="text" class="form-control" id="customerTbName" value="${adminQnaVO.adminsTbId }" readonly>
                                           </c:if>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">작성일</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" name="qnaTbRegDate" value="${adminQnaVO.qnaTbRegDate }" readonly>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="qnaReadCnt" class="col-sm-2 control-label">조회수</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" id="qnaReadCnt" name="qnaTbReadcount" value="${adminQnaVO.qnaTbReadcount }" readonly>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="qnaContent" class="col-sm-2 control-label">내용</label>
                                        <div class="col-sm-10">
                                            <textarea rows="10" class="form-control" id="qnaContent" name="qnaTbContent">${adminQnaVO.qnaTbContent }</textarea>
                                        </div>
                                    </div>
                                    <div class="form-group" style="margin-top: 50px">
                                        <div class="col-sm-2"></div>
                                        <div class="col-sm-10">
                                            <a class="btn btn-primary" href="shoppingmall-qna-delete.ado?qnaTbNo=${adminQnaVO.qnaTbNo }&qnaTbStatus=${'D'}">삭제</a>
                                            <button class="btn btn-primary" type="submit">답글작성</button>
                                            <c:if test="${adminQnaVO.adminsTbId ne null }">
                                            <button class="btn btn-primary" onclick="modArticle()">수정</button>
                                            </c:if>
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


<!-- JavaScripts -->
<jsp:include page="../include/scripts-load.jsp"/>
 <script type="text/javascript">
 function modArticle() {
        $("#mainForm").attr("action", "shoppingmall-qna-update.ado");
        $("#mainForm").submit();
    }
 </script>
</body>
</html>
