package com.mall.meongnyang.admin.index.service;

import com.mall.meongnyang.admin.member.dao.AdminMemberDAO;
import com.mall.meongnyang.client.scheduler.todaycount.ClientUserCountVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

@Service("AdminSelectUserCountService")
public class AdminSelectUserCountServiceImpl implements AdminSelectUserCountService
{
    @Autowired
    private AdminMemberDAO adminMemberDAO;


    @Override
    public ClientUserCountVO selectSingleByDate(ClientUserCountVO clientUserCountVO)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        calendar.add(Calendar.DATE, -1);
        clientUserCountVO.setUserCountTbDate(new java.sql.Date(calendar.getTimeInMillis()));
        return adminMemberDAO.selectSingleByDate(clientUserCountVO);
    }

    @Override
    public ClientUserCountVO selectSinglePrevUserCountByDate(ClientUserCountVO clientUserCountVO)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        calendar.add(Calendar.DATE, -2);
        clientUserCountVO.setUserCountTbDate(new java.sql.Date(calendar.getTimeInMillis()));
        return adminMemberDAO.selectSingleByDate(clientUserCountVO);
    }
}
