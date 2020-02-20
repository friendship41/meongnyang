package com.mall.meongnyang.client.community.service;

import javax.servlet.http.HttpServletRequest;

import com.mall.meongnyang.client.community.vo.ClientReviewVO;

public interface ClientInsertReviewService {

	void insertReview(ClientReviewVO clientReviewVO, HttpServletRequest request);

}
