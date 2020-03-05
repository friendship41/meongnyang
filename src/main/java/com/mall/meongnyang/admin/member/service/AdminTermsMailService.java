package com.mall.meongnyang.admin.member.service;

import com.mall.meongnyang.admin.member.vo.AdminMemberVO;
import com.mall.meongnyang.util.mail.MailVO;

import java.util.List;

public interface AdminTermsMailService {
	public void send(MailVO mailVO, List<AdminMemberVO> memberList);
	
}