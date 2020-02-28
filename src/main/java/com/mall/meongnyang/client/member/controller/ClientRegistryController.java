package com.mall.meongnyang.client.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mall.meongnyang.client.member.service.ClientInsertRegistryService;
import com.mall.meongnyang.client.member.service.ClientSelectLoginService;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.util.mail.MailService;
import com.mall.meongnyang.util.mail.MailVO;

@Controller
public class ClientRegistryController {

	@Autowired
	private ClientInsertRegistryService clientInsertRegistryService;

	@Autowired
	private ClientSelectLoginService clientSelectLoginService;

	@Autowired
	private MailService mailService;

	

	@RequestMapping(value = "/registry.do", method = RequestMethod.POST)
	public String registryProc(ClientCustomerVO clientCustomerVO, Model model) {
		
		clientInsertRegistryService.insertRegistry(clientCustomerVO);
		ClientCustomerVO tempVO = clientSelectLoginService.selectLoginCheck(clientCustomerVO);
		
		// Mail 보내기
		MailVO mailVO = new MailVO();
		mailVO.setFrom("admin@naver.com"); // 관리자아이디
		mailVO.setTo(clientCustomerVO.getCustomerTbEmail()); // 회원가입 아이디
		mailVO.setSubject("회원가입 인증 요청입니다.");
		mailVO.setContent("<h1>메일인증</h1>" 
						  //base64 url암호화
						  + "<a href='localhost:8080/index.do?customerTbNo="
						  + tempVO.getCustomerTbNo()
						  +	"&customerTbState=N"
						  + "' >이메일 인증 확인</a>");
		model.addAttribute("emailSend", true);
		mailService.sendMail(mailVO);

		
		
		return "index";
	}
	
	
	
	

	@RequestMapping(value = "/loginAjaxSingle.do")
	@ResponseBody
	public int idCheck(Model model, ClientCustomerVO clientCustomerVO) {
		int result = 0;
		ClientCustomerVO tempVO = clientSelectLoginService.selectLoginCheck(clientCustomerVO);
		if (tempVO != null) {

			result = 1;
			return result;
		} else {
			return result;
		}

	}

}
