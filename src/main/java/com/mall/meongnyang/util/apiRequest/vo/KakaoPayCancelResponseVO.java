package com.mall.meongnyang.util.apiRequest.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Date;

public class KakaoPayCancelResponseVO
{
    @JsonProperty("aid")
    private String aid;
    @JsonProperty("tid")
    private String tid;
    @JsonProperty("cid")
    private String cid;
    @JsonProperty("status")
    private String status;
    @JsonProperty("partner_order_id")
    private String partner_order_id;
    @JsonProperty("partner_user_id")
    private String partner_user_id;
    @JsonProperty("payment_method_type")
    private String payment_method_type;
    @JsonProperty("amount")
    private KakaoAmountVO amount;
    @JsonProperty("canceled_amount")
    private KakaoCancelAmountVO canceled_amount;
    @JsonProperty("cancel_available_amount")
    private KakaoCancelAvailableAmountVO cancel_available_amount;
    @JsonProperty("item_name")
    private String item_name;
    @JsonProperty("item_code")
    private String item_code;
    @JsonProperty("quantity")
    private int quantity;
    @JsonProperty("created_at")
    private Date created_at;
    @JsonProperty("approved_at")
    private Date approved_at;
    @JsonProperty("canceled_at")
    private Date canceled_at;
    @JsonProperty("payload")
    private String payload;

    public String getAid()
    {
        return aid;
    }

    public void setAid(String aid)
    {
        this.aid = aid;
    }

    public String getTid()
    {
        return tid;
    }

    public void setTid(String tid)
    {
        this.tid = tid;
    }

    public String getCid()
    {
        return cid;
    }

    public void setCid(String cid)
    {
        this.cid = cid;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getPartner_order_id()
    {
        return partner_order_id;
    }

    public void setPartner_order_id(String partner_order_id)
    {
        this.partner_order_id = partner_order_id;
    }

    public String getPartner_user_id()
    {
        return partner_user_id;
    }

    public void setPartner_user_id(String partner_user_id)
    {
        this.partner_user_id = partner_user_id;
    }

    public String getPayment_method_type()
    {
        return payment_method_type;
    }

    public void setPayment_method_type(String payment_method_type)
    {
        this.payment_method_type = payment_method_type;
    }

    public KakaoAmountVO getAmount()
    {
        return amount;
    }

    public void setAmount(KakaoAmountVO amount)
    {
        this.amount = amount;
    }

    public KakaoCancelAmountVO getCanceled_amount()
    {
        return canceled_amount;
    }

    public void setCanceled_amount(KakaoCancelAmountVO canceled_amount)
    {
        this.canceled_amount = canceled_amount;
    }

    public KakaoCancelAvailableAmountVO getCancel_available_amount()
    {
        return cancel_available_amount;
    }

    public void setCancel_available_amount(KakaoCancelAvailableAmountVO cancel_available_amount)
    {
        this.cancel_available_amount = cancel_available_amount;
    }

    public String getItem_name()
    {
        return item_name;
    }

    public void setItem_name(String item_name)
    {
        this.item_name = item_name;
    }

    public String getItem_code()
    {
        return item_code;
    }

    public void setItem_code(String item_code)
    {
        this.item_code = item_code;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public Date getCreated_at()
    {
        return created_at;
    }

    public void setCreated_at(Date created_at)
    {
        this.created_at = created_at;
    }

    public Date getApproved_at()
    {
        return approved_at;
    }

    public void setApproved_at(Date approved_at)
    {
        this.approved_at = approved_at;
    }

    public Date getCanceled_at()
    {
        return canceled_at;
    }

    public void setCanceled_at(Date canceled_at)
    {
        this.canceled_at = canceled_at;
    }

    public String getPayload()
    {
        return payload;
    }

    public void setPayload(String payload)
    {
        this.payload = payload;
    }

    @Override
    public String toString()
    {
        return "KakaoPayCancelResponseVO{" +
                "aid='" + aid + '\'' +
                ", tid='" + tid + '\'' +
                ", cid='" + cid + '\'' +
                ", status='" + status + '\'' +
                ", partner_order_id='" + partner_order_id + '\'' +
                ", partner_user_id='" + partner_user_id + '\'' +
                ", payment_method_type='" + payment_method_type + '\'' +
                ", amount=" + amount +
                ", canceled_amount=" + canceled_amount +
                ", cancel_available_amount=" + cancel_available_amount +
                ", item_name='" + item_name + '\'' +
                ", item_code='" + item_code + '\'' +
                ", quantity=" + quantity +
                ", created_at=" + created_at +
                ", approved_at=" + approved_at +
                ", canceled_at=" + canceled_at +
                ", payload='" + payload + '\'' +
                '}';
    }
}
