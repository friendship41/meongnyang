package com.mall.meongnyang.admin.index.service;

import com.google.gson.Gson;
import com.mall.meongnyang.admin.member.vo.AdminOverviewChartVO;
import com.mall.meongnyang.admin.member.vo.AdminOverviewDataSetVO;
import com.mall.meongnyang.admin.member.vo.AdminOverviewDataVO;
import com.mall.meongnyang.admin.sales.dao.AdminSalesOverviewDAO;
import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;
import com.mall.meongnyang.util.chartLabel.LabelMaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service("AdminSelectWeekSaleService")
public class AdminSelectWeekSaleServiceImpl implements AdminSelectWeekSaleService
{
    @Autowired
    private AdminSalesOverviewDAO adminSalesOverviewDAO;


    @Override
    public String getWeekSaleChartJSONStr()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE, -6);

        ClientProductOrderVO clientProductOrderVO = new ClientProductOrderVO();

        clientProductOrderVO.setStartDate(new java.sql.Date(calendar.getTimeInMillis()));
        clientProductOrderVO.setEndDate(new java.sql.Date(new Date().getTime()));


        List<ClientProductOrderVO> saleList = adminSalesOverviewDAO.selectSalesPayment(clientProductOrderVO);
//        dataset 세팅 구간 ------------------------------------
        AdminOverviewDataSetVO dataset = new AdminOverviewDataSetVO();

        LabelMaker labelMaker = new LabelMaker();
        String[] labels = labelMaker.chartDailyLabelMaker(new java.sql.Date(calendar.getTimeInMillis()), new java.sql.Date(new Date().getTime()));

        int[] datasetData = new int[7];

        for(int i=0; i<7; i++)
        {
            for(ClientProductOrderVO saleTemp : saleList)
            {
                if(labels[i].equals(saleTemp.getPdOrderTbPaymentDateStr()))
                {
                    datasetData[i] = saleTemp.getPdOrderTbPaymentSum();
                    break;
                }
                else
                {
                    datasetData[i] = 0;
                }
            }
        }


        StringBuffer sb = new StringBuffer();
        sb.append("rgb(");
        sb.append(Math.random()*255);
        sb.append(",");
        sb.append(Math.random()*255);
        sb.append(",");
        sb.append(Math.random()*255);
        sb.append(")");

        dataset.setData(datasetData);
        dataset.setBorderColor(sb.toString());
        dataset.setFill(false);
        dataset.setLabel("일별 매출");
        dataset.setLineTension(0.2);


//        Data 세팅구간 --------------------------------------------------
        AdminOverviewDataVO data = new AdminOverviewDataVO();

        data.setLabels(labels);
        data.setDatasets(new AdminOverviewDataSetVO[]{dataset});


//        Chart 세팅구간 ----------------------------------------------
        AdminOverviewChartVO chart = new AdminOverviewChartVO();
        chart.setType("line");
        chart.setData(data);
        chart.setOptions("");


//        JSON화
        Gson gson = new Gson();
        String chartStr = gson.toJson(chart);
        chartStr = chartStr.substring(0,chartStr.length()-3);
        chartStr += "{\"scales\":{\"yAxes\":[{\"ticks\":{\"beginAtZero\":true}}]}}}";

        return chartStr;
    }
}
