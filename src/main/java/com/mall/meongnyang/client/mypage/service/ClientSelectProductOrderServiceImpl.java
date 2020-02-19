package com.mall.meongnyang.client.mypage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.mypage.dao.ClientProductOrderDAO;
import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

@Service
public class ClientSelectProductOrderServiceImpl implements ClientSelectProductOrderService {

	@Autowired
	private ClientProductOrderDAO clientProductOrderDAO;
	
	@Override
	public ClientProductOrderVO selectProductOrder(ClientProductOrderVO clientProductOrderVO) {
		return clientProductOrderDAO.selectProductOrder(clientProductOrderVO);
	}

}
