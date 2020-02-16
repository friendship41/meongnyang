package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductDAO;
import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AdminSelectProductOverviewListService")
public class AdminSelectProductOverviewListServiceImpl implements AdminSelectProductOverviewListService
{
    @Autowired
    private AdminProductDAO adminProductDAO;


    @Override
    public List<AdminProductVO> selectProductOverviewList(AdminProductVO adminProductVO)
    {
        return adminProductDAO.selectProductOverviewList(adminProductVO);
    }
}
