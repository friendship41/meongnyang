<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="no-js" lang="kor">
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>오늘뭐멍냥</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Place favicon.ico in the root directory -->
    <link rel="shortcut icon" type="image/x-icon" href="images/favicon.ico">
    <link rel="apple-touch-icon" href="apple-touch-icon.png">


    <!-- All css files are included here. -->
    <!-- Bootstrap fremwork main css -->
    <link rel="stylesheet" href="/WEB-INF/client/css/bootstrap.min.css">
    <!-- Owl Carousel min css -->
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">
    <!-- This core.css file contents all plugings css file. -->
    <link rel="stylesheet" href="css/core.css">
    <!-- Theme shortcodes/elements style -->
    <link rel="stylesheet" href="css/shortcode/shortcodes.css">
    <!-- Theme main style -->
    <link rel="stylesheet" href="style.css">
    <!-- Responsive css -->
    <link rel="stylesheet" href="css/responsive.css">
    <!-- User style -->
    <link rel="stylesheet" href="css/custom.css">


    <!-- Modernizr JS -->
    <script src="js/vendor/modernizr-3.5.0.min.js"></script>

    <script>
        function loginModal() {
            $('#myModal88').modal('show');
        }
    </script>
</head>

<body>
<a href="#" data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-eye-open" aria-hidden="true">asdasd</span></a>
    <!--[if lt IE 8]>
        <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
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
                <div class="container" >
                    <div class="row" >
                        <div class="col-md-12" >
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
        <!-- Start Slider Area -->
        <div class="slider__container slider--one bg__cat--3">
            <div class="slide__container slider__activation__wrap owl-carousel">
                <!-- Start Single Slide -->
                <div class="single__slide animation__style01 slider__fixed--height">
                    <div class="container">
                        <div class="row align-items__center">
                            <div class="col-md-7 col-sm-7 col-xs-12 col-lg-6">
                                <div class="slide">
                                    <div class="slider__inner">
                                        <h2>collection 2018</h2>
                                        <h1>NICE CHAIR</h1>
                                        <div class="cr__btn">
                                            <a href="cart.html">Shop Now</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-6 col-sm-5 col-xs-12 col-md-5">
                                <div class="slide__thumb">
                                    <img src="images/slider/fornt-img/1.png" alt="slider images">
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- End Single Slide -->
                <!-- Start Single Slide -->
                <div class="single__slide animation__style01 slider__fixed--height">
                    <div class="container">
                        <div class="row align-items__center">
                            <div class="col-md-7 col-sm-7 col-xs-12 col-lg-6">
                                <div class="slide">
                                    <div class="slider__inner">
                                        <h2>collection 2018</h2>
                                        <h1>NICE CHAIR</h1>
                                        <div class="cr__btn">
                                            <a href="cart.html">Shop Now</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-6 col-sm-5 col-xs-12 col-md-5">
                                <div class="slide__thumb">
                                    <img src="images/slider/fornt-img/2.png" alt="slider images">
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- End Single Slide -->
            </div>
        </div>
        <!-- Start Slider Area -->

        <!-- Start Category Area -->
        <section class="htc__category__area ptb--100">
            <div class="container">
                <div class="row">
                    <div class="col-xs-12">
                        <div class="section__title--2 text-center">
                            <h2 class="title__line">New Arrivals</h2>
                            <p>But I must explain to you how all this mistaken idea</p>
                        </div>
                    </div>
                </div>
                <div class="htc__product__container">
                    <div class="row">
                        <div class="product__list clearfix mt--30">
                            <!-- Start Single Category -->
                            <div class="col-md-4 col-lg-3 col-sm-4 col-xs-12">
                                <div class="category">
                                    <div class="ht__cat__thumb">
                                        <a href="product-details.html">
                                            <img src="images/product/1.jpg" alt="product images">
                                        </a>
                                    </div>
                                    <div class="fr__hover__info">
                                        <ul class="product__action">
                                            <li><a href="wishlist.html"><i class="icon-heart icons"></i></a></li>

                                            <li><a href="cart.html"><i class="icon-handbag icons"></i></a></li>


                                        </ul>
                                    </div>
                                    <div class="fr__product__inner">
                                        <h4><a href="product-details.html">Largest Water Pot</a></h4>
                                        <ul class="fr__pro__prize">
                                            <li class="old__prize">$30.3</li>
                                            <li>$25.9</li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <!-- End Single Category -->
                            <!-- Start Single Category -->
                            <div class="col-md-4 col-lg-3 col-sm-4 col-xs-12">
                                <div class="category">
                                    <div class="ht__cat__thumb">
                                        <a href="product-details.html">
                                            <img src="images/product/2.jpg" alt="product images">
                                        </a>
                                    </div>
                                    <div class="fr__hover__info">
                                        <ul class="product__action">
                                            <li><a href="wishlist.html"><i class="icon-heart icons"></i></a></li>

                                            <li><a href="cart.html"><i class="icon-handbag icons"></i></a></li>


                                        </ul>
                                    </div>
                                    <div class="fr__product__inner">
                                        <h4><a href="product-details.html">nemo enim ipsam</a></h4>
                                        <ul class="fr__pro__prize">
                                            <li class="old__prize">$30.3</li>
                                            <li>$25.9</li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <!-- End Single Category -->
                            <!-- Start Single Category -->
                            <div class="col-md-4 col-lg-3 col-sm-4 col-xs-12">
                                <div class="category">
                                    <div class="ht__cat__thumb">
                                        <a href="product-details.html">
                                            <img src="images/product/3.jpg" alt="product images">
                                        </a>
                                    </div>
                                    <div class="fr__hover__info">
                                        <ul class="product__action">
                                            <li><a href="wishlist.html"><i class="icon-heart icons"></i></a></li>

                                            <li><a href="cart.html"><i class="icon-handbag icons"></i></a></li>


                                        </ul>
                                    </div>
                                    <div class="fr__product__inner">
                                        <h4><a href="product-details.html">Chair collection</a></h4>
                                        <ul class="fr__pro__prize">
                                            <li class="old__prize">$30.3</li>
                                            <li>$25.9</li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <!-- End Single Category -->
                            <!-- Start Single Category -->
                            <div class="col-md-4 col-lg-3 col-sm-4 col-xs-12">
                                <div class="category">
                                    <div class="ht__cat__thumb">
                                        <a href="product-details.html">
                                            <img src="images/product/4.jpg" alt="product images">
                                        </a>
                                    </div>
                                    <div class="fr__hover__info">
                                        <ul class="product__action">
                                            <li><a href="wishlist.html"><i class="icon-heart icons"></i></a></li>

                                            <li><a href="cart.html"><i class="icon-handbag icons"></i></a></li>


                                        </ul>
                                    </div>
                                    <div class="fr__product__inner">
                                        <h4><a href="product-details.html">dummy Product name</a></h4>
                                        <ul class="fr__pro__prize">
                                            <li class="old__prize">$30.3</li>
                                            <li>$25.9</li>
                                        </ul>
                                    </div>
                                </div>
                            </div>

                            <!-- End Single Category new 상품 4개수정  -->
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- End Category Area -->
<!--원래잇던 섹션하나제거함 -->

 <!-- Start Brand Area -->
 <div class="htc__brand__area bg__cat--4">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="ht__brand__inner">
                    <ul class="brand__list owl-carousel clearfix">
                        <li><a href="#"><img src="images/brand/1.png" alt="brand images"></a></li>
                        <li><a href="#"><img src="images/brand/2.png" alt="brand images"></a></li>
                        <li><a href="#"><img src="images/brand/3.png" alt="brand images"></a></li>
                        <li><a href="#"><img src="images/brand/4.png" alt="brand images"></a></li>
                        <li><a href="#"><img src="images/brand/5.png" alt="brand images"></a></li>
                        <li><a href="#"><img src="images/brand/5.png" alt="brand images"></a></li>
                        <li><a href="#"><img src="images/brand/1.png" alt="brand images"></a></li>
                        <li><a href="#"><img src="images/brand/2.png" alt="brand images"></a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- End Brand Area -->


        <section class="ftr__product__area ptb--100">
            <div class="container">
                <div class="row">
                    <div class="col-xs-12">
                        <div class="section__title--2 text-center">
                            <h2 class="title__line">Best Seller</h2>
                            <p>But I must explain to you how all this mistaken idea</p>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="product__wrap clearfix">
                        <!-- Start Single Category -->
                        <div class="col-md-4 col-lg-3 col-sm-4 col-xs-12">
                            <div class="category">
                                <div class="ht__cat__thumb">
                                    <a href="product-details.html">
                                        <img src="images/product/9.jpg" alt="product images">
                                    </a>
                                </div>
                                <div class="fr__hover__info">
                                    <ul class="product__action">
                                        <li><a href="wishlist.html"><i class="icon-heart icons"></i></a></li>

                                        <li><a href="cart.html"><i class="icon-handbag icons"></i></a></li>


                                    </ul>
                                </div>
                                <div class="fr__product__inner">
                                    <h4><a href="product-details.html">Special Wood Basket</a></h4>
                                    <ul class="fr__pro__prize">
                                        <li class="old__prize">$30.3</li>
                                        <li>$25.9</li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <!-- End Single Category -->
                        <!-- Start Single Category -->
                        <div class="col-md-4 col-lg-3 col-sm-4 col-xs-12">
                            <div class="category">
                                <div class="ht__cat__thumb">
                                    <a href="product-details.html">
                                        <img src="images/product/10.jpg" alt="product images">
                                    </a>
                                </div>
                                <div class="fr__hover__info">
                                    <ul class="product__action">
                                        <li><a href="wishlist.html"><i class="icon-heart icons"></i></a></li>

                                        <li><a href="cart.html"><i class="icon-handbag icons"></i></a></li>


                                    </ul>
                                </div>
                                <div class="fr__product__inner">
                                    <h4><a href="product-details.html">voluptatem accusantium</a></h4>
                                    <ul class="fr__pro__prize">
                                        <li class="old__prize">$30.3</li>
                                        <li>$25.9</li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <!-- End Single Category -->
                        <!-- Start Single Category -->
                        <div class="col-md-4 col-lg-3 col-sm-4 col-xs-12">
                            <div class="category">
                                <div class="ht__cat__thumb">
                                    <a href="product-details.html">
                                        <img src="images/product/11.jpg" alt="product images">
                                    </a>
                                </div>
                                <div class="fr__hover__info">
                                    <ul class="product__action">
                                        <li><a href="wishlist.html"><i class="icon-heart icons"></i></a></li>

                                        <li><a href="cart.html"><i class="icon-handbag icons"></i></a></li>


                                    </ul>
                                </div>
                                <div class="fr__product__inner">
                                    <h4><a href="product-details.html">Product Dummy Name</a></h4>
                                    <ul class="fr__pro__prize">
                                        <li class="old__prize">$30.3</li>
                                        <li>$25.9</li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <!-- End Single Category -->
                        <!-- Start Single Category -->
                        <div class="col-md-4 col-lg-3 col-sm-4 col-xs-12">
                            <div class="category">
                                <div class="ht__cat__thumb">
                                    <a href="product-details.html">
                                        <img src="images/product/12.jpg" alt="product images">
                                    </a>
                                </div>
                                <div class="fr__hover__info">
                                    <ul class="product__action">
                                        <li><a href="wishlist.html"><i class="icon-heart icons"></i></a></li>

                                        <li><a href="cart.html"><i class="icon-handbag icons"></i></a></li>


                                    </ul>
                                </div>
                                <div class="fr__product__inner">
                                    <h4><a href="product-details.html">Product Title Here </a></h4>
                                    <ul class="fr__pro__prize">
                                        <li class="old__prize">$30.3</li>
                                        <li>$25.9</li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <!-- End Single Category -->


    <!-- Start Single Category -->
    <!--일단해보자-->
    <div class="col-md-4 col-lg-3 col-sm-4 col-xs-12">
        <div class="category">
            <div class="ht__cat__thumb">
                <a href="product-details.html">
                    <img src="images/product/9.jpg" alt="product images">
                </a>
            </div>
            <div class="fr__hover__info">
                <ul class="product__action">
                    <li><a href="wishlist.html"><i class="icon-heart icons"></i></a></li>

                    <li><a href="cart.html"><i class="icon-handbag icons"></i></a></li>


                </ul>
            </div>
            <div class="fr__product__inner">
                <h4><a href="product-details.html">Special Wood Basket</a></h4>
                <ul class="fr__pro__prize">
                    <li class="old__prize">$30.3</li>
                    <li>$25.9</li>
                </ul>
            </div>
        </div>
    </div>
    <!-- End Single Category -->
    <!-- Start Single Category -->
    <div class="col-md-4 col-lg-3 col-sm-4 col-xs-12">
        <div class="category">
            <div class="ht__cat__thumb">
                <a href="product-details.html">
                    <img src="images/product/10.jpg" alt="product images">
                </a>
            </div>
            <div class="fr__hover__info">
                <ul class="product__action">
                    <li><a href="wishlist.html"><i class="icon-heart icons"></i></a></li>

                    <li><a href="cart.html"><i class="icon-handbag icons"></i></a></li>


                </ul>
            </div>
            <div class="fr__product__inner">
                <h4><a href="product-details.html">voluptatem accusantium</a></h4>
                <ul class="fr__pro__prize">
                    <li class="old__prize">$30.3</li>
                    <li>$25.9</li>
                </ul>
            </div>
        </div>
    </div>
    <!-- End Single Category -->
    <!-- Start Single Category -->
    <div class="col-md-4 col-lg-3 col-sm-4 col-xs-12">
        <div class="category">
            <div class="ht__cat__thumb">
                <a href="product-details.html">
                    <img src="images/product/11.jpg" alt="product images">
                </a>
            </div>
            <div class="fr__hover__info">
                <ul class="product__action">
                    <li><a href="wishlist.html"><i class="icon-heart icons"></i></a></li>

                    <li><a href="cart.html"><i class="icon-handbag icons"></i></a></li>


                </ul>
            </div>
            <div class="fr__product__inner">
                <h4><a href="product-details.html">Product Dummy Name</a></h4>
                <ul class="fr__pro__prize">
                    <li class="old__prize">$30.3</li>
                    <li>$25.9</li>
                </ul>
            </div>
        </div>
    </div>
    <!-- End Single Category -->
    <!-- Start Single Category -->
    <div class="col-md-4 col-lg-3 col-sm-4 col-xs-12">
        <div class="category">
            <div class="ht__cat__thumb">
                <a href="product-details.html">
                    <img src="images/product/12.jpg" alt="product images">
                </a>
            </div>
            <div class="fr__hover__info">
                <ul class="product__action">
                    <li><a href="wishlist.html"><i class="icon-heart icons"></i></a></li>

                    <li><a href="cart.html"><i class="icon-handbag icons"></i></a></li>


                </ul>
            </div>
            <div class="fr__product__inner">
                <h4><a href="product-details.html">Product Title Here </a></h4>
                <ul class="fr__pro__prize">
                    <li class="old__prize">$30.3</li>
                    <li>$25.9</li>
                </ul>
            </div>
        </div>
    </div>

                    </div>
                </div>
            </div>
        </section>
        <!-- End Product Area 8개수정 -->


        <!-- 여기다 다시넣어 안돼면!!!!!!!!!!-->
        <!-- Start Blog Area -->
        <section class="htc__blog__area bg__white ptb--100">
            <div class="container">
                <div class="row">
                    <div class="col-xs-12">
                        <div class="section__title--2 text-center">
                            <h2 class="title__line">Market</h2>
                            <p>But I must explain to you how all this mistaken idea</p>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="ht__blog__wrap clearfix">
                        <!-- Start Single Blog -->
                        <div class="col-md-6 col-lg-4 col-sm-6 col-xs-12">
                            <div class="blog">
                                <div class="blog__thumb">
                                    <a href="blog-details.html">
                                        <img src="images/blog/blog-img/1.jpg" alt="blog images">
                                    </a>
                                </div>
                                <div class="blog__details">
                                    <div class="bl__date">
                                        <span>March 22, 2016</span>
                                    </div>
                                    <h2><a href="blog-details.html">Lorem ipsum dolor sit amet, consec tetur adipisicing elit</a></h2>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisici elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                                    <div class="blog__btn">
                                        <a href="blog-details.html">Read More</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- End Single Blog -->
                        <!-- Start Single Blog -->
                        <div class="col-md-6 col-lg-4 col-sm-6 col-xs-12">
                            <div class="blog">
                                <div class="blog__thumb">
                                    <a href="blog-details.html">
                                        <img src="images/blog/blog-img/2.jpg" alt="blog images">
                                    </a>
                                </div>
                                <div class="blog__details">
                                    <div class="bl__date">
                                        <span>May 22, 2017</span>
                                    </div>
                                    <h2><a href="blog-details.html">Lorem ipsum dolor sit amet, consec tetur adipisicing elit</a></h2>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisici elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                                    <div class="blog__btn">
                                        <a href="blog-details.html">Read More</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- End Single Blog -->
                        <!-- Start Single Blog -->
                        <div class="col-md-6 col-lg-4 col-sm-6 col-xs-12">
                            <div class="blog">
                                <div class="blog__thumb">
                                    <a href="blog-details.html">
                                        <img src="images/blog/blog-img/3.jpg" alt="blog images">
                                    </a>
                                </div>
                                <div class="blog__details">
                                    <div class="bl__date">
                                        <span>March 22, 2018</span>
                                    </div>
                                    <h2><a href="blog-details.html">Lorem ipsum dolor sit amet, consec tetur adipisicing elit</a></h2>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisici elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                                    <div class="blog__btn">
                                        <a href="blog-details.html">Read More</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- End Single Blog -->
                    </div>
                </div>
            </div>
        </section>
        <!-- End Blog Area -->
        <!-- End Banner Area -->
        <!-- Start Footer Area -->
        <footer id="htc__footer">
            <!-- Start Footer Widget -->
            <div class="footer__container bg__cat--1">
                <div class="container">
                    <div class="row">
                        <!-- Start Single Footer Widget -->
                        <div class="col-md-12">
                            <div class="footer">
                                <h2 class="title__line--2">ABOUT US</h2>
                                <div class="ft__details">
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim</p>
                                    <div class="ft__social__link">
                                        <ul class="social__link">
                                            <li><a href="#"><i class="icon-social-twitter icons"></i></a></li>

                                            <li><a href="#"><i class="icon-social-instagram icons"></i></a></li>

                                            <li><a href="#"><i class="icon-social-facebook icons"></i></a></li>

                                            <li><a href="#"><i class="icon-social-google icons"></i></a></li>

                                            <li><a href="#"><i class="icon-social-linkedin icons"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- End Single Footer Widget -->
                    </div>
                </div>
            </div>
            <!-- End Footer Widget -->
        </footer>
        <!-- End Footer Style -->
    </div>
    <!-- Body main wrapper end -->

    <!-- Placed js at the end of the document so the pages load faster -->

    <!-- jquery latest version -->
    <script src="js/vendor/jquery-3.2.1.min.js"></script>
    <!-- Bootstrap framework js -->
    <script src="js/bootstrap.min.js"></script>
    <!-- All js plugins included in this file. -->
    <script src="js/plugins.js"></script>
    <script src="js/slick.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <!-- Waypoints.min.js. -->
    <script src="js/waypoints.min.js"></script>
    <!-- Main js file that contents all jQuery plugins activation. -->
    <script src="js/main.js"></script>



    <!-- 리뷰가 뜨는 모달부분 -->
    <div class="modal video-modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModal">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                </div>
                <section>
                    <div class="modal-body">
                        <div class="col-md-5 modal_body_left">
                            <img src="images/3.jpg" alt=" " class="img-responsive" />
                        </div>
                        <div class="col-md-7 modal_body_right">
                            <h4>리뷰 제목</h4>
                            <p>웅대한 곳으로 날카로우나 꾸며 칼이다. 방황하여도, 속에 인생의 가슴에 밝은 뜨거운지라, 청춘을 청춘이 위하여서. 군영과 청춘의 더운지라 어디 고동을 듣기만 살았으며, 길을 영락과 아름다우냐? 것은 온갖 내는 인생을 위하여서. 든 갑 얼음 바이며, 운다. 눈이 불어 할지니, 있는 주며, 쓸쓸하랴?</p>
                            <div class="rating modal_body_right_cart simpleCart_shelfItem">
                                <p>평점 : <i class="item_price">4.0</i></p>
                                <div class="clearfix"> </div>
                            </div>
                            <div class="modal_body_right_cart simpleCart_shelfItem">
                                <p><span>$380</span> <i class="item_price">$350</i></p>
                                <form action="#" method="post">
                                    <input type="hidden" name="cmd" value="_cart">
                                    <input type="hidden" name="add" value="1">
                                    <input type="hidden" name="w3ls_item" value="Mobile Phone1">
                                    <input type="hidden" name="amount" value="350.00">
                                    <button type="submit" class="w3ls-cart">Add to cart</button>
                                </form>
                            </div>
                        </div>
                        <div class="clearfix"> </div>
                    </div>
                </section>
            </div>
        </div>
    </div>

    <!-- 로그인이 뜨는 모달부분 -->
    <div class="modal fade" id="myModal88" tabindex="-1" role="dialog" aria-labelledby="myModal88"
         aria-hidden="true">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title" id="myModalLabel">로그인 / 회원가입</h4>
                </div>
                <div class="modal-body modal-body-sub">
                    <div class="row">
                        <div class="col-md-8 modal_body_left modal_body_left1" style="border-right: 1px dotted #C2C2C2;padding-right:3em;">
                            <div class="sap_tabs">
                                <div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
                                    <ul>
                                        <li class="resp-tab-item" aria-controls="tab_item-0"><span>Login</span></li>
                                        <li class="resp-tab-item" aria-controls="tab_item-1"><span>Join us</span></li>
                                    </ul>
                                    <div class="tab-1 resp-tab-content" aria-labelledby="tab_item-0">
                                        <div class="facts">
                                            <div class="register">
                                                <form action="#" method="post">
                                                    <input name="Email" placeholder="Email Address" type="text" required="">
                                                    <input name="Password" placeholder="Password" type="password" required="">
                                                    <div class="sign-up">
                                                        <input type="submit" value="Sign in"/>
                                                    </div>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="tab-2 resp-tab-content" aria-labelledby="tab_item-1">
                                        <div class="facts">
                                            <div class="register">
                                                <form action="#" method="post">
                                                    <input placeholder="Name" name="Name" type="text" required="">
                                                    <input placeholder="Email Address" name="Email" type="email" required="">
                                                    <input placeholder="Password" name="Password" type="password" required="">
                                                    <input placeholder="Confirm Password" name="Password" type="password" required="">
                                                    <div class="sign-up">
                                                        <input type="submit" value="Create Account"/>
                                                    </div>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
                            <script type="text/javascript">
                                $(document).ready(function () {
                                    $('#horizontalTab').easyResponsiveTabs({
                                        type: 'default', //Types: default, vertical, accordion
                                        width: 'auto', //auto or any width like 600px
                                        fit: true   // 100% fit in a container
                                    });
                                });
                            </script>
                            <div id="OR" class="hidden-xs">OR</div>
                        </div>
                        <div class="col-md-4 modal_body_right modal_body_right1">
                            <div class="row text-center sign-with">
                                <div class="col-md-12">
                                    <h3 class="other-nw">Sign in with</h3>
                                </div>
                                <div class="col-md-12">
                                    <ul class="social">
                                        <li class="social_facebook"><a href="#" class="entypo-facebook"></a></li>
                                        <li class="social_dribbble"><a href="#" class="entypo-dribbble"></a></li>
                                        <li class="social_twitter"><a href="#" class="entypo-twitter"></a></li>
                                        <li class="social_behance"><a href="#" class="entypo-behance"></a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</body>

</html>
