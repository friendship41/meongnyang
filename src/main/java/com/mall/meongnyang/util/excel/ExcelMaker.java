package com.mall.meongnyang.util.excel;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.util.HSSFColor.HSSFColorPredefined;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

public class ExcelMaker {

	public XSSFWorkbook SalesExcelDown(List<ClientProductOrderVO> list) {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
		XSSFRow row = null;
		XSSFCell cell = null;
		int rowNo = 0;

		CellStyle headStyle = workbook.createCellStyle();

		headStyle.setBorderTop(BorderStyle.THIN);
		headStyle.setBorderBottom(BorderStyle.THIN);
		headStyle.setBorderLeft(BorderStyle.THIN);
		headStyle.setBorderRight(BorderStyle.THIN);

		// 배경색
		headStyle.setFillForegroundColor(HSSFColorPredefined.GREY_40_PERCENT.getIndex());
		headStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		// 데이터는 가운데 정렬합니다.
		headStyle.setAlignment(HorizontalAlignment.CENTER);

		CellStyle bodyStyle = workbook.createCellStyle();

		bodyStyle.setBorderTop(BorderStyle.THIN);
		bodyStyle.setBorderBottom(BorderStyle.THIN);
		bodyStyle.setBorderLeft(BorderStyle.THIN);
		bodyStyle.setBorderRight(BorderStyle.THIN);

		row = sheet.createRow(rowNo++);
		cell = row.createCell(0);
		cell.setCellStyle(headStyle);
		cell.setCellValue("일자");

		cell = row.createCell(1);
		cell.setCellStyle(headStyle);
		cell.setCellValue("매출");

		cell = row.createCell(2);
		cell.setCellStyle(headStyle);
		cell.setCellValue("원가");

		cell = row.createCell(3);
		cell.setCellStyle(headStyle);
		cell.setCellValue("배송비");

		cell = row.createCell(4);
		cell.setCellStyle(headStyle);
		cell.setCellValue("포인트소모");

		cell = row.createCell(5);
		cell.setCellStyle(headStyle);
		cell.setCellValue("순이익");

		for (int i = 0; i < list.size(); i++) {
			row = sheet.createRow(rowNo++);
			ClientProductOrderVO vo = list.get(i);

			cell = row.createCell(0);
			cell.setCellStyle(bodyStyle);
			cell.setCellValue(vo.getPdOrderTbPaymentDateStr());

			cell = row.createCell(1);
			cell.setCellStyle(bodyStyle);
			cell.setCellValue(vo.getPdOrderTbPaymentSum());

			cell = row.createCell(2);
			cell.setCellStyle(bodyStyle);
			cell.setCellValue(vo.getPdSaleTbReceivedPrice());

			cell = row.createCell(3);
			cell.setCellStyle(bodyStyle);
			cell.setCellValue(vo.getPdOrderTbDeliveryFee());

			cell = row.createCell(4);
			cell.setCellStyle(bodyStyle);
			cell.setCellValue(vo.getPdOrderTbUsedPoint());

			cell = row.createCell(5);
			cell.setCellStyle(bodyStyle);
			cell.setCellValue(
					vo.getPdOrderTbPaymentSum() - vo.getPdSaleTbReceivedPrice() - vo.getPdOrderTbDeliveryFee());
		}

		return workbook;
	}

