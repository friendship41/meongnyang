package com.mall.meongnyang.admin.index.service;

import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;

import java.util.List;

public interface AdminSelectMonthlySaleListService
{
    public List<ClientOrderVO> selectDashboardMonthMoney(ClientOrderVO clientOrderVO);
}
