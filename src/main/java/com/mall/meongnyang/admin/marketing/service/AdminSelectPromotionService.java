package com.mall.meongnyang.admin.marketing.service;

import java.util.List;

import com.mall.meongnyang.admin.marketing.vo.AdminPromotionVO;

public interface AdminSelectPromotionService {
	AdminPromotionVO selectPromotion(int promotionTbCode);
	List<AdminPromotionVO> selectPromotionAppliedProductList(AdminPromotionVO adminPromotionVO);
}
