package com.mall.meongnyang.admin.marketing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.marketing.dao.AdminPromotionDAO;

@Service
public class AdminDeletePromotionServiceImpl implements AdminDeletePromotionService {

	@Autowired
	private AdminPromotionDAO adminPromotionDAO;
	
	@Override
	public void deletePromotion(int promotionTbCode) {
		adminPromotionDAO.deletePromotion(promotionTbCode);
	}
}
