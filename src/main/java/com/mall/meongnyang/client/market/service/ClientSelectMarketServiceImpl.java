package com.mall.meongnyang.client.market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.market.dao.ClientMarketDAO;
import com.mall.meongnyang.client.market.vo.ClientMarketVO;

@Service
public class ClientSelectMarketServiceImpl implements ClientSelectMarketService {

	@Autowired
	private ClientMarketDAO clientMarketDAO;
	
	@Override
	public ClientMarketVO selectMarket(int marketTbNo) {
		clientMarketDAO.updateReadCount(marketTbNo);
		return clientMarketDAO.selectMarket(marketTbNo);
	}

}
