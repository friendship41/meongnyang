package com.mall.meongnyang.admin.member.controller;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mall.meongnyang.admin.member.service.AdminSelectTermsService;
import com.mall.meongnyang.admin.member.service.AdminTermsMailService;
import com.mall.meongnyang.admin.member.vo.AdminTermsMailVO;
import com.mall.meongnyang.admin.member.vo.AdminTermsVO;

@Controller
@RequestMapping("/*")
public class AdminTermsMailController {

	@Inject
	private AdminTermsMailService mailService;
	@Autowired
	private AdminSelectTermsService adminSelectTermsService;
		
	
	@RequestMapping(value="/mail-write.ado")
	public String write(AdminTermsVO adminTermsVO, Model model) {
				
		model.addAttribute("content", adminSelectTermsService.selectTerms(adminTermsVO));
		return "member/mail-write";
	}

	@RequestMapping(value = "/send.ado", method = RequestMethod.POST)
	public String send(@ModelAttribute AdminTermsMailVO mailVO, Model model ) {
		try {

			mailService.send(mailVO);
			model.addAttribute("message", "이메일이 발송되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", "이메일 발송 실패...");
		}
		return "redirect:/term-manage.ado";
	}

}