package com.mall.meongnyang.admin.sales.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mall.meongnyang.admin.sales.service.AdminSelectSalesPaymentDailyService;
import com.mall.meongnyang.admin.sales.service.AdminSelectSalesPaymentMonthlyService;
import com.mall.meongnyang.admin.sales.vo.AdminSalesOverviewChartVO;
import com.mall.meongnyang.admin.sales.vo.AdminSalesOverviewDataSetVO;
import com.mall.meongnyang.admin.sales.vo.AdminSalesOverviewDataVO;
import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;
import com.mall.meongnyang.util.chartLabel.LabelMaker;

@Controller
public class AdminSelectSalesPaymentController {

	@Autowired
	private AdminSelectSalesPaymentDailyService adminSelectSalesPaymentDailyService;
	@Autowired
	private AdminSelectSalesPaymentMonthlyService adminSelectSalesPaymentMonthlyService;
	
	@RequestMapping(value = "/salesOverviewDay.ado")
	@ResponseBody
	public Map<String, Object> selectSalesOverviewDaily(ClientProductOrderVO clientProductOrderVO) {
		Map<String, Object> map = new HashMap<String, Object>();

		List<ClientProductOrderVO> salesList = adminSelectSalesPaymentDailyService
				.selectSalesPayment(clientProductOrderVO);

		AdminSalesOverviewDataSetVO adminSalesOverviewDataSetVO = new AdminSalesOverviewDataSetVO();
		adminSalesOverviewDataSetVO.setLabel("일별 매출");
		adminSalesOverviewDataSetVO.setFill(false);
		
		adminSalesOverviewDataSetVO.setBorderColor("rgb(93,168,203)");
		adminSalesOverviewDataSetVO.setLineTension(0.2);

		String[] tmpLabels = new LabelMaker().chartDailyLabelMaker(clientProductOrderVO.getStartDate(),
				clientProductOrderVO.getEndDate());

		int[] tmpDatas = new int[tmpLabels.length];

		for (int i = 0; i < tmpLabels.length; i++) {
			for (int j = 0; j < salesList.size(); j++) {
				if (tmpLabels[i].equals(salesList.get(j).getPdOrderTbPaymentDateStr())) {
					tmpDatas[i] = salesList.get(j).getPdOrderTbPaymentSum();
					break;
				} else {
					tmpDatas[i] = 0;
				}
			}
			tmpLabels[i] += "일";
		}

		adminSalesOverviewDataSetVO.setData(tmpDatas);

		AdminSalesOverviewDataSetVO[] datasets = {adminSalesOverviewDataSetVO};
		
		AdminSalesOverviewDataVO adminSalesOverviewDataVO = new AdminSalesOverviewDataVO();
		adminSalesOverviewDataVO.setLabels(tmpLabels);
		adminSalesOverviewDataVO.setDatasets(datasets);

		AdminSalesOverviewChartVO adminSalesOverviewChartVO = new AdminSalesOverviewChartVO();
		adminSalesOverviewChartVO.setType("line");
		adminSalesOverviewChartVO.setOptions("{}");
		adminSalesOverviewChartVO.setData(adminSalesOverviewDataVO);

		map.put("chart", adminSalesOverviewChartVO);
		map.put("dailySales", salesList);
		
		return map;
	}

	@RequestMapping(value = "/salesOverviewMonth.ado")
	@ResponseBody
	public Map<String, Object> selectSalesOverviewMonthly(ClientProductOrderVO clientProductOrderVO) {
		
		Map<String, Object> monthlyMap = new HashMap<String, Object>();
		
		List<ClientProductOrderVO> salesList = adminSelectSalesPaymentMonthlyService.selectSalesPaymentMonthly(clientProductOrderVO);

		AdminSalesOverviewDataSetVO adminSalesOverviewDataSetVO = new AdminSalesOverviewDataSetVO();
		adminSalesOverviewDataSetVO.setLabel("월별 매출");
		adminSalesOverviewDataSetVO.setFill(false);
		
		adminSalesOverviewDataSetVO.setBorderColor("rgb(93,168,203)");
		adminSalesOverviewDataSetVO.setLineTension(0.2);

		String[] tmpLabels = new LabelMaker().chartMonthlyLabelMaker(clientProductOrderVO.getStartDate(),
				clientProductOrderVO.getEndDate());

		int[] tmpDatas = new int[tmpLabels.length];

		for (int i = 0; i < tmpLabels.length; i++) {
			for (int j = 0; j < salesList.size(); j++) {
				if (tmpLabels[i].equals(salesList.get(j).getPdOrderTbPaymentDateStr())) {
					tmpDatas[i] = salesList.get(j).getPdOrderTbPaymentSum();
					break;
				} else {
					tmpDatas[i] = 0;
				}
			}
		}

		adminSalesOverviewDataSetVO.setData(tmpDatas);

		AdminSalesOverviewDataSetVO[] datasets = {adminSalesOverviewDataSetVO};
		
		AdminSalesOverviewDataVO adminSalesOverviewDataVO = new AdminSalesOverviewDataVO();
		adminSalesOverviewDataVO.setLabels(tmpLabels);
		adminSalesOverviewDataVO.setDatasets(datasets);

		AdminSalesOverviewChartVO adminSalesOverviewChartVO = new AdminSalesOverviewChartVO();
		adminSalesOverviewChartVO.setType("line");
		adminSalesOverviewChartVO.setOptions("{}");
		adminSalesOverviewChartVO.setData(adminSalesOverviewDataVO);
		
		monthlyMap.put("chart", adminSalesOverviewChartVO);
		monthlyMap.put("salesMonthly", salesList);		
		
		return monthlyMap;

	}
	
}
