package com.mall.meongnyang.client.mypage.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.client.member.vo.ClientTermsAgreeVO;

@Repository("ClientTermsAgreeDAO")
public class ClientTermsAgreeDAOImpl implements ClientTermsAgreeDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public ClientTermsAgreeVO selectTermsAgree(ClientTermsAgreeVO clientTermsAgreeVO) {
		ClientTermsAgreeVO tempVO = sqlSessionTemplate.selectOne("termsAgreeDAO.selectTermsAgree", clientTermsAgreeVO);
		
		return tempVO;
		
	}

	@Override
	public void updateTermsAgree(ClientTermsAgreeVO clientTermsAgreeVO) {
		sqlSessionTemplate.update("termsAgreeDAO.updateTermsAgree", clientTermsAgreeVO);

	}

}
