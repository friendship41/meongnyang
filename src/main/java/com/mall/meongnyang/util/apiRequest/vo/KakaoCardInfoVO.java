package com.mall.meongnyang.util.apiRequest.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KakaoCardInfoVO
{
    @JsonProperty("purchase_corp")
    private String purchase_corp;
    @JsonProperty("purchase_corp_code")
    private String purchase_corp_code;
    @JsonProperty("issuer_corp")
    private String issuer_corp;
    @JsonProperty("issuer_corp_code")
    private String issuer_corp_code;
    @JsonProperty("kakaopay_purchase_corp")
    private String kakaopay_purchase_corp;
    @JsonProperty("kakaopay_purchase_corp_code")
    private String kakaopay_purchase_corp_code;
    @JsonProperty("kakaopay_issuer_corp")
    private String kakaopay_issuer_corp;
    @JsonProperty("kakaopay_issuer_corp_code")
    private String kakaopay_issuer_corp_code;
    @JsonProperty("bin")
    private String bin;
    @JsonProperty("card_type")
    private String card_type;
    @JsonProperty("install_month")
    private String install_month;
    @JsonProperty("approved_id")
    private String approved_id;
    @JsonProperty("card_mid")
    private String card_mid;
    @JsonProperty("interest_free_install")
    private String interest_free_install;
    @JsonProperty("card_item_code")
    private String card_item_code;

    public String getPurchase_corp()
    {
        return purchase_corp;
    }

    public void setPurchase_corp(String purchase_corp)
    {
        this.purchase_corp = purchase_corp;
    }

    public String getPurchase_corp_code()
    {
        return purchase_corp_code;
    }

    public void setPurchase_corp_code(String purchase_corp_code)
    {
        this.purchase_corp_code = purchase_corp_code;
    }

    public String getIssuer_corp()
    {
        return issuer_corp;
    }

    public void setIssuer_corp(String issuer_corp)
    {
        this.issuer_corp = issuer_corp;
    }

    public String getIssuer_corp_code()
    {
        return issuer_corp_code;
    }

    public void setIssuer_corp_code(String issuer_corp_code)
    {
        this.issuer_corp_code = issuer_corp_code;
    }

    public String getKakaopay_purchase_corp()
    {
        return kakaopay_purchase_corp;
    }

    public void setKakaopay_purchase_corp(String kakaopay_purchase_corp)
    {
        this.kakaopay_purchase_corp = kakaopay_purchase_corp;
    }

    public String getKakaopay_purchase_corp_code()
    {
        return kakaopay_purchase_corp_code;
    }

    public void setKakaopay_purchase_corp_code(String kakaopay_purchase_corp_code)
    {
        this.kakaopay_purchase_corp_code = kakaopay_purchase_corp_code;
    }

    public String getKakaopay_issuer_corp()
    {
        return kakaopay_issuer_corp;
    }

    public void setKakaopay_issuer_corp(String kakaopay_issuer_corp)
    {
        this.kakaopay_issuer_corp = kakaopay_issuer_corp;
    }

    public String getKakaopay_issuer_corp_code()
    {
        return kakaopay_issuer_corp_code;
    }

    public void setKakaopay_issuer_corp_code(String kakaopay_issuer_corp_code)
    {
        this.kakaopay_issuer_corp_code = kakaopay_issuer_corp_code;
    }

    public String getBin()
    {
        return bin;
    }

    public void setBin(String bin)
    {
        this.bin = bin;
    }

    public String getCard_type()
    {
        return card_type;
    }

    public void setCard_type(String card_type)
    {
        this.card_type = card_type;
    }

    public String getInstall_month()
    {
        return install_month;
    }

    public void setInstall_month(String install_month)
    {
        this.install_month = install_month;
    }

    public String getApproved_id()
    {
        return approved_id;
    }

    public void setApproved_id(String approved_id)
    {
        this.approved_id = approved_id;
    }

    public String getCard_mid()
    {
        return card_mid;
    }

    public void setCard_mid(String card_mid)
    {
        this.card_mid = card_mid;
    }

    public String getInterest_free_install()
    {
        return interest_free_install;
    }

    public void setInterest_free_install(String interest_free_install)
    {
        this.interest_free_install = interest_free_install;
    }

    public String getCard_item_code()
    {
        return card_item_code;
    }

    public void setCard_item_code(String card_item_code)
    {
        this.card_item_code = card_item_code;
    }

    @Override
    public String toString()
    {
        return "KakaoCardInfoVO{" +
                "purchase_corp='" + purchase_corp + '\'' +
                ", purchase_corp_code='" + purchase_corp_code + '\'' +
                ", issuer_corp='" + issuer_corp + '\'' +
                ", issuer_corp_code='" + issuer_corp_code + '\'' +
                ", kakaopay_purchase_corp='" + kakaopay_purchase_corp + '\'' +
                ", kakaopay_purchase_corp_code='" + kakaopay_purchase_corp_code + '\'' +
                ", kakaopay_issuer_corp='" + kakaopay_issuer_corp + '\'' +
                ", kakaopay_issuer_corp_code='" + kakaopay_issuer_corp_code + '\'' +
                ", bin='" + bin + '\'' +
                ", card_type='" + card_type + '\'' +
                ", install_month='" + install_month + '\'' +
                ", approved_id='" + approved_id + '\'' +
                ", card_mid='" + card_mid + '\'' +
                ", interest_free_install='" + interest_free_install + '\'' +
                ", card_item_code='" + card_item_code + '\'' +
                '}';
    }
}
