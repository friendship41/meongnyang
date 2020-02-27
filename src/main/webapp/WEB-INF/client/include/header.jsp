<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html class="no-js" lang="kor">
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>오늘뭐멍냥</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Place favicon.ico in the root directory -->
    <link rel="shortcut icon" type="image/x-icon" href="<c:url value='/resources/client/images/favicon.ico'/>">
    <link rel="apple-touch-icon" href="<c:url value='/resources/client/apple-touch-icon.png'/>">

    <!-- All css files are included here. -->
    <!-- Bootstrap fremwork main css -->
    <link rel="stylesheet" href="<c:url value='/resources/client/css/bootstrap.min.css'/>">
    <!-- Owl Carousel min css -->
    <link rel="stylesheet" href="<c:url value='/resources/client/css/owl.carousel.min.css'/>">
    <link rel="stylesheet" href="<c:url value='/resources/client/css/owl.theme.default.min.css'/>">
    <!-- This core.css file contents all plugings css file. -->
    <link rel="stylesheet" href="<c:url value='/resources/client/css/core.css'/>">
    <!-- Theme shortcodes/elements style -->
    <link rel="stylesheet" href="<c:url value='/resources/client/css/shortcode/shortcodes.css'/>">
    <!-- Theme main style -->
    <link rel="stylesheet" href="<c:url value="/resources/client/css/style.css"/>">
    <!-- Responsive css -->
    <link rel="stylesheet" href="<c:url value='/resources/client/css/responsive.css'/>">
    <!-- User style -->
    <link rel="stylesheet" href="<c:url value='/resources/client/css/custom.css'/>">


    <!-- Modernizr JS -->
    <script src="<c:url value='/resources/client/js/vendor/modernizr-3.5.0.min.js'/>"></script>

    <script>
        function loginModal() {
            $('#myModal88').modal('show');
        }
    </script>
</head>

<body>

<jsp:include page="login-modal.jsp"/>
<jsp:include page="review-modal.jsp"/>
<%--<%@include file="login-modal.jsp"%>--%>

<!--[if lt IE 8]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade
    your browser</a> to improve your experience.</p>
<![endif]-->

