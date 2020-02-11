package com.mall.meongnyang.client.community.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mall.meongnyang.client.community.dao.ClientNoticeDAO;
import com.mall.meongnyang.client.community.vo.ClientNoticeVO;

@Service("ClientSelectNoticeService")
public class ClientSelectNoticeServiceImpl implements ClientSelectNoticeService{

	 @Autowired
	 private ClientNoticeDAO clientNoticeDAO;
	
	@Override
	public ClientNoticeVO selectNotice(ClientNoticeVO clientNoticeVO) {
		
		return clientNoticeDAO.selectNotice(clientNoticeVO);
	}
	

}
