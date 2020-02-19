package com.mall.meongnyang.client.mypage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mall.meongnyang.client.mypage.service.ClientDeleteWishlistService;
import com.mall.meongnyang.client.mypage.service.ClientSelectWishlistListService;
import com.mall.meongnyang.client.mypage.vo.ClientWishlistVO;

@Controller("clientWishlistController")
public class ClientWishlistController {
	
	@Autowired
	private ClientSelectWishlistListService clientSelectWishlistListService;
	@Autowired
	private ClientDeleteWishlistService clientDeleteWishlistService;
		
	@RequestMapping(value="/wishlist.do")
	public String selectWishlistList(ClientWishlistVO clientWishlistVO, Model model){
		List<ClientWishlistVO> wishlist = clientSelectWishlistListService.selectWishlistList(new ClientWishlistVO());
		model.addAttribute("wishlist", wishlist);		
		return "mypage/wishlist";
	}
	
	@RequestMapping(value="/wishlistDelete.do")
	public String deleteWishlist(ClientWishlistVO clientWishlistVO) {
		clientDeleteWishlistService.deleteWishlist(clientWishlistVO);		
		return "redirect:/wishlist.do";
	}
	
	
	
	
}
