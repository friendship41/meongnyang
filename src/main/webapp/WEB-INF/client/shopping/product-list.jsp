<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-09
  Time: 오후 6:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../include/header.jsp"/>


<!-- Start Bradcaump area -->
<div class="ht__bradcaump__area" style="background: rgba(0, 0, 0, 0) url(/resources/client/images/bg/4.jpg) no-repeat scroll center center / cover ;">
    <div class="ht__bradcaump__wrap">
        <div class="container">
            <div class="row">
                <div class="col-xs-12">
                    <div class="bradcaump__inner">
                        <nav class="bradcaump-inner">
                            <a class="breadcrumb-item" href="index.html">Home</a>
                            <span class="brd-separetor"><i class="zmdi zmdi-chevron-right"></i></span>
                            <span class="breadcrumb-item active">강아지먹거리</span>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- End Bradcaump area -->
<!-- Start Product Grid -->
<section class="htc__product__grid bg__white ptb--100">
    <div class="container">
        <div class="row">
            <div class="col-lg-9 col-lg-push-3 col-md-9 col-md-push-3 col-sm-12 col-xs-12">
                <div class="htc__product__rightidebar">
                    <div class="htc__grid__top">
                        <div class="htc__select__option">
                            <select class="ht__select">
                                <option>정렬 방식</option>
                                <option>인기순</option>
                                <option>최신순</option>
                                <option>판매순</option>
                            </select>

                        </div>
                        <div class="ht__pro__qun">
                            <span>pages 1-12 of 1033 총갯수</span>
                        </div>
                        <!-- Start List And Grid View -->
                        <ul class="view__mode" role="tablist">
                            <li role="presentation" class="grid-view active"><a href="#grid-view" role="tab" data-toggle="tab"><i class="zmdi zmdi-grid"></i></a></li>
                            <li role="presentation" class="list-view"><a href="#list-view" role="tab" data-toggle="tab"><i class="zmdi zmdi-view-list"></i></a></li>
                        </ul>
                        <!-- End List And Grid View -->
                    </div>
                    <!-- Start Product View -->
                    <div class="row">
                        <div class="shop__grid__view__wrap">
                            <div role="tabpanel" id="grid-view" class="single-grid-view tab-pane fade in active clearfix">
                                <!-- Start Single Product -->
                                <div class="col-md-4 col-lg-4 col-sm-6 col-xs-12">
                                    <div class="category">
                                        <div class="ht__cat__thumb">
                                            <a href="product-read.html">
                                                <img src="images/product/1.jpg" alt="product images">
                                            </a>
                                        </div>
                                        <div class="fr__hover__info">
                                            <ul class="product__action">
                                                <li><a href="wishlist.html"><i class="icon-heart icons"></i></a></li>

                                                <li><a href="cart.html"><i class="icon-handbag icons"></i></a></li>

                                                <li><a href="#"><i class="icon-shuffle icons"></i></a></li>
                                            </ul>
                                        </div>
                                        <div class="fr__product__inner">
                                            <h4><a href="product-read.html">Largest Water Pot</a></h4>
                                            <ul class="fr__pro__prize">
                                                <li class="old__prize">$30.3</li>
                                                <li>$25.9</li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <!-- End Single Product -->
                                <!-- Start Single Product -->
                                <div class="col-md-4 col-lg-4 col-sm-6 col-xs-12">
                                    <div class="category">
                                        <div class="ht__cat__thumb">
                                            <a href="product-read.html">
                                                <img src="images/product/2.jpg" alt="product images">
                                            </a>
                                        </div>
                                        <div class="fr__hover__info">
                                            <ul class="product__action">
                                                <li><a href="wishlist.html"><i class="icon-heart icons"></i></a></li>

                                                <li><a href="cart.html"><i class="icon-handbag icons"></i></a></li>

                                                <li><a href="#"><i class="icon-shuffle icons"></i></a></li>
                                            </ul>
                                        </div>
                                        <div class="fr__product__inner">
                                            <h4><a href="product-read.html">Chair collection</a></h4>
                                            <ul class="fr__pro__prize">
                                                <li class="old__prize">$30.3</li>
                                                <li>$25.9</li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <!-- End Single Product -->
                                <!-- Start Single Product -->
                                <div class="col-md-4 col-lg-4 col-sm-6 col-xs-12">
                                    <div class="category">
                                        <div class="ht__cat__thumb">
                                            <a href="product-read.html">
                                                <img src="images/product/3.jpg" alt="product images">
                                            </a>
                                        </div>
                                        <div class="fr__hover__info">
                                            <ul class="product__action">
                                                <li><a href="wishlist.html"><i class="icon-heart icons"></i></a></li>

                                                <li><a href="cart.html"><i class="icon-handbag icons"></i></a></li>

                                                <li><a href="#"><i class="icon-shuffle icons"></i></a></li>
                                            </ul>
                                        </div>
                                        <div class="fr__product__inner">
                                            <h4><a href="product-read.html">dummy Product name</a></h4>
                                            <ul class="fr__pro__prize">
                                                <li class="old__prize">$30.3</li>
                                                <li>$25.9</li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <!-- End Single Product -->
                                <!-- Start Single Product -->
                                <div class="col-md-4 col-lg-4 col-sm-6 col-xs-12">
                                    <div class="category">
                                        <div class="ht__cat__thumb">
                                            <a href="product-read.html">
                                                <img src="images/product/4.jpg" alt="product images">
                                            </a>
                                        </div>
                                        <div class="fr__hover__info">
                                            <ul class="product__action">
                                                <li><a href="wishlist.html"><i class="icon-heart icons"></i></a></li>

                                                <li><a href="cart.html"><i class="icon-handbag icons"></i></a></li>

                                                <li><a href="#"><i class="icon-shuffle icons"></i></a></li>
                                            </ul>
                                        </div>
                                        <div class="fr__product__inner">
                                            <h4><a href="product-read.html">Largest Water Pot</a></h4>
                                            <ul class="fr__pro__prize">
                                                <li class="old__prize">$30.3</li>
                                                <li>$25.9</li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <!-- End Single Product -->
                                <!-- Start Single Product -->
                                <div class="col-md-4 col-lg-4 col-sm-6 col-xs-12">
                                    <div class="category">
                                        <div class="ht__cat__thumb">
                                            <a href="product-read.html">
                                                <img src="images/product/5.jpg" alt="product images">
                                            </a>
                                        </div>
                                        <div class="fr__hover__info">
                                            <ul class="product__action">
                                                <li><a href="wishlist.html"><i class="icon-heart icons"></i></a></li>

                                                <li><a href="cart.html"><i class="icon-handbag icons"></i></a></li>

                                                <li><a href="#"><i class="icon-shuffle icons"></i></a></li>
                                            </ul>
                                        </div>
                                        <div class="fr__product__inner">
                                            <h4><a href="product-read.html">Largest Water Pot</a></h4>
                                            <ul class="fr__pro__prize">
                                                <li class="old__prize">$30.3</li>
                                                <li>$25.9</li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <!-- End Single Product -->
                                <!-- Start Single Product -->
                                <div class="col-md-4 col-lg-4 col-sm-6 col-xs-12">
                                    <div class="category">
                                        <div class="ht__cat__thumb">
                                            <a href="product-read.html">
                                                <img src="images/product/6.jpg" alt="product images">
                                            </a>
                                        </div>
                                        <div class="fr__hover__info">
                                            <ul class="product__action">
                                                <li><a href="wishlist.html"><i class="icon-heart icons"></i></a></li>

                                                <li><a href="cart.html"><i class="icon-handbag icons"></i></a></li>

                                                <li><a href="#"><i class="icon-shuffle icons"></i></a></li>
                                            </ul>
                                        </div>
                                        <div class="fr__product__inner">
                                            <h4><a href="product-read.html">Special Wood Basket</a></h4>
                                            <ul class="fr__pro__prize">
                                                <li class="old__prize">$30.3</li>
                                                <li>$25.9</li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <!-- End Single Product -->
                                <!-- Start Single Product -->
                                <div class="col-md-4 col-lg-4 col-sm-6 col-xs-12">
                                    <div class="category">
                                        <div class="ht__cat__thumb">
                                            <a href="product-read.html">
                                                <img src="images/product/7.jpg" alt="product images">
                                            </a>
                                        </div>
                                        <div class="fr__hover__info">
                                            <ul class="product__action">
                                                <li><a href="wishlist.html"><i class="icon-heart icons"></i></a></li>

                                                <li><a href="cart.html"><i class="icon-handbag icons"></i></a></li>

                                                <li><a href="#"><i class="icon-shuffle icons"></i></a></li>
                                            </ul>
                                        </div>
                                        <div class="fr__product__inner">
                                            <h4><a href="product-read.html">Largest Water Pot</a></h4>
                                            <ul class="fr__pro__prize">
                                                <li class="old__prize">$30.3</li>
                                                <li>$25.9</li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <!-- End Single Product -->
                                <!-- Start Single Product -->
                                <div class="col-md-4 col-lg-4 col-sm-6 col-xs-12">
                                    <div class="category">
                                        <div class="ht__cat__thumb">
                                            <a href="product-read.html">
                                                <img src="images/product/8.jpg" alt="product images">
                                            </a>
                                        </div>
                                        <div class="fr__hover__info">
                                            <ul class="product__action">
                                                <li><a href="wishlist.html"><i class="icon-heart icons"></i></a></li>

                                                <li><a href="cart.html"><i class="icon-handbag icons"></i></a></li>

                                                <li><a href="#"><i class="icon-shuffle icons"></i></a></li>
                                            </ul>
                                        </div>
                                        <div class="fr__product__inner">
                                            <h4><a href="product-read.html">donec ac tempus nrb</a></h4>
                                            <ul class="fr__pro__prize">
                                                <li class="old__prize">$30.3</li>
                                                <li>$25.9</li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <!-- End Single Product -->
                                <!-- Start Single Product -->
                                <div class="col-md-4 col-lg-4 col-sm-6 col-xs-12">
                                    <div class="category">
                                        <div class="ht__cat__thumb">
                                            <a href="product-read.html">
                                                <img src="images/product/9.jpg" alt="product images">
                                            </a>
                                        </div>
                                        <div class="fr__hover__info">
                                            <ul class="product__action">
                                                <li><a href="wishlist.html"><i class="icon-heart icons"></i></a></li>

                                                <li><a href="cart.html"><i class="icon-handbag icons"></i></a></li>

                                                <li><a href="#"><i class="icon-shuffle icons"></i></a></li>
                                            </ul>
                                        </div>
                                        <div class="fr__product__inner">
                                            <h4><a href="product-read.html">nemo enim ipsam</a></h4>
                                            <ul class="fr__pro__prize">
                                                <li class="old__prize">$30.3</li>
                                                <li>$25.9</li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <!-- End Single Product -->
                                <!-- Start Single Product -->
                                <div class="col-md-4 col-lg-4 col-sm-6 col-xs-12">
                                    <div class="category">
                                        <div class="ht__cat__thumb">
                                            <a href="product-read.html">
                                                <img src="images/product/10.jpg" alt="product images">
                                            </a>
                                        </div>
                                        <div class="fr__hover__info">
                                            <ul class="product__action">
                                                <li><a href="wishlist.html"><i class="icon-heart icons"></i></a></li>

                                                <li><a href="cart.html"><i class="icon-handbag icons"></i></a></li>

                                                <li><a href="#"><i class="icon-shuffle icons"></i></a></li>
                                            </ul>
                                        </div>
                                        <div class="fr__product__inner">
                                            <h4><a href="product-read.html">dummy Product name</a></h4>
                                            <ul class="fr__pro__prize">
                                                <li class="old__prize">$30.3</li>
                                                <li>$25.9</li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <!-- End Single Product -->
                                <!-- Start Single Product -->
                                <div class="col-md-4 col-lg-4 col-sm-6 col-xs-12">
                                    <div class="category">
                                        <div class="ht__cat__thumb">
                                            <a href="product-read.html">
                                                <img src="images/product/11.jpg" alt="product images">
                                            </a>
                                        </div>
                                        <div class="fr__hover__info">
                                            <ul class="product__action">
                                                <li><a href="wishlist.html"><i class="icon-heart icons"></i></a></li>

                                                <li><a href="cart.html"><i class="icon-handbag icons"></i></a></li>

                                                <li><a href="#"><i class="icon-shuffle icons"></i></a></li>
                                            </ul>
                                        </div>
                                        <div class="fr__product__inner">
                                            <h4><a href="product-read.html">Chair collection</a></h4>
                                            <ul class="fr__pro__prize">
                                                <li class="old__prize">$30.3</li>
                                                <li>$25.9</li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <!-- End Single Product -->
                                <!-- Start Single Product -->
                                <div class="col-md-4 col-lg-4 col-sm-6 col-xs-12">
                                    <div class="category">
                                        <div class="ht__cat__thumb">
                                            <a href="product-read.html">
                                                <img src="images/product/1.jpg" alt="product images">
                                            </a>
                                        </div>
                                        <div class="fr__hover__info">
                                            <ul class="product__action">
                                                <li><a href="wishlist.html"><i class="icon-heart icons"></i></a></li>

                                                <li><a href="cart.html"><i class="icon-handbag icons"></i></a></li>

                                                <li><a href="#"><i class="icon-shuffle icons"></i></a></li>
                                            </ul>
                                        </div>
                                        <div class="fr__product__inner">
                                            <h4><a href="product-read.html">Largest Water Pot</a></h4>
                                            <ul class="fr__pro__prize">
                                                <li class="old__prize">$30.3</li>
                                                <li>$25.9</li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <!-- End Single Product -->
                            </div>
                            <div role="tabpanel" id="list-view" class="single-grid-view tab-pane fade clearfix">
                                <div class="col-xs-12">
                                    <div class="ht__list__wrap">
                                        <!-- Start List Product -->
                                        <div class="ht__list__product">
                                            <div class="ht__list__thumb">
                                                <a href="product-read.html"><img src="images/product-2/pro-1/1.jpg" alt="product images"></a>
                                            </div>
                                            <div class="htc__list__details">
                                                <h2><a href="product-read.html">Product Title Here </a></h2>
                                                <ul  class="pro__prize">
                                                    <li class="old__prize">$82.5</li>
                                                    <li>$75.2</li>
                                                </ul>
                                                <h6>평점 : 4.6</h6>

                                                <p>Lorem ipsum dolor sit amet, consectetur adipisLorem ipsum dolor sit amet, consec adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqul Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                                                <div class="fr__list__btn">
                                                    <a class="fr__btn" href="cart.html">Add To Cart</a>
                                                </div>
                                            </div>
                                        </div>
                                        <!-- End List Product -->
                                        <!-- Start List Product -->
                                        <div class="ht__list__product">
                                            <div class="ht__list__thumb">
                                                <a href="product-read.html"><img src="images/product-2/pro-1/2.jpg" alt="product images"></a>
                                            </div>
                                            <div class="htc__list__details">
                                                <h2><a href="product-read.html">Product Title Here </a></h2>
                                                <ul  class="pro__prize">
                                                    <li class="old__prize">$82.5</li>
                                                    <li>$75.2</li>
                                                </ul>
                                                <h6>평점 : 4.6</h6>
                                                <p>Lorem ipsum dolor sit amet, consectetur adipisLorem ipsum dolor sit amet, consec adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqul Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                                                <div class="fr__list__btn">
                                                    <a class="fr__btn" href="cart.html">Add To Cart</a>
                                                </div>
                                            </div>
                                        </div>
                                        <!-- End List Product -->
                                        <!-- Start List Product -->
                                        <div class="ht__list__product">
                                            <div class="ht__list__thumb">
                                                <a href="product-read.html"><img src="images/product-2/pro-1/3.jpg" alt="product images"></a>
                                            </div>
                                            <div class="htc__list__details">
                                                <h2><a href="product-read.html">Product Title Here </a></h2>
                                                <ul  class="pro__prize">
                                                    <li class="old__prize">$82.5</li>
                                                    <li>$75.2</li>
                                                </ul>
                                                <h6>평점 : 4.6</h6>
                                                <p>Lorem ipsum dolor sit amet, consectetur adipisLorem ipsum dolor sit amet, consec adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqul Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                                                <div class="fr__list__btn">
                                                    <a class="fr__btn" href="cart.html">Add To Cart</a>
                                                </div>
                                            </div>
                                        </div>
                                        <!-- End List Product -->
                                        <!-- Start List Product -->
                                        <div class="ht__list__product">
                                            <div class="ht__list__thumb">
                                                <a href="product-read.html"><img src="images/product-2/pro-1/4.jpg" alt="product images"></a>
                                            </div>
                                            <div class="htc__list__details">
                                                <h2><a href="product-read.html">Product Title Here </a></h2>
                                                <ul  class="pro__prize">
                                                    <li class="old__prize">$82.5</li>
                                                    <li>$75.2</li>
                                                </ul>
                                                <h6>평점 : 4.6</h6>
                                                <p>Lorem ipsum dolor sit amet, consectetur adipisLorem ipsum dolor sit amet, consec adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqul Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                                                <div class="fr__list__btn">
                                                    <a class="fr__btn" href="cart.html">Add To Cart</a>
                                                </div>
                                            </div>
                                        </div>
                                        <!-- End List Product -->
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- End Product View -->
                </div>
                <!-- Start Pagenation -->
                <div class="row">
                    <div class="col-xs-12">
                        <ul class="htc__pagenation">
                            <li><a href="#"><i class="zmdi zmdi-chevron-left"></i></a></li>
                            <li><a href="#">1</a></li>
                            <li class="active"><a href="#">3</a></li>
                            <li><a href="#">19</a></li>
                            <li><a href="#"><i class="zmdi zmdi-chevron-right"></i></a></li>
                        </ul>
                    </div>
                </div>
                <!-- End Pagenation -->
            </div>
            <div class="col-lg-3 col-lg-pull-9 col-md-3 col-md-pull-9 col-sm-12 col-xs-12 smt-40 xmt-40">
                <div class="htc__product__leftsidebar">
                    <!-- Start Prize Range -->
                    <div class="htc-grid-range">
                        <h4 class="title__line--4">Price</h4>
                        <div class="content-shopby">
                            <div class="price_filter s-filter clear">
                                <form action="#" method="GET">
                                    <div id="slider-range"></div>
                                    <div class="slider__range--output">
                                        <div class="price__output--wrap">
                                            <div class="price--output">
                                                <span>Price :</span><input type="text" id="amount" readonly>
                                            </div>
                                            <div class="price--filter">
                                                <a href="#">Filter</a>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                    <!-- End Prize Range -->
                    <!-- Start Category Area -->
                    <div class="htc__category">
                        <h4 class="title__line--4">먹거리</h4>
                        <ul class="ht__cat__list">
                            <li><a href="#">사료</a></li>
                            <li><a href="#">간식</a></li>

                        </ul>
                    </div>
                    <!-- End Category Area -->


                    <!-- End Tag Area -->


                </div>
            </div>
        </div>
    </div>
</section>
<!-- End Product Grid -->

<!-- Start Banner Area -->
<div class="htc__banner__area">
    <ul class="banner__list owl-carousel owl-theme clearfix">
        <li><a href="product-read.html"><img src="images/banner/bn-3/1.jpg" alt="banner images"></a></li>
        <li><a href="product-read.html"><img src="images/banner/bn-3/2.jpg" alt="banner images"></a></li>
        <li><a href="product-read.html"><img src="images/banner/bn-3/3.jpg" alt="banner images"></a></li>
        <li><a href="product-read.html"><img src="images/banner/bn-3/4.jpg" alt="banner images"></a></li>
        <li><a href="product-read.html"><img src="images/banner/bn-3/5.jpg" alt="banner images"></a></li>
        <li><a href="product-read.html"><img src="images/banner/bn-3/6.jpg" alt="banner images"></a></li>
        <li><a href="product-read.html"><img src="images/banner/bn-3/1.jpg" alt="banner images"></a></li>
        <li><a href="product-read.html"><img src="images/banner/bn-3/2.jpg" alt="banner images"></a></li>
    </ul>
</div>
<!-- End Banner Area -->


<jsp:include page="../include/footer.jsp"/>