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


}
