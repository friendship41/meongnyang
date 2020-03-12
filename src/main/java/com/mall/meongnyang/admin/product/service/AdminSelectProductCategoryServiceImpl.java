package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductCategoryDAO;
import com.mall.meongnyang.admin.product.vo.AdminProductCategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminSelectProductCategoryService")
public class AdminSelectProductCategoryServiceImpl implements AdminSelectProductCategoryService
{
    @Autowired
    private AdminProductCategoryDAO adminProductCategoryDAO;

    @Override
    public AdminProductCategoryVO selectCategory(AdminProductCategoryVO adminProductCategoryVO)
    {
        return adminProductCategoryDAO.selectProductCategory(adminProductCategoryVO);
    }
}
