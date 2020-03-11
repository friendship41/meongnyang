package com.mall.meongnyang.client.intercepter.menu;

import com.mall.meongnyang.admin.product.vo.AdminProductCategoryVO;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class ClientMenuDAOImpl implements ClientMenuDAO
{
    private SqlSessionTemplate sqlSessionTemplate;

    public ClientMenuDAOImpl(SqlSessionTemplate sqlSessionTemplate)
    {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<AdminProductCategoryVO> selectProductCategoryList(AdminProductCategoryVO adminProductCategoryVO)
    {
        return sqlSessionTemplate.selectList("CategoryDAO.selectCategoryList", adminProductCategoryVO);
    }


}
