package com.mall.meongnyang.util.apiRequest.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Date;

public class KakaoPayReadyResponseVO
{
    @JsonProperty("tid")
    private String tid;
    @JsonProperty("next_redirect_pc_url")
    private String next_redirect_pc_url;
    @JsonProperty("created_at")
    private Date created_at;

    public String getTid()
    {
        return tid;
    }

    public void setTid(String tid)
    {
        this.tid = tid;
    }

    public String getNext_redirect_pc_url()
    {
        return next_redirect_pc_url;
    }

    public void setNext_redirect_pc_url(String next_redirect_pc_url)
    {
        this.next_redirect_pc_url = next_redirect_pc_url;
    }

    public Date getCreated_at()
    {
        return created_at;
    }

    public void setCreated_at(Date created_at)
    {
        this.created_at = created_at;
    }

    @Override
    public String toString()
    {
        return "KakaoPayReadyResponseVO{" +
                "tid='" + tid + '\'' +
                ", next_redirect_pc_url='" + next_redirect_pc_url + '\'' +
                ", created_at=" + created_at +
                '}';
    }
}
