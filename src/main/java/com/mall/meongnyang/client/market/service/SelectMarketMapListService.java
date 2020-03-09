package com.mall.meongnyang.client.market.service;

import java.util.List;

import com.mall.meongnyang.client.market.vo.MarketMapVO;

public interface SelectMarketMapListService {
	
	List<MarketMapVO> selectMarketMap(MarketMapVO marketMapVO);
}
