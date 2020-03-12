package com.mall.meongnyang.admin.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class AdminServiceLog
{


    public Object serviceRunLog(ProceedingJoinPoint joinPoint) throws Throwable
    {
        Logger logger = LoggerFactory.getLogger(joinPoint.getTarget().getClass());

        StringBuffer sb1 = new StringBuffer();
        sb1.append("(admin)method: ");
        sb1.append(joinPoint.getSignature().getName());
        StringBuffer sb2 = new StringBuffer();
        sb2 = new StringBuffer();
        sb2.append("(admin)params: ");
        sb2.append(Arrays.toString(joinPoint.getArgs()));

        logger.info(sb1.toString());
        logger.info(sb2.toString());

        Object result = joinPoint.proceed();

        sb1.append("-----end");

        logger.info(sb1.toString());

        return result;
    }
}
