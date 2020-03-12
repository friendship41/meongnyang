package com.mall.meongnyang.admin.marketing.service;

import com.mall.meongnyang.admin.marketing.dao.AdminEventDAO;
import com.mall.meongnyang.admin.marketing.dao.AdminEventPointDAO;
import com.mall.meongnyang.admin.marketing.vo.AdminEventPointVO;
import com.mall.meongnyang.admin.marketing.vo.AdminEventVO;
import com.mall.meongnyang.util.imagesave.SaveImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Service("AdminInsertEventAndPointService")
public class AdminInsertEventAndPointServiceImpl implements AdminInsertEventAndPointService
{
    @Autowired
    private AdminEventDAO adminEventDAO;
    @Autowired
    private AdminEventPointDAO adminEventPointDAO;

    @Override
    @Transactional
    public void insertEventAndPoint(AdminEventVO adminEventVO, AdminEventPointVO adminEventPointVO, HttpServletRequest request)
    {
        SaveImageService saveImageService = new SaveImageService();
        try
        {
            String imgPath = saveImageService.saveImage("event",adminEventVO.getUploadFile(), request);
            adminEventVO.setEventImg(imgPath);

            adminEventDAO.updateAllEventNstate(adminEventVO);
            adminEventDAO.insertEvent(adminEventVO);
            AdminEventVO eventDB = adminEventDAO.selectYstateEvent(adminEventVO);

            adminEventPointVO.setEventTbNo(eventDB.getEventTbNo());
            adminEventPointDAO.insertEventPoint(adminEventPointVO);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
