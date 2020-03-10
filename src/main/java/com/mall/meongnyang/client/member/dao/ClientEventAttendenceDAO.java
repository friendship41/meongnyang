package com.mall.meongnyang.client.member.dao;

import com.mall.meongnyang.admin.marketing.vo.AdminEventAttendenceVO;

public interface ClientEventAttendenceDAO
{
    public AdminEventAttendenceVO selectAttendenceToday(AdminEventAttendenceVO adminEventAttendenceVO);
    public void insertAttendence(AdminEventAttendenceVO adminEventAttendenceVO);
}
