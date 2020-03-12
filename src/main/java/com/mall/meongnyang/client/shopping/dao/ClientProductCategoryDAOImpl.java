package com.mall.meongnyang.client.shopping.dao;

import com.mall.meongnyang.admin.product.vo.AdminProductCategoryVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ClientProductCategoryDAO")
public class ClientProductCategoryDAOImpl implements ClientProductCategoryDAO
{
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public AdminProductCategoryVO selectCategory(AdminProductCategoryVO adminProductCategoryVO)
    {
        return sqlSessionTemplate.selectOne("CategoryDAO.selectCategory",adminProductCategoryVO);
    }

    @Override
    public List<AdminProductCategoryVO> selectCategoryList(AdminProductCategoryVO adminProductCategoryVO)
    {
        return sqlSessionTemplate.selectList("CategoryDAO.selectCategoryList", adminProductCategoryVO);
    }
}
