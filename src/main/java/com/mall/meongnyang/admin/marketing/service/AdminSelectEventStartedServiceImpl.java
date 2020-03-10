package com.mall.meongnyang.admin.marketing.service;

import com.mall.meongnyang.admin.marketing.dao.AdminEventDAO;
import com.mall.meongnyang.admin.marketing.vo.AdminEventVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminSelectEventStartedCountService")
public class AdminSelectEventStartedServiceImpl implements AdminSelectEventStartedService
{
    @Autowired
    private AdminEventDAO adminEventDAO;

    @Override
    public AdminEventVO selectEventStarted(AdminEventVO adminEventVO)
    {
        return adminEventDAO.selectEventStarted(adminEventVO);
    }
}
