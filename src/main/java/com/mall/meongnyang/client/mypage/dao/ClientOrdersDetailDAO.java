package com.mall.meongnyang.client.mypage.dao;

import java.util.List;

import com.mall.meongnyang.client.mypage.vo.ClientOrdersDetailVO;

public interface ClientOrdersDetailDAO {

	List<ClientOrdersDetailVO> selectOrderDetail(ClientOrdersDetailVO clientOrdersDetailVO);
}