	public XSSFWorkbook categorySalesExcelDown(List<ClientProductOrderVO> list) {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
		XSSFRow row = null;
		XSSFCell cell = null;
		int rowNo = 0;

		CellStyle headStyle = workbook.createCellStyle();

		headStyle.setBorderTop(BorderStyle.THIN);
		headStyle.setBorderBottom(BorderStyle.THIN);
		headStyle.setBorderLeft(BorderStyle.THIN);
		headStyle.setBorderRight(BorderStyle.THIN);

		// 배경색
		headStyle.setFillForegroundColor(HSSFColorPredefined.GREY_40_PERCENT.getIndex());
		headStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		// 데이터는 가운데 정렬합니다.
		headStyle.setAlignment(HorizontalAlignment.CENTER);

		CellStyle bodyStyle = workbook.createCellStyle();

		bodyStyle.setBorderTop(BorderStyle.THIN);
		bodyStyle.setBorderBottom(BorderStyle.THIN);
		bodyStyle.setBorderLeft(BorderStyle.THIN);
		bodyStyle.setBorderRight(BorderStyle.THIN);

		row = sheet.createRow(rowNo++);
		cell = row.createCell(0);
		cell.setCellStyle(headStyle);
		cell.setCellValue("카테고리");

		cell = row.createCell(1);
		cell.setCellStyle(headStyle);
		cell.setCellValue("매출");

		cell = row.createCell(2);
		cell.setCellStyle(headStyle);
		cell.setCellValue("원가");

		cell = row.createCell(3);
		cell.setCellStyle(headStyle);
		cell.setCellValue("판매량");

		cell = row.createCell(4);
		cell.setCellStyle(headStyle);
		cell.setCellValue("비고");

		for (int i = 0; i < list.size(); i++) {
			row = sheet.createRow(rowNo++);
			ClientProductOrderVO vo = list.get(i);

			cell = row.createCell(0);
			cell.setCellStyle(bodyStyle);
			cell.setCellValue(vo.getProductCategoryTbParent() +"-"+ vo.getProductCategoryTbSub());

			cell = row.createCell(1);
			cell.setCellStyle(bodyStyle);
			cell.setCellValue(vo.getOrdersDetailTbPriceSum());

			cell = row.createCell(2);
			cell.setCellStyle(bodyStyle);
			cell.setCellValue(vo.getPdSaleTbReceivedPrice());

			cell = row.createCell(3);
			cell.setCellStyle(bodyStyle);
			cell.setCellValue(vo.getOrdersDetailTbAmount());

			cell = row.createCell(4);
			cell.setCellStyle(bodyStyle);
			cell.setCellValue("");
		}
		return workbook;
	}
	
	public XSSFWorkbook SalesPriceExcelDown(List<ClientProductOrderVO> list) { //범주
		
		List<ClientProductOrderVO> pdlist = priceListreplace(list);
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
		XSSFRow row = null;
		XSSFCell cell = null;
		int rowNo = 0;

		CellStyle headStyle = workbook.createCellStyle();

		headStyle.setBorderTop(BorderStyle.THIN);
		headStyle.setBorderBottom(BorderStyle.THIN);
		headStyle.setBorderLeft(BorderStyle.THIN);
		headStyle.setBorderRight(BorderStyle.THIN);

		// 배경색
		headStyle.setFillForegroundColor(HSSFColorPredefined.GREY_40_PERCENT.getIndex());
		headStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		// 데이터는 가운데 정렬합니다.
		headStyle.setAlignment(HorizontalAlignment.CENTER);

		CellStyle bodyStyle = workbook.createCellStyle();

		bodyStyle.setBorderTop(BorderStyle.THIN);
		bodyStyle.setBorderBottom(BorderStyle.THIN);
		bodyStyle.setBorderLeft(BorderStyle.THIN);
		bodyStyle.setBorderRight(BorderStyle.THIN);

		row = sheet.createRow(rowNo++);
		cell = row.createCell(0);
		cell.setCellStyle(headStyle);
		cell.setCellValue("범주");

		cell = row.createCell(1);
		cell.setCellStyle(headStyle);
		cell.setCellValue("매출");

		cell = row.createCell(2);
		cell.setCellStyle(headStyle);
		cell.setCellValue("원가");

		cell = row.createCell(3);
		cell.setCellStyle(headStyle);
		cell.setCellValue("판매량");

		cell = row.createCell(4);
		cell.setCellStyle(headStyle);
		cell.setCellValue("비고");

		for (int i = 0; i < pdlist.size(); i++) {
			row = sheet.createRow(rowNo++);
			ClientProductOrderVO vo = pdlist.get(i);

			cell = row.createCell(0);
			cell.setCellStyle(bodyStyle);
			cell.setCellValue(vo.getPdSaleTbSalesPriceRange());

			cell = row.createCell(1);
			cell.setCellStyle(bodyStyle);
			cell.setCellValue(vo.getOrdersDetailTbPriceSum());

			cell = row.createCell(2);
			cell.setCellStyle(bodyStyle);
			cell.setCellValue(vo.getPdSaleTbReceivedPrice());

			cell = row.createCell(3);
			cell.setCellStyle(bodyStyle);
			cell.setCellValue(vo.getOrdersDetailTbAmount());

			cell = row.createCell(4);
			cell.setCellStyle(bodyStyle);
			cell.setCellValue("");

		}
		return workbook;
	}

