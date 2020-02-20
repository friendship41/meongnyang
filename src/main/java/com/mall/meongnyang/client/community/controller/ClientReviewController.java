package com.mall.meongnyang.client.community.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mall.meongnyang.client.community.service.ClientInsertReviewService;
import com.mall.meongnyang.client.community.vo.ClientReviewVO;

@Controller
public class ClientReviewController {

	@Autowired
	private ClientInsertReviewService insertReviewService;
	
	@RequestMapping(value = "/insertReview.do", method = RequestMethod.POST)
	public String insertReview(@RequestBody ClientReviewVO clientReviewVO, HttpServletRequest request) {
		
		insertReviewService.insertReview(clientReviewVO, request);
		
		return "reviewInsertSuccess";
	}
}
