package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductDAO;
import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminSelectProductService")
public class AdminSelectProductServiceImpl implements AdminSelectProductService
{
    @Autowired
    private AdminProductDAO adminProductDAO;


    @Override
    public AdminProductVO selectSingleProduct(AdminProductVO adminProductVO)
    {
        return adminProductDAO.selectProduct(adminProductVO);
    }
}
