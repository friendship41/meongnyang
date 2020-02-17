package com.mall.meongnyang.admin.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.member.dao.AdminMemberDAO;
import com.mall.meongnyang.admin.member.vo.AdminMemberVO;

@Service("AdminSelectMemberListService")
public class AdminSelectMemberListServiceImpl implements AdminSelectMemberListService{

	@Autowired
	private AdminMemberDAO adminMemberDAO;
	
	@Override
	public List<AdminMemberVO> selectMemberList(AdminMemberVO adminMemberVO) {
		
		return adminMemberDAO.selectNoticeList(adminMemberVO);
		
		
	}
	

	
	
}
