package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.vo.AdminProductImageVO;

import javax.servlet.http.HttpServletRequest;

public interface AdminInsertProductImageService
{

    public AdminProductImageVO insertProductImageReturnImages(AdminProductImageVO adminProductImageVO, HttpServletRequest request);
}
