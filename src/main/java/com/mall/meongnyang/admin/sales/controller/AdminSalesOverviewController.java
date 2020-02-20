package com.mall.meongnyang.admin.sales.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminSalesOverviewController {

	
	//일단임시 
    @RequestMapping(value="/salesOverview.ado")
    public String salesOverviewPage()
    {
        return "sales/sales-overview";
    }
}
