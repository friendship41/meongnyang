package com.mall.meongnyang.client.market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.market.dao.ClientMarketCommentDAO;
import com.mall.meongnyang.client.market.vo.ClientMarketCommentVO;

@Service
public class ClientUpdateMarketCommentServiceImpl implements ClientUpdateMarketCommentService {

	@Autowired
	private ClientMarketCommentDAO clientMarketCommentDAO;
	
	@Override
	public void updateComment(ClientMarketCommentVO clientMarketCommentVO) {
		
		clientMarketCommentDAO.updateMarketComment(clientMarketCommentVO);
	}

}
