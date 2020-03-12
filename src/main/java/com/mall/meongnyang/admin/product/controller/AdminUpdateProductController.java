package com.mall.meongnyang.admin.product.controller;

import com.mall.meongnyang.admin.product.service.AdminSelectProductCategoryListService;
import com.mall.meongnyang.admin.product.service.AdminSelectProductService;
import com.mall.meongnyang.admin.product.service.AdminUpdateProductBannerStateService;
import com.mall.meongnyang.admin.product.service.AdminUpdateProductService;
import com.mall.meongnyang.admin.product.vo.AdminProductCategoryVO;
import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class AdminUpdateProductController
{
    @Autowired
    private AdminSelectProductService adminSelectProductService;
    @Autowired
    private AdminSelectProductCategoryListService adminSelectProductCategoryListService;
    @Autowired
    private AdminUpdateProductService adminUpdateProductService;
    @Autowired
    private AdminUpdateProductBannerStateService adminUpdateProductBannerStateService;

    @RequestMapping(value = "updateProduct.ado", method = RequestMethod.GET)
    public String updateProduct(AdminProductVO adminProductVO, Model model)
    {
        AdminProductVO product = adminSelectProductService.selectSingleProduct(adminProductVO);
        model.addAttribute("product", product);
        List<AdminProductCategoryVO> categoryList = adminSelectProductCategoryListService.selectCategoryList(new AdminProductCategoryVO());
        model.addAttribute("categoryList", categoryList);
        return "product/product-mod";
    }

    @RequestMapping(value = "/updateProduct.ado", method = RequestMethod.POST)
    public String updateProduct(AdminProductVO adminProductVO, HttpServletRequest request)
    {
        adminUpdateProductService.updateProduct(adminProductVO, request);
        return "redirect:productOverview.ado";
    }

    @RequestMapping(value = "/updateProductBannerStateAjax.ado", method = RequestMethod.GET)
    @ResponseBody
    public AdminProductVO updateProductBannerStateAjax(AdminProductVO adminProductVO)
    {
        adminUpdateProductBannerStateService.updateProductBannerState(adminProductVO);
        return adminProductVO;
    }
}
