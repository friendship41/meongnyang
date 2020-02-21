package com.mall.meongnyang.client.shopping.controller;

import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ClientCartController
{
    @RequestMapping(value = "/addCartAjax.do", method = RequestMethod.GET)
    @ResponseBody
    public AdminProductSaleVO addCartAjax(HttpSession session, AdminProductSaleVO adminProductSaleVO)
    {
        List<AdminProductSaleVO> cartList = (List<AdminProductSaleVO>)session.getAttribute("cartList");
        if(cartList == null)
        {
            cartList = new ArrayList<>();
        }

        cartList.add(adminProductSaleVO);
        session.setAttribute("cartList", cartList);

        return adminProductSaleVO;
    }

    @RequestMapping(value = "/removeCartAjax.do", method = RequestMethod.GET)
    @ResponseBody
    public AdminProductSaleVO removeCartAjax(HttpSession session, AdminProductSaleVO adminProductSaleVO)
    {
        List<AdminProductSaleVO> cartList = (List<AdminProductSaleVO>)session.getAttribute("cartList");
        if(cartList != null)
        {
            for(AdminProductSaleVO item : cartList)
            {
                if(item.getProductTbCode().equals(adminProductSaleVO.getProductTbCode()))
                {
                    cartList.remove(item);
                    return item;
                }
            }
        }
        return null;
    }
}
