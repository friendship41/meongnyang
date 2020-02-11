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
import com.mall.meongnyang.client.community.vo.ClientNoticeVO;

@Controller
public class ClientNoticeController {

	    @Autowired
	    private ClientSelectNoticeListService clientSelectNoticeListService;
	    
	    @Autowired
	    private ClientSelectNoticeService clientSelectNoticeService;
	

	    @RequestMapping(value = "/notice.do", method = RequestMethod.GET)
	    public String noticeList(Model model)
	    {
	        List<ClientNoticeVO> clientNoticeList = clientSelectNoticeListService.selectNoticeList(new ClientNoticeVO());

	        model.addAttribute("clientNoticeList", clientNoticeList);

	        return "community/notice";
	    }
	    
	    @RequestMapping(value = "/notice.read.do", method = RequestMethod.GET)
	    public String noticeRead(ClientNoticeVO clientNoticeVO, Model model)
	    {
	        ClientNoticeVO tempVO = clientSelectNoticeService.selectNotice(clientNoticeVO);

	        model.addAttribute("adminNoticeVO", tempVO);

	        return "community/notice-read";
	    }
	    
}
