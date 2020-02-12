package com.mall.meongnyang.util.codeGen;

import java.util.UUID;

public class GenerateCode
{
    public synchronized String generateProductCode()
    {
        StringBuffer code = new StringBuffer(UUID.randomUUID().toString());
        code.deleteCharAt(8);
        code.deleteCharAt(12);
        code.deleteCharAt(16);
        code.deleteCharAt(20);
        return code.substring(0,20);
    }

    public synchronized String generateImageName()
    {
        StringBuffer code = new StringBuffer(UUID.randomUUID().toString());
        code.deleteCharAt(8);
        code.deleteCharAt(12);
        code.deleteCharAt(16);
        code.deleteCharAt(20);
        return code.substring(0,12);
    }

    public synchronized String generateOrderCode()
    {
        // 8자 날짜 + 4자
        StringBuffer code = new StringBuffer(UUID.randomUUID().toString());
        code.deleteCharAt(8);
        code.deleteCharAt(12);
        code.deleteCharAt(16);
        code.deleteCharAt(20);
        return code.substring(0,20);
    }
}
