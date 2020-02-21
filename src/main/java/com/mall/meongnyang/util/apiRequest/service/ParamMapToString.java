package com.mall.meongnyang.util.apiRequest.service;

import java.util.Map;
import java.util.Set;

public class ParamMapToString
{
    public String mapToString(Map<String,String> map)
    {
        try
        {
            StringBuffer sb = new StringBuffer();
            Set<String> keySet = map.keySet();
            for(String key : keySet)
            {
                sb.append(key);
                sb.append("=");
                sb.append(map.get(key));
                sb.append("&");
            }
            sb.deleteCharAt(sb.length()-1);
            return sb.toString();
        }
        catch (NullPointerException e)
        {
            return "";
        }
    }
}
