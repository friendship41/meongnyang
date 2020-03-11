package com.mall.meongnyang.client.market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.market.dao.ClientMarketCommentDAO;
import com.mall.meongnyang.client.market.vo.ClientMarketCommentVO;

@Service
public class ClientInsertMarketCommentServiceImpl implements ClientInsertMarketCommentService {

	@Autowired
	private ClientMarketCommentDAO clientMarketCommentDAO;
	
	@Override
	public void insertComment(ClientMarketCommentVO clientMarketCommentVO) {
	
		if(clientMarketCommentVO.getMarketCommentTbRef() > 0) {
			clientMarketCommentDAO.updateStep(clientMarketCommentVO);
			clientMarketCommentVO.setMarketCommentTbStep(clientMarketCommentVO.getMarketCommentTbStep() + 1);
		} 

		clientMarketCommentDAO.insertMarketComment(clientMarketCommentVO);		
	}

}
