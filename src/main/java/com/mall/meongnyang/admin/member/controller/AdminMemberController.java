package com.mall.meongnyang.admin.member.controller;

import com.mall.meongnyang.admin.marketing.service.AdminSelectPromotionListService;
import com.mall.meongnyang.admin.marketing.service.AdminSelectPromotionService;
import com.mall.meongnyang.admin.marketing.vo.AdminPromotionVO;
import com.mall.meongnyang.admin.member.service.AdminSelectAgreeMailCustomerListService;
import com.mall.meongnyang.admin.member.service.AdminSelectMemberListService;
import com.mall.meongnyang.admin.member.service.AdminUpdateMemberService;
import com.mall.meongnyang.admin.member.vo.AdminMemberVO;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.util.mail.MailService;
import com.mall.meongnyang.util.mail.MailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class AdminMemberController {

	@Autowired
	private AdminUpdateMemberService adminUpdateMemberService;
	
	@Autowired
	private AdminSelectMemberListService adminSelectMemberListService;

	@Autowired
	private MailService mailService;

	@Autowired
	private AdminSelectPromotionListService adminSelectPromotionListService;

	@Autowired
	private AdminSelectPromotionService adminSelectPromotionService;

	@Autowired
	private AdminSelectAgreeMailCustomerListService adminSelectAgreeMailCustomerListService;
	
	
	
	    @RequestMapping(value = "/member-Manage.ado", method = RequestMethod.GET)
	    public String memberList(Model model)
	    {
	    	List<AdminMemberVO> adminMemberList = adminSelectMemberListService.selectMemberList(new AdminMemberVO());
	    	
	    	model.addAttribute("adminMemberList", adminMemberList);
	    	model.addAttribute("promotionList", adminSelectPromotionListService.selectPromotionList());
	    	
	        return "member/member-manage";
	    }
	    
	    @RequestMapping(value = "/memberStateUpdate.ado", method = {RequestMethod.GET, RequestMethod.POST})
	    public String memberUpdate(AdminMemberVO adminMemberVO)
	    {
	    	
	        adminUpdateMemberService.updateMember(adminMemberVO);

	        return "redirect:member-Manage.ado";
	    }

	    
	    @RequestMapping(value="/memberMail.ado", method= {RequestMethod.GET, RequestMethod.POST})
	    public String memberMailPage(AdminMemberVO adminMemberVO, AdminPromotionVO adminPromotionVO)
	    {
	    	List<ClientCustomerVO> cusList = adminSelectAgreeMailCustomerListService.selectMailAgreeCustomerList(new ClientCustomerVO());

	    	AdminPromotionVO promotion = adminSelectPromotionService.selectPromotion(adminPromotionVO.getPromotionTbCode());

	    	//메일보내기
			MailVO mail = new MailVO();
			mail.setFrom("poo963369@naver.com");
			mail.setSubject(promotion.getPromotionTbName());
			mail.setContent(promotion.getPromotionTbContent());
	    	for(ClientCustomerVO clientCustomerVO : cusList)
	    	{
				mail.setTo(clientCustomerVO.getCustomerTbEmail());
	    		mailService.sendMail(mail);
	    	}
	    	
	    	return "redirect:member-Manage.ado";
	    }
	    
	   
	   
	    
	
}
