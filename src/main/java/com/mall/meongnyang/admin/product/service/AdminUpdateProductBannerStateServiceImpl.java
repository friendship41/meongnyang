package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductDAO;
import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminUpdateProductBannerStateService")
public class AdminUpdateProductBannerStateServiceImpl implements AdminUpdateProductBannerStateService
{
    @Autowired
    private AdminProductDAO adminProductDAO;


    @Override
    public void updateProductBannerState(AdminProductVO adminProductVO)
    {
        adminProductDAO.updateProductBannerState(adminProductVO);
    }
}
