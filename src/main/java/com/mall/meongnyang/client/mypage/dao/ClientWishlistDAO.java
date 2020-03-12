package com.mall.meongnyang.client.mypage.dao;

import java.util.List;

import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import com.mall.meongnyang.client.mypage.vo.ClientWishlistVO;

public interface ClientWishlistDAO {

	public List<ClientWishlistVO> selectWishlistList(ClientWishlistVO clientWishlistVO);

	public void deleteWishlist(ClientWishlistVO clientWishlistVO);

	public void insertWishlist(ClientWishlistVO clientWishlistVO);

	public AdminProductSaleVO selectAdminProductSaleVO(AdminProductSaleVO adminProductSaleVO);
}