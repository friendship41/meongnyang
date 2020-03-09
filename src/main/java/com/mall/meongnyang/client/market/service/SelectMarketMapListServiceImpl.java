package com.mall.meongnyang.client.market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.market.dao.MarketMapDAO;
import com.mall.meongnyang.client.market.vo.MarketMapVO;

@Service
public class SelectMarketMapListServiceImpl implements SelectMarketMapListService {

	@Autowired
	private MarketMapDAO marketMapDAO;
	
	@Override
	public List<MarketMapVO> selectMarketMap(MarketMapVO marketMapVO) {
		
		List<MarketMapVO> list = marketMapDAO.selectMarketMap(marketMapVO);
		
		return list;
	}

}
