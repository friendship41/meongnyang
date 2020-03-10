package com.mall.meongnyang.admin.marketing.controller;

import com.mall.meongnyang.admin.marketing.service.*;
import com.mall.meongnyang.admin.marketing.vo.AdminEventPointVO;
import com.mall.meongnyang.admin.marketing.vo.AdminEventVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AdminEventController
{
    @Autowired
    private AdminSelectEventStartedService adminSelectEventStartedService;
    @Autowired
    private AdminSelectEventStartedPointListService adminSelectEventStartedPointListService;
    @Autowired
    private AdminInsertEventAndPointService adminInsertEventAndPointService;
    @Autowired
    private AdminUpdateEventPointListService adminUpdateEventPointListService;
    @Autowired
    private AdminUpdateEventService adminUpdateEventService;


    @RequestMapping(value = "/event.ado", method = RequestMethod.GET)
    public String goToEventPage(Model model)
    {
        AdminEventVO adminEventVO = adminSelectEventStartedService.selectEventStarted(new AdminEventVO());
        if(adminEventVO != null && adminEventVO.getEventTbNo() != 0)
        {
            model.addAttribute("nowEvent", adminEventVO);
            model.addAttribute("nowEventPoint", adminSelectEventStartedPointListService.selectAllEventPointList(adminEventVO));
        }
        return "marketing/event";
    }

    @RequestMapping(value = "/insertEvent.ado", method = RequestMethod.POST)
    public String insertEvent(AdminEventVO adminEventVO, AdminEventPointVO adminEventPointVO, HttpServletRequest request)
    {
        adminInsertEventAndPointService.insertEventAndPoint(adminEventVO, adminEventPointVO, request);
        return "redirect:event.ado";
    }

    @RequestMapping(value = "/updateEvent.ado", method = RequestMethod.POST)
    public String updateEvent(AdminEventVO adminEventVO, AdminEventPointVO adminEventPointVO, HttpServletRequest request)
    {
        adminUpdateEventPointListService.updateEventPoint(adminEventPointVO);
        adminUpdateEventService.updateEvent(adminEventVO, request);
        return "redirect:event.ado";
    }

}
