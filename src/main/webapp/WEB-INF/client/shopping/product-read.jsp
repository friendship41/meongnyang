<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-09
  Time: 오후 6:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                            <span class="breadcrumb-item active">상품 상세</span>
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
                                <c:forEach var="singleImage" items="${imageList}">
                                    <c:if test="${singleImage.pdImageTbRepresentative eq 'Y'}">
                                        <div role="tabpanel" class="tab-pane fade in active" id="img-tab-${singleImage.pdImageTbNo}">
                                            <img src="${singleImage.pdImageTbPath}" alt="full-image" width="510" height="677">
                                        </div>
                                    </c:if>
                                    <c:if test="${singleImage.pdImageTbRepresentative eq 'N'}">
                                        <div role="tabpanel" class="tab-pane fade" id="img-tab-${singleImage.pdImageTbNo}">
                                            <img src="${singleImage.pdImageTbPath}" alt="full-image" width="510" height="677">
                                        </div>
                                    </c:if>
                                </c:forEach>
                            </div>
                        </div>
                        <!-- End Product Big Images -->
                        <!-- Start Small images -->
                        <ul class="product__small__images" role="tablist">
                            <c:forEach var="singleImage" items="${imageList}">
                                <c:if test="${singleImage.pdImageTbRepresentative eq 'Y'}">
                                    <li role="presentation" class="pot-small-img active">
                                        <a href="#img-tab-${singleImage.pdImageTbNo}" role="tab" data-toggle="tab">
                                            <img src="${singleImage.pdImageTbPath}" alt="small-image" width="80" height="106">
                                        </a>
                                    </li>
                                </c:if>
                                <c:if test="${singleImage.pdImageTbRepresentative eq 'N'}">
                                    <li role="presentation" class="pot-small-img">
                                        <a href="#img-tab-${singleImage.pdImageTbNo}" role="tab" data-toggle="tab">
                                            <img src="${singleImage.pdImageTbPath}" alt="small-image" width="80" height="106">
                                        </a>
                                    </li>
                                </c:if>
                            </c:forEach>
                        </ul>
                        <!-- End Small images -->
                    </div>
                </div>
                <div class="col-md-7 col-lg-7 col-sm-12 col-xs-12 smt-40 xmt-40">
                    <div class="ht__product__dtl">
                        <h2>상품명 : ${detail.productTbName}</h2>
                        <h6>평점 : ${detail.pdSaleTbRating}</h6>
                        <ul class="pro__prize">
                            <li class="old__prize">가격 : <span id="nowPrice">10000</span>원</li>
                            <li id="priceLi">할인가 : <span id="nowDiscount">8000</span>원</li>
                        </ul>
                        <div class="ht__pro__desc">
                            <div class="sin__desc align--left">
                                <p><span>옵션</span></p>
                                <select id="optionSelectBox" class="select__size">
                                    <c:forEach var="singleSale" items="${saleList}">
                                        <option value="${singleSale.pdSaleTbNo}">${singleSale.pdSaleTbSize}</option>
                                    </c:forEach>
                                </select>
                            </div>
                            <div class="sin__desc align--left">
                                <p><span>수량</span></p>&nbsp;&nbsp;
                                <input type="number" value="1" style="text-align: right; height: 20px;" min="1" max="99" id="ordersDetialTbAmount">
                            </div>
                            <div class="sin__desc align--left">
                                <ul class="shopping__btn">
                                    <li><a onclick="addCartD()" style="cursor: pointer"> Add Cart </a></li>
                                    <li class="shp__checkout"><a href="javascript:checkOutGoGo()">Check Out</a></li>
                                </ul>
                            </div>
                            <div class="sin__desc product__share__link">
                                <p><span>공유하기</span></p>
                                <ul class="pro__share">
                                    <li><a id="kakao-link-btn" href="javascript:;"><img src="/resources/client/images/kakaolink_btn_small.png" height="36px"></a></li>
                                    <li><a href="javascript:shareKakaoStory()"><img src="/resources/client/images/kakaostory_icon.png" height="36px"/></a></li>
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
                    <li role="presentation" class="review"><a href="#review" role="tab" data-toggle="tab" id="reviewTap">review</a></li>
                    <li role="presentation" class="shipping"><a href="#shipping" role="tab" data-toggle="tab" id="qnaTap">Q&A</a></li>
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
                            <h4 class="ht__pro__title">상품 설명</h4>
                            <img src="${detail.productTbDetail}" alt="product-detail">
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
                                        <input type="text" id="reviewTbWriter" placeholder="이름" readonly="readonly" value="${customer.customerTbName}">
                                    	<div class="starRev" id="reviewTbRating">
                                    		<span>평점</span>
										    <span class="starR on">★</span>
										    <span class="starR">★</span>
										    <span class="starR">★</span>
										    <span class="starR">★</span>
										    <span class="starR">★</span>
										</div>
                                        <div class="file__box preview-image">
                                            <input class="file__name" readonly="readonly" value="file">
                                            <label for="review-file">업로드</label>
                                            <input type="file" id="review-file" class="file-upload">
                                        </div>
                                    </div>
                                    <div class="comment__form message">
                                        <textarea id="reviewTbContent" placeholder="review 내용"></textarea>
                                    </div>
                                </div>
                                <div class="ht__comment__btn--2 mt--30">
                                    <a class="fr__btn" href="javascript:void(0);" id="addReview">Send</a>
                                </div>
                            </div>
                            <!-- End comment Form -->
                            <h4 class="title__line--5" id="reviewcnt"></h4>
                            <div class="ht__comment__content">
                                <!-- Start Single Comment -->
                                
                                <!-- End Single Comment -->                               
                            </div>
                                <!-- Start Pagenation -->
							<div class="row">
								<div class="col-xs-12">
									<ul class="htc__pagenation" id="reviewPaging">
										
									</ul>
								</div>
							</div>
							<!-- End Pagenation -->
                        </div>
                    </div>
                    <!-- End Single Content -->
                    <!-- Start Single Content -->
                    <div role="tabpanel" id="shipping" class="pro__single__content tab-pane fade">
                        <div class="pro__tab__content__inner">
                            <div class="wishlist-content">
                                <form action="qna-form.do" method="get">
                                    <input type="hidden" name="pdSaleTbNo" value="${saleList.get(0).pdSaleTbNo}">
                                    <input type="hidden" name="qnaTypeTbNo" value="5">
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
                                            <tbody id="qnaTbody">
                                           	<c:forEach var="qna" items="${qnaList}">
                                            <tr>
                                                <input type="hidden" value="${qna.qnaTbDepth}">
                                                <td class="product-remove"> "${qna.rnum}" </td>

                                                <c:if test="${qna.qnaTbSecret == 'Y'}">
                                                    <!-- 비밀글 -->
                                                    <c:if test="${sessionScope.customer.customerTbNo eq qna.customerTbNo}">
                                                        <!-- 내 글이면 -->
                                                        <c:if test="${qna.qnaTbStatus eq 'N'}">
                                                            <!-- 정상글 -->
                                                            <td style="text-align: left;">
                                                                    <c:if test="${qna.adminsTbId eq null}">
                                                                        <span class="badge badge-success">
                                                                            <i class="fa fa-lock" aria-hidden="true"></i>
                                                                            Q
                                                                        </span>
                                                                    </c:if>
                                                                    <c:if test="${qna.adminsTbId ne null}">
                                                                        <span class="badge badge-warning">
                                                                            <i class="fa fa-lock" aria-hidden="true"></i>
                                                                            A
                                                                        </span>
                                                                    </c:if>
                                                                <a href="qna-read.do?qnaTbNo=${qna.qnaTbNo}">${qna.qnaTbTitle}</a>
                                                            </td>
                                                        </c:if>
                                                        <c:if test="${qna.qnaTbStatus eq 'D'}">
                                                            <!-- 삭제된글 -->
                                                            <td style="text-align: left;">
                                                                    <c:if test="${qna.adminsTbId eq null}">
                                                                        <span class="badge badge-success">
                                                                            <i class="fa fa-lock" aria-hidden="true"></i>
                                                                            Q
                                                                        </span>
                                                                    </c:if>
                                                                    <c:if test="${qna.adminsTbId ne null}">
                                                                        <span class="badge badge-warning">
                                                                            <i class="fa fa-lock" aria-hidden="true"></i>
                                                                            A
                                                                        </span>
                                                                    </c:if>
                                                                삭제된 글입니다.
                                                            </td>
                                                        </c:if>
                                                    </c:if>
                                                    <c:if test="${sessionScope.customer.customerTbNo ne qna.customerTbNo}">
                                                        <!-- 내 글이아니면 -->
                                                        <td style="text-align: left;">
                                                            <c:if test="${qna.adminsTbId eq null}">
                                                                <span class="badge badge-success">
                                                                    <i class="fa fa-lock" aria-hidden="true"></i>
                                                                    Q
                                                                </span>
                                                            </c:if>
                                                            <c:if test="${qna.adminsTbId ne null}">
                                                                <span class="badge badge-warning">
                                                                    <i class="fa fa-lock" aria-hidden="true"></i>
                                                                    A
                                                                </span>
                                                            </c:if>
                                                            ${qna.qnaTbTitle}
                                                        </td>
                                                    </c:if>
                                                </c:if>
                                                <c:if test="${qna.qnaTbSecret == 'N' }">
                                                    <!-- 그냥 글 -->
                                                    <c:if test="${qna.qnaTbStatus eq 'N'}">
                                                        <!-- 정상글 -->
                                                        <td style="text-align: left;">
                                                                <c:if test="${qna.adminsTbId eq null}">
                                                                    <span class="badge badge-success">
                                                                        Q
                                                                    </span>
                                                                </c:if>
                                                                <c:if test="${qna.adminsTbId ne null}">
                                                                    <span class="badge badge-warning">
                                                                        A
                                                                    </span>
                                                                </c:if>
                                                            <a href="qna-read.do?qnaTbNo=${qna.qnaTbNo}">${qna.qnaTbTitle}</a>
                                                        </td>
                                                    </c:if>
                                                    <c:if test="${qna.qnaTbStatus eq 'D'}">
                                                        <!-- 삭제된 글 -->
                                                        <td style="text-align: left;">
                                                            <c:if test="${qna.adminsTbId eq null}">
                                                                <span class="badge badge-success">
                                                                    Q
                                                                </span>
                                                            </c:if>
                                                            <c:if test="${qna.adminsTbId ne null}">
                                                                <span class="badge badge-warning">
                                                                    A
                                                                </span>
                                                            </c:if>
                                                            삭제된 글입니다.
                                                        </td>
                                                    </c:if>
                                                </c:if>

                                                <c:if test="${qna.adminsTbId eq null }">
                                                <td class="product-price"><span class="amount">${qna.customerTbName}</span></td>
                                                </c:if>
                                                <c:if test="${qna.adminsTbId ne null }">
                                                <td class="product-price"><span class="amount">${qna.adminsTbId}</span></td>
                                                </c:if>
                                                <td class="product-stock-status"><span class="wishlist-in-stock">${qna.qnaTbRegDate}</span></td>
                                            </tr>
                                            </c:forEach>
                                            </tbody>
                                        </table>
                                        <input type="submit" class="qna-write-btn" value="글쓰기">
                                    </div>
                                </form>
                                <!-- Start Pagenation -->
                                <div class="row">
                                    <div class="col-xs-12">
                                        <ul class="htc__pagenation">
                                            <c:if test="${paging.prev == true }">
                                        <li><a href="#"><i class="zmdi zmdi-chevron-left"></i></a></li>
                                        </c:if>
                                        <c:forEach var="i" begin="${paging.startPage }" end="${paging.endPage }">
                                        <li><a href="/qna-list.do?currentPage=${i}">${i}</a></li>
                                        </c:forEach>
                                        <c:if test="${paging.next == true }">
                                        <li class="active"><a href="#">3</a></li>
                                        </c:if>   
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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
    $(document).ready(function () {
        var normalPrice = "${saleList.get(0).pdSaleTbSalesPrice}";
        var discount = "${saleList.get(0).pdSaleTbDiscountRate}";
        setPrice(normalPrice,discount);
        $("#optionSelectBox").change(function () {
            var opNo = $("#optionSelectBox option:selected").val();
            var optionMap = getOptionMap();
            var nP = optionMap.get(opNo)[0];
            var discount = optionMap.get(opNo)[1];
            setPrice(nP,discount);
        })
        kakaoLink();

        var listSize = '${qnaList.size()}';
        listSize *= 1;
        $("#qnaTap").text("qna(" + listSize + ")");
        for(var i=0; i<listSize; i++) {
            var tr = $("#qnaTbody").children().eq(i);
            var depth = tr.children().eq(0).val();
            depth *=1;
            if(depth != 0) {
                for(var j=0; j<depth; j++) {
                    tr.children().eq(2).prepend('<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>');
                }
            }
        }
    });

    function checkOutGoGo() {
        addCartD();
        location.href="checkout.do";
    }

    function getOptionMap() {
        var optionMap = new Map();
        <c:forEach var="sale" items="${saleList}">
            optionMap.set("${sale.pdSaleTbNo}",["${sale.pdSaleTbSalesPrice}","${sale.pdSaleTbDiscountRate}"]);
        </c:forEach>
        return optionMap;
    }

    function setPrice(normalPrice, discount) {
        normalPrice *= 1;
        discount *= 1;
        var finalPrice = normalPrice*((100-discount)/100);
        $("#nowPrice").text(normalPrice);
        if(finalPrice !== normalPrice)
        {
            finalPrice /= 10;
            finalPrice = Math.floor(finalPrice);
            finalPrice *= 10;
            $("#priceLi").html("할인가 : <span id=\"nowDiscount\">"+finalPrice+"</span>원");
        }
        else
        {
            $("#priceLi").html("<span id=\"nowDiscount\"></span>");
        }
    }

    function addCartD() {
        var params ="?pdSaleTbSalesPrice=";

        var amount = $("#ordersDetialTbAmount").val();
        amount *= 1;

        var normalPrice = $("#nowPrice").text();
        var discountPrice = $("#nowDiscount").text();
        if(discountPrice == null || discountPrice === '')
        {
            normalPrice *= amount;
            params += normalPrice;
        }
        else
        {
            discountPrice *= amount;
            params += discountPrice;
        }

        var opText = $("#optionSelectBox option:selected").text();
        params += "&pdSaleTbProductName=";
        params += "${detail.productTbName}-";
        params += opText;
        params += "&ordersDetialTbAmount=";
        params += amount;
        params += "&cartImage=";
        params += '${imageList.get(0).pdImageTbPath}';
        params += '&productTbCode=';
        params += '${detail.productTbCode}';
        params += '&pdSaleTbNo=';
        params += $("#optionSelectBox option:selected").val();

        var ajaxUrl = "addCartAjax.do"+params;

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

    function shareKakaoStory() {
        Kakao.Story.share({
            url: 'http://ec2-3-135-222-11.us-east-2.compute.amazonaws.com/shoppingDetail.do?productTbCode=${detail.productTbCode}',
            text: '상품명 : ${detail.productTbName}, 오늘뭐멍냥의 상품!'
        });
    }
    
    function kakaoLink() {
        Kakao.Link.createDefaultButton({
            container: '#kakao-link-btn',
            objectType: 'commerce',
            content: {
                title: '${detail.productTbName}',
                imageUrl: 'http://localhost:8080${imageList.get(0).pdImageTbPath}',
                link: {
                    mobileWebUrl: 'http://ec2-3-135-222-11.us-east-2.compute.amazonaws.com/shoppingDetail.do?productTbCode=${detail.productTbCode}',
                    webUrl: 'http://ec2-3-135-222-11.us-east-2.compute.amazonaws.com/shoppingDetail.do?productTbCode=${detail.productTbCode}'
                }
            },
            commerce: {
                regularPrice: ${saleList.get(0).pdSaleTbSalesPrice},
                <c:if test="${saleList.get(0).pdSaleTbDiscountRate ne 0}">
                    discountPrice: ${saleList.get(0).pdSaleTbSalesPrice*(100-saleList.get(0).pdSaleTbDiscountRate)/100},
                    discountRate: ${saleList.get(0).pdSaleTbDiscountRate}
                </c:if>
            },
            buttons: [
                {
                    title: '구매하기',
                    link: {
                        mobileWebUrl: 'http://ec2-3-135-222-11.us-east-2.compute.amazonaws.com/shoppingDetail.do?productTbCode=${detail.productTbCode}',
                        webUrl: 'http://ec2-3-135-222-11.us-east-2.compute.amazonaws.com/shoppingDetail.do?productTbCode=${detail.productTbCode}'
                    }
                },
                {
                    title: '공유하기',
                    link: {
                        mobileWebUrl: 'http://ec2-3-135-222-11.us-east-2.compute.amazonaws.com/shoppingDetail.do?productTbCode=${detail.productTbCode}',
                        webUrl: 'http://ec2-3-135-222-11.us-east-2.compute.amazonaws.com/shoppingDetail.do?productTbCode=${detail.productTbCode}'
                    }
                }
            ]
        });
    }
</script>

<script>
$(function() {
	
	var customer = "${customer}";
	
	getReviewList();
	
	function getReviewList() {
		var productTbCode = '${detail.productTbCode}';
		var url = "/productReviewList.do?productTbCode=" + productTbCode;
		var curr = "&currentPage=";
		
		$.getJSON(url, function(data) {
			var str = "";
			
			var reviewCount = data.reviewCount;
			var page = data.page;
			
			$("#reviewTap").text('review(' + reviewCount +')');
			$("#reviewcnt").text('총 ' + reviewCount + '개의 review가 있습니다');
			
			$(data.reviewList).each(function() {
				var num = this.customerTbNo;
				
				str += '<div class="comment_c">'
                    +		'<div class="comment__thumb">';
                    		if(this.reviewTbImgPath != null){
                				str +=	'<img src="' + this.reviewTbImgPath + '" alt="review images" width="119px" height="141px">';
                    		}
            	str	+=		'</div>'
            		+		'<div class="ht__comment__details">'
	                +			'<div class="ht__comment__title">'
	                +			'<input type="hidden" name="reviewTbNo" value="' + this.reviewTbNo + '">'
	                +   		 	'<h2>'+ this.reviewTbWriter+'</h2>';
	                		if((customer != null) && ('${customer.customerTbNo}' == num)) {	                			
	               				str +=	'<div class="reply__btn"><a href="javascript:void(0);" name="deleteBtn">delete</a></div>'
	                		}
	            str +=			'</div>'
	               	+			'<span>' + this.reviewTbRegDate + '</span>'
	               	+			'<p>평점 : ' + this.reviewTbRating + '</p>'
	                +			'<p>' + this.reviewTbContent + '</p>'
	            	+		'</div>'
        			+	'</div><hr>'	;
			});
			$(".ht__comment__content").html(str);
			
			var p = "";
			
			if(page.prev == true) {
				p += '<li><a href="'+ url + curr + (page.startPage - page.pageBlock)+'"><i class="zmdi zmdi-chevron-left"></i></a></li>';
			}
			for(var i = page.startPage; i < page.endPage+1; i++) {
				p += '<li><a href="'+ url + curr + i +'">'+i+'</a></li>';
			}
			if(page.next == true) {
			    p += '<li class="active"><a href="'+ url + curr +(page.endPage + 1)+'"><i class="zmdi zmdi-chevron-right"></i></a></li>';				
			}	  
		    
			$("#reviewPaging").html(p);
		});
	}
	
	//리뷰 등록하기
	$("#addReview").click(function() { 
		if((customer != '')) {
			var data = new FormData();
			
			var customerNo = "${customer.customerTbNo}";
			var productCode = "${detail.productTbCode}";
			var content = $("#reviewTbContent").val();
			var writer = $("#reviewTbWriter").val();
			var rating = $(".on").length;
			var file = $("#review-file")[0].files[0];
			
			data.append("customerTbNo", customerNo);
			data.append("productTbCode", productCode);
			data.append("reviewTbContent", content);
			data.append("reviewTbWriter", writer);
			data.append("reviewTbRating", rating);
			if(file != null) {
				data.append("file", file);					
			}
	
			$.ajax({
				type : "POST",
				url: "/insertReview.do", //서버 요청 URI
				processData: false,
				contentType: false,
	            dataType: "text", //응답받을 데이터의 형태
	            data: data,
				success: function(result) {
					if(result === "reviewInsertSuccess") {
						$('.starRev span').parent().children('span').removeClass('on');
						$('.starRev span').parent().children('.starR').first().addClass('on');					
					    $('.file__box .file-upload').siblings('.file__name').val("");
					    $('.preview-image .upload-display').remove();
						$("#reviewTbContent").val("");
						getReviewList();
						/* console.log('저장성공'); */
					} else if(result === "reviewInsertFail"){
						alert("구매고객만 리뷰를 남길 수 있습니다.");
						$('.starRev span').parent().children('span').removeClass('on');
						$('.starRev span').parent().children('.starR').first().addClass('on');					
					    $('.file__box .file-upload').siblings('.file__name').val('file');
					    $('.preview-image .upload-display').remove();
						$("#reviewTbContent").val("");
					}
				}
			});	
		} else {
			alert("로그인 후 이용 가능합니다");
		}
	});
	
	//리뷰 삭제하기
	$(document).on("click", "a[name='deleteBtn']", function() {	
		
		var result = confirm("정말로 삭제하시겠습니까?");
		var reviewNo = $(this).parents().children("input[name='reviewTbNo']").val();
		
		if(result) {
			
			$.ajax({
				type : "POST",
				url : "/deleteReview.do?reviewTbNo=" + reviewNo,
				data : {},
				dataType : "TEXT",
				success : function(result) {
					if(result === "deleteSuccess") {
						getReviewList();
					}
				}
			});
			
		} else {
			return false;
		}
	
	});
	
});



</script>
<jsp:include page="../include/footer.jsp"/>