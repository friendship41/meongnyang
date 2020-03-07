package com.mall.meongnyang.client.community.service;

import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import com.mall.meongnyang.client.community.dao.ClientReviewDAO;
import com.mall.meongnyang.client.community.vo.ClientReviewVO;
import com.mall.meongnyang.util.imagesave.SaveImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Service
public class ClientInsertReviewServiceImpl implements ClientInsertReviewService {

	@Autowired
	private ClientReviewDAO clientReviewDAO;

	@Override
	public void insertReview(ClientReviewVO clientReviewVO, HttpServletRequest request) {
		
		if (clientReviewVO.getFile() != null) {
			try {
				String fileName = new SaveImageService().saveImage("review", clientReviewVO.getFile(), request);
				clientReviewVO.setReviewTbImgPath(fileName);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		clientReviewDAO.insertReview(clientReviewVO);
		AdminProductSaleVO adminProductSaleVO = new AdminProductSaleVO();
		adminProductSaleVO.setProductTbCode(clientReviewVO.getProductTbCode());
		clientReviewDAO.updateProductSaleRating(adminProductSaleVO);
	}

	@Override
	public int selectCount(ClientReviewVO clientReviewVO) {
		return clientReviewDAO.selectCount(clientReviewVO);
	}

}
