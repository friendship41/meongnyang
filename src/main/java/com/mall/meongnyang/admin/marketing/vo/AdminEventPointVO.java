package com.mall.meongnyang.admin.marketing.vo;

import java.util.List;

public class AdminEventPointVO
{
    private int roulettePointTbNo;
    private int eventTbNo;
    private int eventPoint;

    private int inp1;
    private int inp2;
    private int inp3;
    private int inp4;
    private int inp5;
    private int inp6;
    private int inp7;
    private int inp8;

    private int rouletteSize;

    private List<AdminEventPointVO> pointList;

    public int getRoulettePointTbNo()
    {
        return roulettePointTbNo;
    }

    public void setRoulettePointTbNo(int roulettePointTbNo)
    {
        this.roulettePointTbNo = roulettePointTbNo;
    }

    public int getEventTbNo()
    {
        return eventTbNo;
    }

    public void setEventTbNo(int eventTbNo)
    {
        this.eventTbNo = eventTbNo;
    }

    public int getEventPoint()
    {
        return eventPoint;
    }

    public void setEventPoint(int eventPoint)
    {
        this.eventPoint = eventPoint;
    }

    public int getInp1()
    {
        return inp1;
    }

    public void setInp1(int inp1)
    {
        this.inp1 = inp1;
    }

    public int getInp2()
    {
        return inp2;
    }

    public void setInp2(int inp2)
    {
        this.inp2 = inp2;
    }

    public int getInp3()
    {
        return inp3;
    }

    public void setInp3(int inp3)
    {
        this.inp3 = inp3;
    }

    public int getInp4()
    {
        return inp4;
    }

    public void setInp4(int inp4)
    {
        this.inp4 = inp4;
    }

    public int getInp5()
    {
        return inp5;
    }

    public void setInp5(int inp5)
    {
        this.inp5 = inp5;
    }

    public int getInp6()
    {
        return inp6;
    }

    public void setInp6(int inp6)
    {
        this.inp6 = inp6;
    }

    public int getInp7()
    {
        return inp7;
    }

    public void setInp7(int inp7)
    {
        this.inp7 = inp7;
    }

    public int getInp8()
    {
        return inp8;
    }

    public void setInp8(int inp8)
    {
        this.inp8 = inp8;
    }

    public int getRouletteSize()
    {
        return rouletteSize;
    }

    public void setRouletteSize(int rouletteSize)
    {
        this.rouletteSize = rouletteSize;
    }

    public List<AdminEventPointVO> getPointList()
    {
        return pointList;
    }

    public void setPointList(List<AdminEventPointVO> pointList)
    {
        this.pointList = pointList;
    }

    @Override
    public String toString()
    {
        return "AdminEventPointVO{" +
                "roulettePointTbNo=" + roulettePointTbNo +
                ", eventTbNo=" + eventTbNo +
                ", eventPoint=" + eventPoint +
                ", inp1=" + inp1 +
                ", inp2=" + inp2 +
                ", inp3=" + inp3 +
                ", inp4=" + inp4 +
                ", inp5=" + inp5 +
                ", inp6=" + inp6 +
                ", inp7=" + inp7 +
                ", inp8=" + inp8 +
                ", rouletteSize=" + rouletteSize +
                ", pointList=" + pointList +
                '}';
    }
}
