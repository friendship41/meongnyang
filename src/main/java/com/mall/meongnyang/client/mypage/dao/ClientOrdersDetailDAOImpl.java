package com.mall.meongnyang.client.mypage.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.client.mypage.vo.ClientOrdersDetailVO;

@Repository
public class ClientOrdersDetailDAOImpl implements ClientOrdersDetailDAO {

	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	@Override
	public List<ClientOrdersDetailVO> selectOrderDetail(ClientOrdersDetailVO clientOrdersDetailVO) {
		return sessionTemplate.selectList("orderDetailDAO.selectOrderDetail", clientOrdersDetailVO);	
	}

}
