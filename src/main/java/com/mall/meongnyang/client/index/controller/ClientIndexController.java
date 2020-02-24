package com.mall.meongnyang.client.index.controller;

import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import com.mall.meongnyang.client.index.service.ClientSelectIndexBannerList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ClientIndexController
{
    @Autowired
    private ClientSelectIndexBannerList clientSelectIndexBannerList;

    @RequestMapping("/index.do")
    public String indexPage(Model model)
    {
        List<AdminProductVO> bannerList = clientSelectIndexBannerList.selectBannerImgs(new AdminProductVO());
        System.out.println(bannerList);
        model.addAttribute("bannerList", bannerList);

        return "index";
    }

}
