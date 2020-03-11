package com.mall.meongnyang.admin.product.controller;

import com.mall.meongnyang.admin.marketing.service.AdminSelectPromotionListService;
import com.mall.meongnyang.admin.marketing.service.AdminSelectPromotionService;
import com.mall.meongnyang.admin.marketing.vo.AdminPromotionVO;
import com.mall.meongnyang.admin.product.service.*;
import com.mall.meongnyang.admin.product.vo.AdminProductImageVO;
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
    @Autowired
    private AdminSelectProductSaleService adminSelectProductSaleService;
    @Autowired
    private AdminSelectProductImageRepCountService adminSelectProductImageRepCountService;

    @RequestMapping(value = "/insertProductSale.ado", method = RequestMethod.GET)
    public String insertProductSalePage(AdminProductVO adminProductVO, Model model)
    {
        AdminProductImageVO adminProductImageVO = new AdminProductImageVO();
        adminProductImageVO.setProductTbCode(adminProductVO.getProductTbCode());
        if(adminSelectProductImageRepCountService.checkRepSetOrNot(adminProductImageVO))
        {
            model.addAttribute("repCheck", true);
        }
        else
        {
            model.addAttribute("repCheck", false);
        }

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
    public String insertProductSaleProc(AdminProductSaleVO adminProductSaleVO, Model model)
    {
        adminProductSaleVO.setPdSaleTbRemainingAmount(adminProductSaleVO.getPdSaleTbReceivedAmount());
        adminInsertProductSaleService.insertProductSale(adminProductSaleVO);
        if(adminProductSaleVO.getInsertMore().equalsIgnoreCase("t"))
        {
            model.addAttribute("repCheck", true);

            AdminProductVO adminProductVO = new AdminProductVO();
            adminProductVO.setProductTbCode(adminProductSaleVO.getProductTbCode());
            AdminProductVO product = adminSelectProductService.selectSingleProduct(adminProductVO);
            model.addAttribute("product", product);

            List<AdminPromotionVO> promotionList = adminSelectPromotionListService.selectPromotionList();
            model.addAttribute("promotionList", promotionList);

            model.addAttribute("productSale", adminProductSaleVO);
            return "product/product-sale";
        }
        return "redirect:productOverview.ado";
    }

    @RequestMapping(value = "/restartSaleProduct.ado", method = RequestMethod.GET)
    public String restartSaleProductPage(AdminProductSaleVO adminProductSaleVO, Model model)
    {
        AdminProductSaleVO productSale = adminSelectProductSaleService.selectProductSale(adminProductSaleVO);
        model.addAttribute("productSale", productSale);

        List<AdminPromotionVO> promotionList = adminSelectPromotionListService.selectPromotionList();
        model.addAttribute("promotionList", promotionList);

        return "product/product-resale";
    }

    @RequestMapping(value = "/restartSaleProduct.ado", method = RequestMethod.POST)
    public String restartSaleProductProc(AdminProductSaleVO adminProductSaleVO)
    {
        System.out.println(adminProductSaleVO);
        adminUpdateProductSaleService.restartSale(adminProductSaleVO);
        return "redirect:productOverview.ado";
    }
}
