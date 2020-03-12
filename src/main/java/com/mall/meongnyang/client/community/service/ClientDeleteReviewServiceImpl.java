package com.mall.meongnyang.client.community.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import com.mall.meongnyang.client.community.dao.ClientReviewDAO;
import com.mall.meongnyang.client.community.vo.ClientReviewVO;

@Service
public class ClientDeleteReviewServiceImpl implements ClientDeleteReviewService {
	
	@Autowired
	private ClientReviewDAO clientReviewDAO;

	@Override
	@Transactional
	public void deleteReview(ClientReviewVO clientReviewVO) {
		clientReviewDAO.deleteReview(clientReviewVO);
		
		AdminProductSaleVO adminProductSaleVO = new AdminProductSaleVO();
		adminProductSaleVO.setProductTbCode(clientReviewVO.getProductTbCode());
		clientReviewDAO.updateProductSaleRating(adminProductSaleVO);
	}

}
