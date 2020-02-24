package com.mall.meongnyang.admin.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mall.meongnyang.admin.member.service.AdminMemberMailService;
import com.mall.meongnyang.admin.member.service.AdminSelectMemberListService;
import com.mall.meongnyang.admin.member.service.AdminUpdateMemberService;
import com.mall.meongnyang.admin.member.vo.AdminMemberVO;
import com.mall.meongnyang.util.mail.MailVO;


@Controller
public class AdminMemberController {

	@Autowired
	private AdminUpdateMemberService adminUpdateMemberService;
	
	@Autowired
	private AdminSelectMemberListService adminSelectMemberListService;
	
	@Autowired
	private AdminMemberMailService adminMemberMailService;
	
	
	
	
	    @RequestMapping(value = "/member-Manage.ado", method = RequestMethod.GET)
	    public String memberList(Model model)
	    {
	    	List<AdminMemberVO> adminMemberList = adminSelectMemberListService.selectMemberList(new AdminMemberVO());
	    	
	    	model.addAttribute("adminMemberList", adminMemberList);
	    	
	    	
	        return "member/member-manage";
	    }
	    
	    @RequestMapping(value = "/memberStateUpdate.ado", method = {RequestMethod.GET, RequestMethod.POST})
	    public String memberUpdate(AdminMemberVO adminMemberVO)
	    {
	    	
	        adminUpdateMemberService.updateMember(adminMemberVO);
	        

	        return "redirect:member-Manage.ado";
	    }

	    
	    @RequestMapping(value="/memberMail.ado", method= {RequestMethod.GET, RequestMethod.POST})
	    public String memberMailPage(AdminMemberVO adminMemberVO)
	    {
	    	List<AdminMemberVO> list = adminSelectMemberListService.selectMemberList(adminMemberVO); 
	    	//메일보내기  
	    	for(AdminMemberVO vo : list) {
	    		MailVO mail = new MailVO();
	    		mail.setTo(vo.getCustomerTbEmail());
	    		mail.setFrom("ssbin9610@nate.com");
	    		mail.setSubject("프로모션메일제목");
	    		mail.setContent("프로모션정보");
	    		adminMemberMailService.sendMail(mail);
	    	}
	    	
	    	return "member/member-Manage.ado";
	    }
	    
	   
	   
	    
	
}
