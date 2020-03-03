package com.mall.meongnyang.admin.sales.service;

import java.util.List;

import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

public interface AdminSelectSalesPaymentDailyService {
	
	List<ClientProductOrderVO> selectSalesPayment(ClientProductOrderVO clientProductOrderVO);

}
