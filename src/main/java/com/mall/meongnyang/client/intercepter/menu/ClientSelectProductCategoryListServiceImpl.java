package com.mall.meongnyang.client.intercepter.menu;

import com.mall.meongnyang.admin.product.vo.AdminProductCategoryVO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientSelectProductCategoryListServiceImpl implements ClientSelectProductCategoryListService
{
    private ClientMenuDAO clientMenuDAO;

    public ClientSelectProductCategoryListServiceImpl(ClientMenuDAO clientMenuDAO)
    {
        this.clientMenuDAO = clientMenuDAO;
    }

    @Override
    public MenuVO getMenu()
    {
        MenuVO menuVO = new MenuVO();

        List<AdminProductCategoryVO> categoryList = clientMenuDAO.selectProductCategoryList(new AdminProductCategoryVO());
        Map<String, Map<Integer, String>> tempMap = new HashMap<>();
        for(AdminProductCategoryVO productCategory : categoryList)
        {
            String pName = productCategory.getProductCategoryTbParent();
            String mName = productCategory.getProductCategoryTbMedian();
            Integer cateNo = productCategory.getProductCategoryTbNo();

            if(tempMap.containsKey(pName))
            {
                if(!tempMap.get(pName).containsValue(mName))
                {
                    tempMap.get(pName).put(cateNo,mName);
                }
            }
            else
            {
                Map<Integer,String> nMap = new HashMap<>();
                nMap.put(cateNo,mName);
                tempMap.put(pName,nMap);
            }
        }
//        System.out.println(tempMap);
        menuVO.setMenu(tempMap);
        return menuVO;
    }

    @Override
    public List<AdminProductCategoryVO> getAllCategory(AdminProductCategoryVO adminProductCategoryVO)
    {
        return clientMenuDAO.selectProductCategoryList(adminProductCategoryVO);
    }
}
