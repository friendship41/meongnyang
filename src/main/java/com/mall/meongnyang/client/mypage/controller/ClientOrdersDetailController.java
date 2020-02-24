package com.mall.meongnyang.client.mypage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mall.meongnyang.client.mypage.service.ClientSelectOrderDetailService;
import com.mall.meongnyang.client.mypage.service.ClientSelectProductOrderService;
import com.mall.meongnyang.client.mypage.vo.ClientOrdersDetailVO;
import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

@Controller
public class ClientOrdersDetailController {

	@Autowired
	private ClientSelectOrderDetailService selectOrderDetailService;
	
	@Autowired
	private ClientSelectProductOrderService clientSelectProductOrderService;
	
	@RequestMapping("/orderRead.do")
	public String orderDetail(ClientOrdersDetailVO clientOrdersDetailVO, Model model) {
		
		List<ClientOrdersDetailVO> detailList = selectOrderDetailService.selectOrderDetail(clientOrdersDetailVO);
		ClientProductOrderVO clientProductOrderVO = new ClientProductOrderVO();
		clientProductOrderVO.setPdOrderTbNo(clientOrdersDetailVO.getPdOrderTbNo());
		ClientProductOrderVO order = clientSelectProductOrderService.selectProductOrder(clientProductOrderVO);
		
		model.addAttribute("detailList", detailList);
		model.addAttribute("order", order);
		
		return "mypage/order-read";
	}
}
