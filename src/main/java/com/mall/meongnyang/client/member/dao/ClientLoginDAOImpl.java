package com.mall.meongnyang.client.member.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.client.member.vo.ClientCustomerVO;

@Repository("ClientLoginDAO")
public class ClientLoginDAOImpl implements ClientLoginDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public ClientCustomerVO selectLoginCheck(ClientCustomerVO clientCustomerVO) {
		ClientCustomerVO tempVO = sqlSessionTemplate.selectOne("ClientLoginDAO.selectClientLoginCheck", clientCustomerVO);
		
		return tempVO;
	}

	@Override
	public ClientCustomerVO logout(ClientCustomerVO clientCustomerVO) {
		ClientCustomerVO tempVO = sqlSessionTemplate.selectOne("ClientLoginDAO.selectClientLoginCheck", clientCustomerVO);
		return tempVO;
	}

	@Override
	public int insertRegistry(ClientCustomerVO clientCustomerVO) {
		int result = sqlSessionTemplate.insert("ClientLoginDAO.insertRegistry", clientCustomerVO);
		return result;
	}

	

	

}
