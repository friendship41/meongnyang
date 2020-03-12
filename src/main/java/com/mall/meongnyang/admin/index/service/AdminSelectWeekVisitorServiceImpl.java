package com.mall.meongnyang.admin.index.service;

import com.google.gson.Gson;
import com.mall.meongnyang.admin.member.dao.AdminOverviewDAO;
import com.mall.meongnyang.admin.member.vo.AdminOverviewChartVO;
import com.mall.meongnyang.admin.member.vo.AdminOverviewDataSetVO;
import com.mall.meongnyang.admin.member.vo.AdminOverviewDataVO;
import com.mall.meongnyang.client.scheduler.todaycount.ClientUserCountVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service("AdminSelectWeekVisitorService")
public class AdminSelectWeekVisitorServiceImpl implements AdminSelectWeekVisitorService
{
    @Autowired
    private AdminOverviewDAO adminOverviewDAO;

    @Override
    public String getWeekVisitorChartJSONStr()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE, -6);

        ClientUserCountVO clientUserCountVO = new ClientUserCountVO();
        clientUserCountVO.setStartDate(new java.sql.Date(calendar.getTimeInMillis()));
        clientUserCountVO.setEndDate(new java.sql.Date(new Date().getTime()));



        List<ClientUserCountVO> userCountList = adminOverviewDAO.selectWeekVisitorList(clientUserCountVO);
//        dataset 세팅 구간 ------------------------------------
        AdminOverviewDataSetVO dataset = new AdminOverviewDataSetVO();

        int[] datasetData = new int[7];
        for(int i=0; i<7; i++)
        {
            datasetData[i] = userCountList.get(i).getUserCountTbVisitors();
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
        dataset.setLabel("일별 방문자 수");
        dataset.setLineTension(0.2);


//        Data 세팅구간 --------------------------------------------------
        AdminOverviewDataVO data = new AdminOverviewDataVO();

        String[] labels = new String[7];
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd");
        for(int i=0; i<7; i++)
        {
            labels[i] = sdf.format(userCountList.get(i).getUserCountTbDate());
        }

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
