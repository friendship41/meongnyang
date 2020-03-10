package com.mall.meongnyang.client.member.dao;

import com.mall.meongnyang.admin.marketing.vo.AdminEventVO;

public interface ClientEventDAO
{
    public AdminEventVO selectAvailableEvent(AdminEventVO adminEventVO);
}
