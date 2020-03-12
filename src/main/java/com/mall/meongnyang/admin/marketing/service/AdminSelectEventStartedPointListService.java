package com.mall.meongnyang.admin.marketing.service;

import com.mall.meongnyang.admin.marketing.vo.AdminEventPointVO;
import com.mall.meongnyang.admin.marketing.vo.AdminEventVO;

import java.util.List;

public interface AdminSelectEventStartedPointListService
{
    public List<AdminEventPointVO> selectAllEventPointList(AdminEventVO adminEventVO);
}
