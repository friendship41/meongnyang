package com.mall.meongnyang.admin.shopping.dao;

import com.mall.meongnyang.admin.shopping.vo.AdminQnaVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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
		return sqlSessionTemplate.selectList("qnaDAO.selectAdminQnaList", adminQnaVO);
	}

	@Override
	public void insertQna(AdminQnaVO adminQnaVO) {
		sqlSessionTemplate.insert("qnaDAO.insertQnaReply", adminQnaVO);
		
	}

	@Override
	public void updateQna(AdminQnaVO adminQnaVO) {
		sqlSessionTemplate.update("qnaDAO.updateQna", adminQnaVO);
		
	}

	@Override
	public void deleteQna(AdminQnaVO adminQnaVO) {
		sqlSessionTemplate.update("qnaDAO.deleteQna", adminQnaVO);
		
	}

	@Override
	public void updateStep(AdminQnaVO adminQnaVO) {
		sqlSessionTemplate.update("qnaDAO.updateStep", adminQnaVO);
		
	}

	@Override
	public void updateStepDepth(AdminQnaVO adminQnaVO) {
		sqlSessionTemplate.update("qnaDAO.updateStepDepth", adminQnaVO);
		
	}

	@Override
	public void insertAdminQnaReply(AdminQnaVO adminQnaVO) {
		sqlSessionTemplate.insert("qnaDAO.insertAdminQnaReply", adminQnaVO);
		
	}

	

	

	

	

}
