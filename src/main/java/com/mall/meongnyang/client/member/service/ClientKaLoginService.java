package com.mall.meongnyang.client.member.service;

import java.util.HashMap;

import com.mall.meongnyang.client.member.vo.ClientCustomerVO;

public interface ClientKaLoginService {

	public void insertKakao(ClientCustomerVO clientCustomerVO);
	// Access Token 발급 (최초 혹은 만료 사용자)
	public HashMap<String, Object> getKakaoAccessToken(String authorize_code);
	// Access Token을 이용하여 kakao 계정 정보 획득
	public ClientCustomerVO getKakaoUserInfo(HashMap<String, Object> token);
	// Access Token 갱신용
	public HashMap<String, Object> updateKakaoAccessToken(ClientCustomerVO clientCustomerVO);
}
