package com.mall.meongnyang.client.market.service;

import java.util.List;

import com.mall.meongnyang.client.market.vo.ClientMarketCommentVO;

public interface ClientSelectMarketCommentListService {

	List<ClientMarketCommentVO> selectCommentList(ClientMarketCommentVO clientMarketCommentVO);
	int selectCommentCount(ClientMarketCommentVO clientMarketCommentVO);
}
