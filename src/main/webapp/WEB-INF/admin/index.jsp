<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="kor">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Responsive Admin Dashboard Template">
    <meta name="keywords" content="admin,dashboard">
    <meta name="author" content="skcats">
    <!-- The above 6 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <!-- Title -->
    <title>ecaps - Responsive Admin Dashboard Template</title>

    <!-- Styles -->
    <link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
    <link href="assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <link href="assets/plugins/icomoon/style.css" rel="stylesheet">
    <link href="assets/plugins/uniform/css/default.css" rel="stylesheet"/>
    <link href="assets/plugins/switchery/switchery.min.css" rel="stylesheet"/>
    <link href="assets/plugins/nvd3/nv.d3.min.css" rel="stylesheet">


    <link href="assets/plugins/datatables/css/jquery.datatables.min.css" rel="stylesheet" type="text/css"/>
    <link href="assets/plugins/datatables/css/jquery.datatables_themeroller.css" rel="stylesheet" type="text/css"/>


    <!-- Theme Styles -->
    <link href="assets/css/ecaps.min.css" rel="stylesheet">
    <link href="assets/css/custom.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body onload="chartGo()">

<!-- Page Container -->
<div class="page-container">
    <!-- Page Sidebar -->
    <div class="page-sidebar">
        <a class="logo-box" href="index.html">
            <span>뭐먹냥</span>
            <i class="icon-radio_button_unchecked" id="fixed-sidebar-toggle-button"></i>
            <i class="icon-close" id="sidebar-toggle-button-close"></i>
        </a>
        <div class="page-sidebar-inner">
            <div class="page-sidebar-menu">
                <ul class="accordion-menu">
                    <li class="active-page">
                        <a href="index.html">
                            <i class="menu-icon icon-home4"></i><span>대시보드</span>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:void(0)">
                            <i class="menu-icon icon-users icon-format_list_bulleted"></i><span>회원관리</span><i
                                class="accordion-icon fa fa-angle-left"></i>
                        </a>
                        <ul class="sub-menu">
                            <li><a href="member/member-overview.html">상세현황</a></li>
                            <li><a href="member/member-manage.html">회원관리</a></li>
                            <li><a href="member/term-manage.html">정책관리</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="javascript:void(0)">
                            <i class="menu-icon icon-shopping_cart icon-format_list_bulleted"></i><span>상품관리</span><i
                                class="accordion-icon fa fa-angle-left"></i>
                        </a>
                        <ul class="sub-menu">
                            <li><a href="product/product-overview.html">상세현황</a></li>
                            <li><a href="product/product-add.html">상품등록</a></li>
                            <li><a href="product/product-analysis.html">상품분석</a></li>
                            <li><a href="product/product-stock.html">재고관리</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="javascript:void(0)">
                            <i class="menu-icon icon-question icon-format_list_bulleted"></i><span>쇼핑몰관리</span><i
                                class="accordion-icon fa fa-angle-left"></i>
                        </a>
                        <ul class="sub-menu">
                            <li><a href="shoppingmall/shoppingmall-notice-list.html">공지관리</a></li>
                            <li><a href="shoppingmall/shoppingmall-qna-list.html">Q&A</a></li>
                            <li><a href="shoppingmall/shoppingmall-faq-list.html">FAQ</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="javascript:void(0)">
                            <i class="menu-icon icon-price-tags icon-format_list_bulleted"></i><span>마케팅관리</span><i
                                class="accordion-icon fa fa-angle-left"></i>
                        </a>
                        <ul class="sub-menu">
                            <li><a href="marketing/promotion-overview.html">프로모션 현황</a></li>
                            <li><a href="marketing/promotion-write.html">프로모션 등록</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="javascript:void(0)">
                            <i class="menu-icon icon-coin-dollar icon-format_list_bulleted"></i><span>매출관리</span><i
                                class="accordion-icon fa fa-angle-left"></i>
                        </a>
                        <ul class="sub-menu">
                            <li><a href="sales/sales-overview.html">매출현황</a></li>
                            <li><a href="sales/sales-analysis.html">매출분석</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <!-- /Page Sidebar -->

    <!-- Page Content -->
    <div class="page-content">
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
                            <li><a href="javascript:void(0)" class="right-sidebar-toggle"
                                   data-sidebar-id="main-right-sidebar"><i class="fa fa-envelope"></i></a></li>
                            <li class="dropdown">
                                <a href="javascript:void(0)" class="dropdown-toggle" data-toggle="dropdown"
                                   role="button" aria-haspopup="true" aria-expanded="false"><i
                                        class="fa fa-bell"></i></a>
                                <ul class="dropdown-menu dropdown-lg dropdown-content">
                                    <li class="drop-title">Notifications<a href="#" class="drop-title-link"><i
                                            class="fa fa-angle-right"></i></a></li>
                                    <li class="slimscroll dropdown-notifications">
                                        <ul class="list-unstyled dropdown-oc">
                                            <li>
                                                <a href="#"><span class="notification-badge bg-primary"><i
                                                        class="fa fa-photo"></i></span>
                                                    <span class="notification-info">Finished uploading photos to gallery <b>"South Africa"</b>.
                                                                <small class="notification-date">20:00</small>
                                                            </span></a>
                                            </li>
                                            <li>
                                                <a href="#"><span class="notification-badge bg-primary"><i
                                                        class="fa fa-at"></i></span>
                                                    <span class="notification-info"><b>John Doe</b> mentioned you in a post "Update v1.5".
                                                                <small class="notification-date">06:07</small>
                                                            </span></a>
                                            </li>
                                            <li>
                                                <a href="#"><span class="notification-badge bg-danger"><i
                                                        class="fa fa-bolt"></i></span>
                                                    <span class="notification-info">4 new special offers from the apps you follow!
                                                                <small class="notification-date">Yesterday</small>
                                                            </span></a>
                                            </li>
                                            <li>
                                                <a href="#"><span class="notification-badge bg-success"><i
                                                        class="fa fa-bullhorn"></i></span>
                                                    <span class="notification-info">There is a meeting with <b>Ethan</b> in 15 minutes!
                                                                <small class="notification-date">Yesterday</small>
                                                            </span></a>
                                            </li>
                                        </ul>
                                    </li>
                                </ul>
                            </li>
                            <li class="dropdown user-dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                                   aria-haspopup="true" aria-expanded="false"><img
                                        src="http://via.placeholder.com/36x36" alt="" class="img-circle"></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">Profile</a></li>
                                    <li><a href="#">Calendar</a></li>
                                    <li><a href="#"><span class="badge pull-right badge-danger">42</span>Messages</a>
                                    </li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#">Account Settings</a></li>
                                    <li><a href="admin-page/login.html">Log Out</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div><!-- /.navbar-collapse -->
                </div><!-- /.container-fluid -->
            </nav>
        </div><!-- /Page Header -->
        <!-- Page Inner -->
        <div class="page-inner">
            <div class="page-title">
                <h3 class="breadcrumb-header">대시보드</h3>
            </div>
            <div id="main-wrapper">
                <!-- Row -->
                <div class="row">
                    <div class="col-lg-3 col-md-6">
                        <div class="panel panel-white stats-widget">
                            <div class="panel-body">
                                <div class="pull-left">
                                    <span class="stats-number">50,000,000</span>
                                    <p class="stats-info">월 매출</p>
                                </div>
                                <div class="pull-right">
                                    <i class="icon-arrow_upward stats-icon"></i>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <div class="panel panel-white stats-widget">
                            <div class="panel-body">
                                <div class="pull-left">
                                    <span class="stats-number">5,000,000</span>
                                    <p class="stats-info">일 매출</p>
                                </div>
                                <div class="pull-right">
                                    <i class="icon-arrow_downward stats-icon"></i>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <div class="panel panel-white stats-widget">
                            <div class="panel-body">
                                <div class="pull-left">
                                    <span class="stats-number">+10,555</span>
                                    <p class="stats-info">신규 회원</p>
                                </div>
                                <div class="pull-right">
                                    <i class="icon-arrow_upward stats-icon"></i>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <div class="panel panel-white stats-widget">
                            <div class="panel-body">
                                <div class="pull-left">
                                    <span class="stats-number">5,000,000</span>
                                    <p class="stats-info">일일 방문자</p>
                                </div>
                                <div class="pull-right">
                                    <i class="icon-arrow_upward stats-icon"></i>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- !Row -->
                <!-- Row -->
                <div class="row">
                    <div class="col-lg-6 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">주간 매출</h4>
                            </div>
                            <div class="panel-body">
                                <canvas id="sales_chart_week"></canvas>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">주간 방문자</h4>
                            </div>
                            <div class="panel-body">
                                <canvas id="visit_chart_week"></canvas>
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
                                <h4 class="panel-title">재고 현황</h4>
                            </div>
                            <div class="panel-body">
                                <div class="table-responsive">
                                    <table id="stockProductTable" class="display table" style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>제품 코드</th>
                                            <th>제품 이름</th>
                                            <th>제품수량</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td>000001</td>
                                            <td>강아지 사료</td>
                                            <td>50</td>
                                        </tr>
                                        <tr>
                                            <td>000002</td>
                                            <td>고양이 사료</td>
                                            <td>80</td>
                                        </tr>
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
                                <h4 class="panel-title">유통기한 임박 상품 현황</h4>
                            </div>
                            <div class="panel-body">
                                <div class="table-responsive">
                                    <table id="expirationProductTable" class="display table" style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>제품 코드</th>
                                            <th>제품 이름</th>
                                            <th>제품수량</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td>000001</td>
                                            <td>강아지 사료</td>
                                            <td>50</td>
                                        </tr>
                                        <tr>
                                            <td>000002</td>
                                            <td>고양이 사료</td>
                                            <td>80</td>
                                        </tr>
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
                                <h4 class="panel-title">주문 현황</h4>
                            </div>
                            <div class="panel-body">
                                <div class="table-responsive">
                                    <table id="orderProductTable" class="display table" style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>주문 번호</th>
                                            <th>주문 상품</th>
                                            <th>주문자명</th>
                                            <th>주문금액</th>
                                            <th>주문일자</th>
                                            <th>주문상태</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td>000002</td>
                                            <td>개 사료 외 1종</td>
                                            <td>안창호</td>
                                            <td>150,000</td>
                                            <td>2011/04/25</td>
                                            <td><span class="label label-nowGo">배송중</span></td>
                                        </tr>
                                        <tr>
                                            <td>000003</td>
                                            <td>개 사료 외 1종</td>
                                            <td>안창호</td>
                                            <td>150,000</td>
                                            <td>2011/04/25</td>
                                            <td><span class="label label-nowGo">배송중</span></td>
                                        </tr>
                                        <tr>
                                            <td>000001</td>
                                            <td>켓타워 외 2종</td>
                                            <td>최창호</td>
                                            <td>336,000</td>
                                            <td>2008/11/28</td>
                                            <td><span class="label label-success">배송완료</span></td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- !Row -->
            </div><!-- Main Wrapper -->
            <div class="page-footer">
                <p>메인프로젝트 뭐먹냥 <i class="fa fa-heart"></i> by team4</p>
            </div>
        </div><!-- /Page Inner -->
        <div class="page-right-sidebar" id="main-right-sidebar">
            <div class="page-right-sidebar-inner">
                <div class="right-sidebar-top">
                    <div class="right-sidebar-tabs">
                        <!-- Nav tabs -->
                        <ul class="nav nav-tabs" role="tablist">
                            <li role="presentation" class="active" id="chat-tab"><a href="#chat" aria-controls="chat"
                                                                                    role="tab"
                                                                                    data-toggle="tab">chat</a></li>
                            <li role="presentation" id="settings-tab"><a href="#settings" aria-controls="settings"
                                                                         role="tab" data-toggle="tab">settings</a></li>
                        </ul>
                    </div>
                    <a href="javascript:void(0)" class="right-sidebar-toggle right-sidebar-close"
                       data-sidebar-id="main-right-sidebar"><i class="icon-close"></i></a>
                </div>
                <div class="right-sidebar-content">
                    <!-- Tab panes -->
                    <div class="tab-content">
                        <div role="tabpanel" class="tab-pane active" id="chat">
                            <div class="chat-list">
                                <span class="chat-title">Recent</span>
                                <a href="javascript:void(0);" class="right-sidebar-toggle chat-item unread"
                                   data-sidebar-id="chat-right-sidebar">
                                    <div class="user-avatar">
                                        <img src="http://via.placeholder.com/40x40" alt="">
                                    </div>
                                    <div class="chat-info">
                                        <span class="chat-author">David</span>
                                        <span class="chat-text">where u at?</span>
                                        <span class="chat-time">08:50</span>
                                    </div>
                                </a>
                                <a href="javascript:void(0);" class="right-sidebar-toggle chat-item unread active-user"
                                   data-sidebar-id="chat-right-sidebar">
                                    <div class="user-avatar">
                                        <img src="http://via.placeholder.com/40x40" alt="">
                                    </div>
                                    <div class="chat-info">
                                        <span class="chat-author">Daisy</span>
                                        <span class="chat-text">Daisy sent a photo.</span>
                                        <span class="chat-time">11:34</span>
                                    </div>
                                </a>
                            </div>
                            <div class="chat-list">
                                <span class="chat-title">Older</span>
                                <a href="javascript:void(0);" class="right-sidebar-toggle chat-item"
                                   data-sidebar-id="chat-right-sidebar">
                                    <div class="user-avatar">
                                        <img src="http://via.placeholder.com/40x40" alt="">
                                    </div>
                                    <div class="chat-info">
                                        <span class="chat-author">Tom</span>
                                        <span class="chat-text">You: ok</span>
                                        <span class="chat-time">2d</span>
                                    </div>
                                </a>
                                <a href="javascript:void(0);" class="right-sidebar-toggle chat-item active-user"
                                   data-sidebar-id="chat-right-sidebar">
                                    <div class="user-avatar">
                                        <img src="http://via.placeholder.com/40x40" alt="">
                                    </div>
                                    <div class="chat-info">
                                        <span class="chat-author">Anna</span>
                                        <span class="chat-text">asdasdasd</span>
                                        <span class="chat-time">4d</span>
                                    </div>
                                </a>
                                <a href="javascript:void(0);" class="right-sidebar-toggle chat-item active-user"
                                   data-sidebar-id="chat-right-sidebar">
                                    <div class="user-avatar">
                                        <img src="http://via.placeholder.com/40x40" alt="">
                                    </div>
                                    <div class="chat-info">
                                        <span class="chat-author">Liza</span>
                                        <span class="chat-text">asdasdasd</span>
                                        <span class="chat-time">&nbsp;</span>
                                    </div>
                                </a>
                                <a href="javascript:void(0);" class="load-more-messages" data-toggle="tooltip"
                                   data-placement="bottom" title="Load More">&bull;&bull;&bull;</a>
                            </div>
                        </div>
                        <div role="tabpanel" class="tab-pane" id="settings">
                            <div class="right-sidebar-settings">
                                <span class="settings-title">General Settings</span>
                                <ul class="sidebar-setting-list list-unstyled">
                                    <li>
                                        <span class="settings-option">Notifications</span><input type="checkbox"
                                                                                                 class="js-switch"
                                                                                                 checked/>
                                    </li>
                                    <li>
                                        <span class="settings-option">Activity log</span><input type="checkbox"
                                                                                                class="js-switch"
                                                                                                checked/>
                                    </li>
                                    <li>
                                        <span class="settings-option">Automatic updates</span><input type="checkbox"
                                                                                                     class="js-switch"/>
                                    </li>
                                    <li>
                                        <span class="settings-option">Allow backups</span><input type="checkbox"
                                                                                                 class="js-switch"/>
                                    </li>
                                </ul>
                                <span class="settings-title">Account Settings</span>
                                <ul class="sidebar-setting-list list-unstyled">
                                    <li>
                                        <span class="settings-option">Chat</span><input type="checkbox"
                                                                                        class="js-switch" checked/>
                                    </li>
                                    <li>
                                        <span class="settings-option">Incognito mode</span><input type="checkbox"
                                                                                                  class="js-switch"/>
                                    </li>
                                    <li>
                                        <span class="settings-option">Public profile</span><input type="checkbox"
                                                                                                  class="js-switch"/>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="page-right-sidebar" id="chat-right-sidebar">
            <div class="page-right-sidebar-inner">
                <div class="right-sidebar-top">
                    <div class="chat-top-info">
                        <span class="chat-name">Noah</span>
                        <span class="chat-state">2h ago</span>
                    </div>
                    <a href="javascript:void(0)" class="right-sidebar-toggle chat-sidebar-close pull-right"
                       data-sidebar-id="chat-right-sidebar"><i class="icon-keyboard_arrow_right"></i></a>
                </div>
                <div class="right-sidebar-content">
                    <div class="right-sidebar-chat slimscroll">
                        <div class="chat-bubbles">
                            <div class="chat-start-date">02/06/2017 5:58PM</div>
                            <div class="chat-bubble them">
                                <div class="chat-bubble-img-container">
                                    <img src="http://via.placeholder.com/38x38" alt="">
                                </div>
                                <div class="chat-bubble-text-container">
                                    <span class="chat-bubble-text">Hello</span>
                                </div>
                            </div>
                            <div class="chat-bubble me">
                                <div class="chat-bubble-text-container">
                                    <span class="chat-bubble-text">Hello!</span>
                                </div>
                            </div>
                            <div class="chat-start-date">03/06/2017 4:22AM</div>
                            <div class="chat-bubble me">
                                <div class="chat-bubble-text-container">
                                    <span class="chat-bubble-text">lorem</span>
                                </div>
                            </div>
                            <div class="chat-bubble them">
                                <div class="chat-bubble-img-container">
                                    <img src="http://via.placeholder.com/38x38" alt="">
                                </div>
                                <div class="chat-bubble-text-container">
                                    <span class="chat-bubble-text">ipsum dolor sit amet</span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="chat-write">
                        <form class="form-horizontal" action="javascript:void(0);">
                            <input type="text" class="form-control" placeholder="Say something">
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div><!-- /Page Content -->
</div><!-- /Page Container -->



