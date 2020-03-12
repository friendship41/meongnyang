package com.mall.meongnyang.admin.marketing.service;

import com.mall.meongnyang.admin.marketing.dao.AdminEventDAO;
import com.mall.meongnyang.admin.marketing.vo.AdminEventVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminUpdateEventStateService")
public class AdminUpdateEventStateServiceImpl implements AdminUpdateEventStateService
{
    @Autowired
    private AdminEventDAO adminEventDAO;

    @Override
    public void updateEventStateN()
    {
        adminEventDAO.updateAllEventNstate(new AdminEventVO());
    }
}
