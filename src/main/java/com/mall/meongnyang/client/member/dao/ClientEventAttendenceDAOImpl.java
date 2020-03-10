package com.mall.meongnyang.client.member.dao;

import com.mall.meongnyang.admin.marketing.vo.AdminEventAttendenceVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("ClientEventAttendenceDAO")
public class ClientEventAttendenceDAOImpl implements ClientEventAttendenceDAO
{
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public AdminEventAttendenceVO selectAttendenceToday(AdminEventAttendenceVO adminEventAttendenceVO)
    {
        return sqlSessionTemplate.selectOne("EventAttendenceDAO.selectAttendenceToday", adminEventAttendenceVO);
    }
}
