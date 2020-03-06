package com.mall.meongnyang.admin.sales.service;

import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

public interface SalesPdfMakerService {

	void salesPdfMaker(String target, ClientProductOrderVO clientProductOrderVO);
}
