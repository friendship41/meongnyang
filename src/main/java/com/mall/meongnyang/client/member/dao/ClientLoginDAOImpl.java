package com.mall.meongnyang.client.member.dao;

import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
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

	

	@Override
	public void updateLastLogin(ClientCustomerVO clientCustomerVO) {
		sqlSessionTemplate.update("ClientLoginDAO.updateClientLastLogin", clientCustomerVO);
		
	}

  
  
  @Override
	public void updatePointUse(ClientOrderVO clientOrderVO)
	{
		sqlSessionTemplate.update("ClientLoginDAO.updatePointUse", clientOrderVO);
	}

	@Override
	public void updatePointRollback(ClientOrderVO clientOrderVO)
	{
		sqlSessionTemplate.update("ClientLoginDAO.updatePointRollback", clientOrderVO);
	}

	@Override
	public void updatePointPlus(ClientOrderVO clientOrderVO)
	{
		sqlSessionTemplate.update("ClientLoginDAO.updatePointPlus", clientOrderVO);
	}
}
