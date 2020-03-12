package com.mall.meongnyang.admin.index.service;

import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;

import java.util.List;

public interface AdminSelectDailySaleListService
{
    public List<ClientOrderVO> selectDashboardDailyMoney(ClientOrderVO clientOrderVO);
}
