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
		sqlSessionTemplate.selectList("termsAgreeDAO.selectTermsAgreeList", clientTermsAgreeVO);
		return null;
	}

	@Override
	public void updateTermsAgree(ClientTermsAgreeVO clientTermsAgreeVO) {
		sqlSessionTemplate.update("termsAgreeDAO.updateTermsAgreeList", clientTermsAgreeVO);

	}

}
