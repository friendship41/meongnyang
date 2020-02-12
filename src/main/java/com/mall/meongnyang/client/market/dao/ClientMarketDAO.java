package com.mall.meongnyang.client.market.dao;

import java.util.List;

import com.mall.meongnyang.client.market.vo.ClientMarketVO;

public interface ClientMarketDAO {

	void insertMarket(ClientMarketVO clientMarketVO);
	void updateMarket(ClientMarketVO clientMarketVO);
	void deleteMarket(int marketTbNo);
	ClientMarketVO selectMarket(int marketTbNo);
	List<ClientMarketVO> selectMarketList();
	int selectCountMarket(); //마켓 전체 글수
	void updateReadCount(int marketTbNo); //게시글 조회 수 증가
}
