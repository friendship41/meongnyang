package com.mall.meongnyang.admin.sales.service;

import java.util.List;

import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

public interface AdminSelectSalesPaymentCategoryService {
	
	List<ClientProductOrderVO> selectSalesPaymentCategory(ClientProductOrderVO clientProductOrderVO);

}
