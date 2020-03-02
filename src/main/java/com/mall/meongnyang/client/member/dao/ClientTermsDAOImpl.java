package com.mall.meongnyang.client.member.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.admin.member.vo.AdminTermsVO;
import com.mall.meongnyang.client.member.vo.ClientTermsAgreeVO;

@Repository
public class ClientTermsDAOImpl implements ClientTermsDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<AdminTermsVO> selectTermsNecessaryList(AdminTermsVO adminTermsVO) {
		
		return sqlSessionTemplate.selectList("termsDAO.selectTermsNecessaryList", adminTermsVO);
	}

	@Override
	public List<AdminTermsVO> selectTermsOptionList(AdminTermsVO adminTermsVO) {
		
		return sqlSessionTemplate.selectList("termsDAO.selectTermsOptionList", adminTermsVO);
	}

	@Override
	public void insertTermsAgreeList(ClientTermsAgreeVO clientTermsAgreeVO) {
		
		sqlSessionTemplate.insert("termsDAO.insertTermsAgreeList", clientTermsAgreeVO);
		
	}
	
	
	
}