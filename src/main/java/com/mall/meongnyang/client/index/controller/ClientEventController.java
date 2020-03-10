package com.mall.meongnyang.client.index.controller;

import com.mall.meongnyang.admin.marketing.vo.AdminEventAttendenceVO;
import com.mall.meongnyang.admin.marketing.vo.AdminEventVO;
import com.mall.meongnyang.client.member.service.ClientInsertEventAttendenceService;
import com.mall.meongnyang.client.member.service.ClientSelectAvailableEventService;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class ClientEventController
{
    @Autowired
    private ClientSelectAvailableEventService clientSelectAvailableEventService;
    @Autowired
    private ClientInsertEventAttendenceService clientInsertEventAttendenceService;

    @RequestMapping(value = "/eventStart.do")
    public String eventStartPage(HttpSession session, Model model)
    {
        model.addAttribute("eventInfo", clientSelectAvailableEventService.selectAvailableEvent(new AdminEventVO()));
        session.setAttribute("eventGo","f");
        return "event/event";
    }

    @RequestMapping(value = "/eventFinish.do", method = RequestMethod.GET)
    public String eventFinishProc(AdminEventAttendenceVO adminEventAttendenceVO, HttpSession session)
    {
        ClientCustomerVO clientCustomerVO = (ClientCustomerVO) session.getAttribute("customer");
        adminEventAttendenceVO.setCustomerTbNo(clientCustomerVO.getCustomerTbNo());
        clientInsertEventAttendenceService.insertAttendence(adminEventAttendenceVO);
        return "redirect:index.do";
    }
}
