package com.mall.meongnyang.client.mypage.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.client.mypage.service.ClientDeleteMyinfoService;
import com.mall.meongnyang.client.mypage.service.ClientUpdateMyinfoPasswordService;
import com.mall.meongnyang.client.mypage.service.ClientUpdateMyinfoPhoneService;

@Controller
public class ClientMyinfoController {

	@Autowired
	private ClientUpdateMyinfoPhoneService clientUpdateMyinfoPhoneService;

	@Autowired
	private ClientUpdateMyinfoPasswordService clientUpdateMyinfoPasswordService;
	
	@Autowired
	private ClientDeleteMyinfoService clientDeleteMyinfoCustomerService;

	
	
	
	
	

	@RequestMapping(value = "/myinfo-update-phone.do", method = RequestMethod.POST)
	public String updateMyinfoPhoneProc(ClientCustomerVO clientCustomerVO, HttpSession session) {
		ClientCustomerVO tempVO = (ClientCustomerVO) session.getAttribute("customer");
		int no = tempVO.getCustomerTbNo();
		clientCustomerVO.setCustomerTbNo(no);
		
		StringBuffer phone = new StringBuffer(clientCustomerVO.getCustomerTbPhone());
		phone.insert(3, "-");
		phone.insert(8, "-");
		
		clientCustomerVO.setCustomerTbPhone(phone.toString());
		
		
		clientUpdateMyinfoPhoneService.updateMyinfoPhone(clientCustomerVO);

		return "mypage/myinfo";
	}

	
	@RequestMapping(value = "/myinfo-update-password.do", method = RequestMethod.POST)
	public String updateMyinfoPasswordProc(@RequestParam String newPassword1, @RequestParam String newPassword2,
		ClientCustomerVO clientCustomerVO, HttpSession session, Model model) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		ClientCustomerVO SessionVO = (ClientCustomerVO) session.getAttribute("customer");
		String no = SessionVO.getCustomerTbPassword();
		
		
		if (encoder.matches(clientCustomerVO.getCustomerTbPassword(), SessionVO.getCustomerTbPassword())) {
			if(newPassword1.equals(newPassword2)) {
			
			//새로운 암호 암호화 시전	
			String securePw = encoder.encode(newPassword1);
			
			//새로운 패스워드값 셋팅
			clientCustomerVO.setCustomerTbPassword(securePw);
			
			int id = SessionVO.getCustomerTbNo();
			clientCustomerVO.setCustomerTbNo(id);
			clientUpdateMyinfoPasswordService.updateMyinfoPassword(clientCustomerVO);
			System.out.println(clientCustomerVO.getCustomerTbPassword());
			model.addAttribute("passwordsuccess", false);
			} else {
				model.addAttribute("passwordCheck", false);
				return "mypage/myinfo";
			}
		} else {
			model.addAttribute("realPasswordCheck", false);
			return "mypage/myinfo";
		}
		
		

		return "mypage/myinfo";
			
	}

	@RequestMapping(value = "/myinfo-delete-customer.do", method = RequestMethod.POST)
	public String deleteMyinfoCustomerProc(HttpSession session, ClientCustomerVO clientCustomerVO, Model model) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		ClientCustomerVO sessionVO = (ClientCustomerVO) session.getAttribute("customer");
		
		if (encoder.matches(clientCustomerVO.getCustomerTbPassword(), sessionVO.getCustomerTbPassword())) {
			String password = sessionVO.getCustomerTbPassword();
			clientCustomerVO.setCustomerTbPassword(password);
			clientDeleteMyinfoCustomerService.deleteMyinfo(clientCustomerVO);
			session.setAttribute("customer", null);
			return "redirect:index.do";
		} else  {
			model.addAttribute("passwordDelete", false);
			return "mypage/myinfo";
		}
		
	}
	
	
	
}
