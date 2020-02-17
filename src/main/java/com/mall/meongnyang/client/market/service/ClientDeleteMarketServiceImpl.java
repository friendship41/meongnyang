package com.mall.meongnyang.client.market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.market.dao.ClientMarketDAO;

@Service
public class ClientDeleteMarketServiceImpl implements ClientDeleteMarketService {

	@Autowired
	private ClientMarketDAO clientMarketDAO;
	
	@Override
	public void deleteMarket(int marketTbNo) {
		clientMarketDAO.deleteMarket(marketTbNo);
	}

}
