package com.mall.meongnyang.client.shopping.service;

import java.util.List;

import com.mall.meongnyang.client.shopping.vo.ClientRecommendProductVO;

public interface ClientSelectRecommendProductService {
	
	List<ClientRecommendProductVO> selectRecommendProduct(ClientRecommendProductVO clientRecommendProductVO);
	
}
