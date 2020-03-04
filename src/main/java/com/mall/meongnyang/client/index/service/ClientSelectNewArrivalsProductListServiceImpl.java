package com.mall.meongnyang.client.index.service;

import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import com.mall.meongnyang.client.index.dao.ClientIndexDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ClientSelectNewArrivalsProductListService")
public class ClientSelectNewArrivalsProductListServiceImpl implements ClientSelectNewArrivalsProductListService
{
    @Autowired
    private ClientIndexDAO clientIndexDAO;


    @Override
    public List<AdminProductVO> selectNewArrivalList(AdminProductVO adminProductVO)
    {
        List<AdminProductVO> list = clientIndexDAO.selectNewArrivalList(adminProductVO);
        for(AdminProductVO product : list)
        {
            if(product.getPdSaleTbDiscountRate() != 0)
            {
                product.setPdSaleTbDiscountRate((int)(product.getPdSaleTbSalesPrice()*(100-product.getPdSaleTbDiscountRate())/100));
            }
        }
        return list;
    }
}
