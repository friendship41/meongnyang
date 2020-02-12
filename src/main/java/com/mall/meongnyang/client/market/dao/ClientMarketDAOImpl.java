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
		sqlSessionTemplate.insert("marketDAO.insertMarket", clientMarketVO);		
	}

	@Override
	public void updateMarket(ClientMarketVO clientMarketVO) {
		sqlSessionTemplate.update("marketDAO.updateMarket", clientMarketVO);
	}

	@Override
	public void deleteMarket(int marketTbNo) {
		sqlSessionTemplate.delete("marketDAO.deleteMarket", marketTbNo);
	}

	@Override
	public ClientMarketVO selectMarket(int marketTbNo) {
		return sqlSessionTemplate.selectOne("marketDAO.selectMarket", marketTbNo);
	}

	@Override
	public List<ClientMarketVO> selectMarketList() {
		return sqlSessionTemplate.selectList("marketDAO.selectMarketList");
	}

	@Override
	public int selectCountMarket() {
		return sqlSessionTemplate.selectOne("marketDAO.selectCountMarket");
	}

	@Override
	public void updateReadCount(int marketTbNo) {
		sqlSessionTemplate.update("marketDAO.updateReadCount", marketTbNo);
	}

}
