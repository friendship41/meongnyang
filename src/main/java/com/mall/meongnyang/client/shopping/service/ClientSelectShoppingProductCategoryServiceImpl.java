package com.mall.meongnyang.client.shopping.service;

import com.mall.meongnyang.admin.product.vo.AdminProductCategoryVO;
import com.mall.meongnyang.client.shopping.dao.ClientProductCategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("ClientSelectProductCategoryService")
public class ClientSelectShoppingProductCategoryServiceImpl implements ClientSelectShoppingProductCategoryService
{
    @Autowired
    private ClientProductCategoryDAO clientProductCategoryDAO;

    @Override
    public List<AdminProductCategoryVO> getSelectedProductCategory(AdminProductCategoryVO adminProductCategoryVO)
    {
        AdminProductCategoryVO category = clientProductCategoryDAO.selectCategory(adminProductCategoryVO);
        List<AdminProductCategoryVO> list = new ArrayList<>();
        List<AdminProductCategoryVO> listFromDB = clientProductCategoryDAO.selectCategoryList(adminProductCategoryVO);
        for(AdminProductCategoryVO tempCate : listFromDB)
        {
            if (category.getProductCategoryTbParent().equals(tempCate.getProductCategoryTbParent()) && category.getProductCategoryTbMedian().equals(tempCate.getProductCategoryTbMedian()))
            {
                list.add(tempCate);
            }
        }
        System.out.println(list);
        return list;
    }
}
