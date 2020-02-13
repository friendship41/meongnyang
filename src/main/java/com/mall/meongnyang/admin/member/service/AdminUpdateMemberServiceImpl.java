package com.mall.meongnyang.admin.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.member.dao.AdminMemberDAO;
import com.mall.meongnyang.admin.member.vo.AdminMemberVO;

@Service("AdminUpdateMemberService")
public class AdminUpdateMemberServiceImpl implements AdminUpdateMemberService{

	@Autowired
	private AdminMemberDAO adminMemberDAO;
	
	@Override
	public void updateMember(AdminMemberVO adminMemberVO) {
	
		adminMemberDAO.updateMember(adminMemberVO);
	}

}
