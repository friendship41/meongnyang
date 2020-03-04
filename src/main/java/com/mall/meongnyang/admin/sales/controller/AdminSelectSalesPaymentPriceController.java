package com.mall.meongnyang.admin.sales.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mall.meongnyang.admin.sales.service.AdminSelectSalesPaymentPriceMonthlyService;
import com.mall.meongnyang.admin.sales.service.AdminSelectSalesPaymentPriceService;
import com.mall.meongnyang.admin.sales.vo.AdminSalesOverviewChartVO;
import com.mall.meongnyang.admin.sales.vo.AdminSalesOverviewDataSetVO;
import com.mall.meongnyang.admin.sales.vo.AdminSalesOverviewDataVO;
import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;
import com.mall.meongnyang.util.chartLabel.LabelMaker;

@Controller
public class AdminSelectSalesPaymentPriceController {

	@Autowired
	private AdminSelectSalesPaymentPriceService paymentPriceService;

	@Autowired
	private AdminSelectSalesPaymentPriceMonthlyService paymentPriceMonthlyService;

	@RequestMapping(value = "/salesPriceDay.ado")
	@ResponseBody
	public Map<String, Object> selectSalesPriceDaily(ClientProductOrderVO clientProductOrderVO) {
		Map<String, Object> map = new HashMap<String, Object>();

		List<ClientProductOrderVO> salesList = paymentPriceService.selectSalesPaymentPrice(clientProductOrderVO);

		List<String> label = new ArrayList<String>();

		int cnt = 0;
		for (int i = 0; i < salesList.size(); i++) {
			if (i == 0) {
				label.add(salesList.get(i).getPdSaleTbSalesPriceRange());
			} else {
				if (!label.get(cnt).equals(salesList.get(i).getPdSaleTbSalesPriceRange())) {
					label.add(salesList.get(i).getPdSaleTbSalesPriceRange());
					cnt = i;
				}
			}
		}

		List<ClientProductOrderVO> poList = new ArrayList<ClientProductOrderVO>();

		for (int i = 0; i < label.size(); i++) {
			ClientProductOrderVO vo = new ClientProductOrderVO();
			vo.setPdSaleTbSalesPriceRange(label.get(i));
			int tmpPrice = 0;
			int tmpRecivePirce = 0;
			int tmpAmount = 0;
			for (int j = 0; j < salesList.size(); j++) {
				if (label.get(i).equals(salesList.get(j).getPdSaleTbSalesPriceRange())) {
					tmpPrice += salesList.get(j).getOrdersDetailTbPriceSum();
					tmpRecivePirce += salesList.get(j).getPdSaleTbReceivedPrice();
					tmpAmount += salesList.get(j).getOrdersDetailTbAmount();
				}
			}
			vo.setOrdersDetailTbPriceSum(tmpPrice);
			vo.setPdSaleTbReceivedPrice(tmpRecivePirce);
			vo.setOrdersDetailTbAmount(tmpAmount);
			poList.add(vo);
		}

		AdminSalesOverviewDataSetVO[] datasets = new AdminSalesOverviewDataSetVO[label.size()];

		String[] tmpLabels = new LabelMaker().chartDailyLabelMaker(clientProductOrderVO.getStartDate(),
				clientProductOrderVO.getEndDate());

		for (int i = 0; i < tmpLabels.length; i++) {
			tmpLabels[i] += "일";
		}

		for (int idx = 0; idx < label.size(); idx++) {
			String[] tmplbl = new LabelMaker().chartDailyLabelMaker(clientProductOrderVO.getStartDate(),
					clientProductOrderVO.getEndDate());

			int[] tmpDatas = new int[tmplbl.length];

			String lbl = label.get(idx);
			AdminSalesOverviewDataSetVO adminSalesOverviewDataSetVO = new AdminSalesOverviewDataSetVO();
			adminSalesOverviewDataSetVO.setLabel(lbl);
			adminSalesOverviewDataSetVO.setFill(false);

			String r = new Random().nextInt(257) + "";
			String g = new Random().nextInt(257) + "";
			String b = new Random().nextInt(257) + "";

			String rgb = "rgb(" + r + "," + g + "," + b + ")";

			adminSalesOverviewDataSetVO.setBorderColor(rgb);
			adminSalesOverviewDataSetVO.setLineTension(0.2);

			for (int i = 0; i < tmplbl.length; i++) {
				for (int j = 0; j < salesList.size(); j++) {
					if (tmplbl[i].equals(salesList.get(j).getPdOrderTbPaymentDateStr())
							&& lbl.equals(salesList.get(j).getPdSaleTbSalesPriceRange())) {
						tmpDatas[i] = salesList.get(j).getOrdersDetailTbPriceSum();
						break;
					} else {
						tmpDatas[i] = 0;
					}
				}
			}

			adminSalesOverviewDataSetVO.setData(tmpDatas);
			datasets[idx] = adminSalesOverviewDataSetVO;
		}

		AdminSalesOverviewDataVO adminSalesOverviewDataVO = new AdminSalesOverviewDataVO();
		adminSalesOverviewDataVO.setLabels(tmpLabels);
		adminSalesOverviewDataVO.setDatasets(datasets);

		AdminSalesOverviewChartVO adminSalesOverviewChartVO = new AdminSalesOverviewChartVO();
		adminSalesOverviewChartVO.setType("line");
		adminSalesOverviewChartVO.setOptions("{}");
		adminSalesOverviewChartVO.setData(adminSalesOverviewDataVO);

		map.put("chart", adminSalesOverviewChartVO);
		map.put("dailySalesPrice", poList);

		return map;
	}

