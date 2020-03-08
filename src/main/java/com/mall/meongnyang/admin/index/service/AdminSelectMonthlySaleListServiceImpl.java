package com.mall.meongnyang.admin.index.service;

import com.mall.meongnyang.admin.product.dao.AdminProductOrderDAO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service("AdminSelectMonthlySaleListService")
public class AdminSelectMonthlySaleListServiceImpl implements AdminSelectMonthlySaleListService
{
    @Autowired
    private AdminProductOrderDAO adminProductOrderDAO;


    @Override
    public List<ClientOrderVO> selectDashboardMonthMoney(ClientOrderVO clientOrderVO)
    {
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YY-MM");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(Calendar.MONTH, -1);

        clientOrderVO.setNowMonth(sdf.format(today));
        clientOrderVO.setPrvMonth(sdf.format(calendar.getTime()));

        return adminProductOrderDAO.selectDashboardMonthMoney(clientOrderVO);
    }
}
