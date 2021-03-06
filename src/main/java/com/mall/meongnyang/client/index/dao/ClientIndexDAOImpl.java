package com.mall.meongnyang.client.index.dao;

import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import com.mall.meongnyang.client.market.vo.ClientMarketVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ClientIndexDAO")
public class ClientIndexDAOImpl implements ClientIndexDAO
{
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<AdminProductVO> selectBannerImgList(AdminProductVO adminProductVO)
    {
        return sqlSessionTemplate.selectList("ProductDAO.selectBannerImg", adminProductVO);
    }

    @Override
    public List<AdminProductVO> selectNewArrivalList(AdminProductVO adminProductVO)
    {
        return sqlSessionTemplate.selectList("ProductDAO.selectNewArrivalList", adminProductVO);
    }

    @Override
    public List<AdminProductVO> selectBestSellerList(AdminProductVO adminProductVO)
    {
        return sqlSessionTemplate.selectList("ProductDAO.selectBestSellerList", adminProductVO);
    }

    @Override
    public List<ClientMarketVO> selectRecentMarketList(ClientMarketVO clientMarketVO)
    {
        return sqlSessionTemplate.selectList("MarketDAO.selectRecentMarketList", clientMarketVO);
    }
}
