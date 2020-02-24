package com.mall.meongnyang.client.community.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mall.meongnyang.admin.shopping.vo.AdminQnaTypeVO;
import com.mall.meongnyang.admin.shopping.vo.AdminQnaVO;
import com.mall.meongnyang.client.community.service.ClientDeleteQnaService;
import com.mall.meongnyang.client.community.service.ClientInsertQnaService;
import com.mall.meongnyang.client.community.service.ClientSelectQnaListService;
import com.mall.meongnyang.client.community.service.ClientSelectQnaService;
import com.mall.meongnyang.client.community.service.ClientSelectQnaTypeListService;
import com.mall.meongnyang.client.community.service.ClientUpdateQnaService;
import com.mall.meongnyang.client.community.vo.ClientQnaListPaging;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;

@Controller
public class ClientQnaController {

	@Autowired
	private ClientInsertQnaService clientInsertQnaService;
	
	@Autowired
	private ClientUpdateQnaService clientUpdateQnaService;
	
	@Autowired
	private ClientDeleteQnaService clientDeleteQnaService;
	
	@Autowired
	private ClientSelectQnaService clientSelectQnaService;
	
	@Autowired
	private ClientSelectQnaListService clientSelectQnaListService;

	@Autowired
	private ClientSelectQnaTypeListService clientSelectQnaTypeListService;
	
	
	
	@RequestMapping(value = "/qna-list.do", method = RequestMethod.GET)
	public String qna(@RequestParam(defaultValue = "1") int currentPage, AdminQnaVO adminQnaVO, Model model) {
		
		ClientQnaListPaging paging = new ClientQnaListPaging(currentPage);
		paging.createPaging(clientSelectQnaListService.selectCountQna());
		
		adminQnaVO.setStartRow(paging.getStartRow());
		adminQnaVO.setEndRow(paging.getEndRow());
		
		
		
		List<AdminQnaVO> tempVO = clientSelectQnaListService.selectQnaList(adminQnaVO);
		
		
		model.addAttribute("paging", paging);
		model.addAttribute("clientQnaList", tempVO);
		
			
		return "community/qna";
	}
	
	//카테고리 값 받을수있게
	@RequestMapping(value = "/qna-form.do", method = RequestMethod.GET)
    public String qnaCategoryList(AdminQnaTypeVO adminQnaTypeVO, Model model, AdminQnaVO adminQnaVO)
    {
		List<AdminQnaTypeVO> tempVO = clientSelectQnaTypeListService.selectQnaTypeList(adminQnaTypeVO);
        model.addAttribute("qnaCategoryList", tempVO);
        
        return "community/qna-form";
    }	
	
	@RequestMapping(value = "/qna-form.do", method = RequestMethod.POST)
	public String qnaForm(AdminQnaVO adminQnaVO, Model model) {
		AdminQnaVO tempVO = clientSelectQnaService.selectQna(adminQnaVO);
		model.addAttribute("stair", tempVO);
		System.out.println(tempVO);
		return "community/qna-form";
	}
	
	@RequestMapping(value = "/qna-form2.do", method = RequestMethod.POST)
	public String qnaForm2(AdminQnaVO adminQnaVO, Model model) {
		AdminQnaVO tempVO = clientSelectQnaService.selectQna(adminQnaVO);
		model.addAttribute("stair", tempVO);
		System.out.println(tempVO);
		return "community/qna-form2";
	}
	
	@RequestMapping(value = "/qna-insert2.do", method = RequestMethod.POST)
	public String qnaInsert2(AdminQnaVO adminQnaVO, HttpSession session, Model model) {
		
		
		if(adminQnaVO.getQnaTbTitle() == null || adminQnaVO.getQnaTbContent() == null) {
			model.addAttribute("inputFail", false);
			return "community/qna-form";
		}
		
		clientInsertQnaService.insertQna2(adminQnaVO);
		return "redirect:qna-list.do";
	}
	
	@RequestMapping(value = "/qna-insert.do", method = RequestMethod.POST)
	public String qnaInsert2(AdminQnaVO adminQnaVO) {
		
		clientInsertQnaService.insertQna(adminQnaVO);
		
		return "redirect:qna-list.do";
	}
	
	
		
	@RequestMapping(value = "/qna-read.do", method = RequestMethod.GET)
	public String qnaRead(AdminQnaVO adminQnaVO, Model model) {
		
		
		AdminQnaVO tempVO = clientSelectQnaService.selectQna(adminQnaVO);
				
		model.addAttribute("clientQnaVO", tempVO);
		return "community/qna-read";
	}
	
	
	@RequestMapping(value = "/qna-update.do", method = RequestMethod.POST)
	public String qnaUpdate(AdminQnaVO adminQnaVO, HttpSession session) {
		
			clientUpdateQnaService.updateQna(adminQnaVO);	
		
		
		return "redirect:qna-list.do";
	}
	
	@RequestMapping(value = "/qna-delete.do", method = RequestMethod.GET)
	public String qnaDelete(AdminQnaVO adminQnaVO, Model model) {
		
		clientDeleteQnaService.deleteQna(adminQnaVO);
		
		return "redirect:qna-list.do";
	}
}
