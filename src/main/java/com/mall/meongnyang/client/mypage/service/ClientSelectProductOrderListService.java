package com.mall.meongnyang.client.mypage.service;

import java.util.List;

import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

public interface ClientSelectProductOrderListService {

	List<ClientProductOrderVO> selectProductOrderList(ClientProductOrderVO clientProductOrderVO);
	int selectOrderCount(ClientProductOrderVO clientProductOrderVO);

}
