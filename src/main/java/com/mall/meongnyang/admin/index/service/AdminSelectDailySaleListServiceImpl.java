package com.mall.meongnyang.admin.index.service;

import com.mall.meongnyang.admin.product.dao.AdminProductOrderDAO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service("AdminSelectDailySaleListService")
public class AdminSelectDailySaleListServiceImpl implements AdminSelectDailySaleListService
{
    @Autowired
    private AdminProductOrderDAO adminProductOrderDAO;


    @Override
    public List<ClientOrderVO> selectDashboardDailyMoney(ClientOrderVO clientOrderVO)
    {
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YY-MM-dd");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(Calendar.DATE, -1);

        clientOrderVO.setNowMonth(sdf.format(today));
        clientOrderVO.setPrvMonth(sdf.format(calendar.getTime()));

        return adminProductOrderDAO.selectDashboardDayMoney(clientOrderVO);
    }
}
