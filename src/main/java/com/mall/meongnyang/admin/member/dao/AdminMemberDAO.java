package com.mall.meongnyang.admin.member.dao;

import java.util.List;

import com.mall.meongnyang.admin.member.vo.AdminMemberVO;


public interface AdminMemberDAO {

	public void updateMember(AdminMemberVO adminMemberVO);
	
	public List<AdminMemberVO> selectNoticeList(AdminMemberVO adminMemberVO);
   
	
}
