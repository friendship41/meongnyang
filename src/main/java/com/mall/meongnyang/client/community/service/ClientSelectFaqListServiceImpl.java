package com.mall.meongnyang.client.community.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.community.dao.ClientFaqDAO;
import com.mall.meongnyang.client.community.vo.ClientFaqVO;

@Service
public class ClientSelectFaqListServiceImpl implements ClientSelectFaqListService {
	@Autowired
	private ClientFaqDAO clientFaqDAO;
	
	@Override
	public List<ClientFaqVO> selectFaqList(ClientFaqVO clientFaqVO) {
		return clientFaqDAO.selectFaqList(clientFaqVO);
	}

}
