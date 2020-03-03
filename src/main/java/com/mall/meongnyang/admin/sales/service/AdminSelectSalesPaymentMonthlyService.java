package com.mall.meongnyang.admin.sales.service;

import java.util.List;

import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

public interface AdminSelectSalesPaymentMonthlyService {

	List<ClientProductOrderVO> selectSalesPaymentMonthly(ClientProductOrderVO clientProductOrderVO);
}
