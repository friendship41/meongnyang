package com.mall.meongnyang.admin.marketing.vo;

import java.sql.Date;

public class AdminEventAttendenceVO
{
    private int eventAttendenceTbNo;
    private int eventTbNo;
    private int customerTbNo;
    private Date attendDate;

    private double degree;

    public int getEventAttendenceTbNo()
    {
        return eventAttendenceTbNo;
    }

    public void setEventAttendenceTbNo(int eventAttendenceTbNo)
    {
        this.eventAttendenceTbNo = eventAttendenceTbNo;
    }

    public int getEventTbNo()
    {
        return eventTbNo;
    }

    public void setEventTbNo(int eventTbNo)
    {
        this.eventTbNo = eventTbNo;
    }

    public int getCustomerTbNo()
    {
        return customerTbNo;
    }

    public void setCustomerTbNo(int customerTbNo)
    {
        this.customerTbNo = customerTbNo;
    }

    public Date getAttendDate()
    {
        return attendDate;
    }

    public void setAttendDate(Date attendDate)
    {
        this.attendDate = attendDate;
    }

    public double getDegree()
    {
        return degree;
    }

    public void setDegree(double degree)
    {
        this.degree = degree;
    }

    @Override
    public String toString()
    {
        return "AdminEventAttendenceVO{" +
                "eventAttendenceTbNo=" + eventAttendenceTbNo +
                ", eventTbNo=" + eventTbNo +
                ", customerTbNo=" + customerTbNo +
                ", attendDate=" + attendDate +
                ", degree=" + degree +
                '}';
    }
}
