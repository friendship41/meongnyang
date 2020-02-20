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
		
		return sqlSessionTemplate.selectOne("qnaDAO.selectQna", adminQnaVO);
	}

	@Override
	public List<AdminQnaVO> selectQnaList(AdminQnaVO adminQnaVO) {
		return sqlSessionTemplate.selectList("qnaDAO.selectQnaList", adminQnaVO);
	}

	@Override
	public void insertQna(AdminQnaVO adminQnaVO) {
		sqlSessionTemplate.insert("qnaDAO.insertQna", adminQnaVO);
		
	}

	@Override
	public void updateQna(AdminQnaVO adminQnaVO) {
		sqlSessionTemplate.update("qnaDAO.updateQna", adminQnaVO);
		
	}

	@Override
	public void deleteQna(AdminQnaVO adminQnaVO) {
		sqlSessionTemplate.delete("qnaDAO.deleteQna", adminQnaVO);
		
	}

	@Override
	public void updateStep(AdminQnaVO adminQnaVO) {
		sqlSessionTemplate.update("qnaDAO.updateStep", adminQnaVO);
		
	}

	

}
