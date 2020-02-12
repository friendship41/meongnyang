package com.mall.meongnyang.client.community.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.client.community.vo.ClientFaqVO;

@Repository
public class ClientFaqDAOImpl implements ClientFaqDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	
	@Override
	public List<ClientFaqVO> selectFaqList(ClientFaqVO clientFaqVO) {
		return sqlSessionTemplate.selectList("AdminFaqDAO.selectFaqList", clientFaqVO);
	}
	
	
}
