package com.mall.meongnyang.client.member.dao;

import java.util.List;

import com.mall.meongnyang.admin.member.vo.AdminTermsVO;
import com.mall.meongnyang.client.member.vo.ClientTermsAgreeVO;

public interface ClientTermsDAO {

	public List<AdminTermsVO> selectTermsNecessaryList(AdminTermsVO adminTermsVO);
	public List<AdminTermsVO> selectTermsOptionList(AdminTermsVO adminTermsVO);
	public void insertTermsAgreeList(ClientTermsAgreeVO clientTermsAgreeVO);
}