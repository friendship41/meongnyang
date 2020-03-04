package com.mall.meongnyang.admin.sales.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mall.meongnyang.admin.sales.service.AdminSelectSalesPaymentCategoryService;
import com.mall.meongnyang.admin.sales.vo.AdminSalesOverviewChartVO;
import com.mall.meongnyang.admin.sales.vo.AdminSalesOverviewDataSetVO;
import com.mall.meongnyang.admin.sales.vo.AdminSalesOverviewDataVO;
import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

@Controller
public class AdminSelectSalesPaymentCategoryController {
	
	@Autowired
	private AdminSelectSalesPaymentCategoryService adminSelectSalesPaymentCategoryService;
	
	@RequestMapping("/salesCategory.ado")
	@ResponseBody
	public Map<String, Object> selectSalesCategory(ClientProductOrderVO clientProductOrderVO) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		List<ClientProductOrderVO> salesList = adminSelectSalesPaymentCategoryService.selectSalesPaymentCategory(clientProductOrderVO);

		AdminSalesOverviewDataSetVO adminSalesOverviewDataSetVO = new AdminSalesOverviewDataSetVO();
		adminSalesOverviewDataSetVO.setLabel("카테고리별 매출");
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
			tmpLabels[i] = salesList.get(i).getProductCategoryTbParent() +"-"+ salesList.get(i).getProductCategoryTbSub();
			tmpDatas[i] = salesList.get(i).getOrdersDetailTbPriceSum();
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
		map.put("categorySales", salesList);
		
		return map;
	}

}
