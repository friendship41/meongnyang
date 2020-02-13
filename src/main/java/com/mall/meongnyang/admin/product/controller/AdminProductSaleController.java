package com.mall.meongnyang.admin.product.controller;

import com.mall.meongnyang.admin.marketing.service.AdminSelectPromotionListService;
import com.mall.meongnyang.admin.marketing.service.AdminSelectPromotionService;
import com.mall.meongnyang.admin.marketing.vo.AdminPromotionVO;
import com.mall.meongnyang.admin.product.service.AdminInsertProductSaleService;
import com.mall.meongnyang.admin.product.service.AdminSelectProductService;
import com.mall.meongnyang.admin.product.service.AdminUpdateProductSaleService;
import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AdminProductSaleController
{
    @Autowired
    private AdminSelectProductService adminSelectProductService;
    @Autowired
    private AdminSelectPromotionListService adminSelectPromotionListService;
    @Autowired
    private AdminSelectPromotionService adminSelectPromotionService;
    @Autowired
    private AdminInsertProductSaleService adminInsertProductSaleService;
    @Autowired
    private AdminUpdateProductSaleService adminUpdateProductSaleService;

    @RequestMapping(value = "/insertProductSale.ado", method = RequestMethod.GET)
    public String insertProductSalePage(AdminProductVO adminProductVO, Model model)
    {
        AdminProductVO product = adminSelectProductService.selectSingleProduct(adminProductVO);
        model.addAttribute("product", product);

        List<AdminPromotionVO> promotionList = adminSelectPromotionListService.selectPromotionList();
        model.addAttribute("promotionList", promotionList);

        return "product/product-sale";
    }

    @RequestMapping(value = "/promotionSelectAjax.ado")
    @ResponseBody
    public AdminPromotionVO getSinglePromotionAjax(AdminPromotionVO adminPromotionVO)
    {
        return adminSelectPromotionService.selectPromotion(adminPromotionVO.getPromotionTbCode());
    }

    @RequestMapping(value = "/insertProductSale.ado", method = RequestMethod.POST)
    public String insertProductSaleProc(AdminProductSaleVO adminProductSaleVO)
    {
        System.out.println(adminProductSaleVO);
        adminInsertProductSaleService.insertProductSale(adminProductSaleVO);
        return "redirect:/product-overview.ado";
    }

    @RequestMapping(value = "/stopSaleProduct.ado", method = RequestMethod.GET)
    public String stopSaleProduct(AdminProductSaleVO adminProductSaleVO)
    {
        adminUpdateProductSaleService.stopSale(adminProductSaleVO);
        return "redirect:product-overview.ado";
    }
}
