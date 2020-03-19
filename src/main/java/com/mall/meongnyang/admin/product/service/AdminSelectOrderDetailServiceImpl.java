package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductOrderDAO;
import com.mall.meongnyang.client.mypage.vo.ClientOrdersDetailVO;
import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service("AdminSelectOrderDetailService")
public class AdminSelectOrderDetailServiceImpl implements AdminSelectOrderDetailService
{
    @Autowired
    private AdminProductOrderDAO adminProductOrderDAO;


    @Override
    public Map<String,Object> selectOrderDetail(ClientOrdersDetailVO clientOrdersDetailVO)
    {
        ClientProductOrderVO clientProductOrderVO = new ClientProductOrderVO();
        clientProductOrderVO.setPdOrderTbNo(clientOrdersDetailVO.getPdOrderTbNo());

        Map<String, Object> map = new HashMap<>();
        map.put("detailList", adminProductOrderDAO.selectOrderDetailVO(clientOrdersDetailVO));
        map.put("orderInfo", adminProductOrderDAO.selectOrder(clientProductOrderVO));
        return map;
    }
}
