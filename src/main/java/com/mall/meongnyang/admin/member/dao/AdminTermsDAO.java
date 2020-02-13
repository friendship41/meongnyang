package com.mall.meongnyang.admin.member.dao;

import java.util.List;

import com.mall.meongnyang.admin.member.vo.AdminTermsVO;

public interface AdminTermsDAO {
	
	public List<AdminTermsVO> selectTermsList(AdminTermsVO adinTermsVO);
	public AdminTermsVO selectTerms(AdminTermsVO adminTermsVO);
	public void insertTerms(AdminTermsVO adminTermsVO);
	public void updateTerms(AdminTermsVO adminTermsVO);
}
