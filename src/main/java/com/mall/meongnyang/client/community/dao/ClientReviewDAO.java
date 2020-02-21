package com.mall.meongnyang.client.community.dao;

import java.util.List;

import com.mall.meongnyang.client.community.vo.ClientReviewVO;

public interface ClientReviewDAO {
	
	ClientReviewVO selectReview(ClientReviewVO clientReviewVO);
	List<ClientReviewVO> selectReviewList(ClientReviewVO clientReviewVO);
	void insertReview(ClientReviewVO clientReviewVO);
	void updateReview(ClientReviewVO clientReviewVO);
	void deleteReview(ClientReviewVO clientReviewVO);
	int selectReveiwCount(ClientReviewVO clientReviewVO);
	int selectCount(ClientReviewVO clientReviewVO);
}
