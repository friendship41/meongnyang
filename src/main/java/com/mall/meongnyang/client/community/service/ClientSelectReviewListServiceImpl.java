package com.mall.meongnyang.client.community.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.community.dao.ClientReviewDAO;
import com.mall.meongnyang.client.community.vo.ClientReviewVO;

@Service
public class ClientSelectReviewListServiceImpl implements ClientSelectReviewListService {

	@Autowired
	private ClientReviewDAO clientReviewDAO;
	
	@Override
	public List<ClientReviewVO> selectReviewList(ClientReviewVO clientReviewVO) {
		return clientReviewDAO.selectReviewList(clientReviewVO);
	}

	
}
