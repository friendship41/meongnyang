package com.mall.meongnyang.client.mypage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.mypage.dao.ClientProductOrderDAO;
import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

@Service
public class ClientSelectProductOrderListServiceImpl implements ClientSelectProductOrderListService {
	
	@Autowired
	private ClientProductOrderDAO clientProductOrderDAO;

	@Override
	public List<ClientProductOrderVO> selectProductOrderList(ClientProductOrderVO clientProductOrderVO) {
		return clientProductOrderDAO.selectProductOrderList(clientProductOrderVO);
	}

	@Override
	public int selectOrderCount(ClientProductOrderVO clientProductOrderVO) {
		return clientProductOrderDAO.selectOrderCount(clientProductOrderVO);
	}

}
