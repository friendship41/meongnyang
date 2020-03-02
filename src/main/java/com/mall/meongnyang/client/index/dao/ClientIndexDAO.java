package com.mall.meongnyang.client.index.dao;

import com.mall.meongnyang.admin.product.vo.AdminProductVO;

import java.util.List;

public interface ClientIndexDAO
{
    public List<AdminProductVO> selectBannerImgList(AdminProductVO adminProductVO);
}
