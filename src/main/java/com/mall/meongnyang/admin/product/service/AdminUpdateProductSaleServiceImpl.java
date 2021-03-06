package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductSaleDAO;
import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminUpdateProductSaleService")
public class AdminUpdateProductSaleServiceImpl implements AdminUpdateProductSaleService
{
    @Autowired
    private AdminProductSaleDAO adminProductSaleDAO;

    @Override
    public void stopSale(AdminProductSaleVO adminProductSaleVO)
    {
        adminProductSaleVO.setPdSaleTbState("N");
        adminProductSaleDAO.updateProductSaleState(adminProductSaleVO);
    }

    @Override
    public void restartSale(AdminProductSaleVO adminProductSaleVO)
    {
        adminProductSaleDAO.updateProductSale(adminProductSaleVO);
    }
}
