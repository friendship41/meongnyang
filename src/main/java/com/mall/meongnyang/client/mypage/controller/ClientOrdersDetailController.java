package com.mall.meongnyang.client.mypage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mall.meongnyang.client.mypage.service.ClientSelectOrderDetailService;
import com.mall.meongnyang.client.mypage.vo.ClientOrdersDetailVO;

@Controller
public class ClientOrdersDetailController {

	@Autowired
	private ClientSelectOrderDetailService selectOrderDetailService;
	
	@RequestMapping("/orderRead.do")
	public String orderDetail(ClientOrdersDetailVO clientOrdersDetailVO, Model model) {
		
		List<ClientOrdersDetailVO> detailList = selectOrderDetailService.selectOrderDetail(clientOrdersDetailVO);
		
		model.addAttribute("detailList", detailList);
		return "mypage/order-read";
	}
}
