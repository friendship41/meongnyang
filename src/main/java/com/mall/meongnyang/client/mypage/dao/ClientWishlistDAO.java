package com.mall.meongnyang.client.mypage.dao;

import java.util.List;

import com.mall.meongnyang.client.mypage.vo.ClientWishlistVO;

public interface ClientWishlistDAO {
	
	public List<ClientWishlistVO> selectWishlistList(ClientWishlistVO clientWishlistVO);
	public void deleteWishlist(ClientWishlistVO clientWishlistVO);
}
