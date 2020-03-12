package com.mall.meongnyang.admin.product.controller;

import com.mall.meongnyang.admin.product.service.AdminDeleteProductService;
import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminDeleteProductController
{
    @Autowired
    private AdminDeleteProductService adminDeleteProductService;

    @RequestMapping(value = "/deleteProduct.ado", method = RequestMethod.GET)
    public String deleteProductProc(AdminProductVO adminProductVO)
    {
        adminDeleteProductService.deleteProduct(adminProductVO);
        return "redirect:/productOverview.ado";
    }
}
