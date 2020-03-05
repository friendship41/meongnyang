package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductOrderDAO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AdminSelectOrderStateListService")
public class AdminSelectOrderStateListServiceImpl implements AdminSelectOrderStateListService
{
    @Autowired
    private AdminProductOrderDAO adminProductOrderDAO;

    @Override
    public List<ClientOrderVO> selectOrderStateList()
    {
        return adminProductOrderDAO.selectOrderStateList();
    }
}
