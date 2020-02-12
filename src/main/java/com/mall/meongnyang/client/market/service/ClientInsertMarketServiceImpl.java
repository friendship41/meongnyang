package com.mall.meongnyang.client.market.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.market.dao.ClientMarketDAO;
import com.mall.meongnyang.client.market.vo.ClientMarketVO;
import com.mall.meongnyang.util.imagesave.SaveImageService;

@Service
public class ClientInsertMarketServiceImpl implements ClientInsertMarketService {

	@Autowired
	private ClientMarketDAO clientMarketDAO;

	@Override
	public void insertMarket(ClientMarketVO clientMarketVO, HttpServletRequest request) {
		
		if (clientMarketVO.getMarketTbSellOrBuy().equals("sell")) {
			clientMarketVO.setMarketTbSellOrBuy("S");
		} else if (clientMarketVO.getMarketTbSellOrBuy().equals("buy")) {
			clientMarketVO.setMarketTbSellOrBuy("B");
		}

		if (!clientMarketVO.getUploadFile().isEmpty()) {
			try {
				String fullFileName = new SaveImageService().saveImage("market", clientMarketVO.getUploadFile(),
						request);

				clientMarketVO.setMarketTbImgPath(fullFileName);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		clientMarketDAO.insertMarket(clientMarketVO);
		System.out.println("서비스 " + clientMarketVO.toString());
	}
}
