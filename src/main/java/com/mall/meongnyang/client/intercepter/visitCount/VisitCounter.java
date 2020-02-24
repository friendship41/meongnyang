package com.mall.meongnyang.client.intercepter.visitCount;

public class VisitCounter
{
    private int visitCount;

    public int getVisitCount()
    {
        return visitCount;
    }

    public void setVisitCount(int visitCount)
    {
        this.visitCount = visitCount;
    }

    @Override
    public String toString()
    {
        return "visitCounter{" +
                "visitCount=" + visitCount +
                '}';
    }
}
