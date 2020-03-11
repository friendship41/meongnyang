package com.mall.meongnyang.client.member.dao;

import com.mall.meongnyang.admin.marketing.vo.AdminEventPointVO;
import com.mall.meongnyang.admin.marketing.vo.AdminEventVO;

import java.util.List;

public interface ClientEventDAO
{
    public AdminEventVO selectAvailableEvent(AdminEventVO adminEventVO);
    public List<AdminEventPointVO> selectAllEventPointList(AdminEventPointVO adminEventPointVO);
    public void updateDateOverEventState(AdminEventVO adminEventVO);
}
