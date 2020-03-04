package com.mall.meongnyang.admin.sales.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

@Repository
public class AdminSalesOverviewDAOImpl implements AdminSalesOverviewDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<ClientProductOrderVO> selectSalesPayment(ClientProductOrderVO clientProductOrderVO) {
		return sqlSessionTemplate.selectList("orderDAO.selectSalesPayment", clientProductOrderVO);
	}

	@Override
	public List<ClientProductOrderVO> selectSalesPaymentMonthly(ClientProductOrderVO clientProductOrderVO) {
		return sqlSessionTemplate.selectList("orderDAO.selectSalesPaymentMonthly", clientProductOrderVO);
	}

	@Override
	public List<ClientProductOrderVO> selectSalesPaymentCategory(ClientProductOrderVO clientProductOrderVO) {
		return sqlSessionTemplate.selectList("orderDAO.selectSalesPaymentCategory", clientProductOrderVO);
	}

	@Override
	public List<ClientProductOrderVO> selectSalesPaymentRegion(ClientProductOrderVO clientProductOrderVO) {
		return sqlSessionTemplate.selectList("orderDAO.selectSalesPaymentRegion", clientProductOrderVO);
	}

	@Override
	public List<ClientProductOrderVO> selectSalesPaymentPrice(ClientProductOrderVO clientProductOrderVO) {
		return sqlSessionTemplate.selectList("orderDAO.selectSalesPaymentPrice", clientProductOrderVO);
	}

	@Override
	public List<ClientProductOrderVO> selectSalesPaymentPriceMonthly(ClientProductOrderVO clientProductOrderVO) {
		return sqlSessionTemplate.selectList("orderDAO.selectSalesPaymentPriceMonthly", clientProductOrderVO);
	}

}
