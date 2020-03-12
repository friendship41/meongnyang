package com.mall.meongnyang.client.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientContactController {

	
	
	@RequestMapping(value = "contact.do")
	public String contactForm() {
		return "community/contact";
	}
}
