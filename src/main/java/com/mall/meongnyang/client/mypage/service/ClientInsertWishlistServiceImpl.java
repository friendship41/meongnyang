package com.mall.meongnyang.client.mypage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.mypage.dao.ClientWishlistDAO;
import com.mall.meongnyang.client.mypage.vo.ClientWishlistVO;

@Service
public class ClientInsertWishlistServiceImpl implements ClientInsertWishlistService {

	@Autowired
	private ClientWishlistDAO clientWishlistDAO;

	@Override
	public void insertWishlist(ClientWishlistVO clientWishlistVO) {
		clientWishlistDAO.insertWishlist(clientWishlistVO);

	}

}