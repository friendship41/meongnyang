package com.mall.meongnyang.client.community.service;

import com.mall.meongnyang.admin.shopping.vo.AdminQnaVO;
import com.mall.meongnyang.client.community.dao.ClientQnaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ClientSelectQnaListService")
public class ClientSelectQnaListServiceImpl implements ClientSelectQnaListService {

	@Autowired
	private ClientQnaDAO clientQnaDAO;
	
	@Override
	public List<AdminQnaVO> selectQnaList(AdminQnaVO adminQnaVO) {
		List<AdminQnaVO> tempVO = clientQnaDAO.selectQnaList(adminQnaVO);
		return tempVO;
	}

	@Override
	public int selectCountQna() {
		return clientQnaDAO.selectCountQna();
	}

	

}
