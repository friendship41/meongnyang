package com.mall.meongnyang.admin.product.controller;

import com.mall.meongnyang.admin.product.service.*;
import com.mall.meongnyang.admin.product.vo.AdminProductCategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminProductCategoryController
{
    @Autowired
    private AdminInsertProductCategoryService adminInsertProductCategoryService;
    @Autowired
    private AdminUpdateProductCategoryService adminUpdateProductCategoryService;
    @Autowired
    private AdminDeleteProductCategoryService adminDeleteProductCategoryService;
    @Autowired
    private AdminSelectProductCategoryListService adminSelectProductCategoryListService;
    @Autowired
    private AdminSelectProductCategoryService adminSelectProductCategoryService;

    @RequestMapping(value = "/product-category-list.ado", method = RequestMethod.GET)
    public String categoryList(Model model)
    {
        model.addAttribute("productCategoryList", adminSelectProductCategoryListService.selectCategoryList(new AdminProductCategoryVO()));

        return "product/product-category-add";
    }
    @RequestMapping(value = "/product-category-single-ajax.ado", method = RequestMethod.GET)
    @ResponseBody
    public AdminProductCategoryVO categoryListAjax(AdminProductCategoryVO adminProductCategoryVO)
    {
        return adminSelectProductCategoryService.selectCategory(adminProductCategoryVO);
    }

    @RequestMapping(value = "/product-category-insert.ado", method = RequestMethod.POST)
    public String insertCategory(AdminProductCategoryVO adminProductCategoryVO)
    {
        adminInsertProductCategoryService.insertCategory(adminProductCategoryVO);

        return "redirect:product-category-list.ado";
    }

    @RequestMapping(value = "/product-category-update.ado", method = RequestMethod.POST)
    public String updateCategory(AdminProductCategoryVO adminProductCategoryVO)
    {
        adminUpdateProductCategoryService.updateCategory(adminProductCategoryVO);

        return "redirect:product-category-list.ado";
    }

    @RequestMapping(value = "/product-category-delete.ado", method = RequestMethod.GET)
    public String deleteCategory(AdminProductCategoryVO adminProductCategoryVO)
    {
        System.out.println(adminProductCategoryVO);

        adminDeleteProductCategoryService.deleteCategory(adminProductCategoryVO);

        return "redirect:product-category-list.ado";
    }
}
