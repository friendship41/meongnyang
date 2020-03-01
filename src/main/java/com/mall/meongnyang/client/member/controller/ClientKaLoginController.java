package com.mall.meongnyang.client.member.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mall.meongnyang.client.member.service.ClientKaLoginService;
import com.mall.meongnyang.client.member.service.ClientSelectLoginService;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;

@Controller
public class ClientKaLoginController {

	@Autowired
	private ClientKaLoginService clientInsertKaLoginService;

	@Autowired
	private ClientSelectLoginService clientSelectLoginService;

	@RequestMapping(value="/klogin.do")
	public String klogin(@RequestParam("code") String code, HttpSession session, Model model) {
		HashMap<String, Object> token = clientInsertKaLoginService.getKakaoAccessToken(code);
		
		ClientCustomerVO clientCustomerVO = clientInsertKaLoginService.getKakaoUserInfo(token);
		ClientCustomerVO tempVO = clientSelectLoginService.selectLoginCheck(clientCustomerVO);
		
		// 최초 카카오톡 로그인 시 DB에 사용자 정보 삽입(회원가입)과 로그인을 동시에 처리
		// else if = 최초 카카오톡 로그인이 아닌 경우 DB 조회 후 로그인만 처리 (AccessToken 갱신 포함)
		// else = 카카오톡 로그인 실패
		if (tempVO == null) {
			clientInsertKaLoginService.insertKakao(clientCustomerVO);
			session.setAttribute("customer", clientCustomerVO);
			
			return "index";
		} else if(tempVO!=null && clientCustomerVO.getCustomerTbPassword()!=null) {
//			TODO DB 사용자의 accessToken과 updateToken을 업데이트 하는 서비스 필요
//			HashMap<String, Object> updateToken = clientInsertKaLoginService.updateKakaoAccessToken(clientCustomerVO);
			session.setAttribute("customer", tempVO);
			
			return "redirect:/index.do";
		} else {
			model.addAttribute("loginCheckSubmit", false);
			return "index";
		}
	}
	
}
