package com.mall.meongnyang.client.community.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.community.dao.ClientReviewDAO;
import com.mall.meongnyang.client.community.vo.ClientReviewVO;

@Service
public class ClientDeleteReviewServiceImpl implements ClientDeleteReviewService {
	
	@Autowired
	private ClientReviewDAO clientReviewDAO;

	@Override
	public void deleteReview(ClientReviewVO clientReviewVO) {
		clientReviewDAO.deleteReview(clientReviewVO);
	}

}
