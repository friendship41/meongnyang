package com.mall.meongnyang.admin.product.dao;

import com.mall.meongnyang.admin.product.vo.AdminProductCategoryVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("AdminProductCategoryDAO")
public class AdminProductCategoryDAOImpl implements AdminProductCategoryDAO
{
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public void insertProductCategory(AdminProductCategoryVO adminProductCategoryVO)
    {
        sqlSessionTemplate.insert("CategoryDAO.insertCategory", adminProductCategoryVO);
    }

    @Override
    public void updateProductCategory(AdminProductCategoryVO adminProductCategoryVO)
    {
        sqlSessionTemplate.update("CategoryDAO.updateCategory", adminProductCategoryVO);
    }

    @Override
    public void deleteProductCategory(AdminProductCategoryVO adminProductCategoryVO)
    {
        sqlSessionTemplate.delete("CategoryDAO.deleteCategory", adminProductCategoryVO);
    }

    @Override
    public List<AdminProductCategoryVO> selectProductCategoryList(AdminProductCategoryVO adminProductCategoryVO)
    {
        return sqlSessionTemplate.selectList("CategoryDAO.selectCategoryList", adminProductCategoryVO);
    }

    @Override
    public AdminProductCategoryVO selectProductCategory(AdminProductCategoryVO adminProductCategoryVO)
    {
        return sqlSessionTemplate.selectOne("CategoryDAO.selectCategory", adminProductCategoryVO);
    }
}
