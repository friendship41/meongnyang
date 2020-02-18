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

        String filterText = adminProductVO.getFilterPrice();
        if(filterText == null || filterText.equals(""))
        {
            adminProductVO.setMaxPrice(1000000);
        }
        else
        {
            String[] fs = filterText.split(" - ");
            adminProductVO.setMinPrice(Integer.parseInt(fs[0].substring(0,fs[0].length()-1)));
            adminProductVO.setMaxPrice(Integer.parseInt(fs[1].substring(0,fs[1].length()-1)));
        }

        List<AdminProductVO> productList = clientShoppingDAO.selectShoppingList(adminProductVO);

        for(int i=0; i<productList.size(); i++)
        {
            int discount = productList.get(i).getPdSaleTbDiscountRate();
            productList.get(i).setPdSaleTbDiscountRate((int)(productList.get(i).getPdSaleTbSalesPrice()*((100-discount)/100.0)));
        }
        productList.add(adminProductVO);
        return productList;
    }
}
