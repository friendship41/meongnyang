package com.mall.meongnyang.client.scheduler.todaycount;

import java.sql.Date;

public class ClientUserCountVO
{
    private Date userCountTbDate;
    private int userCountTbVisitors;
    private int userCountTbJoiners;
    private int userCountTbOutcount;

    public Date getUserCountTbDate()
    {
        return userCountTbDate;
    }

    public void setUserCountTbDate(Date userCountTbDate)
    {
        this.userCountTbDate = userCountTbDate;
    }

    public int getUserCountTbVisitors()
    {
        return userCountTbVisitors;
    }

    public void setUserCountTbVisitors(int userCountTbVisitors)
    {
        this.userCountTbVisitors = userCountTbVisitors;
    }

    public int getUserCountTbJoiners()
    {
        return userCountTbJoiners;
    }

    public void setUserCountTbJoiners(int userCountTbJoiners)
    {
        this.userCountTbJoiners = userCountTbJoiners;
    }

    public int getUserCountTbOutcount()
    {
        return userCountTbOutcount;
    }

    public void setUserCountTbOutcount(int userCountTbOutcount)
    {
        this.userCountTbOutcount = userCountTbOutcount;
    }


    @Override
    public String toString()
    {
        return "ClientUserCountVO{" +
                "userCountTbDate=" + userCountTbDate +
                ", userCountTbVisitors=" + userCountTbVisitors +
                ", userCountTbJoiners=" + userCountTbJoiners +
                ", userCountTbOutcount=" + userCountTbOutcount +
                '}';
    }
}
