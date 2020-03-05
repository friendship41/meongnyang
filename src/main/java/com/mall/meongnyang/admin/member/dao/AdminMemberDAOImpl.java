package com.mall.meongnyang.admin.member.dao;

import com.mall.meongnyang.admin.member.vo.AdminMemberVO;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;




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

	@Override
	public List<ClientCustomerVO> selectMailAgreeCustomerList(ClientCustomerVO clientCustomerVO)
	{
		return sqlSessionTemplate.selectList("ClientLoginDAO.selectMailAgreeCustomerList", clientCustomerVO);
	}


}
