package com.mall.meongnyang.client.index.controller;

import com.mall.meongnyang.admin.marketing.vo.AdminEventVO;
import com.mall.meongnyang.client.member.service.ClientSelectAvailableEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class ClientEventController
{
    @Autowired
    private ClientSelectAvailableEventService clientSelectAvailableEventService;

    @RequestMapping(value = "/eventStart.do")
    public String eventStartPage(HttpSession session, Model model)
    {
        model.addAttribute("eventInfo", clientSelectAvailableEventService.selectAvailableEvent(new AdminEventVO()));
        session.setAttribute("eventGo","f");
        return "event/event";
    }
}
