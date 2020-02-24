package com.mall.meongnyang.client.mypage.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.client.mypage.service.ClientDeleteWishlistService;
import com.mall.meongnyang.client.mypage.service.ClientInsertWishlistService;
import com.mall.meongnyang.client.mypage.service.ClientSelectAdminProductSaleVOService;
import com.mall.meongnyang.client.mypage.service.ClientSelectWishlistListService;
import com.mall.meongnyang.client.mypage.vo.ClientWishlistVO;

@Controller("clientWishlistController")
public class ClientWishlistController {
	
	@Autowired
	private ClientSelectWishlistListService clientSelectWishlistListService;
	@Autowired
	private ClientDeleteWishlistService clientDeleteWishlistService;
	@Autowired
	private ClientInsertWishlistService clientInsertWishlistService;
	@Autowired
	private ClientSelectAdminProductSaleVOService clientSelectAdminProductSaleVOService;	
	
	
	@RequestMapping(value="/wishlistInsert.do")
	public String insertWishlist(@RequestParam("pdSaleTbSize") String pdSaleTbSize, @RequestParam("productTbCode") String productTbCode, @RequestParam("pdImageTbPath") String pdImageTbPath, AdminProductSaleVO adminProductSaleVO, AdminProductVO adminProductVO ,ClientWishlistVO clientWishlistVO, ClientCustomerVO clientCustomerVO, HttpSession session) {
			
		ClientCustomerVO tempVO = (ClientCustomerVO) session.getAttribute("customer");	
		clientWishlistVO.setCustomerTbNo(tempVO.getCustomerTbNo());
						
		adminProductSaleVO.setProductTbCode(productTbCode);
		adminProductSaleVO.setPdSaleTbSize(pdSaleTbSize);
		
		AdminProductSaleVO pdSaleVO = clientSelectAdminProductSaleVOService.selectAdminProductSaleVO(adminProductSaleVO);
		
		int pdSaleTbNo = pdSaleVO.getPdSaleTbNo();
		clientWishlistVO.setPdSaleTbNo(pdSaleTbNo);
		clientWishlistVO.setPdImageTbPath(pdImageTbPath);
		
		clientInsertWishlistService.insertWishlist(clientWishlistVO);
		
		return "redirect:/wishlistSelect.do";
	}
	
	@RequestMapping(value="/wishlistSelect.do")
	public String selectWishlistList(ClientWishlistVO clientWishlistVO, Model model, ClientCustomerVO clientCustomerVO, HttpSession session ){
		ClientCustomerVO tempVO = (ClientCustomerVO) session.getAttribute("customer");	
		clientWishlistVO.setCustomerTbNo(tempVO.getCustomerTbNo());	
		
		List<ClientWishlistVO> wishlist = clientSelectWishlistListService.selectWishlistList(clientWishlistVO);
		model.addAttribute("wishlist", wishlist);
			
		return "mypage/wishlist";
	}
	
	@RequestMapping(value="/wishlistDelete.do")
	public String deleteWishlist(ClientWishlistVO clientWishlistVO) {
		clientDeleteWishlistService.deleteWishlist(clientWishlistVO);		
		return "redirect:/wishlistSelect.do";
	}
	
	
	
	
}