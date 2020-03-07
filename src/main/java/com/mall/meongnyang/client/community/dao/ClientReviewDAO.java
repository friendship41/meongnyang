package com.mall.meongnyang.client.community.dao;

import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import com.mall.meongnyang.client.community.vo.ClientReviewVO;

import java.util.List;

public interface ClientReviewDAO {
	
	ClientReviewVO selectReview(ClientReviewVO clientReviewVO);
	List<ClientReviewVO> selectReviewList(ClientReviewVO clientReviewVO);
	void insertReview(ClientReviewVO clientReviewVO);
	void updateReview(ClientReviewVO clientReviewVO);
	void deleteReview(ClientReviewVO clientReviewVO);
	int selectReveiwCount(ClientReviewVO clientReviewVO);
	int selectCount(ClientReviewVO clientReviewVO);
	public void updateProductSaleRating(AdminProductSaleVO adminProductSaleVO);
}
