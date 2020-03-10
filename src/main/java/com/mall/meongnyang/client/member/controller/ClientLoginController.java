package com.mall.meongnyang.client.member.controller;

import com.mall.meongnyang.admin.marketing.vo.AdminEventAttendenceVO;
import com.mall.meongnyang.admin.marketing.vo.AdminEventVO;
import com.mall.meongnyang.client.member.service.ClientSelectAvailableEventService;
import com.mall.meongnyang.client.member.service.ClientSelectEventAttendenceService;
import com.mall.meongnyang.client.member.service.ClientSelectLoginService;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class ClientLoginController {
	
	@Autowired
	private ClientSelectLoginService clientSelectLoginService;
	
	@Autowired
	private ClientSelectAvailableEventService clientSelectAvailableEventService;
	@Autowired
	private ClientSelectEventAttendenceService clientSelectEventAttendenceService;
	
	
	
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String loginProc(ClientCustomerVO clientCustomerVO,  HttpSession session, Model model) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();		
		ClientCustomerVO tempVO = clientSelectLoginService.selectLoginCheck(clientCustomerVO);

		if(tempVO!=null 
				&& (encoder.matches(clientCustomerVO.getCustomerTbPassword(), tempVO.getCustomerTbPassword()))
				&& tempVO.getCustomerTbState().equals("N")) {
			session.setAttribute("customer", tempVO);


			AdminEventVO event = clientSelectAvailableEventService.selectAvailableEvent(new AdminEventVO());
			if(event != null)
			{
				AdminEventAttendenceVO adminEventAttendenceVO = new AdminEventAttendenceVO();
				adminEventAttendenceVO.setCustomerTbNo(tempVO.getCustomerTbNo());
				adminEventAttendenceVO.setEventTbNo(event.getEventTbNo());
				boolean isEventAttended = clientSelectEventAttendenceService.checkAttendenceToday(adminEventAttendenceVO);
				if(isEventAttended)
				{
					session.setAttribute("eventGo","f");
				}
				else
				{
					session.setAttribute("eventGo","t");
				}
			}
			else
			{
				session.setAttribute("eventGo","f");
			}

			return "redirect:index.do";
		}
		else {
			model.addAttribute("message", "로그인에 실패했습니다");
			return "shopping/message-and-go-back";
		}
	}
	
	
	
	@RequestMapping(value = "/logout.do", method = RequestMethod.GET)
	public String logoutProc(HttpSession session) {
		//session.invalidate();
		session.setAttribute("customer", null);
		return "redirect:index.do";
	}
	
	
	
	
}
