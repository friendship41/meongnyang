package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductImageDAO;
import com.mall.meongnyang.admin.product.vo.AdminProductImageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AdminSelectProductImageService")
public class AdminSelectProductImageServiceImpl implements AdminSelectProductImageService
{
    @Autowired
    private AdminProductImageDAO adminProductImageDAO;


    @Override
    public List<AdminProductImageVO> selectProductImages(AdminProductImageVO adminProductImageVO)
    {
        return adminProductImageDAO.selectProductImages(adminProductImageVO);
    }
}
