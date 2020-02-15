package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductStockDAO;
import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AdminSelectProductExpireDateService")
public class AdminSelectProductExpireDateServiceImpl implements AdminSelectProductExpireDateService
{
    @Autowired
    private AdminProductStockDAO adminProductStockDAO;


    @Override
    public List<AdminProductSaleVO> selectProductExpireDate(AdminProductSaleVO adminProductSaleVO)
    {
        return adminProductStockDAO.selectExpireProductList(adminProductSaleVO);
    }
}
