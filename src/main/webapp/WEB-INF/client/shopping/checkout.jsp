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
<div class="ht__bradcaump__area"
     style="background: rgba(0, 0, 0, 0) url(/resources/client/images/bg/checkout.jpg) no-repeat scroll center center / cover ;">
    <div class="ht__bradcaump__wrap">
        <div class="container">
            <div class="row">
                <div class="col-xs-12">
                    <div class="bradcaump__inner">
                        <nav class="bradcaump-inner">
                            <a class="breadcrumb-item" href="index.html">Home</a>
                            <span class="brd-separetor"><i class="zmdi zmdi-chevron-right"></i></span>
                            <span class="breadcrumb-item active">checkout</span>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- End Bradcaump area -->
<!-- cart-main-area start -->
<div class="checkout-wrap ptb--100">
    <div class="container">
        <div class="row">
            <div class="col-md-8">
                <div class="checkout__inner">
                    <div class="accordion-list">
                        <div class="accordion">
                            <div class="accordion__title">주소입력칸</div>
                            <div class="accordion__body">
                                <div class="bilinfo">
                                    <form action="#">
                                        <div class="row">
                                            <div class="col-md-12">
                                                <div class="single-input mt-0">
                                                    <select id="addressSelectBox">
                                                        <option value="thisIsSelect">주소선택</option>
                                                        <c:forEach var="address" items="${addressList}">
                                                            <option value="${address.cmAddressTbNo}">${address.cmAddressTbAddress1}</option>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="single-input">
                                                    <input id="receivePerson" type="text" placeholder="수령인">
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="single-input">
                                                    <input id="orderPerson" type="text" placeholder="주문자" readonly="" value="${sessionScope.customer.customerTbName}">
                                                </div>
                                            </div>
                                            <div class="col-md-12">
                                                <div class="single-input">
                                                    <input id="phoneNum" type="text" placeholder="전화 번호" value="${sessionScope.customer.customerTbPhone}">
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="single-input">
                                                    <input id="postcode" type="text" placeholder="우편번호" readonly="">
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="single-input">
                                                    <span id="addressFindBtn" class="checkout__purchase_a" onclick="openDaumZipAddress()">주소 찾기</span>
                                                </div>
                                            </div>
                                            <div class="col-md-12">
                                                <div class="single-input">
                                                    <input id="address1" type="text" placeholder="주소1" readonly="">
                                                </div>
                                            </div>
                                            <div class="col-md-12">
                                                <div class="single-input">
                                                    <input id="address2" type="text" placeholder="상세 주소">
                                                </div>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="checkout__point">
                    포인트 : <input id="myPoint" type="number" value="${sessionScope.customer.customerTbPoint}" readonly style="width: 100px"> 점<br><br>
                    사용할포인트 : <input id="usePoint" type="number" value="0" style="width: 100px;"> 점
                </div>
            </div>

            <div class="col-md-4">
                <div class="order-details">
                    <h5 class="order-details__title">금액</h5>
                    <div id="checkoutItems" class="order-details__item">
                        <c:set var="subtotalPrice" value="0"/>
                        <c:forEach var="item" items="${sessionScope.cartList}" varStatus="i">
                            <div class="single-item" id="pCheckout-${item.productTbCode}">
                                <div class="single-item__thumb" id="${item.pdSaleTbNo}">
                                    <img src="${item.cartImage}" alt="ordered item" width="99" height="119">
                                </div>
                                <div class="single-item__content">
                                    <a href="shoppingDetail.do?productTbCode=${item.productTbCode}">${item.pdSaleTbProductName} / ${item.ordersDetialTbAmount}</a>
                                    <span class="price">${item.pdSaleTbSalesPrice} 원</span>
                                </div>
                                <div class="single-item__remove">
                                    <a onclick="removeCheckoutItem('${item.productTbCode}')"><i class="zmdi zmdi-delete"></i></a>
                                </div>
                            </div>
                            <c:set var="subtotalPrice" value="${subtotalPrice + item.pdSaleTbSalesPrice}"/>
                        </c:forEach>
                    </div>
                    <div class="order-details__count">
                        <div class="order-details__count__single">
                            <h5>금액</h5>
                            <span id="nowMoney" class="price">${subtotalPrice} 원</span>
                        </div>
                        <div class="order-details__count__single">
                            <h5>포인트</h5>
                            <span id="checkoutPoint" class="price">0 점</span>
                        </div>
                        <div class="order-details__count__single">
                            <h5>배송비</h5>
                            <span class="price">2500 원</span>
                        </div>
                    </div>
                    <div class="ordre-details__total">
                        <h5>총금액</h5>
                        <span id="totalMoney" class="price">${subtotalPrice + 2500} 원</span>
                    </div>
                    <div class="ordre-details__total">
                        <h5>포인트적립액</h5>
                        <span id="mileage" class="price">${(subtotalPrice+2500)*0.01} 점</span>
                    </div>
                    <div class="ordre-details__total_c">
                        <a class="checkout__purchase_a" onclick="submitToPay()">결제하기</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- cart-main-area end -->

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://ssl.daumcdn.net/dmaps/map_js_init/postcode.v2.js"></script>
<script>
    $(document).ready(function () {
        $("#addressSelectBox").change(function () {
            var selectedValue = $("#addressSelectBox option:selected").val();
            console.log(selectedValue);

            if(selectedValue === 'thisIsSelect')
            {
                $("#phoneNum").val('');
                $("#addressFindBtn").show();
                $("#postcode").val('');
                $("#address1").val('');
                $("#address2").val('');
            }
            else
            {
                console.log(selectedValue);
                var ajaxUrl = "/myinfo-address-single-ajax.do?cmAddressTbNo="+selectedValue;
                $.ajax({
                    url: ajaxUrl,
                    type: "GET",
                    data: {},
                    dataType: "json"
                })
                    .done(function(json) {
                        console.log(json);
                        $("#phoneNum").val(json.cmAddressTbPhone);
                        $("#addressFindBtn").hide();
                        $("#postcode").val(json.cmAddressTbPostcode);
                        $("#address1").val(json.cmAddressTbAddress1);
                        $("#address2").val(json.cmAddressTbAddress2);
                    })
                    .fail(function (xhr, status, errorThrown) {
                        alert(errorThrown);
                    });
            }
        });

        $("#usePoint").bind({'keyup':bindCheckoutPoint}, {'change': bindCheckoutPoint});

        var nowMoney = $("#nowMoney").text();
        nowMoney = nowMoney.substring(0, nowMoney.length-2);
        nowMoney *= 1;
        $("#mileage").text(Math.floor((nowMoney+2500)*0.01) + " 점");
    });

    function bindCheckoutPoint() {
        var myPoint = $("#myPoint").val();
        var usePoint = $("#usePoint").val();
        myPoint *= 1;
        usePoint *= 1;
        if(myPoint < usePoint)
        {
            $("#usePoint").attr("style", "width: 100px;background-color: red;");
        }
        else {
            $("#usePoint").attr("style", "width: 100px;");
            $("#checkoutPoint").text(usePoint + " 점");

            var nowMoney = $("#nowMoney").text();
            nowMoney = nowMoney.substring(0, nowMoney.length-2);
            nowMoney *= 1;
            $("#totalMoney").text((nowMoney-usePoint+2500)+" 원");
            $("#mileage").text(Math.floor((nowMoney-usePoint+2500)*0.01) + "점");
        }
    }

    function openDaumZipAddress() {
        new daum.Postcode({
            oncomplete:function(data) {
                $("#postcode").val(data.zonecode);
                $("#address1").val(data.address)
                $("#address2").focus();
                $("#addressSelectBox option:eq(0)").attr("selected", "selected");
            }
        }).open();
    }

    function removeCheckoutItem(itemId) {
        var ajaxUrl = "/removeCartAjax.do?productTbCode="+itemId;
        $.ajax({
            url: ajaxUrl,
            type: "GET",
            data: {},
            dataType: "json"
        })
            .done(function(json) {
                var item = "pCart-"+itemId;
                document.getElementById(item).remove();
                var subtotal = $("#cartSubtotal").val();
                subtotal *= 1;
                var newItemPrice = json.pdSaleTbSalesPrice;
                newItemPrice *= 1;
                subtotal -= newItemPrice;
                $("#cartSubtotal").val(subtotal);
                $("#cartSubtotal").text(subtotal+"원");

                var nowSize = $("#cartListSize").text();
                nowSize *= 1;
                nowSize -= 1;
                $("#cartListSize").text(nowSize);

                var checkItem = "pCheckout-"+itemId;
                document.getElementById(checkItem).remove();

                var nMoney = $("#nowMoney").text();
                nMoney = nMoney.substring(0, nMoney.length-2);
                nMoney *= 1;
                nMoney -= newItemPrice;
                $("#nowMoney").text(nMoney+" 원");

                var tMoney = $("#totalMoney").text();
                tMoney = tMoney.substring(0, tMoney.length-2);
                tMoney *= 1;
                tMoney -= newItemPrice;
                $("#totalMoney").text(tMoney+" 원");

                var ppoint = $("#mileage").text();
                ppoint = ppoint.substring(0, ppoint.length-2);
                ppoint = Math.floor((ppoint*100-newItemPrice)/100);
                $("#mileage").text(ppoint+" 점");

            })
            .fail(function (xhr, status, errorThrown) {
                alert(errorThrown);
            });
    }

    function submitToPay() {
        var form = document.createElement("form");
        form.setAttribute("charset", "UTF-8");
        form.setAttribute("method", "Post");
        form.setAttribute("action", "/paymentReady.do");

        var pdOrderTbPayment = $("#totalMoney").text();
        pdOrderTbPayment = pdOrderTbPayment.substring(0, pdOrderTbPayment.length-2);
        var pdOrderTbAddress = $("#address1").val()+" "+$("#address2").val();
        var pdOrderTbReceiver = $("#receivePerson").val();
        var pdOrderTbPhone = $("#phoneNum").val();
        var pdOrderTbUsedPoint = $("#usePoint").val();

        var hiddenField = document.createElement("input");
        hiddenField.setAttribute("type", "hidden");
        hiddenField.setAttribute("name", "pdOrderTbPayment");
        hiddenField.setAttribute("value", pdOrderTbPayment);
        form.appendChild(hiddenField);
        hiddenField = document.createElement("input");
        hiddenField.setAttribute("type", "hidden");
        hiddenField.setAttribute("name", "pdOrderTbAddress");
        hiddenField.setAttribute("value", pdOrderTbAddress);
        form.appendChild(hiddenField);
        hiddenField = document.createElement("input");
        hiddenField.setAttribute("type", "hidden");
        hiddenField.setAttribute("name", "pdOrderTbReceiver");
        hiddenField.setAttribute("value", pdOrderTbReceiver);
        form.appendChild(hiddenField);
        hiddenField = document.createElement("input");
        hiddenField.setAttribute("type", "hidden");
        hiddenField.setAttribute("name", "pdOrderTbPhone");
        hiddenField.setAttribute("value", pdOrderTbPhone);
        form.appendChild(hiddenField);
        hiddenField = document.createElement("input");
        hiddenField.setAttribute("type", "hidden");
        hiddenField.setAttribute("name", "pdOrderTbUsedPoint");
        hiddenField.setAttribute("value", pdOrderTbUsedPoint);
        form.appendChild(hiddenField);

        var orderRepProductName = '${sessionScope.cartList.get(0).pdSaleTbProductName}';

        hiddenField = document.createElement("input");
        hiddenField.setAttribute("type", "hidden");
        hiddenField.setAttribute("name", "orderRepProductName");
        hiddenField.setAttribute("value", orderRepProductName);
        form.appendChild(hiddenField);

        var itemsLength = document.getElementById("checkoutItems").childElementCount;
        var itemSingle;
        var singleSaleNo;
        var singleAmount;
        var singlePrice;
        for(var i=0; i<itemsLength; i++)
        {
            itemSingle = $("#checkoutItems").children().eq(i);

            singleSaleNo = itemSingle.children().eq(0).attr("id");

            singleAmount = itemSingle.children().eq(1).children().eq(0).text().split(" / ")[1];

            singlePrice = itemSingle.children().eq(1).children().eq(1).text();
            singlePrice = singlePrice.substring(0, singlePrice.length-2);

            hiddenField = document.createElement("input");
            hiddenField.setAttribute("type", "hidden");
            hiddenField.setAttribute("name", "orderDetailVOList["+i+"].pdSaleTbNo");
            hiddenField.setAttribute("value", singleSaleNo);
            form.appendChild(hiddenField);

            hiddenField = document.createElement("input");
            hiddenField.setAttribute("type", "hidden");
            hiddenField.setAttribute("name", "orderDetailVOList["+i+"].ordersDetailTbAmount");
            hiddenField.setAttribute("value", singleAmount);
            form.appendChild(hiddenField);

            hiddenField = document.createElement("input");
            hiddenField.setAttribute("type", "hidden");
            hiddenField.setAttribute("name", ("orderDetailVOList["+i+"].ordersDetailTbPrice"));
            hiddenField.setAttribute("value", singlePrice);
            form.appendChild(hiddenField);
        }


        document.body.appendChild(form);

        form.submit();
    }
</script>

<jsp:include page="../include/footer.jsp"/>