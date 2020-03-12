package com.mall.meongnyang.client.market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.market.dao.ClientMarketDAO;
import com.mall.meongnyang.client.market.vo.ClientMarketVO;

@Service
public class ClientDeleteMarketServiceImpl implements ClientDeleteMarketService {

	@Autowired
	private ClientMarketDAO clientMarketDAO;
	
	@Override
	public void deleteMarket(ClientMarketVO clientMarketVO) {
		clientMarketDAO.deleteMarket(clientMarketVO);
	}

}
