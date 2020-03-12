package com.mall.meongnyang.admin.product.dao;

import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;

import java.util.List;

public interface AdminProductOrderDAO
{
    public List<ClientProductOrderVO> selectAdminProductOrderOverview(ClientProductOrderVO clientProductOrderVO);
    public List<ClientOrderVO> selectOrderStateList();
    public void deleteProductOrder(ClientOrderVO clientOrderVO);
    public void deleteOrderDetailByNo(ClientOrderVO clientOrderVO);
    public void updateOrderState(ClientOrderVO clientOrderVO);
    public List<ClientOrderVO> selectDashboardMonthMoney(ClientOrderVO clientOrderVO);
    public List<ClientOrderVO> selectDashboardDayMoney(ClientOrderVO clientOrderVO);
    public ClientProductOrderVO selectOrder(ClientProductOrderVO clientProductOrderVO);
}
