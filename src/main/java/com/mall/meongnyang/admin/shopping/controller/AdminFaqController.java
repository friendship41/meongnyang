package com.mall.meongnyang.admin.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mall.meongnyang.admin.shopping.service.AdminInsertFaqService;
import com.mall.meongnyang.admin.shopping.service.AdminSelectFaqListService;
import com.mall.meongnyang.admin.shopping.service.AdminSelectFaqService;
import com.mall.meongnyang.admin.shopping.service.AdminUpdateFaqService;
import com.mall.meongnyang.admin.shopping.vo.AdminFaqVO;

@Controller
public class AdminFaqController {
	
	@Autowired
	private AdminInsertFaqService adminInsertFaqService;
	@Autowired
	private AdminUpdateFaqService adminUpdateFaqService;
	@Autowired
	private AdminSelectFaqListService adminSelectFaqListService;
	@Autowired
	private AdminSelectFaqService adminSelectFaqService;

	@RequestMapping(value = "/shoppingmall-faq-read.ado", method = RequestMethod.GET)
	public String selectFaq(int num, Model model) {
		
		AdminFaqVO faq = adminSelectFaqService.selectFaq(num);
		
		model.addAttribute("faq", faq);
		return "shoppingmall/shoppingmall-faq-read";
	}
	
	@RequestMapping(value = "/shoppingmall-faq-list.ado", method = RequestMethod.GET)
	public String selectFaqList(Model model) {
		List<AdminFaqVO> faqList = adminSelectFaqListService.selectFaqList();
		model.addAttribute("faqList", faqList);
		return "shoppingmall/shoppingmall-faq-list";
	}
	
	@RequestMapping(value = "/shoppingmall-faq-write.ado", method = RequestMethod.POST)
	public String insertFaq(AdminFaqVO vo) {
		System.out.println("faqWrite POST요청");
		adminInsertFaqService.insertFaq(vo);
		return "redirect: shoppingmall-faq-list.ado";
	}
	
	@RequestMapping(value = "/shoppingmall-faq-write.ado", method = RequestMethod.GET)
	public String faqForm() {
		System.out.println("faqWrite GET요청");
		return "shoppingmall/shoppingmall-faq-write";
	}
	
	@RequestMapping(value = "/shoppingmall-faq-update.ado")
	public String updateFaq(AdminFaqVO vo) {
		adminUpdateFaqService.updateFaq(vo);
		return "redirect: shoppingmall-faq-list.ado";
	}
}
