package com.mall.meongnyang.client.shopping.vo;

public class ClientOrderDetailVO
{
    private int ordersDetailTbNo;
    private int pdSaleTbNo;
    private int ordersDetailTbAmount;
    private String pdOrderTbNo;
    private int ordersDetailTbPrice;

    public int getOrdersDetailTbNo()
    {
        return ordersDetailTbNo;
    }

    public void setOrdersDetailTbNo(int ordersDetailTbNo)
    {
        this.ordersDetailTbNo = ordersDetailTbNo;
    }

    public int getPdSaleTbNo()
    {
        return pdSaleTbNo;
    }

    public void setPdSaleTbNo(int pdSaleTbNo)
    {
        this.pdSaleTbNo = pdSaleTbNo;
    }

    public int getOrdersDetailTbAmount()
    {
        return ordersDetailTbAmount;
    }

    public void setOrdersDetailTbAmount(int ordersDetailTbAmount)
    {
        this.ordersDetailTbAmount = ordersDetailTbAmount;
    }

    public String getPdOrderTbNo()
    {
        return pdOrderTbNo;
    }

    public void setPdOrderTbNo(String pdOrderTbNo)
    {
        this.pdOrderTbNo = pdOrderTbNo;
    }

    public int getOrdersDetailTbPrice()
    {
        return ordersDetailTbPrice;
    }

    public void setOrdersDetailTbPrice(int ordersDetailTbPrice)
    {
        this.ordersDetailTbPrice = ordersDetailTbPrice;
    }

    @Override
    public String toString()
    {
        return "ClientOrderDetailVO{" +
                "ordersDetailTbNo=" + ordersDetailTbNo +
                ", pdSaleTbNo=" + pdSaleTbNo +
                ", ordersDetailTbAmount=" + ordersDetailTbAmount +
                ", pdOrderTbNo='" + pdOrderTbNo + '\'' +
                ", ordersDetailTbPrice=" + ordersDetailTbPrice +
                '}';
    }
}
