package com.mall.meongnyang.admin.index.comtroller;

import com.mall.meongnyang.admin.index.service.AdminSelectDailySaleListService;
import com.mall.meongnyang.admin.index.service.AdminSelectDashboardExpireProductListService;
import com.mall.meongnyang.admin.index.service.AdminSelectDashboardStockListService;
import com.mall.meongnyang.admin.index.service.AdminSelectMonthlySaleListService;
import com.mall.meongnyang.admin.product.service.AdminSelectProductOrderOverviewService;
import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@Controller
public class IndexController
{
    @Autowired
    private AdminSelectDashboardStockListService adminSelectDashboardStockListService;
    @Autowired
    private AdminSelectDashboardExpireProductListService adminSelectDashboardExpireProductListService;
    @Autowired
    private AdminSelectProductOrderOverviewService adminSelectProductOrderOverviewService;
    @Autowired
    private AdminSelectMonthlySaleListService adminSelectMonthlySaleListService;
    @Autowired
    private AdminSelectDailySaleListService adminSelectDailySaleListService;



    @RequestMapping("/index.ado")
    public String indexPage(Model model)
    {
        model.addAttribute("dashboardStockList", adminSelectDashboardStockListService.selectDashBoardProductStorkList());
        model.addAttribute("dashboardExpireList", adminSelectDashboardExpireProductListService.selectDashboardExpireProductList());
        model.addAttribute("dashboardOrderList", adminSelectProductOrderOverviewService.selectProductOrderList(getRecentDateVO()));

        List<ClientOrderVO> monthlySaleList = adminSelectMonthlySaleListService.selectDashboardMonthMoney(new ClientOrderVO());
        model.addAttribute("monthlySale", getMonthAndDayClientOrderVO("MM",monthlySaleList));

        List<ClientOrderVO> dailySaleList = adminSelectDailySaleListService.selectDashboardDailyMoney(new ClientOrderVO());
        model.addAttribute("dailySale", getMonthAndDayClientOrderVO("dd",dailySaleList));




        return "index";
    }

    private ClientProductOrderVO getRecentDateVO()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new java.util.Date());


        ClientProductOrderVO clientProductOrderVO = new ClientProductOrderVO();
        clientProductOrderVO.setDayTo(new Date(calendar.getTimeInMillis()));


        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        calendar.add(Calendar.DATE, (dayOfWeek-1)*-1);
        clientProductOrderVO.setDayFrom(new Date(calendar.getTimeInMillis()));

        return clientProductOrderVO;
    }

    private ClientOrderVO getMonthAndDayClientOrderVO(String mmOrdd, List<ClientOrderVO> xSaleList)
    {
        ClientOrderVO xSale = new ClientOrderVO();
        if(xSaleList.size() == 0)
        {
            xSale.setPdOrderTbPayment(0);
            xSale.setUpDown("n");
        }
        else if(xSaleList.size() == 1)
        {
            SimpleDateFormat sdf = new SimpleDateFormat(mmOrdd);
            String dbmd = null;
            if(mmOrdd.equals("MM"))
            {
                dbmd = xSaleList.get(0).getPdOrderTbPaymentDateStr().split("-")[1];
            }
            else
            {
                dbmd = xSaleList.get(0).getPdOrderTbPaymentDateStr().split("-")[2];
            }

            if (sdf.format(new java.util.Date()).equals(dbmd))
            {
                xSale.setPdOrderTbPayment(xSaleList.get(0).getPdOrderTbPayment());
                xSale.setUpDown("u");
            }
            else
            {
                xSale.setPdOrderTbPayment(0);
                xSale.setUpDown("d");
            }
        }
        else
        {
            int prv = xSaleList.get(0).getPdOrderTbPayment();
            int now = xSaleList.get(1).getPdOrderTbPayment();
            xSale.setPdOrderTbPayment(now);
            if(prv < now)
            {
                xSale.setUpDown("u");
            }
            else if (prv == now)
            {
                xSale.setUpDown("n");
            }
            else
            {
                xSale.setUpDown("d");
            }
        }

        return xSale;
    }
}
