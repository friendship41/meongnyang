package com.mall.meongnyang.admin.product.dao;

import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("AdminProductStockDAO")
public class AdminProductStockDAOImpl implements AdminProductStockDAO
{
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;


    @Override
    public List<AdminProductSaleVO> selectProductStockList(AdminProductSaleVO adminProductSaleVO)
    {
        return sqlSessionTemplate.selectList("ProductStockDAO.selectProductStorkList", adminProductSaleVO);
    }

    @Override
    public List<AdminProductSaleVO> selectExpireProductList(AdminProductSaleVO adminProductSaleVO)
    {
        return sqlSessionTemplate.selectList("ProductStockDAO.selectExpireProductList", adminProductSaleVO);
    }

    @Override
    public void updateProductStock(AdminProductSaleVO adminProductSaleVO)
    {
        sqlSessionTemplate.update("ProductStockDAO.updateProductStock", adminProductSaleVO);
    }

    @Override
    public List<AdminProductSaleVO> selectProductStockLimitedList(AdminProductSaleVO adminProductSaleVO)
    {
        return sqlSessionTemplate.selectList("ProductStockDAO.selectProductStockLimitedList", adminProductSaleVO);
    }

    @Override
    public List<AdminProductSaleVO> selectProductExpireCommingList(AdminProductSaleVO adminProductSaleVO)
    {
        return sqlSessionTemplate.selectList("ProductStockDAO.selectProductExpireCommingList", adminProductSaleVO);
    }


}
