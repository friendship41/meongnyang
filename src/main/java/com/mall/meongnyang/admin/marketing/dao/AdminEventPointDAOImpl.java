package com.mall.meongnyang.admin.marketing.dao;

import com.mall.meongnyang.admin.marketing.vo.AdminEventPointVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("AdminEventPointDAO")
public class AdminEventPointDAOImpl implements AdminEventPointDAO
{
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public void insertEventPoint(AdminEventPointVO adminEventPointVO)
    {
        sqlSessionTemplate.insert("EventPointDAO.insertEventPoint", adminEventPointVO);
    }
}
