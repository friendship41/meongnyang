package com.mall.meongnyang.client.shopping.dao;

import java.util.List;

import com.mall.meongnyang.client.shopping.vo.ClientRecommendProductVO;

public interface ClientRecommendProductDAO {

	List<ClientRecommendProductVO> selectRecommendProduct(ClientRecommendProductVO clientRecommendProductVO);
}
