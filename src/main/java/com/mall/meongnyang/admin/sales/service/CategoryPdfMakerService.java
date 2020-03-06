package com.mall.meongnyang.admin.sales.service;

import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

public interface CategoryPdfMakerService {

	void categoryPdfMaker(String target, ClientProductOrderVO clientProductOrderVO);
}
