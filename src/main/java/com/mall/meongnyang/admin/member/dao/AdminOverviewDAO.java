package com.mall.meongnyang.admin.member.dao;

import java.util.List;

import com.mall.meongnyang.admin.member.vo.AdminOverviewVisitorVO;



public interface AdminOverviewDAO {

	public List<AdminOverviewVisitorVO> selectOverviewList(AdminOverviewVisitorVO adminOverviewVisitorVO);
	
}
