package com.mall.meongnyang.admin.intercepter.stockAlert;

import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import com.mall.meongnyang.admin.shopping.vo.AdminQnaVO;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StockCheckInterceptor extends HandlerInterceptorAdapter
{
    AdminSelectProductStockLimitedListService adminSelectProductStockLimitedListService;
    AdminSelectProductExpireCommingListService adminSelectProductExpireCommingListService;
    AdminSelectNewQnaListService adminSelectNewQnaListService;

    public StockCheckInterceptor()
    {
    }
    public StockCheckInterceptor(AdminSelectProductStockLimitedListService adminSelectProductStockLimitedListService, AdminSelectProductExpireCommingListService adminSelectProductExpireCommingListService, AdminSelectNewQnaListService adminSelectNewQnaListService)
    {
        this.adminSelectProductStockLimitedListService = adminSelectProductStockLimitedListService;
        this.adminSelectProductExpireCommingListService = adminSelectProductExpireCommingListService;
        this.adminSelectNewQnaListService = adminSelectNewQnaListService;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
    {
        request.setAttribute("limitedStockList", adminSelectProductStockLimitedListService.selectProductStockLimitedList(new AdminProductSaleVO()));
        request.setAttribute("expireStockList", adminSelectProductExpireCommingListService.selectProductExpireCommingList(new AdminProductSaleVO()));
        request.setAttribute("newQnaList", adminSelectNewQnaListService.selectNewQnalist(new AdminQnaVO()));
        return true;
    }
}
