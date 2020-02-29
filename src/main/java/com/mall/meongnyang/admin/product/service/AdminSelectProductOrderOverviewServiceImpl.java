package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductOrderDAO;
import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AdminSelectProductOrderOverviewService")
public class AdminSelectProductOrderOverviewServiceImpl implements AdminSelectProductOrderOverviewService
{
    @Autowired
    private AdminProductOrderDAO adminProductOrderDAO;

    @Override
    public List<ClientProductOrderVO> selectProductOrderList(ClientProductOrderVO clientProductOrderVO)
    {
        return adminProductOrderDAO.selectAdminProductOrderOverview(clientProductOrderVO);
    }
}
