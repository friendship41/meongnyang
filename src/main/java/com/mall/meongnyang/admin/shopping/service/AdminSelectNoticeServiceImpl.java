package com.mall.meongnyang.admin.shopping.service;

import com.mall.meongnyang.admin.shopping.dao.AdminNoticeDAO;
import com.mall.meongnyang.admin.shopping.vo.AdminNoticeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminSelectNoticeService")
public class AdminSelectNoticeServiceImpl implements AdminSelectNoticeService
{
    @Autowired
    private AdminNoticeDAO adminNoticeDAO;

    @Override
    public AdminNoticeVO selectNotice(AdminNoticeVO adminNoticeVO)
    {
        return adminNoticeDAO.selectNotice(adminNoticeVO);
    }
}
