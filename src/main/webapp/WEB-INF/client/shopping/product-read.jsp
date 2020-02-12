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
<div class="ht__bradcaump__area" style="background: rgba(0, 0, 0, 0) url(/resources/client/images/bg/product-read.jpg) no-repeat scroll center center / cover ;">
    <div class="ht__bradcaump__wrap">
        <div class="container">
            <div class="row">
                <div class="col-xs-12">
                    <div class="bradcaump__inner">
                        <nav class="bradcaump-inner">
                            <a class="breadcrumb-item" href="index.html">Home</a>
                            <span class="brd-separetor"><i class="zmdi zmdi-chevron-right"></i></span>
                            <a class="breadcrumb-item" href="product-grid.html">강아지먹거리</a>
                            <span class="brd-separetor"><i class="zmdi zmdi-chevron-right"></i></span>
                            <span class="breadcrumb-item active">사료</span>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- End Bradcaump area -->
<!-- Start Product Details Area -->
<section class="htc__product__details bg__white ptb--100">
    <!-- Start Product Details Top -->
    <div class="htc__product__details__top">
        <div class="container">
            <div class="row">
                <div class="col-md-5 col-lg-5 col-sm-12 col-xs-12">
                    <div class="htc__product__details__tab__content">
                        <!-- Start Product Big Images -->
                        <div class="product__big__images">
                            <div class="portfolio-full-image tab-content">
                                <div role="tabpanel" class="tab-pane fade in active" id="img-tab-1">
                                    <img src="../images/product-2/big-img/1.jpg" alt="full-image">
                                </div>
                                <div role="tabpanel" class="tab-pane fade" id="img-tab-2">
                                    <img src="../images/product-2/big-img/2.jpg" alt="full-image">
                                </div>
                                <div role="tabpanel" class="tab-pane fade" id="img-tab-3">
                                    <img src="../images/product-2/big-img/3.jpg" alt="full-image">
                                </div>
                            </div>
                        </div>
                        <!-- End Product Big Images -->
                        <!-- Start Small images -->
                        <ul class="product__small__images" role="tablist">
                            <li role="presentation" class="pot-small-img active">
                                <a href="#img-tab-1" role="tab" data-toggle="tab">
                                    <img src="../images/product-2/sm-img-3/3.jpg" alt="small-image">
                                </a>
                            </li>
                            <li role="presentation" class="pot-small-img">
                                <a href="#img-tab-2" role="tab" data-toggle="tab">
                                    <img src="../images/product-2/sm-img-3/1.jpg" alt="small-image">
                                </a>
                            </li>
                            <li role="presentation" class="pot-small-img">
                                <a href="#img-tab-3" role="tab" data-toggle="tab">
                                    <img src="../images/product-2/sm-img-3/2.jpg" alt="small-image">
                                </a>
                            </li>
                        </ul>
                        <!-- End Small images -->
                    </div>
                </div>
                <div class="col-md-7 col-lg-7 col-sm-12 col-xs-12 smt-40 xmt-40">
                    <div class="ht__product__dtl">
                        <h2>상품명 : 사료</h2>
                        <h6>평점 : 4.3</h6>
                        <ul class="pro__prize">
                            <li class="old__prize">가격 : 10000원</li>
                            <li>할인가 : 8000원</li>
                        </ul>
                        <p class="pro__info">맛있는 사료 입니다</p>
                        <div class="ht__pro__desc">
                            <div class="sin__desc align--left">
                                <p><span>무게</span></p>
                                <select class="select__size">
                                    <option>1kg</option>
                                    <option>2kg</option>
                                    <option>5kg</option>
                                </select>
                            </div>
                            <div class="sin__desc align--left">
                                <p><span>수량</span></p>&nbsp;&nbsp;
                                <input type="number" value="1" style="text-align: right; height: 20px;" min="1" max="99">
                            </div>
                            <div class="sin__desc align--left">
                                <ul class="shopping__btn" style="">
                                    <li><a href="#"> Add Cart </a></li>
                                    <li class="shp__checkout"><a href="checkout.html">Check Out</a></li>
                                </ul>
                            </div>
                            <div class="sin__desc product__share__link">
                                <p><span>공유하기</span></p>
                                <ul class="pro__share">
                                    <li><a href="#" target="_blank"><i class="icon-social-instagram icons"></i></a></li>
                                    <li><a href="#" target="_blank"><i class="icon-social-google icons"></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- End Product Details Top -->
