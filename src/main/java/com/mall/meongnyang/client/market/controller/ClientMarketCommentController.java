package com.mall.meongnyang.client.market.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mall.meongnyang.client.market.service.ClientDeleteMarketCommentService;
import com.mall.meongnyang.client.market.service.ClientInsertMarketCommentService;
import com.mall.meongnyang.client.market.service.ClientSelectMarketCommentListService;
import com.mall.meongnyang.client.market.service.ClientUpdateMarketCommentService;
import com.mall.meongnyang.client.market.vo.ClientMarketCommentVO;

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
	public ResponseEntity<List<ClientMarketCommentVO>> commentList(ClientMarketCommentVO clientMarketComment) {
		ResponseEntity<List<ClientMarketCommentVO>> entity = null;
		
		try {
			entity = new ResponseEntity<>(commentListService.selectCommentList(clientMarketComment), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return entity;
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
