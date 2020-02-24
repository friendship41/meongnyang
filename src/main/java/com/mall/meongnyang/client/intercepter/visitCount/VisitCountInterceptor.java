package com.mall.meongnyang.client.intercepter.visitCount;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class VisitCountInterceptor extends HandlerInterceptorAdapter
{
    VisitCounter visitCounter;

    public VisitCountInterceptor()
    {
    }
    public VisitCountInterceptor(VisitCounter visitCounter)
    {
        this.visitCounter = visitCounter;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
    {
        HttpSession session = request.getSession();
        String cntState = (String)session.getAttribute("visitCntOk");
        if(cntState == null)
        {
            visitCounter.setVisitCount(visitCounter.getVisitCount()+1);
            session.setAttribute("visitCntOk", "o");
        }

        return true;
    }
}
