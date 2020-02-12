package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.vo.AdminProductVO;

import javax.servlet.http.HttpServletRequest;

public interface AdminInsertProductService
{
    public void insertProduct(AdminProductVO adminProductVO, HttpServletRequest request);
}
