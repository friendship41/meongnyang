package com.mall.meongnyang.client.mypage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import com.mall.meongnyang.client.mypage.dao.ClientWishlistDAO;

@Service
public class ClientSelectAdminProductSaleVOServiceImpl implements ClientSelectAdminProductSaleVOService {

	@Autowired
	private ClientWishlistDAO clientWishlistDAO;

	@Override
	public AdminProductSaleVO selectAdminProductSaleVO(AdminProductSaleVO adminProductSaleVO) {

		return clientWishlistDAO.selectAdminProductSaleVO(adminProductSaleVO);
	}

}
