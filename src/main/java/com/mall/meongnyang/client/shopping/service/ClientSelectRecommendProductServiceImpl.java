package com.mall.meongnyang.client.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.shopping.dao.ClientRecommendProductDAO;
import com.mall.meongnyang.client.shopping.vo.ClientRecommendProductVO;


@Service
public class ClientSelectRecommendProductServiceImpl implements ClientSelectRecommendProductService {
	
	@Autowired
	private ClientRecommendProductDAO clientRecommendProductDAO;

	@Override
	public List<ClientRecommendProductVO> selectRecommendProduct(ClientRecommendProductVO clientRecommendProductVO) {
		return clientRecommendProductDAO.selectRecommendProduct(clientRecommendProductVO);
	}

}
