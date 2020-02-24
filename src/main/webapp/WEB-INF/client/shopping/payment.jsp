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
                            <span class="breadcrumb-item active">payment</span>
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
            <form id="kakaoPayForm" name="kakaoPayForm" method="post">
                <input type="hidden" name="">
            </form>
            <div class="col-lg-6 col-md-12 col-sm-12">
                <span onclick="kakaoPayGo()"><img src="/resources/client/images/payment_icon_yellow_large.png" alt="카카오페이 결제"></span>
            </div>
        </div>
    </div>
</div>
<!-- cart-main-area end -->

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
    function kakaoPayGo() {
        window.open("${sessionScope.ready.next_redirect_pc_url}", "카카오페이", 'width=500, height=650');
    }
</script>

<jsp:include page="../include/footer.jsp"/>