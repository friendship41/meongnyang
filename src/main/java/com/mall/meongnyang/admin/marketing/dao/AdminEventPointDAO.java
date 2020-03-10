package com.mall.meongnyang.admin.marketing.dao;

import com.mall.meongnyang.admin.marketing.vo.AdminEventPointVO;

import java.util.List;

public interface AdminEventPointDAO
{
    public void insertEventPoint(AdminEventPointVO adminEventPointVO);
    public List<AdminEventPointVO> selectAllEventPointList(AdminEventPointVO adminEventPointVO);
}
