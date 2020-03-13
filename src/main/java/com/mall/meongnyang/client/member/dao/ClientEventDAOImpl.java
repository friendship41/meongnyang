package com.mall.meongnyang.client.member.dao;

import com.mall.meongnyang.admin.marketing.vo.AdminEventPointVO;
import com.mall.meongnyang.admin.marketing.vo.AdminEventVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ClientEventDAO")
public class ClientEventDAOImpl implements ClientEventDAO
{
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public AdminEventVO selectAvailableEvent(AdminEventVO adminEventVO)
    {
        return sqlSessionTemplate.selectOne("EventDAO.selectAvailableEvent", adminEventVO);
    }

    @Override
    public List<AdminEventPointVO> selectAllEventPointList(AdminEventPointVO adminEventPointVO)
    {
        return sqlSessionTemplate.selectList("EventPointDAO.selectAllEventPointList", adminEventPointVO);
    }

    @Override
    public void updateDateOverEventState(AdminEventVO adminEventVO)
    {
        sqlSessionTemplate.update("EventDAO.updateDateOverEventState", adminEventVO);
    }
}
