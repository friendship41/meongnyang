package com.mall.meongnyang.client.member.controller;

import com.mall.meongnyang.admin.marketing.vo.AdminEventAttendenceVO;
import com.mall.meongnyang.admin.marketing.vo.AdminEventVO;
import com.mall.meongnyang.client.member.service.*;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.client.member.vo.ClientTermsAgreeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class ClientKaLoginController
{

    @Autowired
    private ClientKaLoginService clientInsertKaLoginService;

    @Autowired
    private ClientSelectLoginService clientSelectLoginService;
    @Autowired
    private ClientSelectAvailableEventService clientSelectAvailableEventService;
    @Autowired
    private ClientSelectEventAttendenceService clientSelectEventAttendenceService;
    @Autowired
    private ClientInsertTermsAgreeListService clientInsertTermsAgreeListService;


    @RequestMapping(value = "/klogin.do")
    @Transactional
    public String klogin(@RequestParam("code") String code, HttpSession session, Model model)
    {
        HashMap<String, Object> token = clientInsertKaLoginService.getKakaoAccessToken(code);

        ClientCustomerVO clientCustomerVO = clientInsertKaLoginService.getKakaoUserInfo(token);
        ClientCustomerVO tempVO = clientSelectLoginService.selectLoginCheck(clientCustomerVO);

        // 최초 카카오톡 로그인 시 DB에 사용자 정보 삽입(회원가입)과 로그인을 동시에 처리
        // else if = 최초 카카오톡 로그인이 아닌 경우 DB 조회 후 로그인만 처리 (AccessToken 갱신 포함)
        // else = 카카오톡 로그인 실패
        if (tempVO == null)
        {
            clientInsertKaLoginService.insertKakao(clientCustomerVO);
			tempVO = clientSelectLoginService.selectLoginCheck(clientCustomerVO);
            session.setAttribute("customer", tempVO);

			ClientTermsAgreeVO clientTermsAgreeVO = new ClientTermsAgreeVO();
			clientTermsAgreeVO.setTermsTbNo(2);
			clientTermsAgreeVO.setCustomerTbNo(tempVO.getCustomerTbNo());
			clientTermsAgreeVO.setTermsAgreeTbConsentStatus("N");
            clientInsertTermsAgreeListService.insertTermsAgreeListService(clientTermsAgreeVO);

            return "redirect:/index.do";
        }
        else if (tempVO != null && clientCustomerVO.getCustomerTbPassword() != null)
        {
//			TODO DB 사용자의 accessToken과 updateToken을 업데이트 하는 서비스 필요
//			HashMap<String, Object> updateToken = clientInsertKaLoginService.updateKakaoAccessToken(clientCustomerVO);
            session.setAttribute("customer", tempVO);

            AdminEventVO event = clientSelectAvailableEventService.selectAvailableEvent(new AdminEventVO());
            if (event != null)
            {
                AdminEventAttendenceVO adminEventAttendenceVO = new AdminEventAttendenceVO();
                adminEventAttendenceVO.setCustomerTbNo(tempVO.getCustomerTbNo());
                adminEventAttendenceVO.setEventTbNo(event.getEventTbNo());
                boolean isEventAttended = clientSelectEventAttendenceService.checkAttendenceToday(adminEventAttendenceVO);
                if (isEventAttended)
                {
                    session.setAttribute("eventGo", "f");
                }
                else
                {
                    session.setAttribute("eventGo", "t");
                }
            }

            return "redirect:/index.do";
        }
        else
        {
            model.addAttribute("loginCheckSubmit", false);
            return "redirect:/index.do";
        }
    }

}
