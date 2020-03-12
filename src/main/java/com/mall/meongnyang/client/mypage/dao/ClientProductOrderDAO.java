package com.mall.meongnyang.client.mypage.dao;

import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;

import java.util.List;

public interface ClientProductOrderDAO {
	
	List<ClientProductOrderVO> selectProductOrderList(ClientProductOrderVO clientProductOrderVO);
	ClientProductOrderVO selectProductOrder(ClientProductOrderVO clientProductOrderVO);
	int selectOrderCount(ClientProductOrderVO clientProductOrderVO);
	public void insertProductOrder(ClientOrderVO clientOrderVO);
	public void updateProductOrderPay(ClientOrderVO clientOrderVO);
	public void deleteProductOrder(ClientOrderVO clientOrderVO);
	public void updateOrderState(ClientOrderVO clientOrderVO);
}
