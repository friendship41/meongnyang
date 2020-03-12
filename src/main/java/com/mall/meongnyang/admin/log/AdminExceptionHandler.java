package com.mall.meongnyang.admin.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;


@ControllerAdvice("com.mall.meongnyang.client")
public class AdminExceptionHandler
{
    @ExceptionHandler(Exception.class)
    public ModelAndView allException(Exception e)
    {
        Logger logger = LoggerFactory.getLogger(e.getClass());
        logger.error("-------------------Admin Error-----------------");
        logger.error(e.getMessage());
        logger.error("-----------------------------------------------");
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.setViewName("include/error");
        return mav;
    }
}
