package com.mall.meongnyang.admin.sales.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.font.FontProvider;
import com.itextpdf.layout.font.FontSet;
import com.itextpdf.layout.property.TextAlignment;
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
	public void pdfMaker(@RequestParam String targets, ClientProductOrderVO ProductOrderVO,
			HttpServletResponse response, HttpServletRequest request) throws IOException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		String startDate = sdf.format(ProductOrderVO.getStartDate());
		String endDate = sdf.format(ProductOrderVO.getEndDate());
		
		response.setHeader("Content-Disposition", "attachment; filename=" + targets + ".pdf");
		response.setContentType("application/pdf");

		PdfDocument pdf = new PdfDocument(new PdfWriter(response.getOutputStream()));
		Document doc = new Document(pdf);

		String font = request.getServletContext().getRealPath("resources/font/malgungothic.ttf");

		PdfFont ft = PdfFontFactory.createFont(font, PdfEncodings.IDENTITY_H, true);

		pdf.addFont(ft);

		FontSet fontSet = new FontSet();
		fontSet.addFont(font);
		doc.setFontProvider(new FontProvider(fontSet));

		Table table = null;
		
		Paragraph docTitle = new Paragraph();
		Paragraph docDate = new Paragraph();

		if (targets.equals("dailySales")) {
			
			docTitle.add("일별 매출");
			docDate.add("기간 : " + startDate + " ~ " + endDate);
			
			table = salesPdfMakerService.salesPdfMaker(targets, ProductOrderVO, ft);
			
		} else if(targets.equals("monthlySales")) {
			
			docTitle.add("월별 매출");
			docDate.add("기간 : " + startDate.substring(0,startDate.length()-3) + " ~ " + endDate.substring(0,endDate.length()-3));

			table = salesPdfMakerService.salesPdfMaker(targets, ProductOrderVO, ft);

		} else if (targets.equals("categorySales")) {
			
			docTitle.add("카테고리 매출");
			docDate.add("기간 : " + startDate + " ~ " + endDate);
			
			table = categoryPdfMakerService.categoryPdfMaker(targets, ProductOrderVO, ft);

		} else if (targets.equals("dailySalesPrice")) {
			
			docTitle.add("일간 가격대별 매출");
			docDate.add("기간 : " + startDate + " ~ " + endDate);

			table = priceRangePdfMakerService.priceRangePdfMaker(targets, ProductOrderVO, ft);
			
		} else if( targets.equals("monthlySalesPrice")) {
			
			docTitle.add("월간 가격대별 매출");
			docDate.add("기간 : " + startDate.substring(0,startDate.length()-3) + " ~ " + endDate.substring(0,endDate.length()-3));

			table = priceRangePdfMakerService.priceRangePdfMaker(targets, ProductOrderVO, ft);

		} else if (targets.equals("regionSales")) {
			
			docTitle.add("지역별 매출");
			docDate.add("기간 : " + startDate + " ~ " + endDate);

			table = regionPdfMakerService.RegionPdfMaker(targets, ProductOrderVO, ft);

		}

		docTitle.setTextAlignment(TextAlignment.CENTER).setFont(ft).setFontSize(30).setMarginBottom(20);
		docDate.setTextAlignment(TextAlignment.RIGHT).setFont(ft).setFontSize(15);
		
		doc.add(docTitle);
		doc.add(docDate);
		doc.add(table);

		doc.close();
	}

}
