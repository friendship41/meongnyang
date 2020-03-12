package com.mall.meongnyang.admin.shopping.vo;

import java.sql.Date;

public class AdminNoticeVO
{
	private int startRow;//현재페이지의 시작글번호
	private int endRow;//현재페이지의 끝번호 
	
    public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	private int rnum;
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

	@Override
	public String toString() {
		return "AdminNoticeVO [startRow=" + startRow + ", endRow=" + endRow + ", noticeTbNo=" + noticeTbNo
				+ ", adminsTbId=" + adminsTbId + ", noticeTbTitle=" + noticeTbTitle + ", noticeTbContent="
				+ noticeTbContent + ", noticeTbRegDate=" + noticeTbRegDate + "]";
	}

	public int getRnum() {
		return rnum;
	}

	public void setRnum(int rnum) {
		this.rnum = rnum;
	}
	
	
    
    
}
