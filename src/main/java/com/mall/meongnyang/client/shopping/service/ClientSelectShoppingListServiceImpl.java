package com.mall.meongnyang.client.shopping.service;

import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import com.mall.meongnyang.client.shopping.dao.ClientShoppingDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ClientSelectShoppingListService")
public class ClientSelectShoppingListServiceImpl implements ClientSelectShoppingListService
{
    @Autowired
    private ClientShoppingDAO clientShoppingDAO;

    @Override
    public List<AdminProductVO> selectShoppingList(AdminProductVO adminProductVO)
    {
        final int articleCnt = 12;
        final int blockCnt = 10;

        int allProductCnt = clientShoppingDAO.selectShoppingProductCount(adminProductVO);
        adminProductVO.setPageCnt(allProductCnt);
        int allBlockCnt = (int)(((allProductCnt-1)/articleCnt)+1);
        adminProductVO.setAllBlockCnt(allBlockCnt);

        int nowPage = adminProductVO.getNowPage();
        if(nowPage == 0)
        {
            nowPage = 1;
        }
        adminProductVO.setNowPage(nowPage);

        int startNum = (nowPage-1)*articleCnt+1;
        adminProductVO.setStartNum(startNum);
        adminProductVO.setEndNum(startNum+11);

        if(nowPage < blockCnt)
        {
            adminProductVO.setStartBlock(1);
            adminProductVO.setEndBlock(allBlockCnt);
        }
        else
        {
            int startBlock = ((int)(nowPage/blockCnt))*blockCnt+1;
            adminProductVO.setStartBlock(startBlock);
            int endBlock = startBlock+blockCnt-1;
            if(endBlock > allBlockCnt)
            {
                endBlock = allBlockCnt;
            }
            adminProductVO.setEndBlock(endBlock);
        }
        List<AdminProductVO> productList = clientShoppingDAO.selectShoppingList(adminProductVO);

        for(int i=0; i<productList.size(); i++)
        {
            int discount = productList.get(i).getPdSaleTbDiscountRate();
            productList.get(i).setPdSaleTbDiscountRate((int)(productList.get(i).getPdSaleTbSalesPrice()*((100-discount)/100.0)));
        }
        System.out.println(adminProductVO);
        productList.add(adminProductVO);
        return productList;
    }
}
