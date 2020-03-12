package com.mall.meongnyang.client.scheduler.todaycount;

import com.mall.meongnyang.admin.marketing.vo.AdminEventVO;
import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import com.mall.meongnyang.client.intercepter.visitCount.VisitCounter;
import com.mall.meongnyang.client.member.dao.ClientEventDAO;
import com.mall.meongnyang.client.shopping.dao.ClientShoppingDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DailySchedulerService
{
    @Autowired
    private VisitCounter visitCounter;
    @Autowired
    private ClientUserCountDAO clientUserCountDAO;
    @Autowired
    private ClientEventDAO clientEventDAO;
    @Autowired
    private ClientShoppingDAO clientShoppingDAO;


    @Scheduled(cron = "59 59 23 * * *")
    @Transactional
    public void dailyService()
    {
        ClientUserCountVO clientUserCountVO = new ClientUserCountVO();
        clientUserCountVO.setUserCountTbVisitors(visitCounter.getVisitCount());
        clientUserCountDAO.insertUserCount(clientUserCountVO);
        visitCounter.setVisitCount(0);


        clientEventDAO.updateDateOverEventState(new AdminEventVO());


        clientShoppingDAO.updatePromotionEndProductSale(new AdminProductSaleVO());
        clientShoppingDAO.updateExpireDayOverProductSale(new AdminProductSaleVO());
    }

}
