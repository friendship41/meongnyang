package com.mall.meongnyang.admin.product.controller;

import com.mall.meongnyang.admin.product.service.AdminSelectOrderStateListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminDeliveryProductController
{
    @Autowired
    private AdminSelectOrderStateListService adminSelectOrderStateListService;

    @RequestMapping(value = "/productProcess.ado", method = RequestMethod.GET)
    public String goToProductProcessPage(Model model)
    {
        model.addAttribute("orderList",adminSelectOrderStateListService.selectOrderStateList());

        return "product/product-deliveryTemp";
    }
}
