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
<%--<%@include file="login-modal.jsp"%>--%>

<a href="#" data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-eye-open" aria-hidden="true">asdasd</span></a>
<!--[if lt IE 8]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade
    your browser</a> to improve your experience.</p>
<![endif]-->

<!-- Body main wrapper start -->
<div class="wrapper">
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
                                <a href="index.html"><img src="images/logo/4.png" alt="logo images"></a>
                            </div>
                        </div>
                        <div class="col-md-7 col-lg-8 col-sm-5 col-xs-3">
                            <nav class="main__menu__nav hidden-xs hidden-sm">
                                <ul class="main__menu">
                                    <li class="drop"><a href="index.html">Home</a></li>
                                    <li class="drop"><a href="#">Shopping</a>
                                        <ul class="dropdown mega_dropdown">
                                            <!-- Start Single Mega MEnu -->
                                            <li><a class="mega__title" href="#">강아지</a>
                                                <ul class="mega__item">
                                                    <li><a href="#">먹거리</a></li>
                                                    <li><a href="#">용품</a></li>
                                                </ul>
                                            </li>
                                            <!-- End Single Mega MEnu -->
                                            <!-- Start Single Mega MEnu -->
                                            <li><a class="mega__title" href="product-grid.html">고양이</a>
                                                <ul class="mega__item">
                                                    <li><a href="#">먹거리</a></li>
                                                    <li><a href="#">용품</a></li>
                                                </ul>
                                            </li>
                                            <!-- End Single Mega MEnu -->
                                        </ul>
                                    </li>
                                    <li class="drop"><a href="#">Community</a>
                                        <ul class="dropdown">
                                            <li><a href="#">공지</a></li>
                                            <li><a href="#">FAQ</a></li>
                                            <li><a href="#">Q&A</a></li>
                                            <li><a href="#">리뷰</a></li>
                                            <li><a href="#">Contact</a></li>
                                        </ul>
                                    </li>
                                    <li class="drop"><a href="#">Market</a>
                                    </li>
                                </ul>
                            </nav>

                            <div class="mobile-menu clearfix visible-xs visible-sm">
                                <nav id="mobile_dropdown">
                                    <ul>
                                        <li><a href="index.html">Home</a></li>
                                        <li><a href="#">Shopping</a>
                                            <ul>
                                                <li><a href="blog.html">강아지 먹거리</a></li>
                                                <li><a href="blog-details.html">강아지 용품</a></li>
                                                <li><a href="cart.html">고양이 먹거리</a></li>
                                                <li><a href="checkout.html">고양이 용품</a></li>
                                            </ul>
                                        </li>
                                        <li><a href="#">Community</a>
                                            <ul>
                                                <li><a href="#">공지</a></li>
                                                <li><a href="#">FAQ</a></li>
                                                <li><a href="#">Q&A</a></li>
                                                <li><a href="#">리뷰</a></li>
                                                <li><a href="#">Contact</a></li>
                                            </ul>
                                        </li>
                                        <li><a href="blog.html">Market</a></li>
                                    </ul>
                                </nav>
                            </div>
                        </div>
                        <div class="col-md-3 col-lg-2 col-sm-4 col-xs-4">
                            <div class="header__right">
                                <div class="header__search search search__open">
                                    <a href="#"><i class="icon-magnifier icons"></i></a>
                                </div>
                                <div class="header__account">
                                    <a href="#"><i class="icon-user icons" onclick="loginModal()"></i></a>
                                </div>
                                <div class="htc__shopping__cart">
                                    <a class="cart__menu" href="#"><i class="icon-handbag icons"></i></a>
                                    <a class="cart__menu" href="#"><span class="htc__qua">2</span></a>
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
                <div class="shp__cart__wrap">
                    <div class="shp__single__product">
                        <div class="shp__pro__thumb">
                            <a href="#">
                                <img src="images/product-2/sm-smg/1.jpg" alt="product images">
                            </a>
                        </div>
                        <div class="shp__pro__details">
                            <h2><a href="product-details.html">BO&Play Wireless Speaker</a></h2>
                            <span class="quantity">QTY: 1</span>
                            <span class="shp__price">$105.00</span>
                        </div>
                        <div class="remove__btn">
                            <a href="#" title="Remove this item"><i class="zmdi zmdi-close"></i></a>
                        </div>
                    </div>
                    <div class="shp__single__product">
                        <div class="shp__pro__thumb">
                            <a href="#">
                                <img src="images/product-2/sm-smg/1.jpg" alt="product images">
                            </a>
                        </div>
                        <div class="shp__pro__details">
                            <h2><a href="product-details.html">BO&Play Wireless Speaker</a></h2>
                            <span class="quantity">QTY: 1</span>
                            <span class="shp__price">$105.00</span>
                        </div>
                        <div class="remove__btn">
                            <a href="#" title="Remove this item"><i class="zmdi zmdi-close"></i></a>
                        </div>
                    </div>
                    <div class="shp__single__product">
                        <div class="shp__pro__thumb">
                            <a href="#">
                                <img src="images/product-2/sm-smg/2.jpg" alt="product images">
                            </a>
                        </div>
                        <div class="shp__pro__details">
                            <h2><a href="product-details.html">Brone Candle</a></h2>
                            <span class="quantity">QTY: 1</span>
                            <span class="shp__price">$25.00</span>
                        </div>
                        <div class="remove__btn">
                            <a href="#" title="Remove this item"><i class="zmdi zmdi-close"></i></a>
                        </div>
                    </div>
                </div>
                <ul class="shoping__total">
                    <li class="subtotal">Subtotal:</li>
                    <li class="total__price">$130.00</li>
                </ul>
                <ul class="shopping__btn">
                    <li><a href="cart.html">View Cart</a></li>
                    <li class="shp__checkout"><a href="checkout.html">Checkout</a></li>
                </ul>
            </div>
        </div>
        <!-- End Cart Panel -->
    </div>
    <!-- End Offset Wrapper -->