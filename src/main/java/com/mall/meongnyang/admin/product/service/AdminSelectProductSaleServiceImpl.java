package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductSaleDAO;
import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminSelectProductSaleService")
public class AdminSelectProductSaleServiceImpl implements AdminSelectProductSaleService
{
    @Autowired
    private AdminProductSaleDAO adminProductSaleDAO;


    @Override
    public AdminProductSaleVO selectProductSale(AdminProductSaleVO adminProductSaleVO)
    {
        return adminProductSaleDAO.selectProductSale(adminProductSaleVO);
    }
}
