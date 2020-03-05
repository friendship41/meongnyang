package com.mall.meongnyang.admin.index.comtroller;

import com.mall.meongnyang.admin.index.service.AdminSelectDashboardStockListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController
{
    @Autowired
    private AdminSelectDashboardStockListService adminSelectDashboardStockListService;

    @RequestMapping("/index.ado")
    public String indexPage(Model model)
    {
        model.addAttribute("dashboardStockList", adminSelectDashboardStockListService.selectDashBoardProductStorkList());

        return "index";
    }
}
