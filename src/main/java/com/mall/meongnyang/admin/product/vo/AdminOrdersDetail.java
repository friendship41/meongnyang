package com.mall.meongnyang.admin.product.vo;

public class AdminOrdersDetail
{
    private int ordersDetailTbNo;
    private String productTbCode;
    private int pdSaleTbNo;
    private int ordersDetialTbAmount;

    public int getOrdersDetailTbNo()
    {
        return ordersDetailTbNo;
    }

    public void setOrdersDetailTbNo(int ordersDetailTbNo)
    {
        this.ordersDetailTbNo = ordersDetailTbNo;
    }

    public String getProductTbCode()
    {
        return productTbCode;
    }

    public void setProductTbCode(String productTbCode)
    {
        this.productTbCode = productTbCode;
    }

    public int getPdSaleTbNo()
    {
        return pdSaleTbNo;
    }

    public void setPdSaleTbNo(int pdSaleTbNo)
    {
        this.pdSaleTbNo = pdSaleTbNo;
    }

    public int getOrdersDetialTbAmount()
    {
        return ordersDetialTbAmount;
    }

    public void setOrdersDetialTbAmount(int ordersDetialTbAmount)
    {
        this.ordersDetialTbAmount = ordersDetialTbAmount;
    }
}
