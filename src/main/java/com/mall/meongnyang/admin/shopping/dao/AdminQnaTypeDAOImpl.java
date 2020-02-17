package com.mall.meongnyang.admin.shopping.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.admin.shopping.vo.AdminQnaTypeVO;

@Repository("AdminQnaTypeDAO")
public class AdminQnaTypeDAOImpl implements AdminQnaTypeDAO {
	
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public void insertQnaType(AdminQnaTypeVO adminQnaTypeVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteQnaType(AdminQnaTypeVO adminQnaTypeVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateQnaType(AdminQnaTypeVO adminQnaTypeVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AdminQnaTypeVO> selectQnaTypeList(AdminQnaTypeVO adminQnaTypeVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdminQnaTypeVO selectQnaType(AdminQnaTypeVO adminQnaTypeVO) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
