package com.mall.meongnyang.admin.intercepter.stockAlert;

import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;

import java.util.List;

public interface AdminSelectProductExpireCommingListService
{
    public List<AdminProductSaleVO> selectProductExpireCommingList(AdminProductSaleVO adminProductSaleVO);
}
