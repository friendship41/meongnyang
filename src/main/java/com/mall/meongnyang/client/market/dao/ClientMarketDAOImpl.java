package com.mall.meongnyang.client.market.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.client.market.vo.ClientMarketVO;

@Repository
public class ClientMarketDAOImpl implements ClientMarketDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void insertMarket(ClientMarketVO clientMarketVO) {
		sqlSessionTemplate.insert("MarketDAO.insertMarket", clientMarketVO);		
	}

	@Override
	public void updateMarket(ClientMarketVO clientMarketVO) {
		sqlSessionTemplate.update("MarketDAO.updateMarket", clientMarketVO);
	}

	@Override
	public void deleteMarket(ClientMarketVO clientMarketVO) {
		sqlSessionTemplate.delete("MarketDAO.deleteMarket", clientMarketVO);
	}

	@Override
	public ClientMarketVO selectMarket(ClientMarketVO clientMarketVO) {
		return sqlSessionTemplate.selectOne("MarketDAO.selectMarket", clientMarketVO);
	}

	@Override
	public List<ClientMarketVO> selectMarketList(ClientMarketVO clientMarketVO) {
		return sqlSessionTemplate.selectList("MarketDAO.selectMarketList", clientMarketVO);
	}

	@Override
	public int selectCountMarket(ClientMarketVO clientMarketVO) {
		return sqlSessionTemplate.selectOne("MarketDAO.selectCountMarket", clientMarketVO);
	}

	@Override
	public void updateReadCount(ClientMarketVO clientMarketVO) {
		sqlSessionTemplate.update("MarketDAO.updateReadCount", clientMarketVO);
	}

}
