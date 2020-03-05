package com.mall.meongnyang.admin.sales.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mall.meongnyang.admin.sales.service.AdminSelectSalesPaymentCategoryService;
import com.mall.meongnyang.admin.sales.service.AdminSelectSalesPaymentDailyService;
import com.mall.meongnyang.admin.sales.service.AdminSelectSalesPaymentMonthlyService;
import com.mall.meongnyang.admin.sales.service.AdminSelectSalesPaymentPriceMonthlyService;
import com.mall.meongnyang.admin.sales.service.AdminSelectSalesPaymentPriceService;
import com.mall.meongnyang.admin.sales.service.AdminSelectSalesPaymentRegionService;
import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;
import com.mall.meongnyang.util.excel.ExcelMaker;

@Controller
public class ExcelDownContoller {

	@Autowired
	private AdminSelectSalesPaymentDailyService paymentDailyService;

	@Autowired
	private AdminSelectSalesPaymentMonthlyService paymentMonthlyService;
	
	@Autowired
	private AdminSelectSalesPaymentCategoryService paymentCategoryService;
	
	@Autowired
	private AdminSelectSalesPaymentPriceService paymentPriceService;
	
	@Autowired
	private AdminSelectSalesPaymentPriceMonthlyService paymenPriceMonthlyService;
	
	@Autowired
	private AdminSelectSalesPaymentRegionService paymentRegionService;

	@RequestMapping("/exceldown.ado")
	public void excelDownload(@RequestParam String targets, ClientProductOrderVO clientProductOrderVO,
			HttpServletResponse response) throws IOException {

		ExcelMaker em = new ExcelMaker();
		XSSFWorkbook wb = null;
		
		response.setContentType("ms-vnd/excel");
		response.setHeader("Content-Disposition", "attachment;filename=" + targets +".xlsx");

		if (targets.equals("dailySales")) {
			
			wb = em.SalesExcelDown(paymentDailyService.selectSalesPayment(clientProductOrderVO));	

		} else if (targets.equals("monthlySales")) {

			wb = em.SalesExcelDown(paymentMonthlyService.selectSalesPaymentMonthly(clientProductOrderVO));

		} else if (targets.equals("categorySales")) {
			
			wb = em.categorySalesExcelDown(paymentCategoryService.selectSalesPaymentCategory(clientProductOrderVO));
			
		} else if (targets.equals("dailySalesPrice")) {
			
			wb = em.SalesPriceExcelDown(paymentPriceService.selectSalesPaymentPrice(clientProductOrderVO));
			
		} else if (targets.equals("monthlySalesPrice")) {
			
			wb = em.SalesPriceExcelDown(paymenPriceMonthlyService.selectSalesPaymentPriceMonthly(clientProductOrderVO));
			
		} else if (targets.equals("regionSales")) {
			
			wb = em.RegionSalesExcelDown(paymentRegionService.selectSalesPaymentRegion(clientProductOrderVO));			
		}
		
		wb.write(response.getOutputStream());
		wb.close();

	}
}
