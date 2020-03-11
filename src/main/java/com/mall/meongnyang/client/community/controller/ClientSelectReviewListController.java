package com.mall.meongnyang.client.community.controller;

import com.mall.meongnyang.client.community.service.ClientSelectReviewListService;
import com.mall.meongnyang.client.community.vo.ClientReviewVO;
import com.mall.meongnyang.client.community.vo.ReviewPaging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ClientSelectReviewListController {

	@Autowired
	private ClientSelectReviewListService selectReviewListService;
	
	@RequestMapping("/reviewList.do")
	public String reviewList(@RequestParam(defaultValue = "1") int currentPage, ClientReviewVO clientReviewVO, Model model) {		
		
		ReviewPaging paging = new ReviewPaging(currentPage);
		paging.creatPage(selectReviewListService.selectReveiwCount(clientReviewVO));
		
		clientReviewVO.setStartRow(paging.getStartRow());
		clientReviewVO.setEndRow(paging.getEndRow());
		
		model.addAttribute("reviewList", selectReviewListService.selectReviewList(clientReviewVO));
		model.addAttribute("page", paging);
		model.addAttribute("currentage", currentPage);
		
		return "community/review-list";
	}
	
	@RequestMapping("/productReviewList.do")
	@ResponseBody
	public Map<String, Object> productReview(@RequestParam(defaultValue = "1") int currentPage, ClientReviewVO clientReviewVO) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		ReviewPaging paging = new ReviewPaging(currentPage);
		paging.creatPage(selectReviewListService.selectReveiwCount(clientReviewVO));
		
//		System.out.println("시작" + paging.getStartRow());
//		System.out.println("끝 " + paging.getEndRow());
		
		clientReviewVO.setStartRow(paging.getStartRow());
		clientReviewVO.setEndRow(paging.getEndRow());
			
		resultMap.put("reviewList", selectReviewListService.selectReviewList(clientReviewVO));
		resultMap.put("reviewCount", selectReviewListService.selectReveiwCount(clientReviewVO));
		resultMap.put("page", paging);
		
		return resultMap;
	}
	
}
