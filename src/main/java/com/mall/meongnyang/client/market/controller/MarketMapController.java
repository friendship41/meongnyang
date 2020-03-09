package com.mall.meongnyang.client.market.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mall.meongnyang.client.market.service.SelectMarketMapListService;
import com.mall.meongnyang.client.market.vo.MarketMapVO;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.client.mypage.service.ClientSelectMyinfoAddressListService;
import com.mall.meongnyang.client.mypage.vo.ClientCmAddressVO;

@Controller
public class MarketMapController {

	@Autowired
	private ClientSelectMyinfoAddressListService addressListService;

	@Autowired
	private SelectMarketMapListService marketMapListService;

	@RequestMapping("/marketMap.do")
	public String viewMarketMap(HttpSession session, Model model) {

		ClientCustomerVO vo = (ClientCustomerVO) session.getAttribute("customer");
		ClientCmAddressVO clientCmAddressVO = new ClientCmAddressVO();
		clientCmAddressVO.setCustomerTbNo(vo.getCustomerTbNo());
		
		MarketMapVO marketMapVO = new MarketMapVO();
		marketMapVO.setCustomerTbNo(vo.getCustomerTbNo());

		List<MarketMapVO> mapList = marketMapListService.selectMarketMap(marketMapVO);

		model.addAttribute("addressList", addressListService.selectMyinfoAddressList(clientCmAddressVO));
		model.addAttribute("mapList", mapList);

		return "market/market-map";
	}
}
