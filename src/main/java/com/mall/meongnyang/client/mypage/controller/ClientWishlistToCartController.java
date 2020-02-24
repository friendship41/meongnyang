package com.mall.meongnyang.client.mypage.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import com.mall.meongnyang.client.mypage.vo.ClientWishlistVO;

@Controller
public class ClientWishlistToCartController {

	@RequestMapping(value = "/addWishlistToCartAjax.do", method = RequestMethod.GET)
	@ResponseBody
	public ClientWishlistVO addWishlistToCartAjax(ClientWishlistVO clientWishlistVO, HttpSession session) {

		List<ClientWishlistVO> cartList = (List<ClientWishlistVO>) session.getAttribute("cartList");

		if (cartList == null) {
			cartList = new ArrayList<>();
		}
		cartList.add(clientWishlistVO);
		session.setAttribute("cartList", cartList);

		return clientWishlistVO;
	}
	
	@RequestMapping(value = "/removeCartAjax.do", method = RequestMethod.POST)
    @ResponseBody
    public ClientWishlistVO removeCartAjax(HttpSession session, ClientWishlistVO clientWishlistVO){
        List<ClientWishlistVO> cartList = (List<ClientWishlistVO>)session.getAttribute("cartList");
        if(cartList != null){
            for(ClientWishlistVO item : cartList){
                if(item.getProductTbCode().equals(clientWishlistVO.getProductTbCode())){
                    cartList.remove(item);
                    return item;
                }
            }
        }
        return null;
    }
}