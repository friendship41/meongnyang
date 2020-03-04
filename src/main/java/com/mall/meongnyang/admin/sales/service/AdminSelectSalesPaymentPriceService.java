package com.mall.meongnyang.admin.sales.service;

import java.util.List;

import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

public interface AdminSelectSalesPaymentPriceService {

	List<ClientProductOrderVO> selectSalesPaymentPrice(ClientProductOrderVO clientProductOrderVO);
}
