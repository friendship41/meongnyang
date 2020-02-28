package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;

import java.util.List;

public interface AdminSelectProductOrderOverviewService
{
    public List<ClientProductOrderVO> selectProductOrderList(ClientProductOrderVO clientProductOrderVO);
}
