package com.mall.meongnyang.client.shopping.service;

import com.mall.meongnyang.admin.product.vo.AdminProductImageVO;
import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import com.mall.meongnyang.client.shopping.dao.ClientShoppingDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("ClientSelectShoppingDetailService")
public class ClientSelectShoppingDetailServiceImpl implements ClientSelectShoppingDetailService
{
    @Autowired
    private ClientShoppingDAO clientShoppingDAO;

    @Override
    public Map<String, Object> selectProductDetail(AdminProductVO adminProductVO)
    {
        Map<String, Object> tempMap = new HashMap<>();

        AdminProductVO detail = clientShoppingDAO.selectProductDetail(adminProductVO);
        tempMap.put("detail", detail);

        AdminProductImageVO tempImageVO = new AdminProductImageVO();
        tempImageVO.setProductTbCode(adminProductVO.getProductTbCode());
        List<AdminProductImageVO> imageList = clientShoppingDAO.selectProductImages(tempImageVO);
        tempMap.put("imageList", imageList);

        AdminProductSaleVO adminProductSaleVO = new AdminProductSaleVO();
        adminProductSaleVO.setProductTbCode(adminProductVO.getProductTbCode());
        List<AdminProductSaleVO> saleList = clientShoppingDAO.selectSingleProductSaleList(adminProductSaleVO);
        tempMap.put("saleList", saleList);

        clientShoppingDAO.updateProductSaleReadCount(adminProductVO);

        return tempMap;
    }
}
