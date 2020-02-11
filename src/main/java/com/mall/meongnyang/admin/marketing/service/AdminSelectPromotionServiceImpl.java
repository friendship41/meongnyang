package com.mall.meongnyang.admin.marketing.service;

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
}
