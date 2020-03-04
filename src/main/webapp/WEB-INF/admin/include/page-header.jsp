<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-07
  Time: 오후 6:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Page Header -->
<div class="page-header">
    <div class="search-form">
        <form action="#" method="GET">
            <div class="input-group">
                <input type="text" name="search" class="form-control search-input"
                       placeholder="Type something...">
                <span class="input-group-btn">
                                            <button class="btn btn-default" id="close-search" type="button"><i
                                                    class="icon-close"></i></button>
                                        </span>
            </div>
        </form>
    </div>
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <div class="logo-sm">
                    <a href="javascript:void(0)" id="sidebar-toggle-button"><i class="fa fa-bars"></i></a>
                    <a class="logo-box" href="index.html"><span>오늘뭐먹냥</span></a>
                </div>
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                        data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <i class="fa fa-angle-down"></i>
                </button>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->

            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href="javascript:void(0)" id="collapsed-sidebar-toggle-button"><i
                            class="fa fa-bars"></i></a></li>
                    <li><a href="javascript:void(0)" id="toggle-fullscreen"><i class="fa fa-expand"></i></a>
                    </li>
                    <li><a href="javascript:void(0)" id="search-button"><i class="fa fa-search"></i></a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                        <a href="javascript:void(0)" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="badge pull-right badge-danger">${requestScope.limitedStockList.size() + requestScope.expireStockList.size() + requestScope.newQnaList.size()}</span><i class="fa fa-bell"></i></a>
                        <ul class="dropdown-menu dropdown-lg dropdown-content">
                            <li class="drop-title">재고알림<a href="#" class="drop-title-link"><i class="fa fa-angle-right"></i></a></li>
                            <li class="slimscroll dropdown-notifications">
                                <ul class="list-unstyled dropdown-oc">
                                    <c:forEach var="limitStock" items="${requestScope.limitedStockList}">
                                        <li>
                                            <a href="productStock.ado">
                                                <span class="notification-badge bg-danger"><i class="fa fa-bolt"></i></span>
                                                <span class="notification-info"><b>${limitStock.pdSaleTbProductName}</b>의 재고가 부족합니다 <small class="notification-date">현재수량: ${limitStock.pdSaleTbRemainingAmount}</small></span>
                                            </a>
                                        </li>
                                    </c:forEach>
                                    <c:forEach var="expireStock" items="${requestScope.expireStockList}">
                                        <li>
                                            <a href="productStock.ado">
                                                <span class="notification-badge bg-danger"><i class="fa fa-calendar-times-o"></i></span>
                                                <span class="notification-info"><b>${expireStock.pdSaleTbProductName}</b>의 유통기한이 임박했습니다 <small class="notification-date">유통기한: ${expireStock.pdSaleTbExpireDay}</small></span>
                                            </a>
                                        </li>
                                    </c:forEach>
                                    <c:forEach var="newQna" items="${requestScope.newQnaList}">
                                        <li>
                                            <a href="shoppingmall-qna-read.ado?qnaTbNo=${newQna.qnaTbNo}">
                                                <span class="notification-badge bg-danger"><i class="fa fa-question"></i></span>
                                                <span class="notification-info"><b>${newQna.qnaTbTitle}</b> / <small class="notification-date">답변이 필요합니다</small></span>
                                            </a>
                                        </li>
                                    </c:forEach>
                                </ul>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown user-dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><img src="http://via.placeholder.com/36x36" alt="" class="img-circle"></a>
                        <ul class="dropdown-menu">
                            <li><a href="logout.ado">Log Out</a></li>
                        </ul>
                    </li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>
</div>
<!-- /Page Header -->