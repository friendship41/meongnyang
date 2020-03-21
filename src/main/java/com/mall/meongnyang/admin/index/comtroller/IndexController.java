package com.mall.meongnyang.admin.index.comtroller;

import com.mall.meongnyang.admin.index.service.*;
import com.mall.meongnyang.admin.product.service.AdminSelectProductOrderOverviewService;
import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;
import com.mall.meongnyang.client.scheduler.todaycount.ClientUserCountVO;
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
    @Autowired
    private AdminSelectUserCountService adminSelectUserCountService;
    @Autowired
    private AdminSelectWeekVisitorService adminSelectWeekVisitorService;
    @Autowired
    private AdminSelectWeekSaleService adminSelectWeekSaleService;


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

        ClientUserCountVO clientUserCountVO = adminSelectUserCountService.selectSingleByDate(new ClientUserCountVO());
        ClientUserCountVO prevUserCount = adminSelectUserCountService.selectSinglePrevUserCountByDate(new ClientUserCountVO());
        model.addAttribute("userCount", getUpDownSettedUserCount(clientUserCountVO, prevUserCount));

        model.addAttribute("visitorChart", adminSelectWeekVisitorService.getWeekVisitorChartJSONStr());
        model.addAttribute("saleChart", adminSelectWeekSaleService.getWeekSaleChartJSONStr());

        return "index";
    }

    private ClientProductOrderVO getRecentDateVO()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new java.util.Date());
        calendar.add(Calendar.DATE, 1);
        //System.out.println(calendar.getTime());

        ClientProductOrderVO clientProductOrderVO = new ClientProductOrderVO();
        clientProductOrderVO.setDayTo(new Date(calendar.getTimeInMillis()));


        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        calendar.add(Calendar.DATE, -7);
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        clientProductOrderVO.setDayFrom(new Date(calendar.getTimeInMillis()));
        //System.out.println(calendar.getTime());

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

    private ClientUserCountVO getUpDownSettedUserCount(ClientUserCountVO target, ClientUserCountVO prev)
    {
        if(target == null)
        {
            target = new ClientUserCountVO();
            target.setUserCountTbJoiners(0);
            target.setUserCountTbVisitors(0);
        }
        if(prev == null)
        {
            prev = new ClientUserCountVO();
            prev.setUserCountTbJoiners(0);
            prev.setUserCountTbVisitors(0);
        }

        int targetJoin = target.getUserCountTbJoiners();
        int prevJoin = prev.getUserCountTbJoiners();
        int targetVisit = target.getUserCountTbVisitors();
        int prevVisit = prev.getUserCountTbVisitors();

        if(targetJoin == prevJoin)
            target.setJoinUpDown("n");
        else if (targetJoin > prevJoin)
            target.setJoinUpDown("u");
        else
            target.setJoinUpDown("d");

        if (targetVisit == prevVisit)
            target.setVisitUpDown("n");
        else if (targetVisit > prevVisit)
            target.setVisitUpDown("u");
        else
            target.setVisitUpDown("d");

        return target;
    }
}
