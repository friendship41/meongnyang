package com.mall.meongnyang.client.community.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mall.meongnyang.admin.shopping.vo.AdminNoticeVO;
import com.mall.meongnyang.client.community.service.ClientSelectNoticeListService;
import com.mall.meongnyang.client.community.service.ClientSelectNoticeService;


@Controller
public class ClientNoticeController {

	    @Autowired
	    private ClientSelectNoticeListService clientSelectNoticeListService;
	    
	    @Autowired
	    private ClientSelectNoticeService clientSelectNoticeService;
	

	    @RequestMapping(value = "/notice.do", method = RequestMethod.GET)
	    public String noticeList(Model model)
	    {
	        List<AdminNoticeVO> clientNoticeList = clientSelectNoticeListService.selectNoticeList(new AdminNoticeVO());
//	        if(clientNoticeList!=null) {
//	        System.out.println("값이 들어있습니다~~");
//	        	
//	        }else {
//	        	System.out.println("값이 없음 ㅜ ");
//	        }
	        model.addAttribute("clientNoticeList", clientNoticeList);

	        return "community/notice";
	    }
	    
	    @RequestMapping(value = "/notice-read.do", method = RequestMethod.GET)
	    public String noticeRead(AdminNoticeVO adminNoticeVO, Model model)
	    {
	        AdminNoticeVO tempVO = clientSelectNoticeService.selectNotice(adminNoticeVO);
	       
	        model.addAttribute("clientNoticeVO", tempVO);
	      	        
	        return "community/notice-read";
	    }
	    
}
