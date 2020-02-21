package com.mall.meongnyang.client.mypage.dao;

import com.mall.meongnyang.client.mypage.vo.ClientOrdersDetailVO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderDetailVO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;

import java.util.List;

public interface ClientOrdersDetailDAO {

	List<ClientOrdersDetailVO> selectOrderDetail(ClientOrdersDetailVO clientOrdersDetailVO);
	public void insertOrderDetail(ClientOrderDetailVO clientOrderDetailVO);
	public void deleteOrderDetailByNo(ClientOrderVO clientOrderVO);
}
