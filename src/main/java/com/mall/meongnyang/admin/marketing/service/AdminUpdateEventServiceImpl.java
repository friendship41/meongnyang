package com.mall.meongnyang.admin.marketing.service;

import com.mall.meongnyang.admin.marketing.dao.AdminEventDAO;
import com.mall.meongnyang.admin.marketing.vo.AdminEventVO;
import com.mall.meongnyang.util.imagesave.SaveImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Service("AdminUpdateEventService")
public class AdminUpdateEventServiceImpl implements AdminUpdateEventService
{
    @Autowired
    private AdminEventDAO adminEventDAO;

    @Override
    public void updateEvent(AdminEventVO adminEventVO, HttpServletRequest request)
    {
        if(!adminEventVO.getUploadFile().isEmpty())
        {
            SaveImageService saveImageService = new SaveImageService();
            try
            {
                String imgPath = saveImageService.saveImage("event", adminEventVO.getUploadFile(), request);
                adminEventVO.setEventImg(imgPath);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        adminEventDAO.updateEvent(adminEventVO);
    }
}
