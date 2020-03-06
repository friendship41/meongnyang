package com.mall.meongnyang.admin.sales.service;

import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

public interface PriceRangePdfMakerService {

	void priceRangePdfMaker(String target, ClientProductOrderVO clientProductOrderVO);
}
