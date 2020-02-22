package com.mall.meongnyang.client.community.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.client.community.vo.ClientReviewVO;

@Repository
public class ClientReviewDAOImpl implements ClientReviewDAO {

	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	@Override
	public ClientReviewVO selectReview(ClientReviewVO clientReviewVO) {
		return sessionTemplate.selectOne("reviewDAO.selectReview", clientReviewVO);
	}

	@Override
	public List<ClientReviewVO> selectReviewList(ClientReviewVO clientReviewVO) {
		return sessionTemplate.selectList("reviewDAO.selectReviewList", clientReviewVO);
	}

	@Override
	public void insertReview(ClientReviewVO clientReviewVO) {
		sessionTemplate.insert("reviewDAO.insertReview", clientReviewVO);
	}

	@Override
	public void updateReview(ClientReviewVO clientReviewVO) {
		sessionTemplate.update("reviewDAO.updateReview", clientReviewVO);
	}

	@Override
	public void deleteReview(ClientReviewVO clientReviewVO) {
		sessionTemplate.delete("reviewDAO.deleteReview", clientReviewVO);
	}

	@Override
	public int selectReveiwCount(ClientReviewVO clientReviewVO) {
		return sessionTemplate.selectOne("reviewDAO.selectReviewCount", clientReviewVO);
	}

	@Override
	public int selectCount(ClientReviewVO clientReviewVO) {
		return sessionTemplate.selectOne("reviewDAO.cntProduct", clientReviewVO);
	}

}
