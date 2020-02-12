package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductCategoryDAO;
import com.mall.meongnyang.admin.product.vo.AdminProductCategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminInsertProductCategoryService")
public class AdminInsertProductCategoryServiceImpl implements AdminInsertProductCategoryService
{
    @Autowired
    private AdminProductCategoryDAO adminProductCategoryDAO;

    @Override
    public void insertCategory(AdminProductCategoryVO adminProductCategoryVO)
    {
        adminProductCategoryDAO.insertProductCategory(adminProductCategoryVO);
    }
}
