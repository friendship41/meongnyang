package com.mall.meongnyang.client.mypage.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

@Repository
public class ClientProductOrderDAOImpl implements ClientProductOrderDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<ClientProductOrderVO> selectProductOrderList(ClientProductOrderVO clientProductOrderVO) {
		return sqlSessionTemplate.selectList("orderDAO.selectOrderList", clientProductOrderVO);
	}

	@Override
	public int selectOrderCount(ClientProductOrderVO clientProductOrderVO) {
		return sqlSessionTemplate.selectOne("orderDAO.selectOrderCount", clientProductOrderVO);
	}

	@Override
	public ClientProductOrderVO selectProductOrder(ClientProductOrderVO clientProductOrderVO) {
		return sqlSessionTemplate.selectOne("orderDAO.selectOrder", clientProductOrderVO);
	}	
}
