package com.mall.meongnyang.client.market.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.client.market.vo.MarketMapVO;

@Repository
public class MarketMapDAOImpl implements MarketMapDAO {
	
	@Autowired
	private SqlSessionTemplate sessionTemplate;

	@Override
	public List<MarketMapVO> selectMarketMap(MarketMapVO marketMapVO) {
		return sessionTemplate.selectList("MarketDAO.selectMarketMap", marketMapVO);
	}

}
