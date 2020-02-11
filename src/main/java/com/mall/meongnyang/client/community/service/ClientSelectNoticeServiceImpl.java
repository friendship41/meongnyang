package com.mall.meongnyang.client.community.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.shopping.dao.AdminNoticeDAO;
import com.mall.meongnyang.admin.shopping.vo.AdminNoticeVO;
import com.mall.meongnyang.client.community.dao.ClientNoticeDAO;
import com.mall.meongnyang.client.community.vo.ClientNoticeVO;

@Service("ClientSelectNoticeService")
public class ClientSelectNoticeServiceImpl implements ClientSelectNoticeService{

	 @Autowired
	 private ClientNoticeDAO clientNoticeDAO;
	
	@Override
	public ClientNoticeVO selectNotice(ClientNoticeVO clientNoticeVO) {
		// TODO Auto-generated method stub
		return clientNoticeDAO.selectNotice(clientNoticeVO);
	}
	

}