<script>
    function chartGo() {
        new Chart(document.getElementById("sales_chart_week"), {
            "type": "line",
            "data": {
                "labels": ["1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일", "15일"],
                "datasets": [{
                    "label": "방문자 수",
                    "data": [5000, 2000, 3000, 4000, 5000, 500, 3600, 3210, 8000, 2000, 10000, 12000, 1000, 2000, 3000],
                    "fill": false,
                    "borderColor": "rgb(93,168,203)",
                    "lineTension": 0.2
                }]
            },
            "options": {}
        });
        new Chart(document.getElementById("visit_chart_week"), {
            "type": "line",
            "data": {
                "labels": ["1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"],
                "datasets": [{
                    "label": "방문자 수",
                    "data": [5000, 2000, 3000, 4000, 5000, 500, 3600, 3210, 8000, 2000, 10000, 12000],
                    "fill": false,
                    "borderColor": "rgb(93,168,203)",
                    "lineTension": 0.2
                }]
            },
            "options": {}
        });



    }
</script>

<!-- Javascripts -->
<script src="assets/plugins/jquery/jquery-3.1.0.min.js"></script>
<script src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>
<script src="assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<script src="assets/plugins/uniform/js/jquery.uniform.standalone.js"></script>
<script src="assets/plugins/switchery/switchery.min.js"></script>
<script src="assets/plugins/d3/d3.min.js"></script>
<script src="assets/plugins/nvd3/nv.d3.min.js"></script>
<script src="assets/plugins/flot/jquery.flot.min.js"></script>
<script src="assets/plugins/flot/jquery.flot.time.min.js"></script>
<script src="assets/plugins/flot/jquery.flot.symbol.min.js"></script>
<script src="assets/plugins/flot/jquery.flot.resize.min.js"></script>
<script src="assets/plugins/flot/jquery.flot.tooltip.min.js"></script>
<script src="assets/plugins/flot/jquery.flot.pie.min.js"></script>
<script src="assets/plugins/chartjs/chart.min.js"></script>
<script src="assets/js/ecaps.min.js"></script>
<script src="assets/js/pages/dashboard.js"></script>


<script src="assets/js/pages/chart.js"></script>
<script src="assets/plugins/chartjs/chart.min.js"></script>


<script src="assets/js/pages/table-data.js"></script>
<script src="assets/plugins/datatables/js/jquery.datatables.min.js"></script>

<!-- custom 테이블 스크립트 -->
<script src="assets/js/custom/product-table.js"></script>


</body>
</html>
