package com.mall.meongnyang.admin.marketing.service;

import com.mall.meongnyang.admin.marketing.dao.AdminEventPointDAO;
import com.mall.meongnyang.admin.marketing.vo.AdminEventPointVO;
import com.mall.meongnyang.admin.marketing.vo.AdminEventVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AdminSelectEventStartedPointListService")
public class AdminSelectEventStartedPointListServiceImpl implements AdminSelectEventStartedPointListService
{
    @Autowired
    private AdminEventPointDAO adminEventPointDAO;

    @Override
    public List<AdminEventPointVO> selectAllEventPointList(AdminEventVO adminEventVO)
    {
        AdminEventPointVO adminEventPointVO = new AdminEventPointVO();
        adminEventPointVO.setEventTbNo(adminEventVO.getEventTbNo());
        return adminEventPointDAO.selectAllEventPointList(adminEventPointVO);
    }
}
