package com.mall.meongnyang.admin.sales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.UnitValue;
import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

@Service
public class CategoryPdfMakerServiceImpl implements CategoryPdfMakerService {
	
	@Autowired
	private AdminSelectSalesPaymentCategoryService categoryService;

	@Override
	public Table categoryPdfMaker(String target, ClientProductOrderVO clientProductOrderVO, PdfFont font) {

		List<ClientProductOrderVO> list = categoryService.selectSalesPaymentCategory(clientProductOrderVO);

		Table table = new Table(UnitValue.createPercentArray(5)).useAllAvailableWidth();
		
		// 테이블에 컬럼명 추가
		table.addHeaderCell(new Cell().add(new Paragraph("카테고리").setFont(font)));
		table.addHeaderCell(new Cell().add(new Paragraph("매출").setFont(font)));
		table.addHeaderCell(new Cell().add(new Paragraph("원가").setFont(font)));
		table.addHeaderCell(new Cell().add(new Paragraph("판매량").setFont(font)));
		table.addHeaderCell(new Cell().add(new Paragraph("비고").setFont(font)));
		
		int totpay = 0;
		int totRePirce = 0;
		int totAmount = 0;		

		for (ClientProductOrderVO vo : list) {

			table.addCell(new Cell().add(new Paragraph(vo.getProductCategoryTbParent()+"-"+vo.getProductCategoryTbSub()).setFont(font)));
			table.addCell(new Cell().add(new Paragraph("" + vo.getOrdersDetailTbPriceSum()).setFont(font)));
			table.addCell(new Cell().add(new Paragraph("" + vo.getPdSaleTbReceivedPrice()).setFont(font)));
			table.addCell(new Cell().add(new Paragraph("" + vo.getOrdersDetailTbAmount()).setFont(font)));
			table.addCell(new Cell().add(new Paragraph("").setFont(font)));

			totpay += vo.getOrdersDetailTbPriceSum();
			totRePirce += vo.getPdSaleTbReceivedPrice();
			totAmount += vo.getOrdersDetailTbAmount();
		}

		table.addFooterCell(new Cell().add(new Paragraph("총합").setFont(font)));
		table.addFooterCell(new Cell().add(new Paragraph("" + totpay).setFont(font)));
		table.addFooterCell(new Cell().add(new Paragraph("" + totRePirce).setFont(font)));
		table.addFooterCell(new Cell().add(new Paragraph("" + totAmount).setFont(font)));
		table.addFooterCell(new Cell().add(new Paragraph("").setFont(font)));

		return table;
	}

}
