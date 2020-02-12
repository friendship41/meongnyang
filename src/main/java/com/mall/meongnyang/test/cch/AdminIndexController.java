package com.mall.meongnyang.test.cch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminIndexController
{
    @RequestMapping("/index.tdo")
    public String indexPage()
    {
        return "admin/index";
    }

    @RequestMapping("/login.tdo")
    public String loginPage()
    {
        return "admin/admin-page/login";
    }

    @RequestMapping("/promotionOverview.tdo")
    public String promotionOverviewPage()
    {
        return "admin/marketing/promotion-overview";
    }

    @RequestMapping("/promotionRead.tdo")
    public String promotionReadPage()
    {
        return "admin/marketing/promotion-read";
    }

    @RequestMapping("/promotionWrite.tdo")
    public String promotionWritePage()
    {
        return "admin/marketing/promotion-write";
    }

    @RequestMapping("/memberManage.tdo")
    public String memberManagePage()
    {
        return "admin/member/member-manage";
    }

    @RequestMapping("/memberOverview.tdo")
    public String memberOverviewPage()
    {
        return "admin/member/member-overview";
    }

    @RequestMapping("/termManage.tdo")
    public String termManagePage()
    {
        return "admin/member/term-manage";
    }

    @RequestMapping("/termWrite.tdo")
    public String termWritePage()
    {
        return "admin/member/term-write";
    }


    @RequestMapping("/p1.tdo")
    public String qwePage()
    {
        return "admin/product/product-add";
    }
    @RequestMapping("/p2.tdo")
    public String qdqwdePage()
    {
        return "admin/product/product-analysis";
    }
    @RequestMapping("/p3.tdo")
    public String qwqwdqePage()
    {
        return "admin/product/product-category-add";
    }
    @RequestMapping("/p4.tdo")
    public String qwqqdwdqePage()
    {
        return "admin/product/product-image-add";
    }
    @RequestMapping("/p5.tdo")
    public String qwqdaePage()
    {
        return "admin/product/product-overview";
    }
    @RequestMapping("/p6.tdo")
    public String qzxcwePage()
    {
        return "admin/product/product-sale";
    }
    @RequestMapping("/p7.tdo")
    public String qwasdePage()
    {
        return "admin/product/product-stock";
    }


    @RequestMapping("/s1.tdo")
    public String qwadascPage()
    {
        return "admin/sales/sales-analysis";
    }
    @RequestMapping("/s2.tdo")
    public String qwadcascascPage()
    {
        return "admin/sales/sales-overview";
    }


    @RequestMapping("/ss1.tdo")
    public String zxcPage()
    {
        return "admin/shoppingmall/shoppingmall-faq-list";
    }
    @RequestMapping("/ss2.tdo")
    public String zxcxcPage()
    {
        return "admin/shoppingmall/shoppingmall-faq-read";
    }
    @RequestMapping("/ss3.tdo")
    public String zxcsacPage()
    {
        return "admin/shoppingmall/shoppingmall-faq-write";
    }
    @RequestMapping("/ss4.tdo")
    public String zxcdcPage()
    {
        return "admin/shoppingmall/shoppingmall-notice-list";
    }
    @RequestMapping("/ss5.tdo")
    public String zxzxcPage()
    {
        return "admin/shoppingmall/shoppingmall-notice-read";
    }
    @RequestMapping("/ss6.tdo")
    public String zxcqwePage()
    {
        return "admin/shoppingmall/shoppingmall-notice-write";
    }
    @RequestMapping("/ss7.tdo")
    public String zxcecPage()
    {
        return "admin/shoppingmall/shoppingmall-qna-list";
    }
    @RequestMapping("/ss8.tdo")
    public String zxvfcPage()
    {
        return "admin/shoppingmall/shoppingmall-qna-read";
    }
    @RequestMapping("/ss9.tdo")
    public String zxgfcPage()
    {
        return "admin/shoppingmall/shoppingmall-qna-write";
    }


}
