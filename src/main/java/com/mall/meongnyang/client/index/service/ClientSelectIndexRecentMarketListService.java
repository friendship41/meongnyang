package com.mall.meongnyang.client.index.service;

import com.mall.meongnyang.client.market.vo.ClientMarketVO;

import java.util.List;

public interface ClientSelectIndexRecentMarketListService
{
    public List<ClientMarketVO> selectRecentMarketList(ClientMarketVO clientMarketVO);
}
