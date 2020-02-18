package com.mall.meongnyang.client.market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.market.dao.ClientMarketCommentDAO;
import com.mall.meongnyang.client.market.vo.ClientMarketCommentVO;

@Service
public class ClientSelectMarketCommentListServiceImpl implements ClientSelectMarketCommentListService {

	@Autowired
	private ClientMarketCommentDAO clientMarketCommentDAO;
	
	@Override
	public List<ClientMarketCommentVO> selectCommentList(ClientMarketCommentVO clientMarketCommentVO) {
		return clientMarketCommentDAO.selectMarketCommentList(clientMarketCommentVO);
	}

	@Override
	public int selectCommentCount(ClientMarketCommentVO clientMarketCommentVO) {
		return clientMarketCommentDAO.selectCommentCount(clientMarketCommentVO);
	}

}
