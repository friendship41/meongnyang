package com.mall.meongnyang.admin.member.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.admin.member.vo.AdminOverviewVisitorVO;

@Repository("AdminOverviewDAO")
public class AdminOverviewDAOImpl implements AdminOverviewDAO{
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<AdminOverviewVisitorVO> selectOverviewList(AdminOverviewVisitorVO adminOverviewVisitorVO) {
		
	return sqlSessionTemplate.selectList("OverviewDAO.selectOverviewList", adminOverviewVisitorVO);
		
		
	}

}
