package com.mall.meongnyang.client.community.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@RequestMapping("/productReviewList.do")
	@ResponseBody
	public Map<String, Object> productReview(ClientReviewVO clientReviewVO) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
			
		resultMap.put("reviewList", selectReviewListService.selectReviewList(clientReviewVO));
		resultMap.put("reviewCount", selectReviewListService.selectReveiwCount(clientReviewVO));
		
		return resultMap;
	}
	
}
