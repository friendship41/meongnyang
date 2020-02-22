package com.mall.meongnyang.client.mypage.service;

import java.util.List;

import com.mall.meongnyang.client.mypage.vo.ClientOrdersDetailVO;

public interface ClientSelectOrderDetailService {
	
	List<ClientOrdersDetailVO> selectOrderDetail(ClientOrdersDetailVO clientOrdersDetailVO);
}
