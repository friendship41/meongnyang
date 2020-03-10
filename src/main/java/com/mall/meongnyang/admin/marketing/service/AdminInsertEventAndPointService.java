package com.mall.meongnyang.admin.marketing.service;

import com.mall.meongnyang.admin.marketing.vo.AdminEventPointVO;
import com.mall.meongnyang.admin.marketing.vo.AdminEventVO;

import javax.servlet.http.HttpServletRequest;

public interface AdminInsertEventAndPointService
{
    public void insertEventAndPoint(AdminEventVO adminEventVO, AdminEventPointVO adminEventPointVO, HttpServletRequest request);
}
