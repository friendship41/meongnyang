package com.mall.meongnyang.client.mypage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.mypage.dao.ClientWishlistDAO;
import com.mall.meongnyang.client.mypage.vo.ClientWishlistVO;



@Service
public class ClientDeleteWishlistServiceImpl implements ClientDeleteWishlistService {
	
	@Autowired
	private ClientWishlistDAO clientWishlistDAO;
		
	@Override
	public void deleteWishlist(ClientWishlistVO clientWishlistVO) {
		clientWishlistDAO.deleteWishlist(clientWishlistVO);
		
	}

}
