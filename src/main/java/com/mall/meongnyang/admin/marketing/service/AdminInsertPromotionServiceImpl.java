package com.mall.meongnyang.admin.marketing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.marketing.dao.AdminPromotionDAO;
import com.mall.meongnyang.admin.marketing.vo.AdminPromotionVO;

@Service
public class AdminInsertPromotionServiceImpl implements AdminInsertPromotionService {
	
	@Autowired
	private AdminPromotionDAO adminPromotionDAO;

	@Override
	public void insertPromotion(AdminPromotionVO adminPromotionVO) {
		adminPromotionDAO.insertPromotion(adminPromotionVO);
	}

}
