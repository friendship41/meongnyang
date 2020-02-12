package com.mall.meongnyang.admin.shopping.service;

import com.mall.meongnyang.admin.shopping.dao.AdminNoticeDAO;
import com.mall.meongnyang.admin.shopping.vo.AdminNoticeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminInsertNoticeService")
public class AdminInsertNoticeServiceImpl implements AdminInsertNoticeService
{
    @Autowired
    private AdminNoticeDAO adminNoticeDAO;

    @Override
    public void insertNotice(AdminNoticeVO adminNoticeVO)
    {
        adminNoticeDAO.insertNotice(adminNoticeVO);
    }
}
