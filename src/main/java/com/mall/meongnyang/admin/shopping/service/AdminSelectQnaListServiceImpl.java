package com.mall.meongnyang.admin.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.shopping.dao.AdminQnaDAO;
import com.mall.meongnyang.admin.shopping.vo.AdminQnaVO;

@Service("AdminSelectQnaListService")
public class AdminSelectQnaListServiceImpl implements AdminSelectQnaListService {

	@Autowired
	private AdminQnaDAO adminQnaDAO;

	@Override
	public List<AdminQnaVO> selectQnaList(AdminQnaVO adminQnaVO) {
		List<AdminQnaVO> tempVO = adminQnaDAO.selectQnaList(adminQnaVO);
		return tempVO;
	}
	
	

}
