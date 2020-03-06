package com.mall.meongnyang.admin.index.service;

import com.mall.meongnyang.client.scheduler.todaycount.ClientUserCountVO;

public interface AdminSelectUserCountService
{
    public ClientUserCountVO selectSingleByDate(ClientUserCountVO clientUserCountVO);
    public ClientUserCountVO selectSinglePrevUserCountByDate(ClientUserCountVO clientUserCountVO);
}
