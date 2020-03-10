package com.mall.meongnyang.client.mypage.controller;

import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.client.member.vo.ClientTermsAgreeVO;
import com.mall.meongnyang.client.mypage.service.ClientDeleteMyinfoService;
import com.mall.meongnyang.client.mypage.service.ClientUpdateMyinfoPasswordService;
import com.mall.meongnyang.client.mypage.service.ClientUpdateMyinfoPhoneService;
import com.mall.meongnyang.client.mypage.service.ClientUpdateTermsAgreeListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class ClientMyinfoController {

	@Autowired
	private ClientUpdateMyinfoPhoneService clientUpdateMyinfoPhoneService;

	@Autowired
	private ClientUpdateMyinfoPasswordService clientUpdateMyinfoPasswordService;
	
	@Autowired
	private ClientDeleteMyinfoService clientDeleteMyinfoCustomerService;

	@Autowired
	private ClientUpdateTermsAgreeListService clientUpdateTermsAgreeListService;
	
	
	
	
	
	

	@RequestMapping(value = "/myinfo-update-phone.do", method = RequestMethod.POST)
	public String updateMyinfoPhoneProc(ClientCustomerVO clientCustomerVO, HttpSession session) {
		ClientCustomerVO tempVO = (ClientCustomerVO) session.getAttribute("customer");
		int no = tempVO.getCustomerTbNo();
		clientCustomerVO.setCustomerTbNo(no);
		
		StringBuffer phone = new StringBuffer(clientCustomerVO.getCustomerTbPhone());
		phone.insert(3, "-");
		phone.insert(8, "-");
		
		clientCustomerVO.setCustomerTbPhone(phone.toString());

		tempVO.setCustomerTbPhone(phone.toString());
		session.setAttribute("customer", tempVO);
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
			
			//���ο� ��ȣ ��ȣȭ ����	
			String securePw = encoder.encode(newPassword1);
			
			//���ο� �н����尪 ����
			clientCustomerVO.setCustomerTbPassword(securePw);
			
			int id = SessionVO.getCustomerTbNo();
			clientCustomerVO.setCustomerTbNo(id);
			clientUpdateMyinfoPasswordService.updateMyinfoPassword(clientCustomerVO);

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
			clientCustomerVO.setCustomerTbState("T");
			clientDeleteMyinfoCustomerService.deleteMyinfo(clientCustomerVO);
			session.setAttribute("customer", null);
			return "redirect:index.do";
		} else  {
			model.addAttribute("passwordDelete", false);
			return "mypage/myinfo";
		}
		
	}
	
	
	
	@RequestMapping(value = "/myinfo-update-termsAgree.do", method = RequestMethod.POST)
	public String updateTermsAgree(ClientTermsAgreeVO clientTermsAgreeVO, HttpSession session, ClientCustomerVO clientCustomerVO) {
		
		ClientCustomerVO tempVO = (ClientCustomerVO)session.getAttribute("customer");
		int no = tempVO.getCustomerTbNo();
		clientTermsAgreeVO.setCustomerTbNo(no);
		clientUpdateTermsAgreeListService.updateTermsAgree(clientTermsAgreeVO);
		return "redirect:myinfo.do";
	}
	
	
	
	
}
