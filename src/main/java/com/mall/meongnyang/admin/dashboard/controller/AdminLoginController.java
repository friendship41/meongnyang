package com.mall.meongnyang.admin.dashboard.controller;

import com.mall.meongnyang.admin.dashboard.service.AdminLogoutService;
import com.mall.meongnyang.admin.dashboard.service.AdminSelectLoginCheckService;
import com.mall.meongnyang.admin.dashboard.vo.AdminLoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class AdminLoginController {
	
	@Autowired
	private AdminLogoutService adminLogoutService;
	@Autowired
	private AdminSelectLoginCheckService adminSelectLoginCheckService;
	
	
	
	@RequestMapping(value = "/login.ado")
	public String login() {
		return "admin-page/login";
	}
	
	
	@RequestMapping(value = "/login.ado", method = RequestMethod.POST)
	public String loginProc(AdminLoginVO adminLoginVO, HttpSession session, Model model) {
		
		AdminLoginVO tempVO = adminSelectLoginCheckService.selectLoginCheck(adminLoginVO);
				
		if(tempVO!=null && (tempVO.getAdminsTbPassword()).equals(adminLoginVO.getAdminsTbPassword())) {
			
			session.setAttribute("adminId", tempVO.getAdminsTbId());
			
			return "redirect:index.ado";
		
		} else {
			model.addAttribute("loginCheckSubmit", false);
			return "admin-page/login";
		}
			
	}
	
	@RequestMapping(value = "/logout.ado", method = RequestMethod.GET)
	public String logoutProc(AdminLoginVO adminLoginVO, HttpSession session) {
		
		//session.invalidate();
		session.setAttribute("adminId", null);;
		
		return "admin-page/login";
	}

	@RequestMapping(value = "/needLogin.ado")
	public String needLogin()
	{
		return "admin-page/needLogin";
	}
}
