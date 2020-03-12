package com.mall.meongnyang.admin.member.dao;

import com.mall.meongnyang.admin.member.vo.AdminOverviewVisitorVO;
import com.mall.meongnyang.client.scheduler.todaycount.ClientUserCountVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("AdminOverviewDAO")
public class AdminOverviewDAOImpl implements AdminOverviewDAO{
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<AdminOverviewVisitorVO> selectOverviewList(AdminOverviewVisitorVO adminOverviewVisitorVO) {
		
	return sqlSessionTemplate.selectList("OverviewDAO.selectOverviewList", adminOverviewVisitorVO);
		
		
	}

	@Override
	public List<AdminOverviewVisitorVO> selectOverveiwListMonth(AdminOverviewVisitorVO adminOverviewVisitorVO) {
		
		return sqlSessionTemplate.selectList("OverviewDAO.selectOverviewListMonth", adminOverviewVisitorVO);
	}

	@Override
	public List<ClientUserCountVO> selectWeekVisitorList(ClientUserCountVO clientUserCountVO)
	{
		return sqlSessionTemplate.selectList("OverviewDAO.selectWeekVisitorList", clientUserCountVO);
	}
}
