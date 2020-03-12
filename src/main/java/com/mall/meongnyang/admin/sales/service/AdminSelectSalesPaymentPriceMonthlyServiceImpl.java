package com.mall.meongnyang.admin.sales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.sales.dao.AdminSalesOverviewDAO;
import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

@Service
public class AdminSelectSalesPaymentPriceMonthlyServiceImpl implements AdminSelectSalesPaymentPriceMonthlyService {

	@Autowired
	private AdminSalesOverviewDAO overviewDAO;
	
	@Override
	public List<ClientProductOrderVO> selectSalesPaymentPriceMonthly(ClientProductOrderVO clientProductOrderVO) {
		return overviewDAO.selectSalesPaymentPriceMonthly(clientProductOrderVO);
	}

}
