package com.mall.meongnyang.client.mypage.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.client.mypage.vo.ClientCmAddressVO;

@Repository("ClientMyinfoAddressDAO")
public class ClientMyinfoAddressDAOImpl implements ClientMyinfoAddressDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void insertMyinfoAddress(ClientCmAddressVO clientCmAddressVO) {
		sqlSessionTemplate.insert("ClientMyinfoDAO.insertMyinfoAddress", clientCmAddressVO);
		
		
	}

	@Override
	public void updateMyinfoAddress(ClientCmAddressVO clientCmAddressVO) {
		sqlSessionTemplate.update("ClientMyinfoDAO.updateMyinfoAddress", clientCmAddressVO);
		
	}

	@Override
	public void deleteMyinfoAddress(ClientCmAddressVO clientCmAddressVO) {
		sqlSessionTemplate.delete("ClientMyinfoDAO.deleteMyinfoAddress", clientCmAddressVO);
		
	}

	@Override
	public List<ClientCmAddressVO> selectMyinfoAddressList(ClientCmAddressVO clientCmAddressVO) {
		
		return sqlSessionTemplate.selectList("ClientMyinfoDAO.selectMyinfoAddressList", clientCmAddressVO);
		
	}

	@Override
	public ClientCmAddressVO selectMyinfoAddress(ClientCmAddressVO clientCmAddressVO) {
		return sqlSessionTemplate.selectOne("ClientMyinfoDAO.selectMyinfoAddress", clientCmAddressVO);
		
	}

}
