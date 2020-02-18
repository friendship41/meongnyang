package com.mall.meongnyang.client.community.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mall.meongnyang.admin.shopping.vo.AdminNoticeVO;
import com.mall.meongnyang.client.community.service.ClientSelectNoticeListService;
import com.mall.meongnyang.client.community.service.ClientSelectNoticeService;
import com.mall.meongnyang.client.community.vo.NoticeListPaging;


@Controller
public class ClientNoticeController {

	    @Autowired
	    private ClientSelectNoticeListService clientSelectNoticeListService;
	    
	    @Autowired
	    private ClientSelectNoticeService clientSelectNoticeService;
	

	    @RequestMapping(value = "/notice.do", method = RequestMethod.GET)
	    public String noticeList(@RequestParam(defaultValue = "1") int currentPage, AdminNoticeVO adminNoticeVO, Model model)
	    {		
	    	
	    	NoticeListPaging paging = new NoticeListPaging(currentPage);
	    	    	
	    	paging.createPaging(clientSelectNoticeListService.selectCountNotice());
	    	
	    	adminNoticeVO.setStartRow(paging.getStartRow());
	    	
	    	adminNoticeVO.setEndRow(paging.getEndRow());
	    	
	    	
	    	
	       
	        List<AdminNoticeVO> clientNoticeList = clientSelectNoticeListService.selectNoticeList(adminNoticeVO);
	        System.out.println(clientNoticeList);
	       
	        
	        
	        model.addAttribute("clientNoticeList", clientNoticeList);

	        model.addAttribute("paging", paging);
	        
	        return "community/notice";
	    }
	    
	    @RequestMapping(value = "/notice-read.do", method = RequestMethod.GET)
	    public String noticeRead(AdminNoticeVO adminNoticeVO, Model model)
	    {
	        AdminNoticeVO tempVO = clientSelectNoticeService.selectNotice(adminNoticeVO);
	       
	        model.addAttribute("clientNoticeVO", tempVO);
	      	        
	        return "community/notice-read";
	    }
	    
	    
//	    	
//	    	
//	    }
	    
	    
	    
}
