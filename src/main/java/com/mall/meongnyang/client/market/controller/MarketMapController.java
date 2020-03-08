package com.mall.meongnyang.client.market.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.client.mypage.service.ClientSelectMyinfoAddressListService;
import com.mall.meongnyang.client.mypage.vo.ClientCmAddressVO;

@Controller
public class MarketMapController {
	
	@Autowired
	private ClientSelectMyinfoAddressListService addressListService;
	
	@RequestMapping("/marketMap.do")
	public String viewMarketMap(HttpSession session, Model model) {
		
		ClientCustomerVO vo = (ClientCustomerVO) session.getAttribute("customer");
		ClientCmAddressVO clientCmAddressVO = new ClientCmAddressVO();
		clientCmAddressVO.setCustomerTbNo(vo.getCustomerTbNo());
		
		model.addAttribute("addressList", addressListService.selectMyinfoAddressList(clientCmAddressVO));
		
		return "market/market-map";
	}

}
