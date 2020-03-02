package com.mall.meongnyang.client.index.service;

import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import com.mall.meongnyang.client.index.dao.ClientIndexDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ClientSelectIndexBannerList")
public class ClientSelectIndexBannerListImpl implements ClientSelectIndexBannerList
{
    @Autowired
    private ClientIndexDAO clientIndexDAO;


    @Override
    public List<AdminProductVO> selectBannerImgs(AdminProductVO adminProductVO)
    {
        return clientIndexDAO.selectBannerImgList(adminProductVO);
    }
}
