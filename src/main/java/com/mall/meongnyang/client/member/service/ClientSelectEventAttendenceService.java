package com.mall.meongnyang.client.member.service;

import com.mall.meongnyang.admin.marketing.vo.AdminEventAttendenceVO;

public interface ClientSelectEventAttendenceService
{
    public boolean checkAttendenceToday(AdminEventAttendenceVO adminEventAttendenceVO);
}
