package com.mall.meongnyang.admin.marketing.dao;

import java.util.List;

import com.mall.meongnyang.admin.marketing.vo.AdminPromotionVO;

public interface AdminPromotionDAO {
	void deletePromotion(int promotionTbCode);
	void insertPromotion(AdminPromotionVO adminPromotionVO);
	List<AdminPromotionVO> selectPromotionList();
	AdminPromotionVO selectPromotion(int promotionTbCode);
}
