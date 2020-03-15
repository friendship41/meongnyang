package com.mall.meongnyang.client.mypage.controller;

import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import com.mall.meongnyang.client.mypage.vo.ClientWishlistVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ClientWishlistToCartController {

	@RequestMapping(value = "/addWishlistToCartAjax.do", method = RequestMethod.GET)
	@ResponseBody
	public ClientWishlistVO addWishlistToCartAjax(ClientWishlistVO clientWishlistVO, HttpSession session) {
	    AdminProductSaleVO adminProductSaleVO = new AdminProductSaleVO();
	    adminProductSaleVO.setProductTbCode(clientWishlistVO.getProductTbCode());
	    adminProductSaleVO.setPdSaleTbProductName(clientWishlistVO.getPdSaleTbProductName());
	    adminProductSaleVO.setPdSaleTbSalesPrice(clientWishlistVO.getPdSaleTbSalesPrice());
	    adminProductSaleVO.setOrdersDetialTbAmount(clientWishlistVO.getOrdersDetialTbAmount());
	    adminProductSaleVO.setCartImage(clientWishlistVO.getCartImage());


		List<AdminProductSaleVO> cartList = (List<AdminProductSaleVO>) session.getAttribute("cartList");

		if (cartList == null) {
			cartList = new ArrayList<>();
		}
		cartList.add(adminProductSaleVO);
		session.setAttribute("cartList", cartList);

		return clientWishlistVO;
	}
}