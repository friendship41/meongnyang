package com.mall.meongnyang.admin.sales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

@Service
public class SalesPdfMakerServiceImpl implements SalesPdfMakerService {

	@Autowired
	private AdminSelectSalesPaymentDailyService salesPaymentDailyService;
	
	@Autowired
	private AdminSelectSalesPaymentMonthlyService salesPaymentMonthlyService;
	
	@Override
	public void salesPdfMaker(String target, ClientProductOrderVO clientProductOrderVO) {
		
		List<ClientProductOrderVO> list = null;
		
		if(target.equals("dailySales")) {
			
			list = salesPaymentDailyService.selectSalesPayment(clientProductOrderVO);
			
		} else if(target.equals("monthlySales")) {
			
			list = salesPaymentMonthlyService.selectSalesPaymentMonthly(clientProductOrderVO);
			
		}
		
	}

}
