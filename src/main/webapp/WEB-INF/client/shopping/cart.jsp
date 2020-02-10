<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-09
  Time: 오후 5:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../include/header.jsp"/>


<!-- Start Bradcaump area -->
<div class="ht__bradcaump__area" style="background: rgba(0, 0, 0, 0) url(/resources/client/images/bg/cart.jpg) no-repeat scroll center center / cover ;">
    <div class="ht__bradcaump__wrap">
        <div class="container">
            <div class="row">
                <div class="col-xs-12">
                    <div class="bradcaump__inner">
                        <nav class="bradcaump-inner">
                            <a class="breadcrumb-item" href="index.html">Home</a>
                            <span class="brd-separetor"><i class="zmdi zmdi-chevron-right"></i></span>
                            <span class="breadcrumb-item active">shopping cart</span>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- End Bradcaump area -->
<!-- cart-main-area start -->
<div class="cart-main-area ptb--100 bg__white">
    <div class="container">
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <form action="#">
                    <div class="table-content table-responsive">
                        <table>
                            <thead>
                            <tr>
                                <th class="product-thumbnail">products</th>
                                <th class="product-name">name of products</th>
                                <th class="product-price">Price</th>
                                <th class="product-quantity">Quantity</th>
                                <th class="product-subtotal">Total</th>
                                <th class="product-remove">Remove</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td class="product-thumbnail"><a href="#"><img src="../images/product-2/cart-img/1.jpg" alt="product img" /></a></td>
                                <td class="product-name"><a href="#">New Dress For Sunday</a>
                                    <ul class="pro__prize">
                                        <li class="old__prize">$82.5</li>
                                        <li>$75.2</li>
                                    </ul>
                                </td>
                                <td class="product-price"><span class="amount">£165.00</span></td>
                                <td class="product-quantity"><input type="number" value="1" /></td>
                                <td class="product-subtotal">£165.00</td>
                                <td class="product-remove"><a href="#"><i class="icon-trash icons"></i></a></td>
                            </tr>
                            <tr>
                                <td class="product-thumbnail"><a href="#"><img src="../images/product-2/cart-img/2.jpg" alt="product img" /></a></td>
                                <td class="product-name"><a href="#">New Dress For Sunday</a>
                                    <ul class="pro__prize">
                                        <li class="old__prize">$82.5</li>
                                        <li>$75.2</li>
                                    </ul>
                                </td>
                                <td class="product-price"><span class="amount">£50.00</span></td>
                                <td class="product-quantity"><input type="number" value="1" /></td>
                                <td class="product-subtotal">£50.00</td>
                                <td class="product-remove"><a href="#"><i class="icon-trash icons"></i></a></td>
                            </tr>
                            <tr>
                                <td class="product-thumbnail"><a href="#"><img src="../images/product-2/cart-img/3.jpg" alt="product img" /></a></td>
                                <td class="product-name"><a href="#">New Dress For Sunday</a>
                                    <ul class="pro__prize">
                                        <li class="old__prize">$82.5</li>
                                        <li>$75.2</li>
                                    </ul>
                                </td>
                                <td class="product-price"><span class="amount">£50.00</span></td>
                                <td class="product-quantity"><input type="number" value="1" /></td>
                                <td class="product-subtotal">£50.00</td>
                                <td class="product-remove"><a href="#"><i class="icon-trash icons"></i></a></td>
                            </tr>
                            <tr>
                                <td class="product-thumbnail"><a href="#"><img src="../images/product-2/cart-img/4.jpg" alt="product img" /></a></td>
                                <td class="product-name"><a href="#">New Dress For Sunday</a>
                                    <ul class="pro__prize">
                                        <li class="old__prize">$82.5</li>
                                        <li>$75.2</li>
                                    </ul>
                                </td>
                                <td class="product-price"><span class="amount">£50.00</span></td>
                                <td class="product-quantity"><input type="number" value="1" /></td>
                                <td class="product-subtotal">£50.00</td>
                                <td class="product-remove"><a href="#"><i class="icon-trash icons"></i></a></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </form>
                <div class="htc__cart__total">
                    <h6>cart total</h6>
                    <div class="cart__desk__list">
                        <ul class="cart__desc">
                            <li>cart total</li>
                            <li>tax</li>
                            <li>shipping</li>
                        </ul>
                        <ul class="cart__price">
                            <li>$909.00</li>
                            <li>$9.00</li>
                            <li>0</li>
                        </ul>
                    </div>
                    <div class="cart__total">
                        <span>order total</span>
                        <span>$918.00</span>
                    </div>
                    <ul class="payment__btn">
                        <li class="active"><a href="#">payment</a></li>
                        <li><a href="#">continue shopping</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- cart-main-area end -->


<jsp:include page="../include/footer.jsp"/>