package com.mall.meongnyang.admin.product.controller;

import com.mall.meongnyang.admin.product.service.*;
import com.mall.meongnyang.admin.product.vo.AdminProductImageVO;
import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class AdminProductImageController
{
    @Autowired
    private AdminInsertProductImageService adminInsertProductImageService;
    @Autowired
    private AdminSelectProductImageService adminSelectProductImageService;
    @Autowired
    private AdminDeleteProductImageService adminDeleteProductImageService;
    @Autowired
    private AdminUpdateProductImageService adminUpdateProductImageService;
    @Autowired
    private AdminSelectProductService adminSelectProductService;

    @RequestMapping("/productImageAdd.ado")
    public String goToImageAddPage(@RequestParam("productTbCode") String productCode, @RequestParam("resultMessage") String resultMessage, Model model)
    {
        AdminProductVO adminProductVO = new AdminProductVO();
        adminProductVO.setProductTbCode(productCode);
        AdminProductVO product = adminSelectProductService.selectSingleProduct(adminProductVO);
        model.addAttribute("product", product);

        if(resultMessage != null && !resultMessage.equals("none"))
        {
            model.addAttribute("resultMessage", resultMessage);
        }
        else
        {
            model.addAttribute("resultMessage", "none");
        }

        AdminProductImageVO adminProductImageVO = new AdminProductImageVO();
        adminProductImageVO.setProductTbCode(productCode);

        List<AdminProductImageVO> imageList = adminSelectProductImageService.selectProductImages(adminProductImageVO);
        model.addAttribute("productCode", productCode);
        model.addAttribute("productImageList", imageList);
        return "product/product-image-add";
    }

    @RequestMapping(value = "/productImageUpload.ado", method = RequestMethod.POST)
    public String imageUpload(AdminProductImageVO adminProductImageVO, HttpServletRequest request, RedirectAttributes redirectAttributesm)
    {
        AdminProductImageVO insertResult = adminInsertProductImageService.insertProductImageReturnImages(adminProductImageVO, request);

        redirectAttributesm.addAttribute("productTbCode", adminProductImageVO.getProductTbCode());

        if (insertResult == null)
        {
            redirectAttributesm.addAttribute("resultMessage", "moreThan3");
        }
        else
        {
            redirectAttributesm.addAttribute("resultMessage", "none");
        }

        return "redirect:/productImageAdd.ado";
    }

    @RequestMapping(value = "/productImageDelete.ado", method = RequestMethod.GET)
    @ResponseBody
    public String deleteProductImage(AdminProductImageVO adminProductImageVO)
    {
        return adminDeleteProductImageService.deleteProductImageReturnImages(adminProductImageVO);
    }

    @RequestMapping(value = "/productImageUpdateRep.ado", method = RequestMethod.GET)
    @ResponseBody
    public String updateProductImageRep(AdminProductImageVO adminProductImageVO)
    {
        return adminUpdateProductImageService.updateProductImageRep(adminProductImageVO);
    }
}