</section>
<!-- End Product Details Area -->
<!-- Start Product Description -->
<section class="htc__produc__decription bg__white">
    <div class="container">
        <div class="row">
            <div class="col-xs-12">
                <!-- Start List And Grid View -->
                <ul class="pro__details__tab" role="tablist">
                    <li role="presentation" class="description active"><a href="#description" role="tab" data-toggle="tab">상품상세</a></li>
                    <li role="presentation" class="review"><a href="#review" role="tab" data-toggle="tab">review(2)</a></li>
                    <li role="presentation" class="shipping"><a href="#shipping" role="tab" data-toggle="tab">Q&A(2)</a></li>
                </ul>
                <!-- End List And Grid View -->
            </div>
        </div>
        <div class="row">
            <div class="col-xs-12">
                <div class="ht__pro__details__content">
                    <!-- Start Single Content -->
                    <div role="tabpanel" id="description" class="pro__single__content tab-pane fade in active">
                        <div class="pro__tab__content__inner">
                            <p>Formfitting clothing is all about a sweet spot. That elusive place where an item is tight but not clingy, sexy but not cloying, cool but not over the top. Alexandra Alvarez’s label, Alix, hits that mark with its range of comfortable, minimal, and neutral-hued bodysuits.</p>
                            <h4 class="ht__pro__title">Description</h4>
                            <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem</p>
                            <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.</p>
                            <h4 class="ht__pro__title">Standard Featured</h4>
                            <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in</p>
                        </div>
                    </div>
                    <!-- End Single Content -->
                    <!-- Start Single Content -->
                    <div role="tabpanel" id="review" class="pro__single__content tab-pane fade">
                        <div class="htc__comment__area">
                            <!-- Start comment Form -->
                            <div class="ht__comment__form">
                                <h4 class="title__line--5">Review 남기기</h4>
                                <div class="ht__comment__form__inner">
                                    <div class="comment__form">
                                        <input type="text" placeholder="Name *">
                                        <input type="email" placeholder="Email *">
                                        <div class="file__box preview-image">
                                            <input class="file__name" readonly="readonly" value="file">
                                            <label for="review-file">업로드</label>
                                            <input type="file" id="review-file" class="file-upload">
                                        </div>
                                    </div>
                                    <div class="comment__form message">
                                        <textarea name="message" placeholder="Your Comment"></textarea>
                                    </div>
                                </div>
                                <div class="ht__comment__btn--2 mt--30">
                                    <a class="fr__btn" href="#">Send</a>
                                </div>
                            </div>
                            <!-- End comment Form -->
                            <h4 class="title__line--5">총 2개의 리뷰가 있습니다.</h4>
                            <div class="ht__comment__content">
                                <!-- Start Single Comment -->
                                <div class="comment_c">
                                    <div class="comment__thumb">
                                        <img src="../images/comment/1.png" alt="comment images">
                                    </div>
                                    <div class="ht__comment__details">
                                        <div class="ht__comment__title">
                                            <h2><a href="#">JOHN NGUYEN</a></h2>
                                        </div>
                                        <span>July 15, 2016 at 2:39 am</span>
                                        <p>Exercitation photo booth stumptown tote bag Banksy, elit small batch freegan sed.</p>
                                    </div>
                                </div>
                                <!-- End Single Comment -->
                                <!-- Start Single Comment -->
                                <div class="comment">
                                    <div class="comment__thumb">
                                        <img src="../images/comment/3.png" alt="comment images">
                                    </div>
                                    <div class="ht__comment__details">
                                        <div class="ht__comment__title">
                                            <h2><a href="#">JOHN NGUYEN</a></h2>
                                        </div>
                                        <span>July 15, 2016 at 2:39 am</span>
                                        <p>Exercitation photo booth stumptown tote bag Banksy, elit small batch freegan sed.</p>
                                    </div>
                                </div>
                                <!-- End Single Comment -->
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
                        </div>
                    </div>
                    <!-- End Single Content -->
                    <!-- Start Single Content -->
                    <div role="tabpanel" id="shipping" class="pro__single__content tab-pane fade">
                        <div class="pro__tab__content__inner">
                            <div class="wishlist-content">
                                <form action="#">
                                    <div class="wishlist-table table-responsive">
                                        <table>
                                            <thead>
                                            <tr>
                                                <th class="product-remove"><span class="nobr"> NO </span></th>
                                                <th class="product-name"><span class="nobr"> 제 목 </span></th>
                                                <th class="product-price"><span class="nobr"> 글쓴이 </span></th>
                                                <th class="product-stock-stauts"><span class="nobr"> 날짜 </span></th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <tr>
                                                <td class="product-remove"> 2 </td>
                                                <td class="product-name"><a href="#"><span class="badge badge-success">Q</span> 배송문의 </a></td>
                                                <td class="product-price"><span class="amount"> 고객2 </span></td>
                                                <td class="product-stock-status"><span class="wishlist-in-stock"> 20200125 </span></td>
                                            </tr>
                                            <tr>
                                                <td class="product-remove"> 1 </td>
                                                <td class="product-name"><a href="#"><span class="badge badge-warning">A</span> 구매문의 </a></td>
                                                <td class="product-price"><span class="amount"> 고객1 </span></td>
                                                <td class="product-stock-status"><span class="wishlist-in-stock"> 20200125 </span></td>
                                            </tr>
                                            </tbody>
                                        </table>
                                        <input type="button" class="qna-write-btn" value="글쓰기" onclick="javascript:location.href='../community/qna-form.html'">
                                    </div>
                                </form>
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
                        </div>
                    </div>
                    <!-- End Single Content -->
                </div>
            </div>
        </div>
    </div>
</section>
<!-- End Product Description -->


<jsp:include page="../include/footer.jsp"/>