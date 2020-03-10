package com.mall.meongnyang.client.member.service;

import com.mall.meongnyang.admin.marketing.vo.AdminEventAttendenceVO;
import com.mall.meongnyang.client.member.dao.ClientEventAttendenceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ClientSelectEventAttendenceService")
public class ClientSelectEventAttendenceServiceImpl implements ClientSelectEventAttendenceService
{
    @Autowired
    private ClientEventAttendenceDAO clientEventAttendenceDAO;

    @Override
    public boolean checkAttendenceToday(AdminEventAttendenceVO adminEventAttendenceVO)
    {
        AdminEventAttendenceVO attend = clientEventAttendenceDAO.selectAttendenceToday(adminEventAttendenceVO);
        if(attend == null)
        {
            return false;
        }
        return true;
    }
}
