<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-09
  Time: 오후 7:22
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
                <h3 class="breadcrumb-header">정책 관리</h3>
            </div>
            <div id="main-wrapper">
                <!-- Row -->
                <div class="row">
                    <div class="col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">약관 수정 메일보내기</h4>
                            </div>
                            <div class="panel-body">
                                <form class="form-horizontal" action="send.ado" method="post">                   	                                                           
                                    <div class="form-group">
                                        <label for="senderName" class="col-sm-2 control-label">발신자이름</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" name="senderName" id="senderName" value="오늘뭐멍냥 관리자" readonly>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="senderMail" class="col-sm-2 control-label">발신자 이메일</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" name="from" id="senderMail" value="poo963369@naver.com">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="receiveMail" class="col-sm-2 control-label">수신자 이메일</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" name="receiveMail" id="receiveMail" value="전체회원" readonly>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="subject" class="col-sm-2 control-label" >제목</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" name="Subject" id="subject" value="약관 수정 메일" readonly>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="message" class="col-sm-2 control-label">수정 후 약관상세</label>
                                        <div class="col-sm-10">
                                            <textarea rows="10" class="form-control" name="content" id="message" value="${content.termsTbContent }" readonly>${content.termsTbContent }</textarea>
                                        </div>
                                    </div>                            
                                   
                                    <div class="form-group" style="margin-top: 50px">
                                        <div class="col-sm-2"></div>
                                        <div class="col-sm-10">
                                            <button type="submit" class="btn btn-primary" >보내기</button>
                                          
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


<!-- Javascripts -->

<jsp:include page="../include/scripts-load.jsp"/>

