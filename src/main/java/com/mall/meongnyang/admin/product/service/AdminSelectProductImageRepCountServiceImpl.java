package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductImageDAO;
import com.mall.meongnyang.admin.product.vo.AdminProductImageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminSelectProductImageRepCountService")
public class AdminSelectProductImageRepCountServiceImpl implements AdminSelectProductImageRepCountService
{
    @Autowired
    private AdminProductImageDAO adminProductImageDAO;

    @Override
    public boolean checkRepSetOrNot(AdminProductImageVO adminProductImageVO)
    {
        int result = adminProductImageDAO.selectProductImageRepCount(adminProductImageVO);
        if(result>0)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
