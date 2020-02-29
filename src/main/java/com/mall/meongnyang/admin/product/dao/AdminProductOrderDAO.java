package com.mall.meongnyang.admin.product.dao;

import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

import java.util.List;

public interface AdminProductOrderDAO
{
    public List<ClientProductOrderVO> selectAdminProductOrderOverview(ClientProductOrderVO clientProductOrderVO);
}
