package com.mall.meongnyang.admin.marketing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.marketing.dao.AdminPromotionDAO;
import com.mall.meongnyang.admin.marketing.vo.AdminPromotionVO;

@Service
public class AdminSelectPromotionListServiceImpl implements AdminSelectPromotionListService {

	@Autowired
	private AdminPromotionDAO adminPromotionDAO;
	
	@Override
	public List<AdminPromotionVO> selectPromotionList() {
		return adminPromotionDAO.selectPromotionList();
	}

}
