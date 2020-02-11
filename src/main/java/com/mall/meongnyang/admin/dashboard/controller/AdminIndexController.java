package com.mall.meongnyang.admin.dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminIndexController
{
	@RequestMapping(value = "/login.ado")
	public String loginselect() {
		return "admin-page/login";
	}
}
