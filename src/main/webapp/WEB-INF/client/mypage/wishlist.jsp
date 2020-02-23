<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
                                    <li><a href="/wishlistSelect.do">wishlist</a></li>
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
	                                                <td class="product-thumbnail"><a href="/shoppingDetail.do?productTbCode=${wishlist.productTbCode}"><img id="productImg-${wishlist.productTbCode}" src="${wishlist.pdImageTbPath}" alt="product images" /></a></td>
	                                                <td class="product-name"><a id="productName-${wishlist.productTbCode}" href="/shoppingDetail.do?productTbCode=${wishlist.productTbCode}">${wishlist.pdSaleTbProductName}</a></td>
	                                                <td class="old-prize">
	                                                	<ul  class="pro__prize">                                                	                                                		
	                                                        	<li id="nowPrice-${wishlist.productTbCode}" class="old__prize"><c:out value="${wishlist.pdSaleTbSalesPrice}" />원</sli><br>
	                                                        <c:if test="${wishlist.pdSaleTbDiscountRate == 0 }">	
	                                                        	<li id="nowDiscount-${wishlist.productTbCode}"><c:out value="${wishlist.pdSaleTbSalesPrice}" />원</li>
	                                                        </c:if>
	                                                        <c:if test="${wishlist.pdSaleTbDiscountRate != 0 }">
	                                                        	<c:set var="price" value="${wishlist.pdSaleTbSalesPrice -( wishlist.pdSaleTbSalesPrice * (wishlist.pdSaleTbDiscountRate/100))}"/>
	                                                        	<fmt:parseNumber var="i" integerOnly="true" type="number" value="${wishlist.pdSaleTbSalesPrice -( wishlist.pdSaleTbSalesPrice * (wishlist.pdSaleTbDiscountRate/100))}"/>	
	                                                        	<li id="nowDiscount-${wishlist.productTbCode}"><c:out value="${i}" />원</li>
	                                                        </c:if>	
	                                                    </ul>
	                                                </td>                                                
	                                                <c:if test="${wishlist.pdSaleTbRemainingAmount == 0 }">
	                                                	<td class="product-stock-status"><span class="wishlist-in-stock">SOLD OUT</span></td>
	                                                	<td class="product-add-to-cart">Not Available</a></td>
	                                                </c:if>
	                                                <c:if test="${wishlist.pdSaleTbRemainingAmount > 0 }">
	                                                	<td class="product-stock-status"><span class="wishlist-in-stock">In Stock</span><br><span class="wishlist-in-stock">(재고수량:${wishlist.pdSaleTbRemainingAmount})</span></td>
	                                               	 	<td class="product-add-to-cart"><a onclick="addCart('${wishlist.productTbCode}')" style="cursor: pointer"> Add to Cart</a></td>
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
 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
	 	
	 	function addCart(productTbCode) {
	 		
	 		var params ="?pdSaleTbSalesPrice=";			
	        var amount = 1;               	       	
	        var normalPrice = "nowPrice-"+productTbCode;      
	        var discountPrice = "nowDiscount-"+productTbCode;
	        var nowPrice = document.getElementById(normalPrice).innerText;
	        var nowDiscount = document.getElementById(discountPrice).innerText;
	        nowPrice = nowPrice.substring(0, nowPrice.length-1);
	            
	        if(nowDiscount == null || nowDiscount === '' || nowDiscount == 0 || nowDiscount === '0'){
	            params += nowPrice;
	        }else{
	            nowDiscount = nowDiscount.substring(0, nowDiscount.length-1);
	            params += nowDiscount;
	        }
	        console.log(nowDiscount);          
	        var name = document.getElementById("productName-"+productTbCode).innerText;
	        params += "&pdSaleTbProductName=";
	        params += name;
	        params += "&ordersDetialTbAmount=";
	        params += amount;
	        params += "&cartImage=";
	        var imgPath = document.getElementById("productImg-"+productTbCode).getAttribute("src");
	        params += imgPath;
	        params += '&productTbCode=';
	        params += productTbCode;
	
	        var ajaxUrl = "addWishlistToCartAjax.do"+params;
	
	        $.ajax({
	            url: ajaxUrl,
	            type: "GET",
	            data: {},
	            dataType: "json"	            

	        })
	            .done(function(json) {
	                console.log(json);					
	                var cartItemHTML = '<div class="shp__single__product" id="pCart-'+json.productTbCode+'">\n' +
                    '                        <div class="shp__pro__thumb">\n' +
                    '                            <a href="shoppingDetail.do?productTbCode='+json.productTbCode+'">\n' +
                    '                                <img src="'+json.cartImage+'" alt="product images" width="99" height="119">\n' +
                    '                            </a>\n' +
                    '                        </div>\n' +
                    '                        <div class="shp__pro__details">\n' +
                    '                            <h2><a href="shoppingDetail.do?productTbCode='+json.productTbCode+'">'+json.pdSaleTbProductName+'</a></h2>\n' +
                    '                            <span class="quantity">수량: '+json.ordersDetialTbAmount+'</span>\n' +
                    '                            <span class="shp__price">'+json.pdSaleTbSalesPrice+'원</span>\n' +
                    '                        </div>\n' +
                    '                        <div class="remove__btn">\n' +
                    '                            <a onclick="removeCartItem(\''+json.productTbCode+'\')" title="Remove this item"><i class="zmdi zmdi-close"></i></a>\n' +
                    '                        </div>\n' +
                    '                    </div>';
	
	                $("#cartWrapDiv").prepend(cartItemHTML);
	                var subtotal = $("#cartSubtotal").val();
	                subtotal *= 1;
	                var newItemPrice = json.pdSaleTbSalesPrice;
	                newItemPrice *= 1;
	                subtotal += newItemPrice;
	                $("#cartSubtotal").val(subtotal);
	                $("#cartSubtotal").text(subtotal+"원");
	
	                var nowSize = $("#cartListSize").text();
	                nowSize *= 1;
	                nowSize += 1;
	                $("#cartListSize").text(nowSize);
	
	                alert("상품이 카트에 추가되었습니다.");
					      
	            })
	            .fail(function (xhr, status, errorThrown) {
	                alert(errorThrown);
	            });
	    }
</script>
 
 
<jsp:include page="../include/footer.jsp" />