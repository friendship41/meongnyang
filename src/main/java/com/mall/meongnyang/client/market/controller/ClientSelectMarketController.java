package com.mall.meongnyang.client.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mall.meongnyang.client.market.service.ClientSelectMarketCommentListService;
import com.mall.meongnyang.client.market.service.ClientSelectMarketService;
import com.mall.meongnyang.client.market.vo.ClientMarketCommentVO;
import com.mall.meongnyang.client.market.vo.ClientMarketVO;

@Controller
public class ClientSelectMarketController {

	@Autowired
	private ClientSelectMarketService clientSelectMarketService;
	
	@Autowired
	private ClientSelectMarketCommentListService commentListService;
	
	@RequestMapping("/market-read.do")
	public String marketRead(ClientMarketVO clientMarket,
							ClientMarketCommentVO clientMarketComment, Model model) {
		model.addAttribute("commentList", commentListService.selectCommentList(clientMarketComment));
		model.addAttribute("market", clientSelectMarketService.selectMarket(clientMarket));
		model.addAttribute("commentCnt", commentListService.selectCommentCount(clientMarketComment));
		return "market/market-read";
	}
	
	
}
