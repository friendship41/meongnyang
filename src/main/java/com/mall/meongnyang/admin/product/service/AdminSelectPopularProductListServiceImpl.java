package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductDAO;
import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AdminSelectPopularProductListService")
public class AdminSelectPopularProductListServiceImpl implements AdminSelectPopularProductListService
{
    @Autowired
    private AdminProductDAO adminProductDAO;

    @Override
    public List<AdminProductVO> getPopularProductList(AdminProductVO adminProductVO)
    {
        return adminProductDAO.selectPopularProductList(adminProductVO);
    }
}
