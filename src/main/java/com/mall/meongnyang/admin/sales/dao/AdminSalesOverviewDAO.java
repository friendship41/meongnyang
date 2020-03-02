package com.mall.meongnyang.admin.sales.dao;

import java.util.List;

import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

public interface AdminSalesOverviewDAO {

	List<ClientProductOrderVO> selectSalesPayment(ClientProductOrderVO clientProductOrderVO);
	List<ClientProductOrderVO> selectSalesPaymentMonthly(ClientProductOrderVO clientProductOrderVO);
	List<ClientProductOrderVO> selectSalesPaymentCategory(ClientProductOrderVO clientProductOrderVO);
	
	List<ClientProductOrderVO> selectSalesPaymentRegion(ClientProductOrderVO clientProductOrderVO);
	
}
