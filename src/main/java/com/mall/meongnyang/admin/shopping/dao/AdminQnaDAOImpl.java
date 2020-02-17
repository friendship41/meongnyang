package com.mall.meongnyang.admin.shopping.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.admin.shopping.vo.AdminQnaVO;

@Repository("AdminQnaDAO")
public class AdminQnaDAOImpl implements AdminQnaDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public AdminQnaVO selectQna(AdminQnaVO adminQnaVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdminQnaVO> selectQnaList(AdminQnaVO adminQnaVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertQna(AdminQnaVO adminQnaVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateQna(AdminQnaVO adminQnaVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteQna(AdminQnaVO adminQnaVO) {
		// TODO Auto-generated method stub
		
	}

}
