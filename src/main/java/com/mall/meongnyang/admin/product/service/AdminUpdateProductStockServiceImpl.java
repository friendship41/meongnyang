package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductStockDAO;
import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminUpdateProductStockService")
public class AdminUpdateProductStockServiceImpl implements AdminUpdateProductStockService
{
    @Autowired
    private AdminProductStockDAO adminProductStockDAO;

    @Override
    public String updateProductStock(AdminProductSaleVO adminProductSaleVO)
    {
        adminProductStockDAO.updateProductStock(adminProductSaleVO);
        return "{\"state\":\"success\"}";
    }
}
