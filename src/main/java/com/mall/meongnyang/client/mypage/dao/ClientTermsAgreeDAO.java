package com.mall.meongnyang.client.mypage.dao;

import com.mall.meongnyang.client.member.vo.ClientTermsAgreeVO;

public interface ClientTermsAgreeDAO {
	
		//약관동의 radio박스에 넣어주기
		public ClientTermsAgreeVO selectTermsAgree(ClientTermsAgreeVO clientTermsAgreeVO);
		
		//약관동의 업데이트
		public void updateTermsAgree(ClientTermsAgreeVO clientTermsAgreeVO);
}
