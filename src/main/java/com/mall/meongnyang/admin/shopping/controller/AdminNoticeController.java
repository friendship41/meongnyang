package com.mall.meongnyang.admin.shopping.controller;

import com.mall.meongnyang.admin.shopping.service.*;
import com.mall.meongnyang.admin.shopping.vo.AdminNoticeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AdminNoticeController
{
    @Autowired
    private AdminInsertNoticeService adminInsertNoticeService;
    @Autowired
    private AdminUpdateNoticeService adminUpdateNoticeService;
    @Autowired
    private AdminDeleteNoticeService adminDeleteNoticeService;
    @Autowired
    private AdminSelectNoticeListService adminSelectNoticeListService;
    @Autowired
    private AdminSelectNoticeService adminSelectNoticeService;


    @RequestMapping(value = "/shoppingmall-notice-list.ado", method = RequestMethod.GET)
    public String noticeList(Model model)
    {
        List<AdminNoticeVO> list = adminSelectNoticeListService.selectNoticeList(new AdminNoticeVO());

        model.addAttribute("adminNoticeList", list);

        return "shoppingmall/shoppingmall-notice-list";
    }

    @RequestMapping(value = "/shoppingmall-notice-write.ado", method = RequestMethod.GET)
    public String noticeWriteForm(HttpSession session)
    {
        session.setAttribute("id", "admin");
        return "shoppingmall/shoppingmall-notice-write";
    }

    @RequestMapping(value = "/shoppingmall-notice-write.ado", method = RequestMethod.POST)
    public String noticeWriteProc(AdminNoticeVO adminNoticeVO)
    {

        return "redirect:/shoppingmall-notice-list.ado";
    }


}
