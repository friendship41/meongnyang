package com.mall.meongnyang.admin.sales.dao;

import java.util.List;

import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

public interface AdminSalesOverivewDAO {

	List<ClientProductOrderVO> selectSalesPayment(ClientProductOrderVO clientProductOrderVO);
}
