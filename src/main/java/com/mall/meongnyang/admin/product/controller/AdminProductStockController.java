package com.mall.meongnyang.admin.product.controller;

import com.mall.meongnyang.admin.product.service.AdminSelectProductExpireDateService;
import com.mall.meongnyang.admin.product.service.AdminSelectProductStockListService;
import com.mall.meongnyang.admin.product.service.AdminUpdateProductSaleService;
import com.mall.meongnyang.admin.product.service.AdminUpdateProductStockService;
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
    @Autowired
    private AdminSelectProductExpireDateService adminSelectProductExpireDateService;
    @Autowired
    private AdminUpdateProductStockService adminUpdateProductStockService;
    @Autowired
    private AdminUpdateProductSaleService adminUpdateProductSaleService;

    @RequestMapping(value = "/productStock.ado", method = RequestMethod.GET)
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


    @RequestMapping(value = "/productExpireListAjax.ado", method = RequestMethod.GET)
    @ResponseBody
    public List<AdminProductSaleVO> getProductExpireDateListAjax(AdminProductSaleVO adminProductSaleVO)
    {
        return adminSelectProductExpireDateService.selectProductExpireDate(adminProductSaleVO);
    }

    @RequestMapping(value = "/updateProductStockAjax.ado", method = RequestMethod.GET)
    @ResponseBody
    public String updateProductStockAjax(AdminProductSaleVO adminProductSaleVO)
    {
        return adminUpdateProductStockService.updateProductStock(adminProductSaleVO);
    }

    @RequestMapping(value = "/stopSaleProductAjax.ado", method = RequestMethod.GET)
    @ResponseBody
    public String stopSaleProductAjax(AdminProductSaleVO adminProductSaleVO)
    {
        adminUpdateProductSaleService.stopSale(adminProductSaleVO);
        return "{\"pdSaleTbNo\":\""+adminProductSaleVO.getPdSaleTbNo()+"\"}";
    }

}