	@RequestMapping(value = "/salesPriceMonth.ado")
	@ResponseBody
	public Map<String, Object> selectSalesPriceMonthly(ClientProductOrderVO clientProductOrderVO) {

		Map<String, Object> monthlyMap = new HashMap<String, Object>();

		List<ClientProductOrderVO> salesList = paymentPriceMonthlyService
				.selectSalesPaymentPriceMonthly(clientProductOrderVO);

		List<String> label = new ArrayList<String>();

		int cnt = 0;
		for (int i = 0; i < salesList.size(); i++) {
			if (i == 0) {
				label.add(salesList.get(i).getPdSaleTbSalesPriceRange());
			} else {
				if (!label.get(cnt).equals(salesList.get(i).getPdSaleTbSalesPriceRange())) {
					label.add(salesList.get(i).getPdSaleTbSalesPriceRange());
					cnt = i;
				}
			}
		}

		List<ClientProductOrderVO> poList = new ArrayList<ClientProductOrderVO>();

		for (int i = 0; i < label.size(); i++) {
			ClientProductOrderVO vo = new ClientProductOrderVO();
			vo.setPdSaleTbSalesPriceRange(label.get(i));
			int tmpPrice = 0;
			int tmpRecivePirce = 0;
			int tmpAmount = 0;
			for (int j = 0; j < salesList.size(); j++) {
				if (label.get(i).equals(salesList.get(j).getPdSaleTbSalesPriceRange())) {
					tmpPrice += salesList.get(j).getOrdersDetailTbPriceSum();
					tmpRecivePirce += salesList.get(j).getPdSaleTbReceivedPrice();
					tmpAmount += salesList.get(j).getOrdersDetailTbAmount();
				}
			}
			vo.setOrdersDetailTbPriceSum(tmpPrice);
			vo.setPdSaleTbReceivedPrice(tmpRecivePirce);
			vo.setOrdersDetailTbAmount(tmpAmount);
			poList.add(vo);
		}

		AdminSalesOverviewDataSetVO[] datasets = new AdminSalesOverviewDataSetVO[label.size()];

		String[] tmpLabels = new LabelMaker().chartMonthlyLabelMaker(clientProductOrderVO.getStartDate(),
				clientProductOrderVO.getEndDate());

		for (int idx = 0; idx < label.size(); idx++) {

			String lbl = label.get(idx);

			AdminSalesOverviewDataSetVO adminSalesOverviewDataSetVO = new AdminSalesOverviewDataSetVO();
			adminSalesOverviewDataSetVO.setLabel(lbl);
			adminSalesOverviewDataSetVO.setFill(false);

			String r = new Random().nextInt(257) + "";
			String g = new Random().nextInt(257) + "";
			String b = new Random().nextInt(257) + "";

			String rgb = "rgb(" + r + "," + g + "," + b + ")";

			adminSalesOverviewDataSetVO.setBorderColor(rgb);
			adminSalesOverviewDataSetVO.setLineTension(0.2);

			int[] tmpDatas = new int[tmpLabels.length];

			for (int i = 0; i < tmpLabels.length; i++) {
				for (int j = 0; j < salesList.size(); j++) {
					if (tmpLabels[i].equals(salesList.get(j).getPdOrderTbPaymentDateStr())
							&& lbl.equals(salesList.get(j).getPdSaleTbSalesPriceRange())) {
						tmpDatas[i] = salesList.get(j).getOrdersDetailTbPriceSum();
						break;
					} else {
						tmpDatas[i] = 0;
					}
				}
			}

			adminSalesOverviewDataSetVO.setData(tmpDatas);
			datasets[idx] = adminSalesOverviewDataSetVO;
		}

		AdminSalesOverviewDataVO adminSalesOverviewDataVO = new AdminSalesOverviewDataVO();
		adminSalesOverviewDataVO.setLabels(tmpLabels);
		adminSalesOverviewDataVO.setDatasets(datasets);

		AdminSalesOverviewChartVO adminSalesOverviewChartVO = new AdminSalesOverviewChartVO();
		adminSalesOverviewChartVO.setType("line");
		adminSalesOverviewChartVO.setOptions("{}");
		adminSalesOverviewChartVO.setData(adminSalesOverviewDataVO);

		monthlyMap.put("chart", adminSalesOverviewChartVO);
		monthlyMap.put("monthlySalesPrice", poList);

		return monthlyMap;
	}
}
