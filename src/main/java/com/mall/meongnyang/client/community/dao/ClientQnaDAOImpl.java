package com.mall.meongnyang.client.community.dao;

import com.mall.meongnyang.admin.shopping.vo.AdminQnaTypeVO;
import com.mall.meongnyang.admin.shopping.vo.AdminQnaVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ClientQnaDAO")
public class ClientQnaDAOImpl implements ClientQnaDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public void insertQnaReply(AdminQnaVO adminQnaVO) {
		sqlSessionTemplate.insert("qnaDAO.insertQnaReply", adminQnaVO);
	}
	@Override
	public List<AdminQnaVO> selectQnaList(AdminQnaVO adminQnaVO) {

		return sqlSessionTemplate.selectList("qnaDAO.selectQnaList", adminQnaVO);
	}
	@Override
	public int selectCountQna() {
		return sqlSessionTemplate.selectOne("qnaDAO.selectCountQna");
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
	public AdminQnaVO selectQna(AdminQnaVO adminQnaVO) {
		
		return sqlSessionTemplate.selectOne("qnaDAO.selectQna", adminQnaVO);
	}

	//ī�װ� �� �ֱ����� select
	@Override
	public List<AdminQnaTypeVO> selectQnaTypeList(AdminQnaTypeVO adminQnaTypeVO) {
		
		return sqlSessionTemplate.selectList("AdminQnaTypeDAO.selectQnaTypeList", adminQnaTypeVO);
	}



	@Override
	public void updateReadcountQna(int qnaTbNo) {
		sqlSessionTemplate.update("qnaDAO.updateReadcount", qnaTbNo);
		
	}

	@Override
	public void updateStepDepth(AdminQnaVO adminQnaVO) {
		sqlSessionTemplate.update("qnaDAO.updateStepDepth", adminQnaVO);
		
	}

	@Override
	public void updateStep(AdminQnaVO adminQnaVO) {
		sqlSessionTemplate.update("qnaDAO.updateStep", adminQnaVO);
		
	}

	@Override
	public void insertNewQna(AdminQnaVO adminQnaVO) {
		sqlSessionTemplate.insert("qnaDAO.insertNewQna", adminQnaVO);
		
	}

	
	
	
}
