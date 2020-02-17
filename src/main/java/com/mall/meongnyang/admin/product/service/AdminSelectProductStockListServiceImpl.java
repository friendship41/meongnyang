package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductStockDAO;
import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AdminSelectProductStockService")
public class AdminSelectProductStockListServiceImpl implements AdminSelectProductStockListService
{
    @Autowired
    private AdminProductStockDAO adminProductStockDAO;


    @Override
    public List<AdminProductSaleVO> selectProductStockList(AdminProductSaleVO adminProductSaleVO)
    {
        return adminProductStockDAO.selectProductStockList(adminProductSaleVO);
    }
}
