package com.mall.meongnyang.client.shopping.vo;

import java.sql.Date;
import java.util.List;

public class ClientOrderVO
{
    private String pdOrderTbNo;
    private int customerTbNo;
    private Date pdOrderTbOrderDate;
    private int pdOrderTbPayment;
    private String pdOrderTbState;
    private String pdOrderTbAddress;
    private String pdOrderTbAdCity;
    private String pdOrderTbReceiver;
    private Date pdOrderTbPaymentDate;
    private String pdOrderTbPhone;
    private int pdOrderTbDeliveryFee;
    private int pdOrderTbUsedPoint;

    private List<ClientOrderDetailVO> orderDetailVOList;
    private String orderRepProductName;

    private String tid;
    private String pg_token;

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

    public int getPdOrderTbDeliveryFee()
    {
        return pdOrderTbDeliveryFee;
    }

    public void setPdOrderTbDeliveryFee(int pdOrderTbDeliveryFee)
    {
        this.pdOrderTbDeliveryFee = pdOrderTbDeliveryFee;
    }

    public int getPdOrderTbUsedPoint()
    {
        return pdOrderTbUsedPoint;
    }

    public void setPdOrderTbUsedPoint(int pdOrderTbUsedPoint)
    {
        this.pdOrderTbUsedPoint = pdOrderTbUsedPoint;
    }

    public List<ClientOrderDetailVO> getOrderDetailVOList()
    {
        return orderDetailVOList;
    }

    public void setOrderDetailVOList(List<ClientOrderDetailVO> orderDetailVOList)
    {
        this.orderDetailVOList = orderDetailVOList;
    }

    public String getOrderRepProductName()
    {
        return orderRepProductName;
    }

    public void setOrderRepProductName(String orderRepProductName)
    {
        this.orderRepProductName = orderRepProductName;
    }

    public String getPg_token()
    {
        return pg_token;
    }

    public void setPg_token(String pg_token)
    {
        this.pg_token = pg_token;
    }

    public String getTid()
    {
        return tid;
    }

    public void setTid(String tid)
    {
        this.tid = tid;
    }

    @Override
    public String toString()
    {
        return "ClientOrderVO{" +
                "pdOrderTbNo='" + pdOrderTbNo + '\'' +
                ", customerTbNo=" + customerTbNo +
                ", pdOrderTbOrderDate=" + pdOrderTbOrderDate +
                ", pdOrderTbPayment=" + pdOrderTbPayment +
                ", pdOrderTbState='" + pdOrderTbState + '\'' +
                ", pdOrderTbAddress='" + pdOrderTbAddress + '\'' +
                ", pdOrderTbAdCity='" + pdOrderTbAdCity + '\'' +
                ", pdOrderTbReceiver='" + pdOrderTbReceiver + '\'' +
                ", pdOrderTbPaymentDate=" + pdOrderTbPaymentDate +
                ", pdOrderTbPhone='" + pdOrderTbPhone + '\'' +
                ", pdOrderTbDeliveryFee=" + pdOrderTbDeliveryFee +
                ", pdOrderTbUsedPoint=" + pdOrderTbUsedPoint +
                ", orderDetailVOList=" + orderDetailVOList +
                ", orderRepProductName='" + orderRepProductName + '\'' +
                ", tid='" + tid + '\'' +
                ", pg_token='" + pg_token + '\'' +
                '}';
    }
}
