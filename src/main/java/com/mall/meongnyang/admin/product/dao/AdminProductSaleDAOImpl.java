package com.mall.meongnyang.admin.product.dao;

import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("AdminProductSaleDAO")
public class AdminProductSaleDAOImpl implements AdminProductSaleDAO
{
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public void insertProductSale(AdminProductSaleVO adminProductSaleVO)
    {
        sqlSessionTemplate.insert("ProductSaleDAO.insertProductSale", adminProductSaleVO);
    }

    @Override
    public void updateProductSaleState(AdminProductSaleVO adminProductSaleVO)
    {
        sqlSessionTemplate.update("ProductSaleDAO.updateProductSaleState", adminProductSaleVO);
    }

    @Override
    public AdminProductSaleVO selectProductSale(AdminProductSaleVO adminProductSaleVO)
    {
        return sqlSessionTemplate.selectOne("ProductSaleDAO.selectProductSale", adminProductSaleVO);
    }

    @Override
    public void updateProductSale(AdminProductSaleVO adminProductSaleVO)
    {
        sqlSessionTemplate.update("ProductSaleDAO.updateProductSale", adminProductSaleVO);
    }
}
