package com.mall.meongnyang.admin.sales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mall.meongnyang.admin.sales.service.CategoryPdfMakerService;
import com.mall.meongnyang.admin.sales.service.PriceRangePdfMakerService;
import com.mall.meongnyang.admin.sales.service.RegionPdfMakerService;
import com.mall.meongnyang.admin.sales.service.SalesPdfMakerService;
import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

@Controller
public class PdfController {

	@Autowired
	private SalesPdfMakerService salesPdfMakerService;

	@Autowired
	private CategoryPdfMakerService categoryPdfMakerService;

	@Autowired
	private PriceRangePdfMakerService priceRangePdfMakerService;

	@Autowired
	private RegionPdfMakerService regionPdfMakerService;

	@RequestMapping("/pdfdown.ado")
	public void pdfMaker(@RequestParam String targets, ClientProductOrderVO clientProductOrderVO) {
		
		if (targets.equals("dailySales") || targets.equals("monthlySales")) {
			
			salesPdfMakerService.salesPdfMaker(targets, clientProductOrderVO);
			
		} else if (targets.equals("categorySales")) {

			categoryPdfMakerService.categoryPdfMaker(targets, clientProductOrderVO);
			
		} else if (targets.equals("dailySalesPrice") || targets.equals("monthlySalesPrice")) {

			priceRangePdfMakerService.priceRangePdfMaker(targets, clientProductOrderVO);
			
		} else if (targets.equals("regionSales")) {
			
			regionPdfMakerService.RegionPdfMaker(targets, clientProductOrderVO);
			
		}
	}

}
