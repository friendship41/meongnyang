package com.mall.meongnyang.admin.dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminIndexController
{
    @RequestMapping("/index.ado")
    public String indexPage()
    {
        return "index";
    }

    @RequestMapping("/login.ado")
    public String loginPage()
    {
        return "admin-page/login";
    }

    @RequestMapping("/promotionOverview.ado")
    public String promotionOverviewPage()
    {
        return "marketing/promotion-overview";
    }

    @RequestMapping("/promotionRead.ado")
    public String promotionReadPage()
    {
        return "marketing/promotion-read";
    }

    @RequestMapping("/promotionWrite.ado")
    public String promotionWritePage()
    {
        return "marketing/promotion-write";
    }

    @RequestMapping("/memberManage.ado")
    public String memberManagePage()
    {
        return "member/member-manage";
    }

    @RequestMapping("/memberOverview.ado")
    public String memberOverviewPage()
    {
        return "member/member-overview";
    }

    @RequestMapping("/termManage.ado")
    public String termManagePage()
    {
        return "member/term-manage";
    }

    @RequestMapping("/termWrite.ado")
    public String termWritePage()
    {
        return "member/term-write";
    }


    @RequestMapping("/p1.ado")
    public String qwePage()
    {
        return "product/product-add";
    }
    @RequestMapping("/p2.ado")
    public String qdqwdePage()
    {
        return "product/product-analysis";
    }
    @RequestMapping("/p3.ado")
    public String qwqwdqePage()
    {
        return "product/product-category-add";
    }
    @RequestMapping("/p4.ado")
    public String qwqqdwdqePage()
    {
        return "product/product-image-add";
    }
    @RequestMapping("/p5.ado")
    public String qwqdaePage()
    {
        return "product/product-overview";
    }
    @RequestMapping("/p6.ado")
    public String qzxcwePage()
    {
        return "product/product-sale";
    }
    @RequestMapping("/p7.ado")
    public String qwasdePage()
    {
        return "product/product-stock";
    }


    @RequestMapping("/s1.ado")
    public String qwadascPage()
    {
        return "sales/sales-analysis";
    }
    @RequestMapping("/s2.ado")
    public String qwadcascascPage()
    {
        return "sales/sales-overview";
    }


    @RequestMapping("/ss1.ado")
    public String zxcPage()
    {
        return "shoppingmall/shoppingmall-faq-list";
    }
    @RequestMapping("/ss2.ado")
    public String zxcxcPage()
    {
        return "shoppingmall/shoppingmall-faq-read";
    }
    @RequestMapping("/ss3.ado")
    public String zxcsacPage()
    {
        return "shoppingmall/shoppingmall-faq-write";
    }
    @RequestMapping("/ss4.ado")
    public String zxcdcPage()
    {
        return "shoppingmall/shoppingmall-notice-list";
    }
    @RequestMapping("/ss5.ado")
    public String zxzxcPage()
    {
        return "shoppingmall/shoppingmall-notice-read";
    }
    @RequestMapping("/ss6.ado")
    public String zxcqwePage()
    {
        return "shoppingmall/shoppingmall-notice-write";
    }
    @RequestMapping("/ss7.ado")
    public String zxcecPage()
    {
        return "shoppingmall/shoppingmall-qna-list";
    }
    @RequestMapping("/ss8.ado")
    public String zxvfcPage()
    {
        return "shoppingmall/shoppingmall-qna-read";
    }
    @RequestMapping("/ss9.ado")
    public String zxgfcPage()
    {
        return "shoppingmall/shoppingmall-qna-write";
    }


}
