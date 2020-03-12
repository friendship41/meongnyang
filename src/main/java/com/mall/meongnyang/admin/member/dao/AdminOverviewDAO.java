package com.mall.meongnyang.admin.member.dao;

import com.mall.meongnyang.admin.member.vo.AdminOverviewVisitorVO;
import com.mall.meongnyang.client.scheduler.todaycount.ClientUserCountVO;

import java.util.List;


public interface AdminOverviewDAO {

	public List<AdminOverviewVisitorVO> selectOverviewList(AdminOverviewVisitorVO adminOverviewVisitorVO);
	public List<AdminOverviewVisitorVO> selectOverveiwListMonth(AdminOverviewVisitorVO adminOverviewVisitorVO);
	public List<ClientUserCountVO> selectWeekVisitorList(ClientUserCountVO clientUserCountVO);
	
}
