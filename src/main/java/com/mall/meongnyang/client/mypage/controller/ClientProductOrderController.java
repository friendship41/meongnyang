package com.mall.meongnyang.client.mypage.controller;

import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.client.mypage.service.ClientSelectProductOrderListService;
import com.mall.meongnyang.client.mypage.service.ClientupdateOrderStateService;
import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;
import com.mall.meongnyang.client.mypage.vo.OrderPaging;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ClientProductOrderController {
	
	@Autowired
	private ClientSelectProductOrderListService orderListService;
	@Autowired
	private ClientupdateOrderStateService clientupdateOrderStateService;
	
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
		model.addAttribute("currentPage", currentPage);
		
		return "mypage/order-list";
	}

	@RequestMapping(value = "/updateOrderState.do", method = RequestMethod.GET)
	public String updateorderState(ClientOrderVO clientOrderVO)
	{
		clientupdateOrderStateService.updateOrderState(clientOrderVO);
		return "redirect:orderList.do";
	}
}
