package com.mall.meongnyang.admin.product.dao;

import com.mall.meongnyang.admin.product.vo.AdminProductImageVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("AdminProductImageDAO")
public class AdminProductImageDAOImpl implements AdminProductImageDAO
{
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public void insertProductImage(AdminProductImageVO adminProductImageVO)
    {
        sqlSessionTemplate.insert("ProductImageDAO.insertProductImage", adminProductImageVO);
    }

    @Override
    public void deleteProductImage(AdminProductImageVO adminProductImageVO)
    {
        sqlSessionTemplate.delete("ProductImageDAO.deleteProductImage", adminProductImageVO);
    }

    @Override
    public List<AdminProductImageVO> selectProductImages(AdminProductImageVO adminProductImageVO)
    {
        return sqlSessionTemplate.selectList("ProductImageDAO.selectProductImages", adminProductImageVO);
    }

    @Override
    public int selectProductImageCount(AdminProductImageVO adminProductImageVO)
    {
        return sqlSessionTemplate.selectOne("ProductImageDAO.selectProductImageCount", adminProductImageVO);
    }

    @Override
    public AdminProductImageVO selectProductImageRepY(AdminProductImageVO adminProductImageVO)
    {
        return sqlSessionTemplate.selectOne("ProductImageDAO.selectProductImageRepY",adminProductImageVO);
    }

    @Override
    public void updateProductImageRep(AdminProductImageVO adminProductImageVO)
    {
        sqlSessionTemplate.update("ProductImageDAO.updateProductImageRep", adminProductImageVO);
    }

    @Override
    public int selectProductImageRepCount(AdminProductImageVO adminProductImageVO)
    {
        return sqlSessionTemplate.selectOne("ProductImageDAO.selectRepCount", adminProductImageVO);
    }


}
