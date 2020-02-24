package com.mall.meongnyang.client.community.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.shopping.vo.AdminQnaVO;
import com.mall.meongnyang.client.community.dao.ClientQnaDAO;

@Service("ClientDeleteQnaService")
public class ClientDeleteQnaServiceImpl implements ClientDeleteQnaService {

	@Autowired
	private ClientQnaDAO clientQnaDAO;
	
	@Override
	public void deleteQna(AdminQnaVO adminQnaVO) {
		clientQnaDAO.deleteQna(adminQnaVO);
		
	}

	
	
	

}
