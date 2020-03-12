package com.mall.meongnyang.admin.index.service;

import com.mall.meongnyang.admin.product.dao.AdminProductStockDAO;
import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AdminSelectDashboardStockListService")
public class AdminSelectDashboardStockListServiceImpl implements AdminSelectDashboardStockListService
{
    @Autowired
    private AdminProductStockDAO adminProductStockDAO;

    @Override
    public List<AdminProductSaleVO> selectDashBoardProductStorkList()
    {
        return adminProductStockDAO.selectDashBoardProductStorkList();
    }
}
