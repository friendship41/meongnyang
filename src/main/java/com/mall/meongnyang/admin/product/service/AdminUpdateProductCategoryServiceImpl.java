package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductCategoryDAO;
import com.mall.meongnyang.admin.product.vo.AdminProductCategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminUpdateProductCategoryService")
public class AdminUpdateProductCategoryServiceImpl implements AdminUpdateProductCategoryService
{
    @Autowired
    private AdminProductCategoryDAO adminProductCategoryDAO;

    @Override
    public void updateCategory(AdminProductCategoryVO adminProductCategoryVO)
    {
        adminProductCategoryDAO.updateProductCategory(adminProductCategoryVO);
    }
}
