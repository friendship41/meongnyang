package com.mall.meongnyang.client.market.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mall.meongnyang.client.market.service.ClientDeleteMarketCommentService;
import com.mall.meongnyang.client.market.service.ClientInsertMarketCommentService;
import com.mall.meongnyang.client.market.service.ClientSelectMarketCommentListService;
import com.mall.meongnyang.client.market.service.ClientUpdateMarketCommentService;
import com.mall.meongnyang.client.market.vo.ClientMarketCommentVO;
import com.mall.meongnyang.client.market.vo.MarketListPaging;

@Controller
public class ClientMarketCommentController {

	@Autowired
	private ClientInsertMarketCommentService clientInsertMarketCommentService;
	
	@Autowired
	private ClientSelectMarketCommentListService commentListService;
	
	@Autowired
	private ClientDeleteMarketCommentService deleteMarketCommentService;
	
	@Autowired
	private ClientUpdateMarketCommentService clientUpdateMarketCommentService;

	
	@RequestMapping("/commentList.do")
	@ResponseBody
	public Map<String, Object> commentList(@RequestParam(defaultValue = "1") int currentPage, ClientMarketCommentVO clientMarketCommentVO) {
		
		MarketListPaging paging = new MarketListPaging(currentPage);
		
		paging.setPageSize(10);
		paging.createPaging(commentListService.selectCommentCount(clientMarketCommentVO));
		
		clientMarketCommentVO.setStartRow(paging.getStartRow());
		clientMarketCommentVO.setEndRow(paging.getEndRow());		
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("comment", commentListService.selectCommentList(clientMarketCommentVO));
		map.put("paging", paging);
		
		return map;
	}	
	
	@RequestMapping("/insertComment.do")
	@ResponseBody
	public String insertComment(@RequestBody ClientMarketCommentVO clientMarketComment) {
		
		clientInsertMarketCommentService.insertComment(clientMarketComment);
		
		return "insertSuccess";
		
	}
	
	@RequestMapping("/insertReply.do")
	@ResponseBody
	public String insertReply(@RequestBody ClientMarketCommentVO clientMarketCommentVO) {
		
		clientInsertMarketCommentService.insertComment(clientMarketCommentVO);
		
		return "replyInsertSuccess";
		
	}
	
	@RequestMapping("/deleteReply.do")
	@ResponseBody
	public String deleteReply(@RequestBody ClientMarketCommentVO clientMarketCommentVO) {
		
		deleteMarketCommentService.deleteComment(clientMarketCommentVO);
		
		return "deleteSuccess";
	}

	
	@RequestMapping("/updateReply.do")
	@ResponseBody
	public String updateReply(@RequestBody ClientMarketCommentVO clientMarketCommentVO) {
		
		clientUpdateMarketCommentService.updateComment(clientMarketCommentVO);
		
		return "updateSuccess";
	}
}
