<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="include/header.jsp"/>

<!-- Start Slider Area -->
<div class="slider__container slider--one bg__cat--3">
    <div class="slide__container slider__activation__wrap owl-carousel">
        <!-- Start Single Slide -->
        <c:forEach var="banner" items="${bannerList}">
            <div class="single__slide animation__style01 slider__fixed--height">
                <div class="container">
                    <div class="row align-items__center">
                        <div class="col-md-7 col-sm-7 col-xs-12 col-lg-6">
                            <div class="slide">
                                <div class="slider__inner">
                                    <h1>${banner.productTbName}</h1>
                                    <div class="cr__btn">
                                        <a href="shoppingDetail.do?productTbCode=${banner.productTbCode}">쇼핑하러가기</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6 col-sm-5 col-xs-12 col-md-5">
                            <div class="slide__thumb">
                                <img src="${banner.pdImageTbPath}" alt="slider images">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>
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
                                    <img src="../../resources/client/images/product/1.jpg" alt="product images">
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
                                    <img src="../../resources/client/images/product/2.jpg" alt="product images">
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
                                    <img src="../../resources/client/images/product/3.jpg" alt="product images">
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
                                    <img src="../../resources/client/images/product/4.jpg" alt="product images">
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
                        <li><a href="#"><img src="../../resources/client/images/brand/1.png" alt="brand images"></a>
                        </li>
                        <li><a href="#"><img src="../../resources/client/images/brand/2.png" alt="brand images"></a>
                        </li>
                        <li><a href="#"><img src="../../resources/client/images/brand/3.png" alt="brand images"></a>
                        </li>
                        <li><a href="#"><img src="../../resources/client/images/brand/4.png" alt="brand images"></a>
                        </li>
                        <li><a href="#"><img src="../../resources/client/images/brand/5.png" alt="brand images"></a>
                        </li>
                        <li><a href="#"><img src="../../resources/client/images/brand/5.png" alt="brand images"></a>
                        </li>
                        <li><a href="#"><img src="../../resources/client/images/brand/1.png" alt="brand images"></a>
                        </li>
                        <li><a href="#"><img src="../../resources/client/images/brand/2.png" alt="brand images"></a>
                        </li>
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
                                <img src="../../resources/client/images/product/9.jpg" alt="product images">
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
                                <img src="../../resources/client/images/product/10.jpg" alt="product images">
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
                                <img src="../../resources/client/images/product/11.jpg" alt="product images">
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
                                <img src="../../resources/client/images/product/12.jpg" alt="product images">
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
                                <img src="../../resources/client/images/product/9.jpg" alt="product images">
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
                                <img src="resources/client/images/product/10.jpg" alt="product images">
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
                            <h2><a href="blog-details.html">Lorem ipsum dolor sit amet, consec tetur adipisicing
                                elit</a></h2>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisici elit, sed do eiusmod tempor incididunt
                                ut labore et dolore magna aliqua.</p>
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
                            <h2><a href="blog-details.html">Lorem ipsum dolor sit amet, consec tetur adipisicing
                                elit</a></h2>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisici elit, sed do eiusmod tempor incididunt
                                ut labore et dolore magna aliqua.</p>
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
                            <h2><a href="blog-details.html">Lorem ipsum dolor sit amet, consec tetur adipisicing
                                elit</a></h2>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisici elit, sed do eiusmod tempor incididunt
                                ut labore et dolore magna aliqua.</p>
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
<c:choose>
<c:when test="${emailSend eq true}">
<script type="text/javascript"> 
	alert("이메일 발송이 완료되었습니다.");
</script>
</c:when>
<c:when test="${emailCertification eq true}">
<script type="text/javascript"> 
	alert("이메일 인증이 완료되었습니다. 로그인을 해주세요.");
</script>
</c:when>
</c:choose>


<jsp:include page="include/footer.jsp"></jsp:include>