<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-09
  Time: 오후 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="kor">
<jsp:include page="../include/head.jsp" />
<body>

	<!-- Page Container -->
	<div class="page-container">
		<!-- Page Sidebar -->
		<jsp:include page="../include/page-sidebar.jsp" />
		<!-- /Page Sidebar -->

		<!-- Page Content -->
		<div class="page-content">
			<!-- Page Header -->
			<jsp:include page="../include/page-header.jsp" />
			<!-- /Page Header -->
			<!-- Page Inner -->
			<div class="page-inner">
				<div class="page-title">
					<h3 class="breadcrumb-header">Q&A 현황</h3>
				</div>
				<div id="main-wrapper">
					<!-- Row -->
					<div class="row">
						<div class="col-lg-12 col-md-12">
							<div class="panel panel-white">
								<div class="panel-heading clearfix">
									<h4 class="panel-title">Q&A 게시판</h4>
								</div>
								<div class="panel-body">
									<div class="table-responsive">
										<table id="qnaTable" class="display table"
											style="width: 100%; cellspacing: 0;">
											<thead>
												<tr>

													<th>글번호</th>
													<th>제목</th>
													<th>글쓴이</th>
													<th>작성일</th>
													<th>조회수</th>
												</tr>
											</thead>
											<tfoot>
												<tr>

													<th>글번호</th>
													<th>제목</th>
													<th>글쓴이</th>
													<th>작성일</th>
													<th>조회수</th>
												</tr>
											</tfoot>
											<tbody id="qnaTbody">
												<c:forEach var="qna" items="${adminQnaList }">
													<tr>
														<input type="hidden" value="${qna.qnaTbDepth }">
														<td>${qna.rnum}</td>
														<c:if test="${qna.qnaTbStatus eq 'N'}">
															<!-- 정상글 -->
															<td style="text-align: left;"><span class="label label-success" style="margin-right: 10px">
																	<c:if test="${qna.adminsTbId eq null}">
                                                                        Q
                                                                    </c:if><c:if test="${qna.adminsTbId ne null}">
                                                                        A
                                                                    </c:if>
															</span><a class="f-bold" href="/shoppingmall-qna-read.ado?qnaTbNo=${qna.qnaTbNo }">${qna.qnaTbTitle }</a>
															</td>
														</c:if>
														<c:if test="${qna.qnaTbStatus eq 'D'}">
															<!-- 삭제된글 -->
															<td style="text-align: left;"><span	class="label label-success" style="margin-right: 10px">
																	<c:if test="${qna.adminsTbId eq null}">
                                                                        Q
                                                                    </c:if> <c:if test="${qna.adminsTbId ne null}">
                                                                        A
                                                                    </c:if>
															</span>삭제된 글입니다.</td>
														</c:if>
														<c:if test="${qna.customerTbNo eq null }">
														<td>${qna.adminsTbId}</td>
														</c:if>
														<c:if test="${qna.customerTbNo ne null }">
														<td>${qna.customerTbName}</td>
														</c:if>
														<td>${qna.qnaTbRegDate }</td>
														<td>${qna.qnaTbReadcount }</td>
													</tr>
												</c:forEach>


											</tbody>
										</table>
									</div>
								</div>
							</div>
						</div>
					</div>
					<!-- !Row -->
				</div>
				<!-- Main Wrapper -->
				<div class="page-footer">
					<p>
						메인프로젝트 뭐먹냥 <i class="fa fa-heart"></i> by team4
					</p>
				</div>
			</div>
			<!-- /Page Inner -->
			<jsp:include page="../include/right-sidebar.jsp" />
		</div>
		<!-- /Page Content -->
	</div>
	<!-- /Page Container -->


	<!-- Javascripts -->
	<jsp:include page="../include/scripts-load.jsp" />
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		var listSize = '${adminQnaList.size()}';
		listSize *= 1;
		for(var i=0; i<listSize; i++) {
			var tr = $("#qnaTbody").children().eq(i);
			var depth = tr.children().eq(0).val();
			depth *=1;
			if(depth != 0) {
				for(var j=0; j<depth; j++) {
					tr.children().eq(2).prepend('<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>');
				}
			}
		}
	});
</script>
</body>

</html>


