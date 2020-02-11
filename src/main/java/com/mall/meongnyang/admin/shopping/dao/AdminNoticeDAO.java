package com.mall.meongnyang.admin.shopping.dao;

import com.mall.meongnyang.admin.shopping.vo.AdminNoticeVO;

import java.util.List;

public interface AdminNoticeDAO
{
    public void insertNotice(AdminNoticeVO adminNoticeVO);
    public void updateNotice(AdminNoticeVO adminNoticeVO);
    public void deleteNotice(AdminNoticeVO adminNoticeVO);
    public List<AdminNoticeVO> selectNoticeList(AdminNoticeVO adminNoticeVO);
    public AdminNoticeVO selectNotice(AdminNoticeVO adminNoticeVO);
}
