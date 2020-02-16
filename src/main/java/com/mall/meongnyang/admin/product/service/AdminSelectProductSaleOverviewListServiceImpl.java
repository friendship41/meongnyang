package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductSaleDAO;
import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AdminSelectProductSaleOverviewListService")
public class AdminSelectProductSaleOverviewListServiceImpl implements AdminSelectProductSaleOverviewListService
{
    @Autowired
    private AdminProductSaleDAO adminProductSaleDAO;

    @Override
    public List<AdminProductSaleVO> selectProductSaleOverview(AdminProductSaleVO adminProductSaleVO)
    {
        return adminProductSaleDAO.selectProductSaleOverviewList(adminProductSaleVO);
    }
}
