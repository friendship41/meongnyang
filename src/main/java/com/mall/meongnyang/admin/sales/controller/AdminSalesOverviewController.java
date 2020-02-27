package com.mall.meongnyang.admin.sales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mall.meongnyang.admin.sales.service.AdminSelectSalesOverviewListService;
import com.mall.meongnyang.admin.sales.vo.AdminSalesOverviewChartVO;
import com.mall.meongnyang.admin.sales.vo.AdminSalesOverviewDataSetVO;
import com.mall.meongnyang.admin.sales.vo.AdminSalesOverviewDataVO;
import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;
import com.mall.meongnyang.util.chartLabel.LabelMaker;

@Controller
public class AdminSalesOverviewController {

	@Autowired
	private AdminSelectSalesOverviewListService adminSelectSalesOverviewListService;
	
    @RequestMapping(value="/salesOverview.ado")
    public String salesOverviewPage() {
    	
        return "sales/sales-overview";
    }
    
    @RequestMapping(value = "/salesOverviewDay.ado")
    @ResponseBody
    public AdminSalesOverviewChartVO selectSalesOverviewDay(ClientProductOrderVO clientProductOrderVO) {
   
    	List<ClientProductOrderVO> salesList = adminSelectSalesOverviewListService.selectSalesPayment(clientProductOrderVO);
    	
    	AdminSalesOverviewDataSetVO adminSalesOverviewDataSetVO = new AdminSalesOverviewDataSetVO();
    	adminSalesOverviewDataSetVO.setLabel("일별 매출");
    	adminSalesOverviewDataSetVO.setFill(false);
    	adminSalesOverviewDataSetVO.setBorderColor("rgb(93,168,203)");
    	adminSalesOverviewDataSetVO.setLineTension(0.2);
    	
    	System.out.println("시작일 :" + clientProductOrderVO.getStartDate());
    	System.out.println("마지막일 : " + clientProductOrderVO.getEndDate());
    	
    	String[] tmpLabels = new LabelMaker().chartLabelMaker(clientProductOrderVO.getStartDate(), clientProductOrderVO.getEndDate());;
    	
    	int[] tmpDatas = new int[tmpLabels.length];
    	System.out.println(tmpLabels.length);
    	
    	for(int i = 0; i < tmpLabels.length; i++) {
    		if(tmpLabels[i] == salesList.get(i).getPdOrderTbPaymentDateStr()) {
    			tmpLabels[i] += "일"; 
    			tmpDatas[i] = salesList.get(i).getPdOrderTbPayment();
    		} else {
    			tmpLabels[i] += "일"; 
    			tmpDatas[i] = 0;
    		}
    		System.out.println(tmpLabels[i]);
    		System.out.println(tmpDatas[i]);
    	}
    	
    	adminSalesOverviewDataSetVO.setData(tmpDatas);
    	
    	AdminSalesOverviewDataVO adminSalesOverviewDataVO  = new AdminSalesOverviewDataVO();
    	adminSalesOverviewDataVO.setLabels(tmpLabels);    	
    	
    	AdminSalesOverviewChartVO adminSalesOverviewChartVO = new AdminSalesOverviewChartVO();
    	adminSalesOverviewChartVO.setType("line");
    	adminSalesOverviewChartVO.setOptions("{}");
    	adminSalesOverviewChartVO.setData(adminSalesOverviewDataVO);
    	
    	return adminSalesOverviewChartVO;
    }
}
