package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductSaleDAO;
import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminInsertProductSaleService")
public class AdminInsertProductSaleServiceImpl implements AdminInsertProductSaleService
{
    @Autowired
    private AdminProductSaleDAO adminProductSaleDAO;

    @Override
    public void insertProductSale(AdminProductSaleVO adminProductSaleVO)
    {
        adminProductSaleVO.setPdSaleTbSize(adminProductSaleVO.getPdSaleTbSize().toUpperCase());
        StringBuffer stringBuffer = new StringBuffer(adminProductSaleVO.getPdSaleTbProductName());
        stringBuffer.append("-");
        stringBuffer.append(adminProductSaleVO.getPdSaleTbSize());
        adminProductSaleVO.setPdSaleTbProductName(stringBuffer.toString());
        adminProductSaleDAO.insertProductSale(adminProductSaleVO);
    }
}
