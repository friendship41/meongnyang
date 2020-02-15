package com.mall.meongnyang.admin.product.controller;

import com.mall.meongnyang.admin.product.service.AdminInsertProductService;
import com.mall.meongnyang.admin.product.service.AdminSelectProductCategoryListService;
import com.mall.meongnyang.admin.product.vo.AdminProductCategoryVO;
import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class AdminInsertProductController
{
    @Autowired
    private AdminSelectProductCategoryListService adminSelectProductCategoryListService;
    @Autowired
    private AdminInsertProductService adminInsertProductService;

    @RequestMapping(value = "/product-add-page.ado", method = RequestMethod.GET)
    public String gotoProductAddPage(Model model)
    {
        List<AdminProductCategoryVO> categoryList = adminSelectProductCategoryListService.selectCategoryList(new AdminProductCategoryVO());
        model.addAttribute("categoryList", categoryList);
        return "product/product-add";
    }
    @RequestMapping(value = "/productAdd.ado", method = RequestMethod.POST)
    public String insertProduct(AdminProductVO adminProductVO, HttpServletRequest request)
    {
        adminInsertProductService.insertProduct(adminProductVO, request);
        return "redirect:product/product-overview";
    }
}
