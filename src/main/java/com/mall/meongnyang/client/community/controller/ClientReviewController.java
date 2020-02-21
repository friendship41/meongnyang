package com.mall.meongnyang.client.community.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mall.meongnyang.client.community.service.ClientDeleteReviewService;
import com.mall.meongnyang.client.community.service.ClientInsertReviewService;
import com.mall.meongnyang.client.community.vo.ClientReviewVO;

@Controller
public class ClientReviewController {

	@Autowired
	private ClientInsertReviewService insertReviewService;
	
	@Autowired
	private ClientDeleteReviewService deleteReviewService;
	
	@RequestMapping(value = "/insertReview.do", method = RequestMethod.POST)
	@ResponseBody
	public String insertReview(ClientReviewVO clientReviewVO, HttpServletRequest request) {
		
		int cntProduct = insertReviewService.selectCount(clientReviewVO);
		
		String result = "";
		
		if(cntProduct > 0) {			
			insertReviewService.insertReview(clientReviewVO, request);
			result = "reviewInsertSuccess";
		} else if(cntProduct == 0) {
			result = "reviewInsertFail";
		}
		
		return result;
	}
	
	@RequestMapping("/deleteReview.do")
	@ResponseBody
	public String deleteReview(ClientReviewVO clientReviewVO) {
		
		deleteReviewService.deleteReview(clientReviewVO);
		
		return "deleteSuccess";
	}
}
