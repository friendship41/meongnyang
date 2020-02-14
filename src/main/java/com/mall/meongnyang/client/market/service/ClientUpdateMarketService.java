package com.mall.meongnyang.client.market.service;

import javax.servlet.http.HttpServletRequest;

import com.mall.meongnyang.client.market.vo.ClientMarketVO;

public interface ClientUpdateMarketService {

	void updateMarket(ClientMarketVO clientMarketVO, HttpServletRequest request);
}
