package com.mall.meongnyang.client.member.service;

import com.mall.meongnyang.admin.marketing.vo.AdminEventVO;
import com.mall.meongnyang.client.member.dao.ClientEventDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ClientSelectAvailableEventService")
public class ClientSelectAvailableEventServiceImpl implements ClientSelectAvailableEventService
{
    @Autowired
    private ClientEventDAO clientEventDAO;

    @Override
    public AdminEventVO selectAvailableEvent(AdminEventVO adminEventVO)
    {
        return clientEventDAO.selectAvailableEvent(adminEventVO);
    }
}
