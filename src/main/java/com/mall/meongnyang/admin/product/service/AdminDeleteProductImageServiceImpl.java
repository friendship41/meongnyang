package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductImageDAO;
import com.mall.meongnyang.admin.product.vo.AdminProductImageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminDeleteProductImageService")
public class AdminDeleteProductImageServiceImpl implements AdminDeleteProductImageService
{
    @Autowired
    private AdminProductImageDAO adminProductImageDAO;

    @Override
    public String deleteProductImageReturnImages(AdminProductImageVO adminProductImageVO)
    {
        adminProductImageDAO.deleteProductImage(adminProductImageVO);
        return "{\"deleteState\":\"deleteSucess\",\"imgno\":\""+adminProductImageVO.getPdImageTbNo()+"\"}";
    }
}
