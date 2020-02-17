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
import com.mall.meongnyang.client.mypage.service.ClientSelectMyinfoAddressService;

import com.mall.meongnyang.client.mypage.service.ClientUpdateMyinfoPasswordService;
import com.mall.meongnyang.client.mypage.service.ClientUpdateMyinfoPhoneService;
import com.mall.meongnyang.client.mypage.vo.ClientCmAddressVO;

@Controller
public class ClientMyinfoController {

	@Autowired
	private ClientUpdateMyinfoPhoneService clientUpdateMyinfoPhoneService;

	@Autowired
	private ClientUpdateMyinfoPasswordService clientUpdateMyinfoPasswordService;
	
	@Autowired
	private ClientDeleteMyinfoService clientDeleteMyinfoCustomerService;

	@Autowired
	private ClientSelectMyinfoAddressService clientSelectMyinfoAddressService;
	
	
	
	

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
		
		System.out.println(no + "암호화 된 암호(DB)");
		System.out.println(clientCustomerVO.getCustomerTbPassword()+ " : DB값과 일치하는 사용자가 적은값");
		if (encoder.matches(clientCustomerVO.getCustomerTbPassword(), SessionVO.getCustomerTbPassword())) {
			if(newPassword1.equals(newPassword2)) {
			
			//새로운 암호 암호화 시전	
			String securePw = encoder.encode(newPassword1);
			
			//새로운 패스워드값 셋팅
			clientCustomerVO.setCustomerTbPassword(securePw);
			System.out.println(newPassword1 + " : 새로운 비번");
			System.out.println(securePw + " : 암호화된 새로운 비번");	
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
		ClientCustomerVO tempVO = (ClientCustomerVO) session.getAttribute("customer");
		//세션에 있는 no값
		String password = tempVO.getCustomerTbPassword();
		//vo에 셋팅
		clientCustomerVO.setCustomerTbPassword(password);
		if(tempVO.getCustomerTbPassword().equals(clientCustomerVO.getCustomerTbPassword())) {
			
			clientDeleteMyinfoCustomerService.deleteMyinfo(clientCustomerVO);
			
		} else if(clientCustomerVO.getCustomerTbPassword() == null) {
			model.addAttribute("passwordDelete", false);
			return "mypage/myinfo";
		}
		return "mypage/myinfo";
	}
	
	
	
}
