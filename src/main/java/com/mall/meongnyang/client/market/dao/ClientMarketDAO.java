package com.mall.meongnyang.client.market.dao;

import java.util.List;

import com.mall.meongnyang.client.market.vo.ClientMarketVO;

public interface ClientMarketDAO {

	void insertMarket(ClientMarketVO clientMarketVO);
	void updateMarket(ClientMarketVO clientMarketVO);
	void deleteMarket(ClientMarketVO clientMarketVO);
	ClientMarketVO selectMarket(ClientMarketVO clientMarketVO);
	List<ClientMarketVO> selectMarketList(ClientMarketVO clientMarketVO);
	int selectCountMarket(ClientMarketVO clientMarketVO); //마켓 전체 글수
	void updateReadCount(ClientMarketVO clientMarketVO); //게시글 조회 수 증가
}
