package com.mall.meongnyang.client.community.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.shopping.vo.AdminNoticeVO;
import com.mall.meongnyang.client.community.dao.ClientNoticeDAO;

@Service("ClientSelectNoticeService")
public class ClientSelectNoticeServiceImpl implements ClientSelectNoticeService{

	 @Autowired
	 private ClientNoticeDAO clientNoticeDAO;
	
	@Override
	public AdminNoticeVO selectNotice(AdminNoticeVO adminNoticeVO) {
		
		return clientNoticeDAO.selectNotice(adminNoticeVO);
	}
	

}
