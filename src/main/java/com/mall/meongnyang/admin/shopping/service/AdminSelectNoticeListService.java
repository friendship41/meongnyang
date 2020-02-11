package com.mall.meongnyang.admin.shopping.service;

import com.mall.meongnyang.admin.shopping.vo.AdminNoticeVO;

import java.util.List;

public interface AdminSelectNoticeListService
{
    public List<AdminNoticeVO> selectNoticeList(AdminNoticeVO adminNoticeVO);
}
