package com.mall.meongnyang.client.member.service;

import java.util.List;

import com.mall.meongnyang.admin.member.vo.AdminTermsVO;

public interface ClientSelectTermsListService {
	
	public List<AdminTermsVO> selectTermsNecessaryList(AdminTermsVO adminTermsVO);
	public List<AdminTermsVO> selectTermsOptionList(AdminTermsVO adminTermsVO);
}