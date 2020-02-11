package com.mall.meongnyang.client.community.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mall.meongnyang.client.community.dao.ClientNoticeDAO;
import com.mall.meongnyang.client.community.vo.ClientNoticeVO;

@Service("ClientSelectNoticeListService")
public class ClientSelectNoticeListServiceImpl implements ClientSelectNoticeListService{

	@Autowired
	private ClientNoticeDAO clientNoticeDAO;
	
	@Override
	public List<ClientNoticeVO> selectNoticeList(ClientNoticeVO clientNoticeVO) {
		
		return clientNoticeDAO.selectNoticeList(clientNoticeVO);
	}

}
