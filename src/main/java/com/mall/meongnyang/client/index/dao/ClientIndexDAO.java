package com.mall.meongnyang.client.index.dao;

import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import com.mall.meongnyang.client.market.vo.ClientMarketVO;

import java.util.List;

public interface ClientIndexDAO
{
    public List<AdminProductVO> selectBannerImgList(AdminProductVO adminProductVO);
    public List<AdminProductVO> selectNewArrivalList(AdminProductVO adminProductVO);
    public List<AdminProductVO> selectBestSellerList(AdminProductVO adminProductVO);
    public List<ClientMarketVO> selectRecentMarketList(ClientMarketVO clientMarketVO);
}
