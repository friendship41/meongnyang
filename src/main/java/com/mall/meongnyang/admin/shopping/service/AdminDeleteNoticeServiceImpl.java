package com.mall.meongnyang.admin.shopping.service;

import com.mall.meongnyang.admin.shopping.dao.AdminNoticeDAO;
import com.mall.meongnyang.admin.shopping.vo.AdminNoticeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminDeleteNoticeService")
public class AdminDeleteNoticeServiceImpl implements AdminDeleteNoticeService
{
    @Autowired
    private AdminNoticeDAO adminNoticeDAO;

    @Override
    public void deleteNotice(AdminNoticeVO adminNoticeVO)
    {
        adminNoticeDAO.deleteNotice(adminNoticeVO);
    }
}
