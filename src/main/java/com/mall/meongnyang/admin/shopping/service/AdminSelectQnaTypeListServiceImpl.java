package com.mall.meongnyang.admin.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.shopping.dao.AdminQnaTypeDAO;
import com.mall.meongnyang.admin.shopping.vo.AdminQnaTypeVO;

@Service("AdminSelectQnaTypeListService")
public class AdminSelectQnaTypeListServiceImpl implements AdminSelectQnaTypeListService {

	@Autowired
	private AdminQnaTypeDAO adminQnaTypeDAO;
	
	@Override
	public List<AdminQnaTypeVO> selectQnaTypeList(AdminQnaTypeVO adminQnaTypeVO) {
		// TODO Auto-generated method stub
		return null;
	}

}
