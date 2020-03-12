package com.mall.meongnyang.admin.marketing.service;

import com.mall.meongnyang.admin.marketing.vo.AdminEventVO;

import javax.servlet.http.HttpServletRequest;

public interface AdminUpdateEventService
{
    public void updateEvent(AdminEventVO adminEventVO, HttpServletRequest request);
}
