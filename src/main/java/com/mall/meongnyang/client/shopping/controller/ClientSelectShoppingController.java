package com.mall.meongnyang.client.shopping.controller;

import com.mall.meongnyang.admin.product.vo.AdminProductCategoryVO;
import com.mall.meongnyang.admin.product.vo.AdminProductImageVO;
import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import com.mall.meongnyang.client.shopping.service.ClientSelectShoppingDetailService;
import com.mall.meongnyang.client.shopping.service.ClientSelectShoppingListService;
import com.mall.meongnyang.client.shopping.service.ClientSelectShoppingProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Controller
public class ClientSelectShoppingController
{
    @Autowired
    private ClientSelectShoppingProductCategoryService clientSelectProductCategoryService;
    @Autowired
    private ClientSelectShoppingListService clientSelectShoppingListService;
    @Autowired
    private ClientSelectShoppingDetailService clientSelectShoppingDetailService;


    @RequestMapping(value = "/shopping.do", method = RequestMethod.GET)
    public String goToShoppingPage(AdminProductCategoryVO adminProductCategoryVO, AdminProductVO adminProductVO, Model model)
    {
        model.addAttribute("nowCategory",adminProductCategoryVO.getProductCategoryTbNo());

        List<AdminProductCategoryVO> categoryList = clientSelectProductCategoryService.getSelectedProductCategory(adminProductCategoryVO);
        model.addAttribute("categoryList", categoryList);

        adminProductVO.setProductCategoryTbNo(adminProductCategoryVO.getProductCategoryTbNo());
        List<AdminProductVO> productList = clientSelectShoppingListService.selectShoppingList(adminProductVO);
        int listSize = productList.size();
        if(listSize != 0)
        {
            adminProductVO = productList.get(listSize-1);
            productList.remove(listSize-1);
        }
        else
        {
            adminProductVO = productList.get(0);
            productList.remove(0);
        }
        model.addAttribute("pageInfo", adminProductVO);
        model.addAttribute("productList", productList);
        return "shopping/product-list";
    }

    @RequestMapping(value = "/shoppingDetail.do", method = RequestMethod.GET)
    public String goToShoppingProductDetail(AdminProductVO adminProductVO, Model model)
    {
        Map<String, Object> detailMap = clientSelectShoppingDetailService.selectProductDetail(adminProductVO);
        model.addAttribute("detail", (AdminProductVO)detailMap.get("detail"));
        model.addAttribute("imageList", (List<AdminProductImageVO>)detailMap.get("imageList"));
        model.addAttribute("saleList", (List<AdminProductSaleVO>)detailMap.get("saleList"));

        return "shopping/product-read";
    }
}
