package com.mall.meongnyang.admin.shopping.service;

import com.mall.meongnyang.admin.shopping.dao.AdminNoticeDAO;
import com.mall.meongnyang.admin.shopping.vo.AdminNoticeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AdminSelectNoticeListService")
public class AdminSelectNoticeListServiceImpl implements AdminSelectNoticeListService
{
    @Autowired
    private AdminNoticeDAO adminNoticeDAO;

    @Override
    public List<AdminNoticeVO> selectNoticeList(AdminNoticeVO adminNoticeVO)
    {
        return adminNoticeDAO.selectNoticeList(adminNoticeVO);
    }
}
