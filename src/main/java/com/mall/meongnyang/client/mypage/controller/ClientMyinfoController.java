package com.mall.meongnyang.client.mypage.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mall.meongnyang.client.member.vo.ClientCustomerVO;

import com.mall.meongnyang.client.mypage.service.ClientSelectMyinfoService;
import com.mall.meongnyang.client.mypage.service.ClientUpdateMyinfoPasswordService;
import com.mall.meongnyang.client.mypage.service.ClientUpdateMyinfoPhoneService;
import com.mall.meongnyang.client.mypage.vo.ClientCmAddressVO;

@Controller
public class ClientMyinfoController {

	@Autowired
	private ClientSelectMyinfoService clientSelectMyinfoService;
	
	@Autowired
	private ClientUpdateMyinfoPhoneService clientUpdateMyinfoPhoneService;
	
	@Autowired
	private ClientUpdateMyinfoPasswordService clientUpdateMyinfoPasswordService;
	
	@RequestMapping(value = "/myinfo.do", method = RequestMethod.GET)
	public String myinfo(ClientCmAddressVO clientCmAddressVO, Model model) {
		ClientCmAddressVO tempVO = clientSelectMyinfoService.selectMyinfo(clientCmAddressVO);
		
		model.addAttribute("clientMyinfoVO", tempVO);
		
		return "mypage/myinfo";
	}
	
	@RequestMapping(value = "/myinfo-update-phone.do", method = RequestMethod.POST)
	public String updateMyinfoPhoneProc(ClientCustomerVO clientCustomerVO, HttpSession session) {
		ClientCustomerVO tempVO = (ClientCustomerVO)session.getAttribute("customer");
		int no = tempVO.getCustomerTbNo();
		clientCustomerVO.setCustomerTbNo(no);
		clientUpdateMyinfoPhoneService.updateMyinfoPhone(clientCustomerVO);
		
		
		return "mypage/myinfo";
	}
	
	@RequestMapping(value = "/myinfo-update-password.do", method = RequestMethod.POST)
	public String updateMyinfoPasswordProc(ClientCustomerVO clientCustomerVO, HttpSession session) {
				
		
		ClientCustomerVO DBVO 
					= clientUpdateMyinfoPasswordService.selectMyinfoPassword(clientCustomerVO);
		BCryptPasswordEncoder encoder 
					= new BCryptPasswordEncoder();
		
		//사용자가 적은 값 암호화시킴
		String securePw = encoder.encode(clientCustomerVO.getCustomerTbPassword());
		clientCustomerVO.setCustomerTbPassword(securePw);
		//사용자가 적은 암호화된 값(성공)
		System.out.println(securePw);
		//DB값 실패
		System.out.println(DBVO.getCustomerTbPassword());
		if(DBVO.getCustomerTbPassword().equals(clientCustomerVO.getCustomerTbPassword())) {
			ClientCustomerVO tempVO = (ClientCustomerVO)session.getAttribute("customer");
			int no = tempVO.getCustomerTbNo();
			clientCustomerVO.setCustomerTbNo(no);
			System.out.println(securePw + " : 텍스트에 적은 암호화된 암호");
			System.out.println(DBVO.getCustomerTbPassword() + " : DB에 있는 값");
			System.out.println(clientCustomerVO.getCustomerTbPassword());
			clientUpdateMyinfoPasswordService.updateMyinfoPassword(clientCustomerVO);
		} else {
			return "mypage/myinfo";
		}
		
		
		return "mypage/myinfo";
	}
	
	
	
	
	
}
