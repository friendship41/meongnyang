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
		sqlSessionTemplate.insert("AdminQnaTypeDAO.insertQnaType", adminQnaTypeVO);
		
	}

	@Override
	public void deleteQnaType(AdminQnaTypeVO adminQnaTypeVO) {
		sqlSessionTemplate.delete("AdminQnaTypeDAO.deleteQnaType", adminQnaTypeVO);
		
	}

	@Override
	public void updateQnaType(AdminQnaTypeVO adminQnaTypeVO) {
		sqlSessionTemplate.update("AdminQnaTypeDAO.updateQnaType", adminQnaTypeVO);
		
	}

	@Override
	public List<AdminQnaTypeVO> selectQnaTypeList(AdminQnaTypeVO adminQnaTypeVO) {
		return sqlSessionTemplate.selectList("AdminQnaTypeDAO.selectQnaTypeList", adminQnaTypeVO);
	}

	@Override
	public AdminQnaTypeVO selectQnaType(AdminQnaTypeVO adminQnaTypeVO) {
		return sqlSessionTemplate.selectOne("AdminQnaTypeDAO.selectQnaType", adminQnaTypeVO);
	}
	
	
}
