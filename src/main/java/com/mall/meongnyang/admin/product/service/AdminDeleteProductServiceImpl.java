package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductDAO;
import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminDeleteProductService")
public class AdminDeleteProductServiceImpl implements AdminDeleteProductService
{
    @Autowired
    private AdminProductDAO adminProductDAO;

    @Override
    public void deleteProduct(AdminProductVO adminProductVO)
    {
        adminProductDAO.deleteProduct(adminProductVO);
    }
}
