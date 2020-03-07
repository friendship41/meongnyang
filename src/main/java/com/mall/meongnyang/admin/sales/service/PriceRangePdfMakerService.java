package com.mall.meongnyang.admin.sales.service;

import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.layout.element.Table;
import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

public interface PriceRangePdfMakerService {

	Table priceRangePdfMaker(String target, ClientProductOrderVO clientProductOrderVO, PdfFont font);
}
