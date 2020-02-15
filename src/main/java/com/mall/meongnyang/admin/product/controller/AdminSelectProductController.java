package com.mall.meongnyang.admin.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminSelectProductController
{
    @RequestMapping(value = "productOverview.ado", method = RequestMethod.GET)
    public String goToProductOverviewPage()
    {


        return "product/product-overview";
    }



}
