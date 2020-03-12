package com.mall.meongnyang.admin.marketing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.marketing.dao.AdminPromotionDAO;
import com.mall.meongnyang.admin.marketing.vo.AdminPromotionVO;

@Service
public class AdminSelectPromotionServiceImpl implements AdminSelectPromotionService {

	@Autowired
	private AdminPromotionDAO adminPromotionDAO;
	
	@Override
	public AdminPromotionVO selectPromotion(int promotionTbCode) {
		return adminPromotionDAO.selectPromotion(promotionTbCode);
	}

	@Override
	public List<AdminPromotionVO> selectPromotionAppliedProductList(AdminPromotionVO adminPromotionVO) {
		
		List<AdminPromotionVO> list = adminPromotionDAO.selectPromotionAppliedProductList(adminPromotionVO);
		
		for(AdminPromotionVO vo :list) {
			String parent = vo.getProductCategoryTbParent();
			String median = vo.getProductCategoryTbMedian();
			String sub = vo.getProductCategoryTbSub();
			vo.setCategory(parent + "-" + median + "-" + sub);
		}
		
		return list;
	}
}
