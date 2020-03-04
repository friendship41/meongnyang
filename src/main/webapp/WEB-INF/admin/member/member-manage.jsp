<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-09
  Time: 오후 7:21
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
                <h3 class="breadcrumb-header">회원 관리</h3>
            </div>
            <div id="main-wrapper">
                <!-- Row -->
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">전체 회원 현황</h4>
                            </div>
                            <div class="panel-body">
                                <div class="table-responsive">
                                    <table id="readCountProductTable" class="display table"
                                           style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>회원ID</th>
                                            <th>이름</th>
                                            <th>최종로그인</th>
                                            <th>상태</th>
                                            <th>활동중지</th>
                                        </tr>
                                        </thead>
                                        <tfoot>
                                        <tr>
                                            <th>회원ID</th>
                                            <th>이름</th>
                                            <th>최종로그인</th>
                                            <th>상태</th>
                                            <th>활동중지</th>
                                        </tr>
                                        </tfoot>
                                        <tbody>
                                        
                                        <c:forEach var="memberList" items= "${adminMemberList}" > 
                   
                                           <tr>
                                              <td>${memberList.customerTbEmail}</td>
                                              <td>${memberList.customerTbName}</td>
                                              <td>${memberList.customerTbLastLogin}</td>
                                              <td>${memberList.customerTbState}</td>
                                        	  <td>
                                                <a class="btn btn-rounded btn-danger" href="/memberStateUpdate.ado?customerTbNo=${memberList.customerTbNo}">블랙</a>
                                            </td>	
                                        	</tr>	        
                                        </c:forEach>
                                        <!--  
                                        <tr>
                                            <td>stage41@nate.com</td>
                                            <td>최창호</td>
                                            <td>20/01/14</td>
                                            <td><span class="label label-success">정상</span></td>
                                            <td>
                                                <button class="btn btn-rounded btn-danger">블랙</button>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>stage41@nate.com</td>
                                            <td>최창호</td>
                                            <td>20/01/14</td>
                                            <td><span class="label label-success">정상</span></td>
                                            <td>
                                                <button class="btn btn-rounded btn-danger">블랙</button>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>stage41@nate.com</td>
                                            <td>최창호</td>
                                            <td>20/01/14</td>
                                            <td><span class="label label-success">정상</span></td>
                                            <td>
                                                <button class="btn btn-rounded btn-danger">블랙</button>
                                            </td>
                                        </tr>
                                        -->
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- !Row -->
                <!-- Row -->
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">프로모션 이메일 보내기</h4>
                            </div>
                            <div class="panel-body">
                                <form class="form-inline">
                                    <div class="form-group" style="margin-right: 10px">
                                        <select class="form-control">
                                            <option>프로모션1</option>
                                            <option>2</option>
                                            <option>3</option>
                                            <option>4</option>
                                            <option>5</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <a class="btn btn-rounded btn-success" href="/memberMail.ado">전체메일 보내기</a>
                                        
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
</body>
</html>
