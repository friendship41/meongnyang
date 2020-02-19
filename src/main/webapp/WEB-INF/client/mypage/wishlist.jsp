<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp"/>

        <!-- Start Bradcaump area -->
        <div class="ht__bradcaump__area" style="background: rgba(0, 0, 0, 0) url(resources/client/images/bg/wishlist.jpg) no-repeat scroll center center / cover ;">
            <div class="ht__bradcaump__wrap">
                <div class="container">
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="bradcaump__inner">
                                <nav class="bradcaump-inner">
                                  <a class="breadcrumb-item" href="index.html">Home</a>
                                  <span class="brd-separetor"><i class="zmdi zmdi-chevron-right"></i></span>
                                  <span class="breadcrumb-item active">Wishlist</span>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- End Bradcaump area -->
        <!-- wishlist-area start -->
        <div class="wishlist-area ptb--100 bg__white">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3">
                        <div class="htc__product__leftsidebar">
                            <div class="htc__category">
                                <h4 class="title__line--4">My Page</h4>
                                <ul class="ht__cat__list">
                                    <li><a href="#">주문내역</a></li>
                                    <li><a href="#">wishlist</a></li>
                                    <li><a href="#">내정보</a></li>
                                    <li><a href="#">Logout</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-9">
                        <div class="wishlist-content">
                            <form action="#">
                                <div class="wishlist-table table-responsive">
                                    <table>
                                        <thead>
                                            <tr>
                                                <th class="product-remove"><span class="nobr">Remove</span></th>
                                                <th class="product-thumbnail">Image</th>
                                                <th class="product-name"><span class="nobr">Product Name</span></th>
                                                <th class="product-price"><span class="nobr"> Unit Price </span></th>
                                                <th class="product-stock-stauts"><span class="nobr"> Stock Status </span></th>
                                                <th class="product-add-to-cart"><span class="nobr">Add To Cart</span></th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach items="${wishlist}" var="wishlist">
                                            <tr>
                                                <td class="product-remove"><a href="/wishlistDelete.do?pdSaleTbNo=${wishlist.pdSaleTbNo}">×</a></td>
                                                <td class="product-thumbnail"><a href="#"><img src="images/product-2/pro-1/1.jpg" alt="" /></a></td>
                                                <td class="product-name"><a href="#">${wishlist.pdSaleTbProductName}</a></td>
                                                <td class="product-price"><span class="amount">${wishlist.pdSaleTbSalesPrice}원</span></td>
                                                <c:if test="${wishlist.pdSaleTbRemainingAmount == 0 }">
                                                	<td class="product-stock-status"><span class="wishlist-in-stock">SOLD OUT</span></td>
                                                	<td class="product-add-to-cart">Not Available</a></td>
                                                </c:if>
                                                <c:if test="${wishlist.pdSaleTbRemainingAmount > 0 }">
                                                	<td class="product-stock-status"><span class="wishlist-in-stock">In Stock</span></td>
                                               	 	<td class="product-add-to-cart"><a href="#"> Add to Cart</a></td>
                                                </c:if>                                                
                                            </tr>
                                            </c:forEach>                                            
                                        </tbody>                                                                           
                                    </table>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- wishlist-area end -->
     

<jsp:include page="../include/footer.jsp" />