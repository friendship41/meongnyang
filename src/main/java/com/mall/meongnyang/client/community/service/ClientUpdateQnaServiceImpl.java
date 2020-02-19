package com.mall.meongnyang.client.community.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.shopping.vo.AdminQnaVO;
import com.mall.meongnyang.client.community.dao.ClientQnaDAO;

@Service("ClientUpdateQnaService")
public class ClientUpdateQnaServiceImpl implements ClientUpdateQnaService {

	@Autowired
	private ClientQnaDAO clientQnaDAO;
	
	@Override
	public void updateQna(AdminQnaVO adminQnaVO) {
		clientQnaDAO.updateQna(adminQnaVO);
		
	}

}
