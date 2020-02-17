package com.mall.meongnyang.client.shopping.controller;

import com.mall.meongnyang.admin.product.vo.AdminProductCategoryVO;
import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import com.mall.meongnyang.client.shopping.service.ClientSelectShoppingListService;
import com.mall.meongnyang.client.shopping.service.ClientSelectShoppingProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ClientSelectShoppingController
{
    @Autowired
    private ClientSelectShoppingProductCategoryService clientSelectProductCategoryService;
    @Autowired
    private ClientSelectShoppingListService clientSelectShoppingListService;

    @RequestMapping(value = "/shopping.do", method = RequestMethod.GET)
    public String goToShoppingPage(AdminProductCategoryVO adminProductCategoryVO, Model model)
    {
        System.out.println(adminProductCategoryVO);
        List<AdminProductCategoryVO> categoryList = clientSelectProductCategoryService.getSelectedProductCategory(adminProductCategoryVO);
        System.out.println(categoryList);
        model.addAttribute("categoryList", categoryList);

        AdminProductVO adminProductVO = new AdminProductVO();
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
}
