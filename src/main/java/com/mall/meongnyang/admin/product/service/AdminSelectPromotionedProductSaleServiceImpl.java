package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductSaleDAO;
import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AdminSelectPromotionedProductSaleService")
public class AdminSelectPromotionedProductSaleServiceImpl implements AdminSelectPromotionedProductSaleService
{
    @Autowired
    private AdminProductSaleDAO adminProductSaleDAO;

    @Override
    public List<AdminProductSaleVO> selectPromotionedProductSale(AdminProductSaleVO adminProductSaleVO)
    {
        return adminProductSaleDAO.selectPromotionedProductSale(adminProductSaleVO);
    }
}
