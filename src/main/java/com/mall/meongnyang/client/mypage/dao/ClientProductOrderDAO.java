package com.mall.meongnyang.client.mypage.dao;

import java.util.List;

import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

public interface ClientProductOrderDAO {
	
	List<ClientProductOrderVO> selectProductOrderList(ClientProductOrderVO clientProductOrderVO);
	ClientProductOrderVO selectProductOrder(ClientProductOrderVO clientProductOrderVO);
	int selectOrderCount(ClientProductOrderVO clientProductOrderVO);
}
