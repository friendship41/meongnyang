package com.mall.meongnyang.client.scheduler.todaycount;

import java.sql.Date;

public class ClientUserCountVO
{
    private Date userCountTbDate;
    private int userCountTbVisitors;
    private int userCountTbJoiners;
    private int userCountTbOutcount;

    private String joinUpDown;
    private String visitUpDown;

    private Date startDate;
    private Date endDate;

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

    public String getJoinUpDown()
    {
        return joinUpDown;
    }

    public void setJoinUpDown(String joinUpDown)
    {
        this.joinUpDown = joinUpDown;
    }

    public String getVisitUpDown()
    {
        return visitUpDown;
    }

    public void setVisitUpDown(String visitUpDown)
    {
        this.visitUpDown = visitUpDown;
    }

    public Date getStartDate()
    {
        return startDate;
    }

    public void setStartDate(Date startDate)
    {
        this.startDate = startDate;
    }

    public Date getEndDate()
    {
        return endDate;
    }

    public void setEndDate(Date endDate)
    {
        this.endDate = endDate;
    }

    @Override
    public String toString()
    {
        return "ClientUserCountVO{" +
                "userCountTbDate=" + userCountTbDate +
                ", userCountTbVisitors=" + userCountTbVisitors +
                ", userCountTbJoiners=" + userCountTbJoiners +
                ", userCountTbOutcount=" + userCountTbOutcount +
                ", joinUpDown='" + joinUpDown + '\'' +
                ", visitUpDown='" + visitUpDown + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
