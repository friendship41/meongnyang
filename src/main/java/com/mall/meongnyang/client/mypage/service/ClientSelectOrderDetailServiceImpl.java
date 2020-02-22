package com.mall.meongnyang.client.mypage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.mypage.dao.ClientOrdersDetailDAO;
import com.mall.meongnyang.client.mypage.vo.ClientOrdersDetailVO;

@Service
public class ClientSelectOrderDetailServiceImpl implements ClientSelectOrderDetailService {

	@Autowired
	private ClientOrdersDetailDAO clientOrdersDetailDAO;
	
	@Override
	public List<ClientOrdersDetailVO> selectOrderDetail(ClientOrdersDetailVO clientOrdersDetailVO) {
		return clientOrdersDetailDAO.selectOrderDetail(clientOrdersDetailVO);
	}

}
