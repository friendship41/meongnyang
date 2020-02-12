package com.mall.meongnyang.admin.shopping.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.admin.shopping.vo.AdminFaqVO;

@Repository
public class AdminFaqDAOImpl implements AdminFaqDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public AdminFaqVO selectFaq(int num) {
		return sqlSessionTemplate.selectOne("AdminFaqDAO.selectFaq", num);
	}

	@Override
	public List<AdminFaqVO> selectFaqList() {	
		return sqlSessionTemplate.selectList("AdminFaqDAO.selectFaqList");
	}

	@Override
	public void insertFaq(AdminFaqVO vo) {
		sqlSessionTemplate.insert("AdminFaqDAO.insertFaq", vo);
	}

	@Override
	public void updateFaq(AdminFaqVO vo) {
		sqlSessionTemplate.update("AdminFaqDAO.updateFaq", vo);
	}

}
