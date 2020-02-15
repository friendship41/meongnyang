package com.mall.meongnyang.admin.product.controller;

import com.mall.meongnyang.admin.product.service.AdminSelectProductStockListService;
import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AdminProductStockController
{
    @Autowired
    private AdminSelectProductStockListService adminSelectProductStockListService;

    @RequestMapping(value = "productStock.ado", method = RequestMethod.GET)
    public String goToProductStockPage()
    {
        return "product/product-stock";
    }

    @RequestMapping(value = "/productStockListAjax.ado", method = RequestMethod.GET)
    @ResponseBody
    public List<AdminProductSaleVO> getProductStockListAjax(AdminProductSaleVO adminProductSaleVO)
    {
        return adminSelectProductStockListService.selectProductStockList(adminProductSaleVO);
    }



}
