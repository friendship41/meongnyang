package com.mall.meongnyang.admin.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mall.meongnyang.admin.dashboard.service.AdminSelectLoginService;

@Controller
public class AdminLoginController {
	
	@Autowired
	private AdminSelectLoginService adminSelectLoginService;
	
	@RequestMapping(value = "/login.ado", method = RequestMethod.GET )
	public String adminLogin() {
		
		return "admin-page/login";
	}
	
	
	
	
}
