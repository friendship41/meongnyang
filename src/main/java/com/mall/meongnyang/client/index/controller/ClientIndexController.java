package com.mall.meongnyang.client.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientIndexController
{

    @RequestMapping("/index.do")
    public String indexPage()
    {
        return "index";
    }

    @RequestMapping("/cart.do")
    public String cartPage()
    {
        return "shopping/cart";
    }

    @RequestMapping("/checkout.do")
    public String checkoutPage()
    {
        return "shopping/checkout";
    }

    @RequestMapping("/productList.do")
    public String productListPage()
    {
        return "shopping/product-list";
    }

    @RequestMapping("/productRead.do")
    public String productReadPage()
    {
        return "shopping/product-read";
    }
    
    @RequestMapping("/myinfo.do")
    public String myinfoPage() {
    	return "mypage/myinfo";
    }
    @RequestMapping("/order-list.do")
    public String orderListPage() {
    	return "mypage/order-list";
    }
    @RequestMapping("/order-read.do")
    public String orderReadPage() {
    	return "mypage/order-read";
    }
    @RequestMapping("/wishlist.do")
    public String wishlistPage() {
    	return "mypage/wishlist";
    }
    
    @RequestMapping("/faq.do")
    public String faqPage() {
    	return "community/faq";
    }
    @RequestMapping("/notice.do")
    public String noticePage() {
    	return "community/notice";
    }
    @RequestMapping("/notice-form.do")
    public String noticeFormPage() {
    	return "community/notice-form";
    }
    @RequestMapping("/notice-read.do")
    public String noticeReadPage() {
    	return "community/notice-read";
    }
    @RequestMapping("/qna.do")
    public String qnaPage() {
    	return "community/qna";
    }
    @RequestMapping("/qna-form.do")
    public String qnaFormPage() {
    	return "community/qna-form";
    }
    @RequestMapping("/qna-read.do")
    public String qnaReadPage() {
    	return "community/qna-read";
    }
    @RequestMapping("/review-list.do")
    public String reviewListPage() {
    	return "community/review-list";
    }
}
