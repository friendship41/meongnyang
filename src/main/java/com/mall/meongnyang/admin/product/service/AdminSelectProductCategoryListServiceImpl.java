package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductCategoryDAO;
import com.mall.meongnyang.admin.product.vo.AdminProductCategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AdminSelectProductCategoryListService")
public class AdminSelectProductCategoryListServiceImpl implements AdminSelectProductCategoryListService
{
    @Autowired
    private AdminProductCategoryDAO adminProductCategoryDAO;

    @Override
    public List<AdminProductCategoryVO> selectCategoryList(AdminProductCategoryVO adminProductCategoryVO)
    {
        return adminProductCategoryDAO.selectProductCategoryList(adminProductCategoryVO);
    }
}
