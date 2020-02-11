package com.mall.meongnyang.admin.marketing.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.admin.marketing.vo.AdminPromotionVO;

@Repository
public class AdminPromotionDAOImpl implements AdminPromotionDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void deletePromotion(int promotionTbCode) {
		sqlSessionTemplate.delete("promotionDAO.deletePromotion", promotionTbCode);
	}

	@Override
	public void insertPromotion(AdminPromotionVO adminPromotionVO) {
		sqlSessionTemplate.insert("promotionDAO.insertPromotion", adminPromotionVO);
	}

	@Override
	public List<AdminPromotionVO> selectPromotionList() {
		return sqlSessionTemplate.selectList("promotionDAO.selectPromotionList");
	}

	@Override
	public AdminPromotionVO selectPromotion(int promotionTbCode) {
		return sqlSessionTemplate.selectOne("promotionDAO.selectPromotion", promotionTbCode);
	}

}
