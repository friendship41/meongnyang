package com.mall.meongnyang.client.community.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.shopping.vo.AdminQnaTypeVO;
import com.mall.meongnyang.client.community.dao.ClientQnaDAO;

@Service("ClientSelectQnaTypeListService")
public class ClientSelectQnaTypeListServiceImpl implements ClientSelectQnaTypeListService {

	@Autowired
	private ClientQnaDAO clientQnaDAO;
	
	@Override
	public List<AdminQnaTypeVO> selectQnaTypeList(AdminQnaTypeVO adminQnaTypeVO) {
		
		return clientQnaDAO.selectQnaTypeList(adminQnaTypeVO);
	}

}
