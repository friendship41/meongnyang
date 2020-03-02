package com.mall.meongnyang.client.scheduler.todaycount;

import com.mall.meongnyang.client.intercepter.visitCount.VisitCounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class InsertVisitMemberCountSchedulerService
{
    @Autowired
    private VisitCounter visitCounter;
    @Autowired
    private ClientUserCountDAO clientUserCountDAO;

    @Scheduled(cron = "59 59 23 * * *")
    public void insertTodayCount()
    {
        ClientUserCountVO clientUserCountVO = new ClientUserCountVO();
        clientUserCountVO.setUserCountTbVisitors(visitCounter.getVisitCount());
        clientUserCountDAO.insertUserCount(clientUserCountVO);
        visitCounter.setVisitCount(0);
    }

}
