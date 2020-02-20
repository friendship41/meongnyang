package com.mall.meongnyang.client.community.service;

import java.util.List;

import com.mall.meongnyang.client.community.vo.ClientReviewVO;

public interface ClientSelectReviewListService {

	List<ClientReviewVO> selectReviewList(ClientReviewVO clientReviewVO);
}
