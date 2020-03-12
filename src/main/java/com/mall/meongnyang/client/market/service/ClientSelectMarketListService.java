package com.mall.meongnyang.client.market.service;

import java.util.List;

import com.mall.meongnyang.client.market.vo.ClientMarketVO;

public interface ClientSelectMarketListService {
	
	List<ClientMarketVO> selectMarketList(ClientMarketVO clientMarketVO);
	int selectCountMarket(ClientMarketVO clientMarketVO);
}
