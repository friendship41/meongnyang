package com.mall.meongnyang.client.community.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mall.meongnyang.admin.shopping.service.AdminSelectQnaTypeListService;
import com.mall.meongnyang.admin.shopping.vo.AdminQnaTypeVO;
import com.mall.meongnyang.admin.shopping.vo.AdminQnaVO;
import com.mall.meongnyang.client.community.service.ClientDeleteQnaService;
import com.mall.meongnyang.client.community.service.ClientInsertQnaService;
import com.mall.meongnyang.client.community.service.ClientSelectQnaListService;
import com.mall.meongnyang.client.community.service.ClientSelectQnaService;
import com.mall.meongnyang.client.community.service.ClientSelectQnaTypeListService;
import com.mall.meongnyang.client.community.service.ClientUpdateQnaService;
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
	
	
	
	
	@RequestMapping(value = "/qna-form.do", method = RequestMethod.GET)
    public String qnaCategoryList(AdminQnaTypeVO adminQnaTypeVO, Model model)
    {
		List<AdminQnaTypeVO> tempVO = clientSelectQnaTypeListService.selectQnaTypeList(adminQnaTypeVO);
        model.addAttribute("qnaCategoryList", tempVO);
                
        return "community/qna-form";
    }
	
	
	@RequestMapping("/qna-insert.do")
	public String qnaInsert(AdminQnaVO adminQnaVO) {
		clientInsertQnaService.insertQna(adminQnaVO);
		return "redirect:qna-list.do";
	}
	
	@RequestMapping("/qna-list.do")
	public String qna(AdminQnaVO adminQnaVO, Model model, HttpSession session) {
		List<AdminQnaVO> tempVO = clientSelectQnaListService.selectQnaList(adminQnaVO);
		ClientCustomerVO sessionVO = (ClientCustomerVO)session.getAttribute("customer");
		
		int no = sessionVO.getCustomerTbNo();
		
		for(AdminQnaVO vo : tempVO) { //게시글리스트
			if(vo.getQnaTbSecret().equals("Y")) { //비밀글일경우
				if(no != vo.getCustomerTbNo()) { //비밀글이고 사용자가 남일때
					model.addAttribute("secret", false);
				} 
			} else {
				model.addAttribute("clientQnaList", tempVO);
			}
		}
		
		return "redirect:qna-list.do";
	}
		
	@RequestMapping("/qna-read.do")
	public String qnaRead(AdminQnaVO adminQnaVO, HttpSession session) {
		
		clientSelectQnaService.selectQna(adminQnaVO);
		return "community/qna-read";
	}
	
	@RequestMapping("/qna-update.do")
	public String qnaUpdate(AdminQnaVO adminQnaVO) {
		
		clientUpdateQnaService.updateQna(adminQnaVO);
		return "redirect:qna-list.do";
	}
	
	@RequestMapping("/qna-delete.do")
	public String qnaDelete(AdminQnaVO adminQnaVO) {
		
		clientDeleteQnaService.deleteQna(adminQnaVO);
		return "redirect:qna-list.do";
	}
}
