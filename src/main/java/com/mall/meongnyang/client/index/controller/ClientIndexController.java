package com.mall.meongnyang.client.index.controller;

import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import com.mall.meongnyang.client.index.service.ClientSelectIndexBannerList;
import com.mall.meongnyang.client.index.service.ClientSelectIndexBestSellerListService;
import com.mall.meongnyang.client.index.service.ClientSelectIndexRecentMarketListService;
import com.mall.meongnyang.client.index.service.ClientSelectNewArrivalsProductListService;
import com.mall.meongnyang.client.market.vo.ClientMarketVO;
import com.mall.meongnyang.client.member.service.ClientUpdateRegistryStateService;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
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
    @Autowired
    private ClientUpdateRegistryStateService clientUpdateRegistryStateService;
    @Autowired
    private ClientSelectNewArrivalsProductListService clientSelectNewArrivalsProductListService;
    @Autowired
    private ClientSelectIndexBestSellerListService clientSelectIndexBestSellerListService;
    @Autowired
    private ClientSelectIndexRecentMarketListService clientSelectIndexRecentMarketListService;
    
    @RequestMapping("/index.do")
    public String indexPage(Model model, ClientCustomerVO clientCustomerVO)
    {
    	if(clientCustomerVO.getCustomerTbState() != null ) {
    	clientUpdateRegistryStateService.updateState(clientCustomerVO);
    	model.addAttribute("emailCertification", true);
    	}

        List<AdminProductVO> bannerList = clientSelectIndexBannerList.selectBannerImgs(new AdminProductVO());
        model.addAttribute("bannerList", bannerList);

        List<AdminProductVO> newArrivalsList = clientSelectNewArrivalsProductListService.selectNewArrivalList(new AdminProductVO());
        model.addAttribute("newArrivalsList", newArrivalsList);

        List<AdminProductVO> bestSellerList = clientSelectIndexBestSellerListService.selectBestSellerList(new AdminProductVO());
        model.addAttribute("bestSellerList", bestSellerList);

        List<ClientMarketVO> marketList = clientSelectIndexRecentMarketListService.selectRecentMarketList(new ClientMarketVO());
        model.addAttribute("marketList", marketList);

        return "index";
    }

}
