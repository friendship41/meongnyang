package com.mall.meongnyang.admin.product.controller;

import com.mall.meongnyang.admin.product.service.AdminSelectProductOverviewListService;
import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AdminSelectProductController
{
    @Autowired
    private AdminSelectProductOverviewListService adminSelectProductOverviewListService;

    @RequestMapping(value = "productOverview.ado", method = RequestMethod.GET)
    public String goToProductOverviewPage()
    {
        return "product/product-overview";
    }

    @RequestMapping(value = "/productAllTableAjax.ado", method = RequestMethod.GET)
    @ResponseBody
    public List<AdminProductVO> getProductAllTableAjax(AdminProductVO adminProductVO)
    {
        return adminSelectProductOverviewListService.selectProductOverviewList(adminProductVO);
    }



}
