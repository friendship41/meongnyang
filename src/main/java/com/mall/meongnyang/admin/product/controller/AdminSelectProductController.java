package com.mall.meongnyang.admin.product.controller;

import com.mall.meongnyang.admin.product.service.AdminSelectProductOrderOverviewService;
import com.mall.meongnyang.admin.product.service.AdminSelectProductOverviewListService;
import com.mall.meongnyang.admin.product.service.AdminSelectProductSaleOverviewListService;
import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;
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
    @Autowired
    private AdminSelectProductSaleOverviewListService adminSelectProductSaleOverviewListService;
    @Autowired
    private AdminSelectProductOrderOverviewService adminSelectProductOrderOverviewService;

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

    @RequestMapping(value = "/productSaleOverviewAjax.ado", method = RequestMethod.GET)
    @ResponseBody
    public List<AdminProductSaleVO> getProductSaleOverviewAjax(AdminProductSaleVO adminProductSaleVO)
    {
        List<AdminProductSaleVO> productSaleList = adminSelectProductSaleOverviewListService.selectProductSaleOverview(adminProductSaleVO);
        return productSaleList;
    }

    @RequestMapping(value = "/productOrderOverviewAjax.ado", method = RequestMethod.GET)
    @ResponseBody
    public List<ClientProductOrderVO> getProductOrderOverviewAjax(ClientProductOrderVO clientProductOrderVO)
    {
        List<ClientProductOrderVO> productOrderList =adminSelectProductOrderOverviewService.selectProductOrderList(clientProductOrderVO);
        return productOrderList;
    }

}
