package com.mall.meongnyang.client.mypage.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.client.member.vo.ClientTermsAgreeVO;
import com.mall.meongnyang.client.mypage.service.ClientDeleteMyinfoAddressService;
import com.mall.meongnyang.client.mypage.service.ClientInsertMyinfoAddressService;
import com.mall.meongnyang.client.mypage.service.ClientSelectMyinfoAddressListService;
import com.mall.meongnyang.client.mypage.service.ClientSelectMyinfoAddressService;
import com.mall.meongnyang.client.mypage.service.ClientSelectTermsAgreeListService;
import com.mall.meongnyang.client.mypage.service.ClientUpdateMyinfoAddressService;
import com.mall.meongnyang.client.mypage.vo.ClientCmAddressVO;

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
	
	@Autowired
	private ClientSelectTermsAgreeListService clientSelectTermsAgreeListService;
	
	@RequestMapping(value = "/myinfo.do", method = RequestMethod.GET)
	public String addressList(ClientCmAddressVO clientCmAddressVO, Model model, HttpSession session, ClientTermsAgreeVO clientTermsAgreeVO) {
		ClientCustomerVO sessionVO = (ClientCustomerVO)session.getAttribute("customer");
		
		int no = sessionVO.getCustomerTbNo();
		clientCmAddressVO.setCustomerTbNo(no);
		List<ClientCmAddressVO> tempVO = clientSelectMyinfoAddressListService.selectMyinfoAddressList(clientCmAddressVO);
		
		clientTermsAgreeVO.setCustomerTbNo(no);
		
		ClientTermsAgreeVO termsAgreeVO = clientSelectTermsAgreeListService.selectTermsAgree(clientTermsAgreeVO);
		
		
		model.addAttribute("termsAgreeVO", termsAgreeVO);
		model.addAttribute("myinfoAddressList", tempVO);
		
		return "mypage/myinfo";
	}
	
	@RequestMapping(value = "/myinfo-address-single-ajax.do", method = RequestMethod.GET)
	@ResponseBody
	public ClientCmAddressVO addressListAjax(ClientCmAddressVO clientCmAddressVO, HttpSession session) {
		
		return clientSelectMyinfoAddressService.selectMyinfoAddress(clientCmAddressVO);
	}
	
	@RequestMapping(value = "/myinfo-address-insert.do", method=RequestMethod.POST)
	public String insertAddress(ClientCmAddressVO clientCmAddressVO, HttpSession session) {
		
		
		clientInsertMyinfoAddressService.insertMyinfoAddress(clientCmAddressVO);
		
		
		return "redirect:myinfo.do";
	}
	
	@RequestMapping(value = "/myinfo-address-update.do", method=RequestMethod.POST)
	public String updateAddress(ClientCmAddressVO clientCmAddressVO) {
		
		
		clientUpdateMyinfoAddressService.updateMyinfoAddress(clientCmAddressVO);
		return "redirect:myinfo.do";
	}
	
	@RequestMapping(value = "/myinfo-address-delete.do", method=RequestMethod.GET)
	public String deleteAddress(ClientCmAddressVO clientCmAddressVO, HttpSession session) {
		
		
		clientDeleteMyinfoAddressService.deleteMyinfoAddress(clientCmAddressVO);
		
		return "redirect:myinfo.do";
	}
}
