package com.mall.meongnyang.admin.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mall.meongnyang.admin.shopping.service.AdminDeleteQnaService;
import com.mall.meongnyang.admin.shopping.service.AdminInsertQnaService;
import com.mall.meongnyang.admin.shopping.service.AdminSelectQnaListService;
import com.mall.meongnyang.admin.shopping.service.AdminSelectQnaService;
import com.mall.meongnyang.admin.shopping.service.AdminUpdateQnaService;
import com.mall.meongnyang.admin.shopping.vo.AdminQnaVO;

@Controller
public class AdminQnaController {
	
	@Autowired
	private AdminInsertQnaService adminInsertQnaService;
	
	@Autowired
	private AdminUpdateQnaService adminUpdateQnaService;
	
	@Autowired
	private AdminDeleteQnaService adminDeleteQnaService;
	
	@Autowired
	private AdminSelectQnaListService adminSelectQnaListService;
	
	@Autowired
	private AdminSelectQnaService adminSelectQnaService;
	
	
	@RequestMapping(value = "/shoppingmall-qna-list.ado", method = RequestMethod.GET)
	public String selectQnaList(AdminQnaVO adminQnaVO, Model model) {
		
		List<AdminQnaVO> adminQnaList = adminSelectQnaListService.selectQnaList(adminQnaVO);
		model.addAttribute("adminQnaList", adminQnaList);
		
		return "shoppingmall/shoppingmall-qna-list";
	}
	
	@RequestMapping(value = "/qna-write.ado", method = RequestMethod.POST)
	public String writeForm(AdminQnaVO adminQnaVO, Model model) {
		AdminQnaVO tempVO = adminSelectQnaService.selectQna(adminQnaVO);
		
		
		model.addAttribute("stair", tempVO);
		
		return "shoppingmall/shoppingmall-qna-write";
	}
	
	@RequestMapping(value = "/shoppingmall-qna-read.ado", method = RequestMethod.GET)
	public String updateFormQna(AdminQnaVO adminQnaVO, Model model) {
		
		AdminQnaVO tempVO = adminSelectQnaService.selectQna(adminQnaVO);
		
		model.addAttribute("adminSelectQna", tempVO);
		return "shoppingmall/shoppingmall-qna-read";
	}
	
	
	
	
	@RequestMapping(value = "/shoppingmall-qna-write.ado", method = RequestMethod.POST)
	public String qnaInsert(AdminQnaVO adminQnaVO) {
		
		adminInsertQnaService.insertQna(adminQnaVO);
		
		return "redirect:shoppingmall-qna-list.ado";
	}

	
	@RequestMapping(value = "/shoppingmall-qna-update.ado", method = RequestMethod.POST)
	public String updateQna(AdminQnaVO adminQnaVO) {
		
		adminUpdateQnaService.updateQna(adminQnaVO);
		return "redirect:shoppingmall-qna-list.ado";
	}
	
	@RequestMapping(value = "/shoppingmall-qna-delete.ado", method = RequestMethod.GET)
	public String deleteQna(AdminQnaVO adminQnaVO) {
		
		adminDeleteQnaService.deleteQna(adminQnaVO);
		return "redirect:shoppingmall-qna-list.ado";
	}
	
}
