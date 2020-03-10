package com.mall.meongnyang.admin.marketing.dao;

import com.mall.meongnyang.admin.marketing.vo.AdminEventVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("AdminEventDAO")
public class AdminEventDAOImpl implements AdminEventDAO
{
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public void updateAllEventNstate(AdminEventVO adminEventVO)
    {
        sqlSessionTemplate.update("EventDAO.updateAllEventNstate", adminEventVO);
    }

    @Override
    public void insertEvent(AdminEventVO adminEventVO)
    {
        sqlSessionTemplate.insert("EventDAO.insertEvent", adminEventVO);
    }

    @Override
    public AdminEventVO selectYstateEvent(AdminEventVO adminEventVO)
    {
        return sqlSessionTemplate.selectOne("EventDAO.selectYstateEvent", adminEventVO);
    }
}
