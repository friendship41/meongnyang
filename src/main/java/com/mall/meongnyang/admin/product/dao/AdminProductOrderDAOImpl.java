package com.mall.meongnyang.admin.product.dao;

import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("AdminProductOrderDAO")
public class AdminProductOrderDAOImpl implements AdminProductOrderDAO
{
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<ClientProductOrderVO> selectAdminProductOrderOverview(ClientProductOrderVO clientProductOrderVO)
    {
        return sqlSessionTemplate.selectList("orderDAO.selectAdminProductOrderOverview", clientProductOrderVO);
    }

    @Override
    public List<ClientOrderVO> selectOrderStateList()
    {
        return sqlSessionTemplate.selectList("orderDAO.selectOrderStateList");
    }
}
