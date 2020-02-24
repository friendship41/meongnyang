package com.mall.meongnyang.client.community.controller;

import com.mall.meongnyang.admin.shopping.vo.AdminQnaTypeVO;
import com.mall.meongnyang.admin.shopping.vo.AdminQnaVO;
import com.mall.meongnyang.client.community.service.*;
import com.mall.meongnyang.client.community.vo.ClientQnaListPaging;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

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

		List<AdminQnaVO> clientQnaList = clientSelectQnaListService.selectQnaList(adminQnaVO);
		
		
		model.addAttribute("paging", paging);
		model.addAttribute("clientQnaList", clientQnaList);
		
			
		return "community/qna";
	}

	//ī�װ� �� �������ְ�
	@RequestMapping(value = "/qna-form.do", method = RequestMethod.GET)
    public String qnaCategoryList(Model model, AdminQnaVO adminQnaVO)
    {
		List<AdminQnaTypeVO> tempVO = clientSelectQnaTypeListService.selectQnaTypeList(new AdminQnaTypeVO());
        model.addAttribute("qnaCategoryList", tempVO);
        model.addAttribute("insertInfo", adminQnaVO);
        
        return "community/qna-form";
    }	
	
	@RequestMapping(value = "/qna-form.do", method = RequestMethod.POST)
	public String qnaForm(AdminQnaVO adminQnaVO, HttpSession session) {
		ClientCustomerVO user = (ClientCustomerVO)session.getAttribute("customer");
		adminQnaVO.setCustomerTbNo(user.getCustomerTbNo());
		clientInsertQnaService.insertNewQna(adminQnaVO);
		return "redirect:qna-list.do";
	}

	@RequestMapping(value = "/qna-read.do", method = RequestMethod.GET)
	public String qnaRead(AdminQnaVO adminQnaVO, Model model) {
		AdminQnaVO tempVO = clientSelectQnaService.selectQna(adminQnaVO);
		model.addAttribute("clientQnaVO", tempVO);
		return "community/qna-read";
	}
	@RequestMapping(value = "/qna-form2.do", method = RequestMethod.GET)
	public String qnaForm2Page(AdminQnaVO adminQnaVO, Model model) {
		List<AdminQnaTypeVO> tempVO = clientSelectQnaTypeListService.selectQnaTypeList(new AdminQnaTypeVO());
		AdminQnaVO replyFrom = clientSelectQnaService.selectQna(adminQnaVO);
		model.addAttribute("qnaCategoryList", tempVO);
		model.addAttribute("replyFrom", replyFrom);
		return "community/qna-form2";
	}
	@RequestMapping(value = "/qna-form2.do", method = RequestMethod.POST)
	public String qnaForm2(AdminQnaVO adminQnaVO) {
		clientInsertQnaService.insertQnaReply(adminQnaVO);
		return "redirect:qna-list.do";
	}





	


	
	
		

	
	
	@RequestMapping(value = "/qna-update.do", method = RequestMethod.POST)
	public String qnaUpdate(AdminQnaVO adminQnaVO, HttpSession session) {
		
			clientUpdateQnaService.updateQna(adminQnaVO);	
		
		
		return "redirect:qna-list.do";
	}
	
	@RequestMapping(value = "/qna-delete.do", method = RequestMethod.GET)
	public String qnaDelete(AdminQnaVO adminQnaVO) {
		clientDeleteQnaService.deleteQna(adminQnaVO);
		return "redirect:qna-list.do";
	}
}
