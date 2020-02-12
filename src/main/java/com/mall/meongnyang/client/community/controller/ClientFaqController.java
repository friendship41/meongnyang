package com.mall.meongnyang.client.community.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mall.meongnyang.client.community.service.ClientSelectFaqListService;
import com.mall.meongnyang.client.community.vo.ClientFaqVO;

@Controller
public class ClientFaqController {
	@Autowired
	private ClientSelectFaqListService clientSelectFaqListService;
	
	@RequestMapping(value="/faq.do", method = RequestMethod.GET)
	public String selectFaqList(Model model) {
		List<ClientFaqVO> faqList = clientSelectFaqListService.selectFaqList(new ClientFaqVO());
		model.addAttribute("faqList",faqList);
		return "community/faq";
	}
	
	
}
