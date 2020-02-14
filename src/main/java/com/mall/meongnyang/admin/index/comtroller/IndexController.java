package com.mall.meongnyang.admin.index.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController
{
    @RequestMapping("/index.ado")
    public String indexPage()
    {
        return "index";
    }
}
