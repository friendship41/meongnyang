package com.mall.meongnyang.admin.sales.service;

import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

public interface RegionPdfMakerService {
	
	void RegionPdfMaker(String target, ClientProductOrderVO clientProductOrderVO);
}
