package com.mall.meongnyang.client.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mall.meongnyang.client.community.service.ClientSelectReviewListService;
import com.mall.meongnyang.client.community.vo.ClientReviewVO;

@Controller
public class ClientSelectReviewListController {

	@Autowired
	private ClientSelectReviewListService selectReviewListService;
	
	@RequestMapping("/reviewList.do")
	public String reviewList(ClientReviewVO clientReviewVO, Model model) {		
		
		model.addAttribute("reviewList", selectReviewListService.selectReviewList(clientReviewVO));
		
		return "community/review-list";
	}
}
