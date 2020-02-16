package com.mall.meongnyang.client.market.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.client.market.vo.ClientMarketCommentVO;

@Repository
public class ClientMarketCommentDAOImpl implements ClientMarketCommentDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
 
	@Override
	public void insertMarketComment(ClientMarketCommentVO clientMarketCommentVO) {
		sqlSessionTemplate.insert("commentDAO.insertComment", clientMarketCommentVO);
	}

	@Override
	public void updateMarketComment(ClientMarketCommentVO clientMarketCommentVO) {
		sqlSessionTemplate.update("commentDAO.updateComment", clientMarketCommentVO);
	}

	@Override
	public void deleteMarketComment(ClientMarketCommentVO clientMarketCommentVO) {
		sqlSessionTemplate.delete("commentDAO.deleteComment", clientMarketCommentVO);
	}

	@Override
	public ClientMarketCommentVO selectMarketComment(ClientMarketCommentVO clientMarketCommentVO) {
		return sqlSessionTemplate.selectOne("commentDAO.selectComment", clientMarketCommentVO);
	}

	@Override
	public List<ClientMarketCommentVO> selectMarketCommentList(ClientMarketCommentVO clientMarketCommentVO) {
		return sqlSessionTemplate.selectList("commentDAO.selectCommentList", clientMarketCommentVO);
	}

	@Override
	public int selectCommentCount(ClientMarketCommentVO clientMarketCommentVO) {
		return sqlSessionTemplate.selectOne("commentDAO.selectCountComment", clientMarketCommentVO);
	}

}
