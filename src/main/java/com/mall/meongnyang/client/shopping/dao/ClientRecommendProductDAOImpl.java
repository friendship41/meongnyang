package com.mall.meongnyang.client.shopping.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.client.shopping.vo.ClientRecommendProductVO;

@Repository
public class ClientRecommendProductDAOImpl implements ClientRecommendProductDAO {
	
	@Autowired
	private SqlSessionTemplate sessionTemplate;

	@Override
	public List<ClientRecommendProductVO> selectRecommendProduct(ClientRecommendProductVO clientRecommendProductVO) {
		return sessionTemplate.selectList("ProductSaleDAO.selectRecommendProduct", clientRecommendProductVO);
	}

	
}
