package com.mall.meongnyang.admin.marketing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mall.meongnyang.admin.marketing.service.AdminDeletePromotionService;
import com.mall.meongnyang.admin.marketing.service.AdminInsertPromotionService;
import com.mall.meongnyang.admin.marketing.service.AdminSelectPromotionListService;
import com.mall.meongnyang.admin.marketing.service.AdminSelectPromotionService;
import com.mall.meongnyang.admin.marketing.vo.AdminPromotionVO;

@Controller
public class AdminPromotionController {
	
	@Autowired
	private AdminInsertPromotionService adminInsertPromotionService;
	@Autowired
	private AdminDeletePromotionService adminDeletePromotionService;
	@Autowired
	private AdminSelectPromotionService adminSelectPromotionService;
	@Autowired
	private AdminSelectPromotionListService	adminSelectPromotionListService;
	
	//리스트 불러오기
	@RequestMapping("/promotion-overview.ado")
	public String selectPromotionList(Model model) {
		
		List<AdminPromotionVO> promotionList =
		adminSelectPromotionListService.selectPromotionList();
		
		model.addAttribute("promotionList", promotionList);
		return "marketing/promotion-overview";
	}
	
	@RequestMapping("/promotion-read.ado")
	public String selectPromotion(AdminPromotionVO adminPromotionVO, Model model) {
		
		AdminPromotionVO adminPromotion = adminSelectPromotionService.selectPromotion(adminPromotionVO.getPromotionTbCode());
		List<AdminPromotionVO> productList = adminSelectPromotionService.selectPromotionAppliedProductList(adminPromotionVO);
		
		model.addAttribute("promotion", adminPromotion);
		model.addAttribute("promotionProductList", productList);
		
		return "marketing/promotion-read";
	}
	
	@RequestMapping(value = "/promotion-write.ado", method = RequestMethod.GET)
	public String promotionForm() {
		return "marketing/promotion-write";
	}
	
	@RequestMapping(value = "/promotion-write.ado", method = RequestMethod.POST)
	public String insertPromotion(AdminPromotionVO adminPromotionVO) {
		
		adminInsertPromotionService.insertPromotion(adminPromotionVO);
		
		return "redirect: promotion-overview.ado";
	}
	
	@RequestMapping("/deletePromotion.ado")
	public String deletePromotion(int promotionTbCode) {
		adminDeletePromotionService.deletePromotion(promotionTbCode);
		
		return "redirect: promotion-overview.ado";
		
	}
	
}
