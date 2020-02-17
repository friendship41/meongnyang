package com.mall.meongnyang.admin.member.service;

import java.util.List;

import com.mall.meongnyang.admin.member.vo.AdminTermsVO;

public interface AdminSelectTermsListService {
	
	public List<AdminTermsVO> selectTermsList(AdminTermsVO adminTermsVO);
}
