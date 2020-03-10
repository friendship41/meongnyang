package com.mall.meongnyang.admin.marketing.service;

import com.mall.meongnyang.admin.marketing.dao.AdminEventPointDAO;
import com.mall.meongnyang.admin.marketing.vo.AdminEventPointVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminUpdateEventPointListService")
public class AdminUpdateEventPointListServiceImpl implements AdminUpdateEventPointListService
{
    @Autowired
    private AdminEventPointDAO adminEventPointDAO;

    @Override
    public void updateEventPoint(AdminEventPointVO adminEventPointVO)
    {
        for(AdminEventPointVO point : adminEventPointVO.getPointList())
        {
            adminEventPointDAO.updateEventPoint(point);
        }
    }
}
