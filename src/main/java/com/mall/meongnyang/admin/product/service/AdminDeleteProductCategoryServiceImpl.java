package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductCategoryDAO;
import com.mall.meongnyang.admin.product.vo.AdminProductCategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminDeleteProductCategoryService")
public class AdminDeleteProductCategoryServiceImpl implements AdminDeleteProductCategoryService
{
    @Autowired
    private AdminProductCategoryDAO adminProductCategoryDAO;

    @Override
    public void deleteCategory(AdminProductCategoryVO adminProductCategoryVO)
    {
        adminProductCategoryDAO.deleteProductCategory(adminProductCategoryVO);
    }
}
