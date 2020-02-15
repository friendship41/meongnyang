package com.mall.meongnyang.admin.product.vo;

import java.sql.Date;

public class AdminProductSaleVO
{
    private int pdSaleTbNo;
    private String productTbCode;
    private int promotionTbCode;
    private String pdSaleTbProductName;
    private int pdSaleTbReceivedPrice;
    private int pdSaleTbSalesPrice;
    private int pdSaleTbReceivedAmount;
    private int pdSaleTbRemainingAmount;
    private int pdSaleTbLimitAmount;
    private Date pdSaleTbStartDay;
    private Date pdSaleTbExpireDay;
    private String pdSaleTbSize;
    private int pdSaleTbReadCount;
    private int pdSaleTbRating;
    private int pdSaleTbDiscountRate;
    private String pdSaleTbState;

    private int rowNumber;
    private Date dayFrom;
    private Date dayTo;

    public int getPdSaleTbNo()
    {
        return pdSaleTbNo;
    }

    public void setPdSaleTbNo(int pdSaleTbNo)
    {
        this.pdSaleTbNo = pdSaleTbNo;
    }

    public String getProductTbCode()
    {
        return productTbCode;
    }

    public void setProductTbCode(String productTbCode)
    {
        this.productTbCode = productTbCode;
    }

    public int getPromotionTbCode()
    {
        return promotionTbCode;
    }

    public void setPromotionTbCode(int promotionTbCode)
    {
        this.promotionTbCode = promotionTbCode;
    }

    public String getPdSaleTbProductName()
    {
        return pdSaleTbProductName;
    }

    public void setPdSaleTbProductName(String pdSaleTbProductName)
    {
        this.pdSaleTbProductName = pdSaleTbProductName;
    }

    public int getPdSaleTbReceivedPrice()
    {
        return pdSaleTbReceivedPrice;
    }

    public void setPdSaleTbReceivedPrice(int pdSaleTbReceivedPrice)
    {
        this.pdSaleTbReceivedPrice = pdSaleTbReceivedPrice;
    }

    public int getPdSaleTbSalesPrice()
    {
        return pdSaleTbSalesPrice;
    }

    public void setPdSaleTbSalesPrice(int pdSaleTbSalesPrice)
    {
        this.pdSaleTbSalesPrice = pdSaleTbSalesPrice;
    }

    public int getPdSaleTbReceivedAmount()
    {
        return pdSaleTbReceivedAmount;
    }

    public void setPdSaleTbReceivedAmount(int pdSaleTbReceivedAmount)
    {
        this.pdSaleTbReceivedAmount = pdSaleTbReceivedAmount;
    }

    public int getPdSaleTbRemainingAmount()
    {
        return pdSaleTbRemainingAmount;
    }

    public void setPdSaleTbRemainingAmount(int pdSaleTbRemainingAmount)
    {
        this.pdSaleTbRemainingAmount = pdSaleTbRemainingAmount;
    }

    public int getPdSaleTbLimitAmount()
    {
        return pdSaleTbLimitAmount;
    }

    public void setPdSaleTbLimitAmount(int pdSaleTbLimitAmount)
    {
        this.pdSaleTbLimitAmount = pdSaleTbLimitAmount;
    }

    public Date getPdSaleTbStartDay()
    {
        return pdSaleTbStartDay;
    }

    public void setPdSaleTbStartDay(Date pdSaleTbStartDay)
    {
        this.pdSaleTbStartDay = pdSaleTbStartDay;
    }

    public Date getPdSaleTbExpireDay()
    {
        return pdSaleTbExpireDay;
    }

    public void setPdSaleTbExpireDay(Date pdSaleTbExpireDay)
    {
        this.pdSaleTbExpireDay = pdSaleTbExpireDay;
    }

    public String getPdSaleTbSize()
    {
        return pdSaleTbSize;
    }

    public void setPdSaleTbSize(String pdSaleTbSize)
    {
        this.pdSaleTbSize = pdSaleTbSize;
    }

    public int getPdSaleTbReadCount()
    {
        return pdSaleTbReadCount;
    }

    public void setPdSaleTbReadCount(int pdSaleTbReadCount)
    {
        this.pdSaleTbReadCount = pdSaleTbReadCount;
    }

    public int getPdSaleTbRating()
    {
        return pdSaleTbRating;
    }

    public void setPdSaleTbRating(int pdSaleTbRating)
    {
        this.pdSaleTbRating = pdSaleTbRating;
    }

    public int getPdSaleTbDiscountRate()
    {
        return pdSaleTbDiscountRate;
    }

    public void setPdSaleTbDiscountRate(int pdSaleTbDiscountRate)
    {
        this.pdSaleTbDiscountRate = pdSaleTbDiscountRate;
    }

    public String getPdSaleTbState()
    {
        return pdSaleTbState;
    }

    public void setPdSaleTbState(String pdSaleTbState)
    {
        this.pdSaleTbState = pdSaleTbState;
    }

    public int getRowNumber()
    {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber)
    {
        this.rowNumber = rowNumber;
    }

    public Date getDayFrom()
    {
        return dayFrom;
    }

    public void setDayFrom(Date dayFrom)
    {
        this.dayFrom = dayFrom;
    }

    public Date getDayTo()
    {
        return dayTo;
    }

    public void setDayTo(Date dayTo)
    {
        this.dayTo = dayTo;
    }

    @Override
    public String toString()
    {
        return "AdminProductSaleVO{" +
                "pdSaleTbNo=" + pdSaleTbNo +
                ", productTbCode='" + productTbCode + '\'' +
                ", promotionTbCode=" + promotionTbCode +
                ", pdSaleTbProductName='" + pdSaleTbProductName + '\'' +
                ", pdSaleTbReceivedPrice=" + pdSaleTbReceivedPrice +
                ", pdSaleTbSalesPrice=" + pdSaleTbSalesPrice +
                ", pdSaleTbReceivedAmount=" + pdSaleTbReceivedAmount +
                ", pdSaleTbRemainingAmount=" + pdSaleTbRemainingAmount +
                ", pdSaleTbLimitAmount=" + pdSaleTbLimitAmount +
                ", pdSaleTbStartDay=" + pdSaleTbStartDay +
                ", pdSaleTbExpireDay=" + pdSaleTbExpireDay +
                ", pdSaleTbSize='" + pdSaleTbSize + '\'' +
                ", pdSaleTbReadCount=" + pdSaleTbReadCount +
                ", pdSaleTbRating=" + pdSaleTbRating +
                ", pdSaleTbDiscountRate=" + pdSaleTbDiscountRate +
                '}';
    }
}
