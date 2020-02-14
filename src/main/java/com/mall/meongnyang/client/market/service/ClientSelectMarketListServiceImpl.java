package com.mall.meongnyang.client.market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.client.market.dao.ClientMarketDAO;
import com.mall.meongnyang.client.market.vo.ClientMarketVO;

@Repository
public class ClientSelectMarketListServiceImpl implements ClientSelectMarketListService {

	@Autowired
	private ClientMarketDAO clientMarketDAO;
	
	@Override
	public List<ClientMarketVO> selectMarketList(ClientMarketVO clientMarketVO) {
		
		return clientMarketDAO.selectMarketList(clientMarketVO);
	}

	@Override
	public int selectCountMarket() {
		return clientMarketDAO.selectCountMarket();
	}
	
	

}
