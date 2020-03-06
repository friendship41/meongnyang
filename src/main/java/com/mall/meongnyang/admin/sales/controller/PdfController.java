package com.mall.meongnyang.admin.sales.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Table;
import com.itextpdf.licensekey.util.UTF8;
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
	public void pdfMaker(@RequestParam String targets, ClientProductOrderVO clientProductOrderVO,
			HttpServletResponse response, HttpServletRequest request) throws IOException {
		
		response.setHeader("Content-Disposition", "attachment; filename=" + targets + ".pdf");
		response.setContentType("application/pdf");		
		
		PdfDocument pdf = new PdfDocument(new PdfWriter(response.getOutputStream()));
		Document doc = new Document(pdf);
		
		String font = request.getServletContext().getRealPath("resources/font/MalgunGothic.TTF");
		
		PdfFont ft = PdfFontFactory.createFont(font, "UTF-8");
		
		Table table = null;
		
		if (targets.equals("dailySales") || targets.equals("monthlySales")) {

			table = salesPdfMakerService.salesPdfMaker(targets, clientProductOrderVO, ft);

		} else if (targets.equals("categorySales")) {

			categoryPdfMakerService.categoryPdfMaker(targets, clientProductOrderVO);

		} else if (targets.equals("dailySalesPrice") || targets.equals("monthlySalesPrice")) {

			priceRangePdfMakerService.priceRangePdfMaker(targets, clientProductOrderVO);

		} else if (targets.equals("regionSales")) {

			regionPdfMakerService.RegionPdfMaker(targets, clientProductOrderVO);

		}
	
		doc.add(table);
		
		doc.close();
	}

}
