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
}
