package com.mall.meongnyang.admin.intercepter.stockAlert;

import com.mall.meongnyang.admin.product.dao.AdminProductStockDAO;
import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdminSelectProductExpireCommingListServiceImpl implements AdminSelectProductExpireCommingListService
{
    @Autowired
    private AdminProductStockDAO adminProductStockDAO;

    @Override
    public List<AdminProductSaleVO> selectProductExpireCommingList(AdminProductSaleVO adminProductSaleVO)
    {
        return adminProductStockDAO.selectProductExpireCommingList(adminProductSaleVO);
    }
}
