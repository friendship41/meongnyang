package com.mall.meongnyang.admin.index.comtroller;

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



    @RequestMapping("/index.ado")
    public String indexPage(Model model)
    {
        model.addAttribute("dashboardStockList", adminSelectDashboardStockListService.selectDashBoardProductStorkList());
        model.addAttribute("dashboardExpireList", adminSelectDashboardExpireProductListService.selectDashboardExpireProductList());
        model.addAttribute("dashboardOrderList", adminSelectProductOrderOverviewService.selectProductOrderList(getRecentDateVO()));

        ClientOrderVO monthlySale = new ClientOrderVO();
        List<ClientOrderVO> monthlySaleList = adminSelectMonthlySaleListService.selectDashboardMonthMoney(new ClientOrderVO());
        if(monthlySaleList.size() == 0)
        {
            monthlySale.setPdOrderTbPayment(0);
            monthlySale.setUpDown("n");
        }
        else if(monthlySaleList.size() == 1)
        {
            SimpleDateFormat sdf = new SimpleDateFormat("MM");
            if (sdf.format(new java.util.Date()).equals(monthlySaleList.get(0).getPdOrderTbPaymentDateStr().substring(3)))
            {
                monthlySale.setPdOrderTbPayment(monthlySaleList.get(0).getPdOrderTbPayment());
                monthlySale.setUpDown("u");
            }
            else
            {
                monthlySale.setPdOrderTbPayment(0);
                monthlySale.setUpDown("d");
            }
        }
        else
        {
            int prv = monthlySaleList.get(0).getPdOrderTbPayment();
            int now = monthlySaleList.get(1).getPdOrderTbPayment();
            monthlySale.setPdOrderTbPayment(now);
            if(prv < now)
            {
                monthlySale.setUpDown("u");
            }
            else if (prv == now)
            {
                monthlySale.setUpDown("n");
            }
            else
            {
                monthlySale.setUpDown("d");
            }
        }

        model.addAttribute("monthlySale", monthlySale);

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
}
