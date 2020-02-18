package com.mall.meongnyang.client.community.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.shopping.vo.AdminQnaVO;
import com.mall.meongnyang.client.community.dao.ClientQnaDAO;

@Service("ClientSelectQnaService")
public class ClientSelectQnaServiceImpl implements ClientSelectQnaService {

	@Autowired
	private ClientQnaDAO clientQnaDAO;
	
	@Override
	public AdminQnaVO selectQna(AdminQnaVO adminQnaVO) {
		
		
		
		return clientQnaDAO.selectQna(adminQnaVO);
	}

}
