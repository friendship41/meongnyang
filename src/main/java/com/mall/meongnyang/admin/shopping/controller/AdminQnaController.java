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
	public String qnaForm(AdminQnaVO adminQnaVO) {
				
		return "shoppingmall/shoppingmall-qna-list";
	}
	
	
	
	@RequestMapping(value = "/qna-insert.ado", method = RequestMethod.POST)
	public String insertQna(AdminQnaVO adminQnaVO) {
		adminInsertQnaService.insertQna(adminQnaVO);
		return "redirect:shoppingmall-qna-list.ado";
	}
	
	@RequestMapping(value = "/qna-list.ado")
	public String selectQnaList(AdminQnaVO adminQnaVO, Model model) {
		List<AdminQnaVO> adminQnaList = adminSelectQnaListService.selectQnaList(adminQnaVO);
		model.addAttribute("adminQnaList", adminQnaList);
		return "redirect:shoppingmall-qna-list";
	}
	
	@RequestMapping(value = "/qna-update.ado", method = RequestMethod.GET)
	public String updateFormQna(AdminQnaVO adminQnaVO, Model model) {
		AdminQnaVO tempVO = adminSelectQnaService.selectQna(adminQnaVO);
		
		model.addAttribute("adminSelectQna", tempVO);
		return "redirect:shoppingmall-qna-list";
	}
	
	@RequestMapping(value = "/qna-update.ado", method = RequestMethod.POST)
	public String updateQna(AdminQnaVO adminQnaVO) {
		adminUpdateQnaService.updateQna(adminQnaVO);
		return "redirect:shoppingmall-qna-list.ado";
	}
	
	@RequestMapping("/qna-delete.ado")
	public String deleteQna(AdminQnaVO adminQnaVO) {
		adminDeleteQnaService.deleteQna(adminQnaVO);
		return "redirect:shoppingmall-qna-list.ado";
	}
	
}
