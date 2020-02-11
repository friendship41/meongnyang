package com.mall.meongnyang.admin.shopping.service;

import com.mall.meongnyang.admin.shopping.dao.AdminNoticeDAO;
import com.mall.meongnyang.admin.shopping.vo.AdminNoticeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminUpdateNoticeService")
public class AdminUpdateNoticeServiceImpl implements AdminUpdateNoticeService
{
    @Autowired
    private AdminNoticeDAO adminNoticeDAO;


    @Override
    public void updateNotice(AdminNoticeVO adminNoticeVO)
    {
        adminNoticeDAO.updateNotice(adminNoticeVO);
    }
}
