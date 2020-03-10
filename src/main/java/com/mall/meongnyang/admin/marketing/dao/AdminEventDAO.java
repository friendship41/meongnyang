package com.mall.meongnyang.admin.marketing.dao;

import com.mall.meongnyang.admin.marketing.vo.AdminEventVO;

public interface AdminEventDAO
{
    public void updateAllEventNstate(AdminEventVO adminEventVO);
    public void insertEvent(AdminEventVO adminEventVO);
    public AdminEventVO selectYstateEvent(AdminEventVO adminEventVO);
    public AdminEventVO selectEventStarted(AdminEventVO adminEventVO);
    public void updateEvent(AdminEventVO adminEventVO);
}
