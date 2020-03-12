package com.mall.meongnyang.admin.sales.service;

import java.util.ArrayList;
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
public class PriceRangePdfMakerServiceImpl implements PriceRangePdfMakerService {
	
	@Autowired
	private AdminSelectSalesPaymentPriceService paymentPriceService;
	
	@Autowired
	private AdminSelectSalesPaymentPriceMonthlyService priceMonthlyService;

	@Override
	public Table priceRangePdfMaker(String target, ClientProductOrderVO clientProductOrderVO, PdfFont font) {
		List<ClientProductOrderVO> tmpList = null;

		if (target.equals("dailySalesPrice")) {

			tmpList = paymentPriceService.selectSalesPaymentPrice(clientProductOrderVO);
			
		} else if (target.equals("monthlySalesPrice")) {

			tmpList = priceMonthlyService.selectSalesPaymentPriceMonthly(clientProductOrderVO);
		}
		
		List<ClientProductOrderVO> list = priceListreplace(tmpList);

		Table table = new Table(UnitValue.createPercentArray(5)).useAllAvailableWidth();
		
		// 테이블에 컬럼명 추가
		table.addHeaderCell(new Cell().add(new Paragraph("범주").setFont(font)));
		table.addHeaderCell(new Cell().add(new Paragraph("매출").setFont(font)));
		table.addHeaderCell(new Cell().add(new Paragraph("원가").setFont(font)));
		table.addHeaderCell(new Cell().add(new Paragraph("판매량").setFont(font)));
		table.addHeaderCell(new Cell().add(new Paragraph("비고").setFont(font)));

		int totpay = 0;
		int totRePirce = 0;
		int totAmount = 0;
		

		for (ClientProductOrderVO vo : list) {

			table.addCell(new Cell().add(new Paragraph(vo.getPdSaleTbSalesPriceRange()).setFont(font)));
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
	
	public List<ClientProductOrderVO> priceListreplace(List<ClientProductOrderVO> list) {

		List<ClientProductOrderVO> salesList = list;

		List<String> label = new ArrayList<String>();

		int cnt = 0;
		for (int i = 0; i < salesList.size(); i++) {
			if (i == 0) {
				label.add(salesList.get(i).getPdSaleTbSalesPriceRange().replace(" ",""));
			} else {
				if (!label.get(cnt).equals(salesList.get(i).getPdSaleTbSalesPriceRange().replace(" ",""))) {
					label.add(salesList.get(i).getPdSaleTbSalesPriceRange().replace(" ",""));
					cnt += 1;
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
				if (label.get(i).equals(salesList.get(j).getPdSaleTbSalesPriceRange().replace(" ",""))) {
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
		return poList;
	}

}
