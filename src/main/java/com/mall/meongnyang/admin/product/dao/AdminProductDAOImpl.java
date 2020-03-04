package com.mall.meongnyang.admin.product.dao;

import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("AdminProductDAO")
public class AdminProductDAOImpl implements AdminProductDAO
{
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public void insertProduct(AdminProductVO adminProductVO)
    {
        sqlSessionTemplate.insert("ProductDAO.insertProduct", adminProductVO);
    }

    @Override
    public void deleteProduct(AdminProductVO adminProductVO)
    {
        sqlSessionTemplate.delete("ProductDAO.deleteProduct", adminProductVO);
    }

    @Override
    public List<AdminProductVO> selectProductList(AdminProductVO adminProductVO)
    {
        return sqlSessionTemplate.selectList("ProductDAO.selectProductList", adminProductVO);
    }

    @Override
    public AdminProductVO selectProduct(AdminProductVO adminProductVO)
    {
        return sqlSessionTemplate.selectOne("ProductDAO.selectProduct", adminProductVO);
    }

    @Override
    public void updateProduct(AdminProductVO adminProductVO)
    {
        sqlSessionTemplate.update("ProductDAO.updateProduct", adminProductVO);
    }

    @Override
    public List<AdminProductVO> selectProductOverviewList(AdminProductVO adminProductVO)
    {
        return sqlSessionTemplate.selectList("ProductDAO.selectProductOverviewList", adminProductVO);
    }

    @Override
    public void updateProductBannerState(AdminProductVO adminProductVO)
    {
        sqlSessionTemplate.update("ProductDAO.updateBannerState", adminProductVO);
    }

    @Override
    public List<AdminProductVO> selectPopularProductList(AdminProductVO adminProductVO)
    {
        return sqlSessionTemplate.selectList("ProductDAO.selectPopularProductList", adminProductVO);
    }

    @Override
    public List<AdminProductVO> selectReadcountSaleRateList(AdminProductVO adminProductVO)
    {
        return sqlSessionTemplate.selectList("ProductDAO.selectReadcountSaleRateList", adminProductVO);
    }

    @Override
    public List<AdminProductVO> selectCancelProductRanking(AdminProductVO adminProductVO)
    {
        return sqlSessionTemplate.selectList("ProductDAO.selectCancelProductRanking", adminProductVO);
    }
}
