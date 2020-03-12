package com.mall.meongnyang.client.member.controller;

import com.mall.meongnyang.admin.marketing.vo.AdminEventAttendenceVO;
import com.mall.meongnyang.admin.marketing.vo.AdminEventVO;
import com.mall.meongnyang.client.member.service.ClientSelectAvailableEventService;
import com.mall.meongnyang.client.member.service.ClientSelectEventAttendenceService;
import com.mall.meongnyang.client.member.service.GoogleLoginProcService;
import com.mall.meongnyang.client.member.service.GoogleLoginService;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.client.member.vo.GoogleCustomerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class ClientGoogleLoginController
{
    @Autowired
    private GoogleLoginService googleLoginService;
    @Autowired
    private GoogleLoginProcService googleLoginProcService;
    @Autowired
    private ClientSelectAvailableEventService clientSelectAvailableEventService;
    @Autowired
    private ClientSelectEventAttendenceService clientSelectEventAttendenceService;


    @RequestMapping(value = "/googleLogin.do")
    @Transactional
    public String googleLoginProc(@RequestParam("code") String code, HttpSession session, Model model)
    {
        GoogleCustomerVO googleCustomerVO = googleLoginService.googleLogin(code);
        if (googleCustomerVO == null)
        {
            model.addAttribute("message", "로그인중 오류가 생겼습니다.");
            model.addAttribute("urldo","/index.do");
            return "include/message-and-go-urldo";
        }

        ClientCustomerVO customer = googleLoginProcService.googleLoginProc(googleCustomerVO);
        session.setAttribute("customer", customer);

        if (customer != null)
        {
            AdminEventVO event = clientSelectAvailableEventService.selectAvailableEvent(new AdminEventVO());
            if(event != null)
            {
                AdminEventAttendenceVO adminEventAttendenceVO = new AdminEventAttendenceVO();
                adminEventAttendenceVO.setCustomerTbNo(customer.getCustomerTbNo());
                adminEventAttendenceVO.setEventTbNo(event.getEventTbNo());
                boolean isEventAttended = clientSelectEventAttendenceService.checkAttendenceToday(adminEventAttendenceVO);
                if(isEventAttended)
                {
                    session.setAttribute("eventGo","f");
                }
                else
                {
                    session.setAttribute("eventGo","t");
                }
            }
        }


        return "redirect:index.do";
    }
}
