package com.mall.meongnyang.admin.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mall.meongnyang.admin.member.service.AdminInsertTermsService;
import com.mall.meongnyang.admin.member.service.AdminSelectTermsListService;
import com.mall.meongnyang.admin.member.service.AdminSelectTermsService;
import com.mall.meongnyang.admin.member.service.AdminUpdateTermsService;
import com.mall.meongnyang.admin.member.vo.AdminTermsVO;

@Controller
public class AdminTermsController {
	@Autowired
	private AdminSelectTermsListService adminSelectTermsListService;
	@Autowired
	private AdminSelectTermsService adminSelectTermsService;
	@Autowired
	private AdminInsertTermsService adminInsertTermsService;
	@Autowired
	private AdminUpdateTermsService adminUpdateTermsService; 
	
	@RequestMapping(value="/term-manage.ado", method=RequestMethod.GET)
	public String selectTermsList(Model model) {
		List<AdminTermsVO> termsList = adminSelectTermsListService.selectTermsList(new AdminTermsVO());
		model.addAttribute("termsList", termsList);		
		return "member/term-manage";
	}
	
	@RequestMapping(value="/term-read.ado", method=RequestMethod.GET)
	public String selectTerms(AdminTermsVO adminTermsVO, Model model) {
		AdminTermsVO terms = adminSelectTermsService.selectTerms(adminTermsVO);
		model.addAttribute("terms", terms);
		return "member/term-read";
	}
	
	@RequestMapping(value="/term-write.ado", method=RequestMethod.GET)
	public String termWriteForm() {
		return "member/term-write";
	}
	
	@RequestMapping(value="/term-write.ado", method=RequestMethod.POST)
	public String insertTerms(AdminTermsVO adminTermsVO) {		
		adminInsertTermsService.insertTerms(adminTermsVO);		
		return "redirect:/term-manage.ado";
	}
	
	@RequestMapping(value="/term-read.ado", method=RequestMethod.POST)
	public String updateTerms(AdminTermsVO admintermsVO) {
		adminUpdateTermsService.updateTerms(admintermsVO);		
		return "redirect:/term-manage.ado";
	}
	
	
}
