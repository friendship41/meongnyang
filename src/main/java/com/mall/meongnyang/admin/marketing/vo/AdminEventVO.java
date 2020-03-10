package com.mall.meongnyang.admin.marketing.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;

public class AdminEventVO
{
    private int eventTbNo;
    private int rouletteSize;
    private String eventImg;
    private String eventState;

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

    @Override
    public String toString()
    {
        return "AdminEventVO{" +
                "eventTbNo=" + eventTbNo +
                ", rouletteSize=" + rouletteSize +
                ", eventImg='" + eventImg + '\'' +
                ", eventState='" + eventState + '\'' +
                '}';
    }
}
