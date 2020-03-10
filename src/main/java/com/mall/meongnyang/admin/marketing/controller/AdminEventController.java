package com.mall.meongnyang.admin.marketing.controller;

import com.mall.meongnyang.admin.marketing.service.AdminInsertEventAndPointService;
import com.mall.meongnyang.admin.marketing.service.AdminSelectEventStartedPointListService;
import com.mall.meongnyang.admin.marketing.service.AdminSelectEventStartedService;
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
        System.out.println(adminEventVO);
        System.out.println(adminEventPointVO);
        System.out.println(adminEventVO.getUploadFile());
        adminInsertEventAndPointService.insertEventAndPoint(adminEventVO, adminEventPointVO, request);
        return "redirect:event.ado";
    }
}
