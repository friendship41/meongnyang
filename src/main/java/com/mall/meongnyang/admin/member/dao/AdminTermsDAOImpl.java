package com.mall.meongnyang.admin.member.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.admin.member.vo.AdminTermsVO;

@Repository
public class AdminTermsDAOImpl implements AdminTermsDAO {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<AdminTermsVO> selectTermsList(AdminTermsVO adminTermsVO) {
		return sqlSessionTemplate.selectList("termsDAO.selectTermsList",adminTermsVO);
	}

	@Override
	public AdminTermsVO selectTerms(AdminTermsVO adminTermsVO) {
		
		return sqlSessionTemplate.selectOne("termsDAO.selectTerms",adminTermsVO);
	}

	@Override
	public void insertTerms(AdminTermsVO adminTermsVO) {
		
		sqlSessionTemplate.insert("termsDAO.insertTerms", adminTermsVO);
		
	}

	@Override
	public void updateTerms(AdminTermsVO adminTermsVO) {
		
		sqlSessionTemplate.update("termsDAO.updateTerms", adminTermsVO);
		
	}
	
	
	
	
	
}
