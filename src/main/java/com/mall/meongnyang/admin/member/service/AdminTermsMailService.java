package com.mall.meongnyang.admin.member.service;

import java.util.List;

import com.mall.meongnyang.admin.member.vo.AdminMemberVO;
import com.mall.meongnyang.admin.member.vo.AdminTermsMailVO;

public interface AdminTermsMailService {
	public void send(AdminTermsMailVO mailVO, List<AdminMemberVO> memberList);
	
}