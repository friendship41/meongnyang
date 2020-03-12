package com.mall.meongnyang.client.mypage.dao;

import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientProductOrderDAOImpl implements ClientProductOrderDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<ClientProductOrderVO> selectProductOrderList(ClientProductOrderVO clientProductOrderVO) {
		return sqlSessionTemplate.selectList("orderDAO.selectOrderList", clientProductOrderVO);
	}

	@Override
	public int selectOrderCount(ClientProductOrderVO clientProductOrderVO) {
		return sqlSessionTemplate.selectOne("orderDAO.selectOrderCount", clientProductOrderVO);
	}

	@Override
	public ClientProductOrderVO selectProductOrder(ClientProductOrderVO clientProductOrderVO) {
		return sqlSessionTemplate.selectOne("orderDAO.selectOrder", clientProductOrderVO);
	}

	@Override
	public void insertProductOrder(ClientOrderVO clientOrderVO)
	{
		sqlSessionTemplate.insert("orderDAO.insertProductOrder", clientOrderVO);
	}

	@Override
	public void updateProductOrderPay(ClientOrderVO clientOrderVO)
	{
		sqlSessionTemplate.update("orderDAO.updateProductOrderPay", clientOrderVO);
	}

	@Override
	public void deleteProductOrder(ClientOrderVO clientOrderVO)
	{
		sqlSessionTemplate.delete("orderDAO.deleteProductOrder", clientOrderVO);
	}

	@Override
	public void updateOrderState(ClientOrderVO clientOrderVO)
	{
		sqlSessionTemplate.update("orderDAO.updateOrderState", clientOrderVO);
	}


}
