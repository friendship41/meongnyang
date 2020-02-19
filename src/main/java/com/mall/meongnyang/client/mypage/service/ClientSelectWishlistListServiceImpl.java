package com.mall.meongnyang.client.mypage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.mypage.dao.ClientWishlistDAO;
import com.mall.meongnyang.client.mypage.vo.ClientWishlistVO;

@Service
public class ClientSelectWishlistListServiceImpl implements ClientSelectWishlistListService {
	
	@Autowired
	private ClientWishlistDAO clientWishlistDAO;
	
	@Override
	public List<ClientWishlistVO> selectWishlistList(ClientWishlistVO clientWishlistVO) {
		
		return clientWishlistDAO.selectWishlistList(clientWishlistVO);
	}

}
