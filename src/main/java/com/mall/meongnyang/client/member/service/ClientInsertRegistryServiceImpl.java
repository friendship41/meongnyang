package com.mall.meongnyang.client.member.service;

import com.mall.meongnyang.util.annotation.NoLogging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.member.dao.ClientLoginDAO;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;

@Service("ClientInsertRegistry")
public class ClientInsertRegistryServiceImpl implements ClientInsertRegistryService {

	@Autowired
	private ClientLoginDAO clientLoginDAO;

	@Override
	@NoLogging
	public int insertRegistry(ClientCustomerVO clientCustomerVO) {
		BCryptPasswordEncoder encoder 
			= new BCryptPasswordEncoder();
		
		String securePw = encoder.encode(clientCustomerVO.getCustomerTbPassword());
		clientCustomerVO.setCustomerTbPassword(securePw);
		
		
		
		int result = clientLoginDAO.insertRegistry(clientCustomerVO);
		return result;
		
	}

	
	
	

}
