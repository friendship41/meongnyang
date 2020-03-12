package com.mall.meongnyang.util.apiRequest.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KakaoAmountVO
{
    @JsonProperty("total")
    private int total;
    @JsonProperty("tax_free")
    private int tax_free;
    @JsonProperty("vat")
    private int vat;
    @JsonProperty("point")
    private int point;
    @JsonProperty("discount")
    private int discount;

    public int getTotal()
    {
        return total;
    }

    public void setTotal(int total)
    {
        this.total = total;
    }

    public int getTax_free()
    {
        return tax_free;
    }

    public void setTax_free(int tax_free)
    {
        this.tax_free = tax_free;
    }

    public int getVat()
    {
        return vat;
    }

    public void setVat(int vat)
    {
        this.vat = vat;
    }

    public int getPoint()
    {
        return point;
    }

    public void setPoint(int point)
    {
        this.point = point;
    }

    public int getDiscount()
    {
        return discount;
    }

    public void setDiscount(int discount)
    {
        this.discount = discount;
    }

    @Override
    public String toString()
    {
        return "KakaoAmountVO{" +
                "total=" + total +
                ", tax_free=" + tax_free +
                ", vat=" + vat +
                ", point=" + point +
                ", discount=" + discount +
                '}';
    }
}
