package com.mall.meongnyang.client.community.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.shopping.vo.AdminNoticeVO;
import com.mall.meongnyang.client.community.dao.ClientNoticeDAO;

@Service("ClientSelectNoticeListService")
public class ClientSelectNoticeListServiceImpl implements ClientSelectNoticeListService{

	@Autowired
	private ClientNoticeDAO clientNoticeDAO;
	
	@Override
	public List<AdminNoticeVO> selectNoticeList(AdminNoticeVO adminNoticeVO) {
		
		return clientNoticeDAO.selectNoticeList(adminNoticeVO);
	}

}
