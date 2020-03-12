package com.mall.meongnyang.client.index.service;

import com.mall.meongnyang.client.index.dao.ClientIndexDAO;
import com.mall.meongnyang.client.market.vo.ClientMarketVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ClientSelectIndexRecentMarketListService")
public class ClientSelectIndexRecentMarketListServiceImpl implements ClientSelectIndexRecentMarketListService
{
    @Autowired
    private ClientIndexDAO clientIndexDAO;

    @Override
    public List<ClientMarketVO> selectRecentMarketList(ClientMarketVO clientMarketVO)
    {
        return clientIndexDAO.selectRecentMarketList(clientMarketVO);
    }
}
