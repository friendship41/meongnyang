package com.mall.meongnyang.client.member.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.scribejava.core.model.OAuth2AccessToken;
import com.mall.meongnyang.client.member.service.ClientNaverLoginService;
import com.mall.meongnyang.client.member.service.ClientSelectLoginService;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;







@Controller
public class ClientNaverLoginController {
	


	@Autowired
	private ClientSelectLoginService clientSelectLoginService;
	
	@Autowired
	private ClientNaverLoginService clientNaverLoginService;
	
	@Autowired
	private NaverLoginBO naverLoginBO;
	

	private String apiResult = null;
	
	@Autowired
	private void setNaverLoginBO(NaverLoginBO naverLoginBO) {
		this.naverLoginBO = naverLoginBO;
	}
	
	@RequestMapping(value = "/index.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String login(Model model, HttpSession session) {
		
		/* 네이버아이디로 인증 URL을 생성하기 위하여 naverLoginBO클래스의 getAuthorizationUrl메소드 호출 */
		String naverAuthUrl = naverLoginBO.getAuthorizationUrl(session);
		
		//https://nid.naver.com/oauth2.0/authorize?response_type=code&client_id=sE***************&
		//redirect_uri=http%3A%2F%2F211.63.89.90%3A8090%2Flogin_project%2Fcallback&state=e68c269c-5ba9-4c31-85da-54c16c658125
		System.out.println("네이버:" + naverAuthUrl);
		
		//네이버 
		model.addAttribute("url", naverAuthUrl);

		/* 생성한 인증 URL을 View로 전달 */
		return "index";
	}
	
	@RequestMapping(value="/NaverLogin.do",method = { RequestMethod.GET, RequestMethod.POST })
	public String NaverLogin(Model model, @RequestParam String code, @RequestParam String state, HttpSession session,ClientCustomerVO clientCustomerVO) 
		throws IOException, ParseException {
			System.out.println("여기는 callback");
			OAuth2AccessToken oauthToken;
	        oauthToken = naverLoginBO.getAccessToken(session, code, state);
	        //로그인 사용자 정보를 읽어온다.
		    apiResult = naverLoginBO.getUserProfile(oauthToken);
		   
		    
			model.addAttribute("result", apiResult);

			/** apiResult json 구조
			{"resultcode":"00",
			"message":"success",
			"response":{"id":"33666449","nickname":"shinn****","age":"20-29","gender":"M","email":"sh@naver.com","name":"\uc2e0\ubc94\ud638"}}
			**/
			//2. String형식인 apiResult를 json형태로 바꿈
			JSONParser parser = new JSONParser();
			Object obj = parser.parse(apiResult);
			JSONObject jsonObj = (JSONObject) obj;
			//3. 데이터 파싱
			//Top레벨 단계 _response 파싱
			JSONObject response_obj = (JSONObject)jsonObj.get("response");
			//response의 nickname값 파싱
			String naveremail = (String)response_obj.get("email");
			String navername=(String)response_obj.get("name");
			
			System.out.println(naveremail);
			System.out.println(navername);
			
			
			ClientCustomerVO tempVO = clientSelectLoginService.selectLoginCheck(clientCustomerVO);
			if(tempVO==null) {
				clientCustomerVO.setCustomerTbEmail(naveremail);
				clientCustomerVO.setCustomerTbName(navername);
				clientNaverLoginService.insertNaver(clientCustomerVO);
				
				session.setAttribute("customer", clientCustomerVO);
				
				}else if(tempVO!=null && clientCustomerVO.getCustomerTbPassword()!=null) {
			
					session.setAttribute("customer", tempVO);
				
					return "redirect:/index.do";
				}else {
					model.addAttribute("loginCheckSubmit",false);
					return "index";
				}
			
			//4.파싱 닉네임 세션으로 저장
//			session.setAttribute("customer",clientCustomerVO);//세션 생성
//			
//			model.addAttribute("result", apiResult);
			
			
			
			return "index";
			}
		
		
		
	
	
}
		
	