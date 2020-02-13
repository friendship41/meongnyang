package com.mall.meongnyang.client.market.dao;

import java.util.List;

import com.mall.meongnyang.client.market.vo.ClientMarketCommentVO;

public interface ClientMarketCommentDAO {

	void insertMarketComment(ClientMarketCommentVO clientMarketCommentVO);
	void updateMarketComment(ClientMarketCommentVO clientMarketCommentVO);
	void deleteMarketComment(ClientMarketCommentVO clientMarketCommentVO);
	ClientMarketCommentVO selectMarketComment(ClientMarketCommentVO clientMarketCommentVO);
	List<ClientMarketCommentVO> selectMarketCommentList(ClientMarketCommentVO clientMarketCommentVO);
}
