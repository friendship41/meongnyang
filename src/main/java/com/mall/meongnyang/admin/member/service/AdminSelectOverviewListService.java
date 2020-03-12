package com.mall.meongnyang.admin.member.service;

import java.util.List;

import com.mall.meongnyang.admin.member.vo.AdminOverviewVisitorVO;

public interface AdminSelectOverviewListService {

	public List<AdminOverviewVisitorVO> selectOverviewList(AdminOverviewVisitorVO adminOverviewVisitorVO);

	
	public List<AdminOverviewVisitorVO> selectOverveiwListMonth(AdminOverviewVisitorVO adminOverviewVisitorVO);

	
	
}
