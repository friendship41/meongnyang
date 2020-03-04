package com.mall.meongnyang.admin.intercepter.stockAlert;

import com.mall.meongnyang.admin.shopping.dao.AdminQnaDAO;
import com.mall.meongnyang.admin.shopping.vo.AdminQnaVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdminSelectNewQnaListServiceImpl implements AdminSelectNewQnaListService
{
    @Autowired
    private AdminQnaDAO adminQnaDAO;

    @Override
    public List<AdminQnaVO> selectNewQnalist(AdminQnaVO adminQnaVO)
    {
        return adminQnaDAO.selectNewQnalist(adminQnaVO);
    }
}
