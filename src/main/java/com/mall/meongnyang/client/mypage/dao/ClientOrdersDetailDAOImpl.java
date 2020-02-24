package com.mall.meongnyang.client.mypage.dao;

import com.mall.meongnyang.client.mypage.vo.ClientOrdersDetailVO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderDetailVO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientOrdersDetailDAOImpl implements ClientOrdersDetailDAO {

	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	@Override
	public List<ClientOrdersDetailVO> selectOrderDetail(ClientOrdersDetailVO clientOrdersDetailVO) {
		return sessionTemplate.selectList("orderDetailDAO.selectOrderDetail", clientOrdersDetailVO);	
	}

	@Override
	public void insertOrderDetail(ClientOrderDetailVO clientOrderDetailVO)
	{
		sessionTemplate.insert("orderDetailDAO.insertOrderDetail", clientOrderDetailVO);
	}

	@Override
	public void deleteOrderDetailByNo(ClientOrderVO clientOrderVO)
	{
		sessionTemplate.delete("orderDetailDAO.deleteOrderDetailByNo", clientOrderVO);
	}

}
