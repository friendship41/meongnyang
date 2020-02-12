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
}
