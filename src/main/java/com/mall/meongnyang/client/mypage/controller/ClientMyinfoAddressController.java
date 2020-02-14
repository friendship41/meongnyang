package com.mall.meongnyang.client.mypage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mall.meongnyang.client.mypage.service.ClientDeleteMyinfoAddressService;
import com.mall.meongnyang.client.mypage.service.ClientInsertMyinfoAddressService;
import com.mall.meongnyang.client.mypage.service.ClientSelectMyinfoAddressListService;
import com.mall.meongnyang.client.mypage.service.ClientSelectMyinfoAddressService;
import com.mall.meongnyang.client.mypage.service.ClientUpdateMyinfoAddressService;

@Controller
public class ClientMyinfoAddressController {

	@Autowired
	private ClientInsertMyinfoAddressService clientInsertMyinfoAddressService;
	
	@Autowired
	private ClientUpdateMyinfoAddressService clientUpdateMyinfoAddressService;
	
	@Autowired
	private ClientDeleteMyinfoAddressService clientDeleteMyinfoAddressService;
	
	@Autowired
	private ClientSelectMyinfoAddressService clientSelectMyinfoAddressService;
	
	@Autowired
	private ClientSelectMyinfoAddressListService clientSelectMyinfoAddressListService;
	
	
	
	
	
}