	public XSSFWorkbook RegionSalesExcelDown(List<ClientProductOrderVO> list) {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
		XSSFRow row = null;
		XSSFCell cell = null;
		int rowNo = 0;

		CellStyle headStyle = workbook.createCellStyle();

		headStyle.setBorderTop(BorderStyle.THIN);
		headStyle.setBorderBottom(BorderStyle.THIN);
		headStyle.setBorderLeft(BorderStyle.THIN);
		headStyle.setBorderRight(BorderStyle.THIN);

		// 배경색
		headStyle.setFillForegroundColor(HSSFColorPredefined.GREY_40_PERCENT.getIndex());
		headStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		// 데이터는 가운데 정렬합니다.
		headStyle.setAlignment(HorizontalAlignment.CENTER);

		CellStyle bodyStyle = workbook.createCellStyle();

		bodyStyle.setBorderTop(BorderStyle.THIN);
		bodyStyle.setBorderBottom(BorderStyle.THIN);
		bodyStyle.setBorderLeft(BorderStyle.THIN);
		bodyStyle.setBorderRight(BorderStyle.THIN);

		row = sheet.createRow(rowNo++);
		cell = row.createCell(0);
		cell.setCellStyle(headStyle);
		cell.setCellValue("지역");

		cell = row.createCell(1);
		cell.setCellStyle(headStyle);
		cell.setCellValue("매출");

		cell = row.createCell(2);
		cell.setCellStyle(headStyle);
		cell.setCellValue("원가");

		cell = row.createCell(3);
		cell.setCellStyle(headStyle);
		cell.setCellValue("배송비");

		cell = row.createCell(4);
		cell.setCellStyle(headStyle);
		cell.setCellValue("포인트소모");

		cell = row.createCell(5);
		cell.setCellStyle(headStyle);
		cell.setCellValue("순이익");

		for (int i = 0; i < list.size(); i++) {
			row = sheet.createRow(rowNo++);
			ClientProductOrderVO vo = list.get(i);

			cell = row.createCell(0);
			cell.setCellStyle(bodyStyle);
			cell.setCellValue(vo.getPdOrderTbAdCity());

			cell = row.createCell(1);
			cell.setCellStyle(bodyStyle);
			cell.setCellValue(vo.getPdOrderTbPaymentSum());

			cell = row.createCell(2);
			cell.setCellStyle(bodyStyle);
			cell.setCellValue(vo.getPdSaleTbReceivedPrice());

			cell = row.createCell(3);
			cell.setCellStyle(bodyStyle);
			cell.setCellValue(vo.getPdOrderTbDeliveryFee());

			cell = row.createCell(4);
			cell.setCellStyle(bodyStyle);
			cell.setCellValue(vo.getPdOrderTbUsedPoint());

			cell = row.createCell(5);
			cell.setCellStyle(bodyStyle);
			cell.setCellValue(
					vo.getPdOrderTbPaymentSum() - vo.getPdSaleTbReceivedPrice() - vo.getPdOrderTbDeliveryFee());
		}

		return workbook;
	}
	
	public List<ClientProductOrderVO> priceListreplace(List<ClientProductOrderVO> list) {

		List<ClientProductOrderVO> salesList = list;

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
		return poList;
	}
}
