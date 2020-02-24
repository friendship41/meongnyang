package com.mall.meongnyang.client.mypage.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import com.mall.meongnyang.client.mypage.vo.ClientWishlistVO;

@Repository
public class ClientWishlistDAOImpl implements ClientWishlistDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<ClientWishlistVO> selectWishlistList(ClientWishlistVO clientWishlistVO) {

		return sqlSessionTemplate.selectList("clientWishlistDAO.selectWishlist", clientWishlistVO);
	}

	@Override
	public void deleteWishlist(ClientWishlistVO clientWishlistVO) {
		sqlSessionTemplate.delete("clientWishlistDAO.deleteWishlist", clientWishlistVO);

	}

	@Override
	public void insertWishlist(ClientWishlistVO clientWishlistVO) {
		sqlSessionTemplate.insert("clientWishlistDAO.insertWishlist", clientWishlistVO);

	}

	@Override
	public AdminProductSaleVO selectAdminProductSaleVO(AdminProductSaleVO adminProductSaleVO) {

		return sqlSessionTemplate.selectOne("clientWishlistDAO.selectAdminProductSaleVO", adminProductSaleVO);
	}

}