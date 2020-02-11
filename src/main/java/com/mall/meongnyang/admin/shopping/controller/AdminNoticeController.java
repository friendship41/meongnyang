package com.mall.meongnyang.admin.shopping.controller;

import com.mall.meongnyang.admin.shopping.service.*;
import com.mall.meongnyang.admin.shopping.vo.AdminNoticeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
        List<AdminNoticeVO> adminNoticeList = adminSelectNoticeListService.selectNoticeList(new AdminNoticeVO());

        model.addAttribute("adminNoticeList", adminNoticeList);

        return "shoppingmall/shoppingmall-notice-list";
    }

    @RequestMapping(value = "/shoppingmall-notice-write.ado", method = RequestMethod.GET)
    public String noticeWriteForm()
    {
        return "shoppingmall/shoppingmall-notice-write";
    }

    @RequestMapping(value = "/shoppingmall-notice-write.ado", method = RequestMethod.POST)
    public String noticeWriteProc(AdminNoticeVO adminNoticeVO)
    {
        adminInsertNoticeService.insertNotice(adminNoticeVO);
        return "redirect:/shoppingmall-notice-list.ado";
    }

    @RequestMapping(value = "/shoppingmall-notice-read.ado", method = RequestMethod.GET)
    public String noticeRead(AdminNoticeVO adminNoticeVO, Model model)
    {
        AdminNoticeVO tempVO = adminSelectNoticeService.selectNotice(adminNoticeVO);

        model.addAttribute("adminNoticeVO", tempVO);

        return "shoppingmall/shoppingmall-notice-read";
    }

    @RequestMapping(value = "/shoppingmall-notice-read.ado", method = RequestMethod.POST)
    public String noticeUpdate(AdminNoticeVO adminNoticeVO)
    {
        adminUpdateNoticeService.updateNotice(adminNoticeVO);

        return "redirect:/shoppingmall-notice-list.ado";
    }

    @RequestMapping(value = "/shoppingmall-notice-delete.ado", method = RequestMethod.GET)
    public String noticeDelete(AdminNoticeVO adminNoticeVO)
    {
        adminDeleteNoticeService.deleteNotice(adminNoticeVO);

        return "redirect:/shoppingmall-notice-list.ado";
    }

}
