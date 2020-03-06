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
public class SalesPdfMakerServiceImpl implements SalesPdfMakerService {

	@Autowired
	private AdminSelectSalesPaymentDailyService salesPaymentDailyService;

	@Autowired
	private AdminSelectSalesPaymentMonthlyService salesPaymentMonthlyService;

	@Override
	public Table salesPdfMaker(String target, ClientProductOrderVO clientProductOrderVO, PdfFont font) {

		List<ClientProductOrderVO> list = null;

		if (target.equals("dailySales")) {

			list = salesPaymentDailyService.selectSalesPayment(clientProductOrderVO);
			
		} else if (target.equals("monthlySales")) {

			list = salesPaymentMonthlyService.selectSalesPaymentMonthly(clientProductOrderVO);
		}

		Table table = new Table(UnitValue.createPercentArray(6)).useAllAvailableWidth();
		
		// 테이블에 컬럼명 추가
		table.addCell(new Cell().add(new Paragraph("일자").setFont(font)));
		table.addCell(new Cell().add(new Paragraph("매출").setFont(font)));
		table.addCell(new Cell().add(new Paragraph("원가").setFont(font)));
		table.addCell(new Cell().add(new Paragraph("배송비").setFont(font)));
		table.addCell(new Cell().add(new Paragraph("포인트소모").setFont(font)));
		table.addCell(new Cell().add(new Paragraph("순이익").setFont(font)));

		int totpay = 0;
		int totRePirce = 0;
		int totDelFee = 0;
		int totPoint = 0;
		int totprofit = totpay - totRePirce - totDelFee;

		for (ClientProductOrderVO vo : list) {
			int profit = (vo.getPdOrderTbPaymentSum() - vo.getPdSaleTbReceivedPrice()
					- vo.getPdOrderTbDeliveryFee());
			table.addCell(new Cell().add(new Paragraph(vo.getPdOrderTbPaymentDateStr()).setFont(font)));
			table.addCell(new Cell().add(new Paragraph("" + vo.getPdOrderTbPaymentSum()).setFont(font)));
			table.addCell(new Cell().add(new Paragraph("" + vo.getPdSaleTbReceivedPrice()).setFont(font)));
			table.addCell(new Cell().add(new Paragraph("" + vo.getPdOrderTbDeliveryFee()).setFont(font)));
			table.addCell(new Cell().add(new Paragraph("" + vo.getPdOrderTbUsedPoint()).setFont(font)));
			table.addCell(new Cell().add(new Paragraph("" + profit).setFont(font)));

			totpay += vo.getPdOrderTbPaymentSum();
			totRePirce += vo.getPdSaleTbReceivedPrice();
			totDelFee += vo.getPdOrderTbDeliveryFee();
			totPoint += vo.getPdOrderTbUsedPoint();
		}

		table.addCell(new Cell().add(new Paragraph("총합").setFont(font)));
		table.addCell(new Cell().add(new Paragraph("" + totpay).setFont(font)));
		table.addCell(new Cell().add(new Paragraph("" + totRePirce).setFont(font)));
		table.addCell(new Cell().add(new Paragraph("" + totDelFee).setFont(font)));
		table.addCell(new Cell().add(new Paragraph("" + totPoint).setFont(font)));
		table.addCell(new Cell().add(new Paragraph("" + totprofit).setFont(font)));

		return table;

	}

}
