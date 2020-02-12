package com.mall.meongnyang.admin.product.vo;

import java.sql.Date;

public class AdminProductOrderVO
{
    private String pdOrderTbNo;
    private int customerTbNo;
    private Date pdOrderTbOrderDate;
    private int pdOrderTbPayment;
    private String  pdOrderTbState;
    private String  pdOrderTbAddress;
    private String pdOrderTbAdCity;
    private String  pdOrderTbReceiver;
    private Date pdOrderTbPaymentDate;
    private String  pdOrderTbPhone;
    private int pdOrderTbDelivertyFee;
    private int pdOrderTbUsedPoint;

    public String getPdOrderTbNo()
    {
        return pdOrderTbNo;
    }

    public void setPdOrderTbNo(String pdOrderTbNo)
    {
        this.pdOrderTbNo = pdOrderTbNo;
    }

    public int getCustomerTbNo()
    {
        return customerTbNo;
    }

    public void setCustomerTbNo(int customerTbNo)
    {
        this.customerTbNo = customerTbNo;
    }

    public Date getPdOrderTbOrderDate()
    {
        return pdOrderTbOrderDate;
    }

    public void setPdOrderTbOrderDate(Date pdOrderTbOrderDate)
    {
        this.pdOrderTbOrderDate = pdOrderTbOrderDate;
    }

    public int getPdOrderTbPayment()
    {
        return pdOrderTbPayment;
    }

    public void setPdOrderTbPayment(int pdOrderTbPayment)
    {
        this.pdOrderTbPayment = pdOrderTbPayment;
    }

    public String getPdOrderTbState()
    {
        return pdOrderTbState;
    }

    public void setPdOrderTbState(String pdOrderTbState)
    {
        this.pdOrderTbState = pdOrderTbState;
    }

    public String getPdOrderTbAddress()
    {
        return pdOrderTbAddress;
    }

    public void setPdOrderTbAddress(String pdOrderTbAddress)
    {
        this.pdOrderTbAddress = pdOrderTbAddress;
    }

    public String getPdOrderTbAdCity()
    {
        return pdOrderTbAdCity;
    }

    public void setPdOrderTbAdCity(String pdOrderTbAdCity)
    {
        this.pdOrderTbAdCity = pdOrderTbAdCity;
    }

    public String getPdOrderTbReceiver()
    {
        return pdOrderTbReceiver;
    }

    public void setPdOrderTbReceiver(String pdOrderTbReceiver)
    {
        this.pdOrderTbReceiver = pdOrderTbReceiver;
    }

    public Date getPdOrderTbPaymentDate()
    {
        return pdOrderTbPaymentDate;
    }

    public void setPdOrderTbPaymentDate(Date pdOrderTbPaymentDate)
    {
        this.pdOrderTbPaymentDate = pdOrderTbPaymentDate;
    }

    public String getPdOrderTbPhone()
    {
        return pdOrderTbPhone;
    }

    public void setPdOrderTbPhone(String pdOrderTbPhone)
    {
        this.pdOrderTbPhone = pdOrderTbPhone;
    }

    public int getPdOrderTbDelivertyFee()
    {
        return pdOrderTbDelivertyFee;
    }

    public void setPdOrderTbDelivertyFee(int pdOrderTbDelivertyFee)
    {
        this.pdOrderTbDelivertyFee = pdOrderTbDelivertyFee;
    }

    public int getPdOrderTbUsedPoint()
    {
        return pdOrderTbUsedPoint;
    }

    public void setPdOrderTbUsedPoint(int pdOrderTbUsedPoint)
    {
        this.pdOrderTbUsedPoint = pdOrderTbUsedPoint;
    }
}
