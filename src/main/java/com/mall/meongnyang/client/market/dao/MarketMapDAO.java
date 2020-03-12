package com.mall.meongnyang.client.market.dao;

import java.util.List;

import com.mall.meongnyang.client.market.vo.MarketMapVO;

public interface MarketMapDAO {
	
	List<MarketMapVO> selectMarketMap(MarketMapVO marketMapVO);

}
