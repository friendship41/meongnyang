package com.mall.meongnyang.admin.shopping.vo;

import java.sql.Date;

public class AdminNoticeVO
{
    private int noticeTbNo;
    private String adminsTbId;
    private String noticeTbTitle;
    private String noticeTbContent;
    private Date noticeTbRegDate;

    public int getNoticeTbNo()
    {
        return noticeTbNo;
    }

    public void setNoticeTbNo(int noticeTbNo)
    {
        this.noticeTbNo = noticeTbNo;
    }

    public String getAdminsTbId()
    {
        return adminsTbId;
    }

    public void setAdminsTbId(String adminsTbId)
    {
        this.adminsTbId = adminsTbId;
    }

    public String getNoticeTbTitle()
    {
        return noticeTbTitle;
    }

    public void setNoticeTbTitle(String noticeTbTitle)
    {
        this.noticeTbTitle = noticeTbTitle;
    }

    public String getNoticeTbContent()
    {
        return noticeTbContent;
    }

    public void setNoticeTbContent(String noticeTbContent)
    {
        this.noticeTbContent = noticeTbContent;
    }

    public Date getNoticeTbRegDate()
    {
        return noticeTbRegDate;
    }

    public void setNoticeTbRegDate(Date noticeTbRegDate)
    {
        this.noticeTbRegDate = noticeTbRegDate;
    }
}
