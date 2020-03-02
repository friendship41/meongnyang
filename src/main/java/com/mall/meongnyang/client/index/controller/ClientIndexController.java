package com.mall.meongnyang.client.index.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import com.mall.meongnyang.client.index.service.ClientSelectIndexBannerList;
import com.mall.meongnyang.client.member.service.ClientUpdateRegistryStateService;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;

@Controller
public class ClientIndexController
{
    @Autowired
    private ClientSelectIndexBannerList clientSelectIndexBannerList;

    @Autowired
    private ClientUpdateRegistryStateService clientUpdateRegistryStateService;
    
    @RequestMapping("/index.do")
    public String indexPage(Model model, ClientCustomerVO clientCustomerVO)
    {
    	if(clientCustomerVO.getCustomerTbState() != null ) {
    	clientUpdateRegistryStateService.updateState(clientCustomerVO);
    	model.addAttribute("emailCertification", true);
    	}
        List<AdminProductVO> bannerList = clientSelectIndexBannerList.selectBannerImgs(new AdminProductVO());
        System.out.println(bannerList);
        model.addAttribute("bannerList", bannerList);

        return "index";
    }

}