<!-- Body main wrapper start -->
<div class="wrapper">
    
    <!-- 카카오톡 상담문의 -->
    <a href="javascript:void kakaoChat()">
        <img src="/resources/client/images/question_small_yellow_pc.png" style="position: fixed; bottom: 80px; right: 20px; z-index: 2147483647;">
    </a>
    
    <!-- Start Header Style -->
    <header id="htc__header" class="htc__header__area header--one">
        <!-- Start Mainmenu Area -->
        <div id="sticky-header-with-topbar" class="mainmenu__wrap sticky__header">
            <div class="container">
                <!-- row -->
                <div class="row">
                    <div class="menumenu__container clearfix">
                        <div class="col-lg-2 col-md-2 col-sm-3 col-xs-5">
                            <div class="logo">
                                <a href="index.do"><img src="/resources/client/images/logo/logo_final.png" alt="logo images"></a>
                            </div>
                        </div>
                        <div class="col-md-7 col-lg-8 col-sm-5 col-xs-3">
                            <nav class="main__menu__nav hidden-xs hidden-sm">
                                <ul class="main__menu">
                                    <li class="drop"><a href="index.do">Home</a></li>
                                    <li class="drop"><a href="#">Shopping</a>
                                        <ul class="dropdown mega_dropdown">
                                            <!-- Start Single Mega MEnu -->
                                            <c:forEach var="singleMenu" items="${sessionScope.menu.menu}" varStatus="status">
                                                <li><a class="mega__title">${singleMenu.key}</a>
                                                    <ul class="mega__item">
                                                        <c:forEach var="subMenu" items="${singleMenu.value}" varStatus="status">
                                                            <li><a href="shopping.do?productCategoryTbNo=${subMenu.key}">${subMenu.value}</a></li>
                                                        </c:forEach>
                                                    </ul>
                                                </li>
                                            </c:forEach>
                                        </ul>
                                    </li>
                                    <li class="drop"><a href="#">Community</a>
                                        <ul class="dropdown">
                                            <li><a href="notice.do">공지</a></li>
                                            <li><a href="faq.do">FAQ</a></li>
                                            <li><a href="qna-list.do">Q&A</a></li>
                                            <li><a href="reviewList.do">리뷰</a></li>
                                            <li><a href="#">Contact</a></li>
                                        </ul>
                                    </li>
                                    <li class="drop"><a href="market-list.do">Market</a>
                                    </li>
                                </ul>
                            </nav>

                            <div class="mobile-menu clearfix visible-xs visible-sm">
                                <nav id="mobile_dropdown">
                                    <ul>
                                        <li><a href="index.do">Home</a></li>
                                        <li><a href="#">Shopping</a>
                                            <ul>
                                                <c:forEach var="singleMenu" items="${sessionScope.menu.menu}" varStatus="status">
                                                    <c:forEach var="subMenu" items="${singleMenu.value}" varStatus="status">
                                                        <li><a href="shopping.do?productCategoryTbNo=${subMenu.key}">${singleMenu.key}-${subMenu.value}</a></li>
                                                    </c:forEach>
                                                </c:forEach>
                                            </ul>
                                        </li>
                                        <li><a href="#">Community</a>
                                            <ul>
                                                <li><a href="notice.do">공지</a></li>
                                                <li><a href="faq.do">FAQ</a></li>
                                                <li><a href="qna-list.do">Q&A</a></li>
                                                <li><a href="reviewList.do">리뷰</a></li>
                                                <li><a href="#">Contact</a></li>
                                            </ul>
                                        </li>
                                        <li><a href="market-list.do">Market</a></li>
                                    </ul>
                                </nav>
                            </div>
                        </div>
                        <div class="col-md-3 col-lg-2 col-sm-4 col-xs-4">
                            <div class="header__right">
                                <div class="header__search search search__open">
                                    <a href="#"><i class="icon-magnifier icons"></i></a>
                                </div>
                                
                                <c:choose>
                                <c:when test="${sessionScope.customer eq null }">
                                 <div class="header__account">
                                    <a href="#"><i class="icon-user icons" onclick="loginModal()"></i></a>
                                </div>
                                </c:when>
                                <c:otherwise>
                                <div class="header__account">
                                    <a href="/myinfo.do"><i class="icon-user icons"></i></a>
                                </div>
                                </c:otherwise>
                                </c:choose>
                                <div class="htc__shopping__cart">
                                    <a class="cart__menu" href="#"><i class="icon-handbag icons"></i></a>
                                    <a class="cart__menu" href="#"><span id="cartListSize" class="htc__qua">${sessionScope.cartList.size()}</span></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- !row -->
                <div class="mobile-menu-area"></div>
            </div>
        </div>
        <!-- End Mainmenu Area -->
    </header>
    <!-- End Header Area -->

    <div class="body__overlay"></div>
    <!-- Start Offset Wrapper -->
    <div class="offset__wrapper">
        <!-- Start Search Popap -->
        <div class="search__area">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="search__inner">
                            <form action="#" method="get">
                                <input placeholder="Search here... " type="text">
                                <button type="submit"></button>
                            </form>
                            <div class="search__close__btn">
                                <span class="search__close__btn_icon"><i class="zmdi zmdi-close"></i></span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- End Search Popap -->
        <!-- Start Cart Panel -->
        <div class="shopping__cart">
            <div class="shopping__cart__inner">
                <div class="offsetmenu__close__btn">
                    <a href="#"><i class="zmdi zmdi-close"></i></a>
                </div>
                <div id="cartWrapDiv" class="shp__cart__wrap">
                    <c:set var="subtotalPrice" value="0"/>
                    <c:forEach var="item" items="${sessionScope.cartList}">
                        <div class="shp__single__product" id="pCart-${item.productTbCode}">
                            <div class="shp__pro__thumb">
                                <a href="shoppingDetail.do?productTbCode=${item.productTbCode}">
                                    <img src="${item.cartImage}" alt="product images" width="99" height="119">
                                </a>
                            </div>
                            <div class="shp__pro__details">
                                <h2><a href="shoppingDetail.do?productTbCode=${item.productTbCode}">${item.pdSaleTbProductName}</a></h2>
                                <span class="quantity">수량: ${item.ordersDetialTbAmount}</span>
                                <span class="shp__price">${item.pdSaleTbSalesPrice}원</span>
                            </div>
                            <div class="remove__btn">
                                <a onclick="removeCartItem('${item.productTbCode}')" title="Remove this item"><i class="zmdi zmdi-close"></i></a>
                            </div>
                        </div>
                        <c:set var="subtotalPrice" value="${subtotalPrice + item.pdSaleTbSalesPrice}"/>
                    </c:forEach>
                <ul class="shoping__total">
                    <li class="subtotal">합 계:</li>
                    <li id="cartSubtotal" class="total__price" value="${subtotalPrice}">${subtotalPrice}원</li>
                </ul>
                    <ul class="shopping__btn">
                        <li class="shp__checkout"><a href="checkout.do">Checkout</a></li>
                    </ul>
            </div>
        </div>
        <!-- End Cart Panel -->
    </div>
    <!-- End Offset Wrapper -->