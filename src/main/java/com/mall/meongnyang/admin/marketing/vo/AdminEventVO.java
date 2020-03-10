package com.mall.meongnyang.admin.marketing.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Date;

public class AdminEventVO
{
    private int eventTbNo;
    private int rouletteSize;
    private String eventImg;
    private String eventState;
    private String eventMessage;
    private Date eventStartDate;
    private Date eventEndDate;

    private double pointAvg;

    @JsonIgnore
    private MultipartFile uploadFile;


    public int getEventTbNo()
    {
        return eventTbNo;
    }

    public void setEventTbNo(int eventTbNo)
    {
        this.eventTbNo = eventTbNo;
    }

    public int getRouletteSize()
    {
        return rouletteSize;
    }

    public void setRouletteSize(int rouletteSize)
    {
        this.rouletteSize = rouletteSize;
    }

    public String getEventImg()
    {
        return eventImg;
    }

    public void setEventImg(String eventImg)
    {
        this.eventImg = eventImg;
    }

    public String getEventState()
    {
        return eventState;
    }

    public void setEventState(String eventState)
    {
        this.eventState = eventState;
    }

    public MultipartFile getUploadFile()
    {
        return uploadFile;
    }

    public void setUploadFile(MultipartFile uploadFile)
    {
        this.uploadFile = uploadFile;
    }

    public double getPointAvg()
    {
        return pointAvg;
    }

    public void setPointAvg(double pointAvg)
    {
        this.pointAvg = pointAvg;
    }

    public String getEventMessage()
    {
        return eventMessage;
    }

    public void setEventMessage(String eventMessage)
    {
        this.eventMessage = eventMessage;
    }

    public Date getEventStartDate()
    {
        return eventStartDate;
    }

    public void setEventStartDate(Date eventStartDate)
    {
        this.eventStartDate = eventStartDate;
    }

    public Date getEventEndDate()
    {
        return eventEndDate;
    }

    public void setEventEndDate(Date eventEndDate)
    {
        this.eventEndDate = eventEndDate;
    }

    @Override
    public String toString()
    {
        return "AdminEventVO{" +
                "eventTbNo=" + eventTbNo +
                ", rouletteSize=" + rouletteSize +
                ", eventImg='" + eventImg + '\'' +
                ", eventState='" + eventState + '\'' +
                ", eventMessage='" + eventMessage + '\'' +
                ", eventStartDate=" + eventStartDate +
                ", eventEndDate=" + eventEndDate +
                ", pointAvg=" + pointAvg +
                ", uploadFile=" + uploadFile +
                '}';
    }
}
