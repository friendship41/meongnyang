package com.mall.meongnyang.admin.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.member.dao.AdminOverviewDAO;
import com.mall.meongnyang.admin.member.vo.AdminOverviewVisitorVO;

@Service("AdminSelectOverviewListService")
public class AdminSelectOverviewListServicceImpl implements AdminSelectOverviewListService{

	@Autowired
	private AdminOverviewDAO adminOverviewDAO;
	
	@Override
	public List<AdminOverviewVisitorVO> selectOverviewList(AdminOverviewVisitorVO adminOverviewVisitorVO) {
	
		return adminOverviewDAO.selectOverviewList(adminOverviewVisitorVO);
	}

	@Override
	public List<AdminOverviewVisitorVO> selectOverveiwListMonth(AdminOverviewVisitorVO adminOverviewVisitorVO) {
		
		return adminOverviewDAO.selectOverveiwListMonth(adminOverviewVisitorVO);
	}

	
	
}
