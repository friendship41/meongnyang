package com.mall.meongnyang.admin.dashboard.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mall.meongnyang.admin.dashboard.dao.AdminLoginDAO;
import com.mall.meongnyang.admin.dashboard.service.AdminLogoutService;
import com.mall.meongnyang.admin.dashboard.service.AdminSelectLoginCheckService;
import com.mall.meongnyang.admin.dashboard.vo.AdminLoginVO;

@Controller
public class AdminLoginController {
	
	@Autowired
	private AdminLogoutService adminLogoutService;
	@Autowired
	private AdminSelectLoginCheckService adminSelectLoginCheckService;
	
	
	//단순한 로그인화면
	@RequestMapping(value = "/login.ado")
	public String login() {
		return "admin-page/login";
	}
	
	
	@RequestMapping(value = "/index.ado", method = RequestMethod.POST)
	public String loginProc(AdminLoginVO adminLoginVO, HttpSession session) {
		
		AdminLoginVO tempVO = adminSelectLoginCheckService.selectLoginCheck(adminLoginVO);
				
		if(tempVO!=null && (tempVO.getAdminsTbPassword()).equals(adminLoginVO.getAdminsTbPassword())) {
			
			session.setAttribute("adminId", tempVO.getAdminsTbId());
			
			return "index";
		//실패
		} else {
			
			return "admin-page/login";
		}
			
	}
	
	@RequestMapping(value = "/logout.ado", method = RequestMethod.GET)
	public String logoutProc(AdminLoginVO adminLoginVO, HttpSession session) {
		
		//session.invalidate();
		session.setAttribute("adminId", null);;
		System.out.println("세션 널값줬음");
		return "admin-page/login";
	}
}
