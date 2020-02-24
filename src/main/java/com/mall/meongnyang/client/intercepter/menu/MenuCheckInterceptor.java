package com.mall.meongnyang.client.intercepter.menu;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MenuCheckInterceptor extends HandlerInterceptorAdapter
{
    ClientSelectProductCategoryListService clientSelectProductCategoryListService;

    public MenuCheckInterceptor()
    {
    }
    public MenuCheckInterceptor(ClientSelectProductCategoryListService clientSelectProductCategoryListService)
    {
        this.clientSelectProductCategoryListService = clientSelectProductCategoryListService;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
    {
        HttpSession session = request.getSession();
        MenuVO menuVO = (MenuVO) session.getAttribute("menu");
        if(menuVO == null)
        {
            session.setAttribute("menu", clientSelectProductCategoryListService.getMenu());
        }
        return true;
    }
}
