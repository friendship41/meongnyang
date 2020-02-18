package com.mall.meongnyang.client.community.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.shopping.vo.AdminQnaVO;
import com.mall.meongnyang.client.community.dao.ClientQnaDAO;

@Service("ClientSelectQnaListService")
public class ClientSelectQnaListServiceImpl implements ClientSelectQnaListService {

	@Autowired
	private ClientQnaDAO clientQnaDAO;
	
	@Override
	public List<AdminQnaVO> selectQnaList(AdminQnaVO adminQnaVO) {
		
		return clientQnaDAO.selectQnaList(adminQnaVO);
	}

}
