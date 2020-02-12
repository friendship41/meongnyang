package com.mall.meongnyang.admin.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mall.meongnyang.admin.member.service.AdminSelectMemberListService;
import com.mall.meongnyang.admin.member.service.AdminUpdateMemberService;
import com.mall.meongnyang.admin.member.vo.AdminMemberVO;


@Controller
public class AdminMemberController {

	@Autowired
	private AdminUpdateMemberService adminUpdateMemberService;
	
	@Autowired
	private AdminSelectMemberListService adminSelectMemberListService;
	
	
	
	
	    @RequestMapping(value = "/memberManage.ado", method = RequestMethod.GET)
	    public String memberList(Model model)
	    {
	    	List<AdminMemberVO> adminMemberList = adminSelectMemberListService.selectMemberList(new AdminMemberVO());
	    	
	    	model.addAttribute("adminMemberList", adminMemberList);
	        return "member/member-manage";
	    }
	    
	    @RequestMapping(value = "/memberManage.ado", method = RequestMethod.POST)
	    public String memberUpdate(AdminMemberVO adminMemberVO)
	    {
	        adminUpdateMemberService.updateMember(adminMemberVO);

	        return "member/member-manage";
	    }

	   
	
}
