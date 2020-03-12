package com.mall.meongnyang.admin.member.controller;

import com.mall.meongnyang.admin.member.service.AdminSelectMemberListService;
import com.mall.meongnyang.admin.member.service.AdminSelectTermsService;
import com.mall.meongnyang.admin.member.service.AdminTermsMailService;
import com.mall.meongnyang.admin.member.vo.AdminMemberVO;
import com.mall.meongnyang.admin.member.vo.AdminTermsVO;
import com.mall.meongnyang.util.mail.MailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import java.util.List;

@Controller
@RequestMapping("/*")
public class AdminTermsMailController {

	@Inject
	private AdminTermsMailService mailService;
	@Autowired
	private AdminSelectTermsService adminSelectTermsService;
	@Autowired
	private AdminSelectMemberListService adminSelectMemberListService;

	@RequestMapping(value = "/mail-write.ado")
	public String write(AdminTermsVO adminTermsVO, Model model) {		
		
		model.addAttribute("content", adminSelectTermsService.selectTerms(adminTermsVO));
		
		return "member/mail-write";
	}

	@RequestMapping(value = "/send.ado", method = RequestMethod.POST)
	public String send(MailVO mailVO, AdminMemberVO adminMemberVO, Model model) {
		try {
			List<AdminMemberVO> memberList = adminSelectMemberListService.selectMemberList(adminMemberVO);
			mailService.send(mailVO, memberList);
			model.addAttribute("message", "메일을 보냈습니다");

		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", "...메일보내기에 실패하였습니다.");
		}
		return "redirect:/term-manage1.ado";
	}

}