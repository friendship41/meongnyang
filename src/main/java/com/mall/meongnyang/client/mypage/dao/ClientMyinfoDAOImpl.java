package com.mall.meongnyang.client.mypage.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.client.mypage.vo.ClientCmAddressVO;

@Repository("ClientMyinfoDAO")
public class ClientMyinfoDAOImpl implements ClientMyinfoDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	
	


	@Override
	public void updateMyinfoPhone(ClientCustomerVO clientCustomerVO) {
		sqlSessionTemplate.update("ClientLoginDAO.updateMyinfoPhone", clientCustomerVO);
		
	}


	@Override
	public void updateMyinfoPassword(ClientCustomerVO clientCustomerVO) {
		sqlSessionTemplate.update("ClientLoginDAO.updateMyinfoPassword", clientCustomerVO);
		
	}


	@Override
	public ClientCustomerVO selectMyinfoPassword(ClientCustomerVO clientCustomerVO) {
		ClientCustomerVO tempVO = sqlSessionTemplate.selectOne("ClientLoginDAO.selectMyinfoPassword", clientCustomerVO);
		return tempVO;
	}


	@Override
	public void deleteMyinfoCustomer(ClientCustomerVO clientCustomerVO) {
		sqlSessionTemplate.delete("ClientLoginDAO.deleteMyinfoCustomer", clientCustomerVO);
		
	}


	


	

	

}
