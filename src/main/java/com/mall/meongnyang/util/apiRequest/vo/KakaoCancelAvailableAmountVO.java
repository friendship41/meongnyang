package com.mall.meongnyang.util.apiRequest.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KakaoCancelAvailableAmountVO
{
    @JsonProperty("total")
    private int total;
    @JsonProperty("tax_free")
    private int tax_free;
    @JsonProperty("vat")
    private int vat;
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
        return "KakaoCancelAvailableAmountVO{" +
                "total=" + total +
                ", tax_free=" + tax_free +
                ", vat=" + vat +
                ", discount=" + discount +
                '}';
    }
}
