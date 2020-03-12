package com.mall.meongnyang.admin.member.service;

import java.util.List;

import com.mall.meongnyang.admin.member.vo.AdminMemberVO;

public interface AdminSelectMemberListService {

	public List<AdminMemberVO> selectMemberList(AdminMemberVO adminMemberVO);
}
