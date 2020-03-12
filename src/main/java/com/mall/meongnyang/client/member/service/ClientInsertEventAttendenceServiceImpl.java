package com.mall.meongnyang.client.member.service;

import com.mall.meongnyang.admin.marketing.vo.AdminEventAttendenceVO;
import com.mall.meongnyang.admin.marketing.vo.AdminEventPointVO;
import com.mall.meongnyang.admin.marketing.vo.AdminEventVO;
import com.mall.meongnyang.client.member.dao.ClientEventAttendenceDAO;
import com.mall.meongnyang.client.member.dao.ClientEventDAO;
import com.mall.meongnyang.client.member.dao.ClientLoginDAO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("ClientInsertEventAttendenceService")
public class ClientInsertEventAttendenceServiceImpl implements ClientInsertEventAttendenceService
{
    @Autowired
    private ClientEventDAO clientEventDAO;
    @Autowired
    private ClientEventAttendenceDAO clientEventAttendenceDAO;
    @Autowired
    private ClientLoginDAO clientLoginDAO;

    @Override
    @Transactional
    public int insertAttendence(AdminEventAttendenceVO adminEventAttendenceVO)
    {
        AdminEventVO adminEventVO = clientEventDAO.selectAvailableEvent(new AdminEventVO());
        if(adminEventVO != null)
        {
            adminEventAttendenceVO.setEventTbNo(adminEventVO.getEventTbNo());
            clientEventAttendenceDAO.insertAttendence(adminEventAttendenceVO);

            AdminEventPointVO adminEventPointVO = new AdminEventPointVO();
            adminEventPointVO.setEventTbNo(adminEventVO.getEventTbNo());
            List<AdminEventPointVO> pointList = clientEventDAO.selectAllEventPointList(adminEventPointVO);
            int point = this.getPoint(pointList,adminEventAttendenceVO.getDegree());

            ClientOrderVO clientOrderVO = new ClientOrderVO();
            clientOrderVO.setCustomerTbNo(adminEventAttendenceVO.getCustomerTbNo());
            clientOrderVO.setPdOrderTbUsedPoint(point);
            clientLoginDAO.updatePointRollback(clientOrderVO);

            return point;
        }
        return 0;
    }


    private int getPoint(List<AdminEventPointVO> pointList, double degree)
    {
        int size = pointList.size();
        int pieDegree = 360/size;

        for(int i=size-1; i>=0; i--)
        {
            if(degree < pieDegree*(size-i))
            {
                return pointList.get(i).getEventPoint();
            }
        }
        return -1;
    }
}
