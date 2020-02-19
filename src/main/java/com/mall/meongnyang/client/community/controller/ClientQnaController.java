package com.mall.meongnyang.client.community.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mall.meongnyang.admin.shopping.vo.AdminQnaTypeVO;
import com.mall.meongnyang.admin.shopping.vo.AdminQnaVO;
import com.mall.meongnyang.client.community.service.ClientDeleteQnaService;
import com.mall.meongnyang.client.community.service.ClientInsertQnaService;
import com.mall.meongnyang.client.community.service.ClientSelectQnaListService;
import com.mall.meongnyang.client.community.service.ClientSelectQnaService;
import com.mall.meongnyang.client.community.service.ClientSelectQnaTypeListService;
import com.mall.meongnyang.client.community.service.ClientUpdateQnaService;
import com.mall.meongnyang.client.community.vo.ClientQnaListPaging;

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
	public String qna(AdminQnaVO adminQnaVO, Model model, HttpSession session) {
		
		ClientQnaListPaging paging = new ClientQnaListPaging();
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
    public String qnaCategoryList(AdminQnaTypeVO adminQnaTypeVO, Model model)
    {
		List<AdminQnaTypeVO> tempVO = clientSelectQnaTypeListService.selectQnaTypeList(adminQnaTypeVO);
        model.addAttribute("qnaCategoryList", tempVO);
                
        return "community/qna-form";
    }	
	
	@RequestMapping(value = "/qna-insert.do", method = RequestMethod.POST)
	public String qnaInsert(AdminQnaVO adminQnaVO, HttpSession session, Model model) {
		
		clientInsertQnaService.insertQna(adminQnaVO);
		if(adminQnaVO.getQnaTbTitle() == null || adminQnaVO.getQnaTbContent() == null) {
			model.addAttribute("inputFail", false);
			return "community/qna-form";
		}
		return "redirect:qna-list.do";
	}
		
	@RequestMapping(value = "/qna-read.do", method = RequestMethod.GET)
	public String qnaRead(AdminQnaVO adminQnaVO, Model model) {
		
		
		AdminQnaVO tempVO = clientSelectQnaService.selectQna(adminQnaVO);
				
		model.addAttribute("clientQnaVO", tempVO);
		return "community/qna-read";
	}
	
	
	@RequestMapping(value = "/qna-update.do", method = RequestMethod.POST)
	public String qnaUpdate(AdminQnaVO adminQnaVO) {
		
		clientUpdateQnaService.updateQna(adminQnaVO);
		return "redirect:qna-list.do";
	}
	
	@RequestMapping(value = "/qna-delete.do", method = RequestMethod.GET)
	public String qnaDelete(AdminQnaVO adminQnaVO) {
		adminQnaVO.setQnaTbStatus("D");
		clientDeleteQnaService.deleteQna(adminQnaVO);
		return "redirect:qna-list.do";
	}
}
