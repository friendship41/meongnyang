package com.mall.meongnyang.admin.sales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.sales.dao.AdminSalesOverviewDAO;
import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

@Service
public class AdminSelectSalesPaymentRegionServiceImpl implements AdminSelectSalesPaymentRegionService {

	@Autowired
	private AdminSalesOverviewDAO adminSalesOverviewDAO;
	
	@Override
	public List<ClientProductOrderVO> selectSalesPaymentRegion(ClientProductOrderVO clientProductOrderVO) {
		return adminSalesOverviewDAO.selectSalesPaymentRegion(clientProductOrderVO);
	}

}
