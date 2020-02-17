package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.vo.AdminProductVO;

import javax.servlet.http.HttpServletRequest;

public interface AdminUpdateProductService
{
    public void updateProduct(AdminProductVO adminProductVO, HttpServletRequest request);
}
