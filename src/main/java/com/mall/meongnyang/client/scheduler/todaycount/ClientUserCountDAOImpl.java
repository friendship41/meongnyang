package com.mall.meongnyang.client.scheduler.todaycount;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ClientUserCountDAO")
public class ClientUserCountDAOImpl implements ClientUserCountDAO
{
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;


    @Override
    public void insertUserCount(ClientUserCountVO clientUserCountVO)
    {
        sqlSessionTemplate.insert("OverviewDAO.insertUserCount", clientUserCountVO);
    }
}
