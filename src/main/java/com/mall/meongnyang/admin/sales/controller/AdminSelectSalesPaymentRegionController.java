package com.mall.meongnyang.admin.sales.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mall.meongnyang.admin.sales.service.AdminSelectSalesPaymentRegionService;
import com.mall.meongnyang.admin.sales.vo.AdminSalesOverviewChartVO;
import com.mall.meongnyang.admin.sales.vo.AdminSalesOverviewDataSetVO;
import com.mall.meongnyang.admin.sales.vo.AdminSalesOverviewDataVO;
import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

@Controller
public class AdminSelectSalesPaymentRegionController {

	@Autowired
	private AdminSelectSalesPaymentRegionService paymentRegion;
	
	@RequestMapping("/salesRegion.ado")
	@ResponseBody
	public Map<String, Object> salesPaymentRegion(ClientProductOrderVO clientProductOrderVO){
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		List<ClientProductOrderVO> salesList = paymentRegion.selectSalesPaymentRegion(clientProductOrderVO);

		AdminSalesOverviewDataSetVO adminSalesOverviewDataSetVO = new AdminSalesOverviewDataSetVO();
		adminSalesOverviewDataSetVO.setLabel("지역별 매출");
		adminSalesOverviewDataSetVO.setFill(true);
		
		String[] backgroundColor = new String[salesList.size()];
		for(int i = 0; i < salesList.size(); i++) {
			String r = new Random().nextInt(257) +"";
			String g = new Random().nextInt(257) +"";
			String b = new Random().nextInt(257) +"";
			
			String rgb = "rgb(" + r + "," + g + "," + b + ")";
			backgroundColor[i] = rgb;
		}
		
		adminSalesOverviewDataSetVO.setBackgroundColor(backgroundColor);
		
		String[] tmpLabels = new String[salesList.size()];
		int[] tmpDatas = new int[salesList.size()];
	
		for(int i = 0; i < tmpLabels.length; i++) {
			tmpLabels[i] = salesList.get(i).getPdOrderTbAdCity();
			tmpDatas[i] = salesList.get(i).getPdOrderTbPaymentSum();
		}
		
		adminSalesOverviewDataSetVO.setData(tmpDatas);

		AdminSalesOverviewDataSetVO[] datasets = {adminSalesOverviewDataSetVO};
		
		AdminSalesOverviewDataVO adminSalesOverviewDataVO = new AdminSalesOverviewDataVO();
		adminSalesOverviewDataVO.setLabels(tmpLabels);
		adminSalesOverviewDataVO.setDatasets(datasets);

		AdminSalesOverviewChartVO adminSalesOverviewChartVO = new AdminSalesOverviewChartVO();
		adminSalesOverviewChartVO.setType("doughnut");
		adminSalesOverviewChartVO.setOptions("{}");
		adminSalesOverviewChartVO.setData(adminSalesOverviewDataVO);

		map.put("chart", adminSalesOverviewChartVO);
		map.put("regionSales", salesList);
		
		return map;
		
	}
}
