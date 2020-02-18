package com.mall.meongnyang.client.shopping.dao;

import com.mall.meongnyang.admin.product.vo.AdminProductImageVO;
import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ClientShoppingDAO")
public class ClientShoppingDAOImpl implements ClientShoppingDAO
{
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;


    @Override
    public int selectShoppingProductCount(AdminProductVO adminProductVO)
    {
        return sqlSessionTemplate.selectOne("ProductDAO.selectProductCnt", adminProductVO);
    }

    @Override
    public List<AdminProductVO> selectShoppingList(AdminProductVO adminProductVO)
    {
        return sqlSessionTemplate.selectList("ProductDAO.selectShoppingList", adminProductVO);
    }

    @Override
    public AdminProductVO selectProductDetail(AdminProductVO adminProductVO)
    {
        return sqlSessionTemplate.selectOne("ProductDAO.selectProductDetail",adminProductVO);
    }

    @Override
    public List<AdminProductImageVO> selectProductImages(AdminProductImageVO adminProductImageVO)
    {
        return sqlSessionTemplate.selectList("ProductImageDAO.selectProductImages", adminProductImageVO);
    }
}
