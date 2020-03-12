package com.mall.meongnyang.client.intercepter.menu;

import java.util.Map;

public class MenuVO
{
    private Map<String, Map<Integer,String>> menu;

    public Map<String, Map<Integer, String>> getMenu()
    {
        return menu;
    }

    public void setMenu(Map<String, Map<Integer, String>> menu)
    {
        this.menu = menu;
    }
}
