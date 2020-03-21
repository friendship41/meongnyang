package com.mall.meongnyang.client.member.controller;

import com.mall.meongnyang.admin.member.vo.AdminTermsVO;
import com.mall.meongnyang.client.member.service.ClientInsertRegistryService;
import com.mall.meongnyang.client.member.service.ClientInsertTermsAgreeListService;
import com.mall.meongnyang.client.member.service.ClientSelectLoginService;
import com.mall.meongnyang.client.member.service.ClientSelectTermsListService;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.client.member.vo.ClientTermsAgreeVO;
import com.mall.meongnyang.util.mail.MailService;
import com.mall.meongnyang.util.mail.MailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ClientRegistryController {

	@Autowired
	private ClientInsertRegistryService clientInsertRegistryService;

	@Autowired
	private ClientSelectLoginService clientSelectLoginService;

	@Autowired
	private MailService mailService;

	@Autowired
	private ClientSelectTermsListService clientSelectTermsListService;

	@Autowired
	private ClientInsertTermsAgreeListService clientInsertTermsAgreeListService;

	@RequestMapping(value = "/registry.do", method = RequestMethod.POST)
	@Transactional
	public String registryProc(@RequestParam String agreeCheckOption, ClientTermsAgreeVO clientTermsAgreeVO,
			AdminTermsVO admintermsVo, ClientCustomerVO clientCustomerVO, Model model) {

		
		ClientCustomerVO tempVO2 = clientSelectLoginService.selectLoginCheck(clientCustomerVO);
		
		if(tempVO2 == null) {
			
		
		clientInsertRegistryService.insertRegistry(clientCustomerVO);
		ClientCustomerVO tempVO = clientSelectLoginService.selectLoginCheck(clientCustomerVO);

		// Mail 蹂대궡湲�
		MailVO mailVO = new MailVO();
		mailVO.setFrom("poo963369@naver.com");
		mailVO.setTo(clientCustomerVO.getCustomerTbEmail());
		mailVO.setSubject("오늘 뭐멍냥 회원가입 인증메일입니다.");
		mailVO.setContent("<h1>클릭해주세요</h1>"
				// base64 url암호화 필요함
				+ "<a href='http://localhost:8080/index.do?customerTbNo=" + tempVO.getCustomerTbNo() + "&customerTbState=N"
				+ "' >회원가입 인증</a>");
		model.addAttribute("emailSend", true);
		mailService.sendMail(mailVO);		

		List<AdminTermsVO> termsList = clientSelectTermsListService.selectTermsOptionList(admintermsVo); // 선택사항 약관만
																											// select
		int[] termsTbNoList = new int[termsList.size()];
		for (int i = 0; i < termsList.size(); i++) {
			termsTbNoList[i] = termsList.get(i).getTermsTbNo();
		}

		List<ClientTermsAgreeVO> clientTermsAgreeVOList = new ArrayList<ClientTermsAgreeVO>();
		for (int i = 0; i < termsTbNoList.length; i++) {
			ClientTermsAgreeVO VO = new ClientTermsAgreeVO();
			VO.setTermsTbNo(termsTbNoList[i]);
			VO.setCustomerTbNo(tempVO.getCustomerTbNo());
			VO.setTermsAgreeTbConsentStatus(agreeCheckOption);
			clientTermsAgreeVOList.add(VO);
		}
		for (int i = 0; i < clientTermsAgreeVOList.size(); i++) {
			clientTermsAgreeVO = clientTermsAgreeVOList.get(i);
			clientInsertTermsAgreeListService.insertTermsAgreeListService(clientTermsAgreeVO);

		}
			model.addAttribute("message","인증메일이 발송되었습니다. 확인해 주세요");
			model.addAttribute("urldo","/index.do");
			return "include/message-and-go-urldo";
		} else {
			model.addAttribute("registryMessage", "등록된 아이디입니다.");
			model.addAttribute("urldo","/index.do");
			return "include/message-and-go-url";
		}
		

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

	@RequestMapping(value = "/termsCheck1.do")
	public String selectTermsNecessary(AdminTermsVO admintermsVo, Model model) {

		List<AdminTermsVO> termsList = clientSelectTermsListService.selectTermsNecessaryList(admintermsVo);
		model.addAttribute("termsList", termsList);

		return "terms-agree";
	}

	@RequestMapping(value = "/termsCheck2.do")
	public String selectTermsOption(AdminTermsVO admintermsVo, Model model) {

		List<AdminTermsVO> termsList = clientSelectTermsListService.selectTermsOptionList(admintermsVo);
		model.addAttribute("termsList", termsList);

		return "terms-agree2";
	}

}
