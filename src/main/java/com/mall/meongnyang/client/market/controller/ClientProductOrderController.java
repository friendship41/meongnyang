package com.mall.meongnyang.client.market.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.client.mypage.service.ClientSelectProductOrderListService;
import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;
import com.mall.meongnyang.client.mypage.vo.OrderPaging;

@Controller
public class ClientProductOrderController {
	
	@Autowired
	private ClientSelectProductOrderListService orderListService;
	
	@RequestMapping("/orderList.do")
	public String selectOrderList(@RequestParam(defaultValue = "1") int currentPage, HttpSession session,
			ClientProductOrderVO clientProductOrderVO, Model model) {
		
		ClientCustomerVO vo = null;
		if(session.getAttribute("customer") != null) {
			vo = (ClientCustomerVO) session.getAttribute("customer");			
			clientProductOrderVO.setCustomerTbNo(vo.getCustomerTbNo());
		}
		
		OrderPaging page = new OrderPaging(currentPage);
		page.createPage(orderListService.selectOrderCount(clientProductOrderVO));
		
		clientProductOrderVO.setStartRow(page.getStartRow());
		clientProductOrderVO.setEndRow(page.getEndRow());
		
		List<ClientProductOrderVO> orderList = orderListService.selectProductOrderList(clientProductOrderVO);
	
		model.addAttribute("page", page);
		model.addAttribute("orderList", orderList);
		
		return "mypage/order-list";
	}
}
