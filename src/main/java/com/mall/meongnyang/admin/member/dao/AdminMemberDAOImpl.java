package com.mall.meongnyang.admin.member.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.admin.member.vo.AdminMemberVO;




@Repository("AdminMemberDAO")
public class AdminMemberDAOImpl implements AdminMemberDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public void updateMember(AdminMemberVO adminMemberVO) {
		sqlSessionTemplate.update("MemberDAO.updateMember", adminMemberVO);
		
	}

	@Override
	public List<AdminMemberVO> selectNoticeList(AdminMemberVO adminMemberVO) {
		return sqlSessionTemplate.selectList("MemberDAO.selectMemberList", adminMemberVO);
	}

	

	
}
