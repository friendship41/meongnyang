package com.mall.meongnyang.client.shopping.service;

import com.mall.meongnyang.client.shopping.dao.ClientShoppingDAO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderDetailVO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ClientUpdateProductSaleRemainCountService")
public class ClientUpdateProductSaleRemainCountServiceImpl implements ClientUpdateProductSaleRemainCountService
{
    @Autowired
    private ClientShoppingDAO clientShoppingDAO;


    @Override
    public boolean updateproductRemain(ClientOrderVO clientOrderVO)
    {
        List<ClientOrderDetailVO> detailList = clientOrderVO.getOrderDetailVOList();
        int a = 0;
        for(ClientOrderDetailVO detail : detailList)
        {
            try
            {
                a = clientShoppingDAO.updateProductRemainCount(detail);
                if(a == 0)
                {
                    return false;
                }
            }
            catch (Exception e)
            {
                return false;
            }
        }
        return true;
    }
}
