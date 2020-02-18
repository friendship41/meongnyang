package com.mall.meongnyang.client.market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.market.dao.ClientMarketCommentDAO;
import com.mall.meongnyang.client.market.vo.ClientMarketCommentVO;

@Service
public class ClientDeleteMarketCommentServiceImpl implements ClientDeleteMarketCommentService {

	@Autowired
	private ClientMarketCommentDAO clientMarketCommentDAO;
	
	@Override
	public void deleteComment(ClientMarketCommentVO clientMarketCommentVO) {
		clientMarketCommentVO.setMarketCommentTbContent("삭제된 댓글 입니다.");
//		System.out.println(clientMarketCommentVO.toString());
		clientMarketCommentDAO.updateMarketComment(clientMarketCommentVO);
	}

}
