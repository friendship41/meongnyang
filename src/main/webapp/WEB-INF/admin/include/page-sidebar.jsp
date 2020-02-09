<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-07
  Time: 오후 5:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Page Sidebar -->
<div class="page-sidebar">
    <a class="logo-box" href="index.html">
        <span>오늘뭐멍냥</span>
        <i class="icon-radio_button_unchecked" id="fixed-sidebar-toggle-button"></i>
        <i class="icon-close" id="sidebar-toggle-button-close"></i>
    </a>
    <div class="page-sidebar-inner">
        <div class="page-sidebar-menu">
            <ul class="accordion-menu">
                <li class="active-page">
                    <a href="index.html">
                        <i class="menu-icon icon-home4"></i><span>대시보드</span>
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0)">
                        <i class="menu-icon icon-users icon-format_list_bulleted"></i><span>회원관리</span><i
                            class="accordion-icon fa fa-angle-left"></i>
                    </a>
                    <ul class="sub-menu">
                        <li><a href="member/member-overview.html">상세현황</a></li>
                        <li><a href="member/member-manage.html">회원관리</a></li>
                        <li><a href="member/term-manage.html">정책관리</a></li>
                    </ul>
                </li>
                <li>
                    <a href="javascript:void(0)">
                        <i class="menu-icon icon-shopping_cart icon-format_list_bulleted"></i><span>상품관리</span><i
                            class="accordion-icon fa fa-angle-left"></i>
                    </a>
                    <ul class="sub-menu">
                        <li><a href="product/product-overview.html">상세현황</a></li>
                        <li><a href="product/product-add.html">상품등록</a></li>
                        <li><a href="product/product-add.html">카테고리</a></li>
                        <li><a href="product/product-add.html">상품이미지</a></li>
                        <li><a href="product/product-analysis.html">상품분석</a></li>
                        <li><a href="product/product-stock.html">재고관리</a></li>
                    </ul>
                </li>
                <li>
                    <a href="javascript:void(0)">
                        <i class="menu-icon icon-question icon-format_list_bulleted"></i><span>쇼핑몰관리</span><i
                            class="accordion-icon fa fa-angle-left"></i>
                    </a>
                    <ul class="sub-menu">
                        <li><a href="shoppingmall/shoppingmall-notice-list.html">공지관리</a></li>
                        <li><a href="shoppingmall/shoppingmall-qna-list.html">Q&A</a></li>
                        <li><a href="shoppingmall/shoppingmall-faq-list.html">FAQ</a></li>
                    </ul>
                </li>
                <li>
                    <a href="javascript:void(0)">
                        <i class="menu-icon icon-price-tags icon-format_list_bulleted"></i><span>마케팅관리</span><i
                            class="accordion-icon fa fa-angle-left"></i>
                    </a>
                    <ul class="sub-menu">
                        <li><a href="marketing/promotion-overview.html">프로모션 현황</a></li>
                        <li><a href="marketing/promotion-write.html">프로모션 등록</a></li>
                    </ul>
                </li>
                <li>
                    <a href="javascript:void(0)">
                        <i class="menu-icon icon-coin-dollar icon-format_list_bulleted"></i><span>매출관리</span><i
                            class="accordion-icon fa fa-angle-left"></i>
                    </a>
                    <ul class="sub-menu">
                        <li><a href="sales/sales-overview.html">매출현황</a></li>
                        <li><a href="sales/sales-analysis.html">매출분석</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</div>
<!-- /Page Sidebar -->