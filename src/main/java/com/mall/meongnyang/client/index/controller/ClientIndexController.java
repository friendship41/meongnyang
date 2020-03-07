package com.mall.meongnyang.client.index.controller;

import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import com.mall.meongnyang.client.index.service.ClientSelectIndexBannerList;
import com.mall.meongnyang.client.index.service.ClientSelectIndexBestSellerListService;
import com.mall.meongnyang.client.index.service.ClientSelectIndexRecentMarketListService;
import com.mall.meongnyang.client.index.service.ClientSelectNewArrivalsProductListService;
import com.mall.meongnyang.client.market.vo.ClientMarketVO;
import com.mall.meongnyang.client.member.controller.NaverLoginBO;
import com.mall.meongnyang.client.member.service.ClientUpdateRegistryStateService;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
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
    @Autowired
    private NaverLoginBO naverLoginBO;


    @Autowired
    private void setNaverLoginBO(NaverLoginBO naverLoginBO) {
        this.naverLoginBO = naverLoginBO;
    }


    @RequestMapping(value = "/needLogin.do")
    public String needLogin()
    {
        return "include/needLogin";
    }

    @RequestMapping("/index.do")
    public String indexPage(Model model, ClientCustomerVO clientCustomerVO, HttpSession session)
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


//        네이버관련
        /* 네이버아이디로 인증 URL을 생성하기 위하여 naverLoginBO클래스의 getAuthorizationUrl메소드 호출 */
        String naverAuthUrl = naverLoginBO.getAuthorizationUrl(session);

        //https://nid.naver.com/oauth2.0/authorize?response_type=code&client_id=sE***************&
        //redirect_uri=http%3A%2F%2F211.63.89.90%3A8090%2Flogin_project%2Fcallback&state=e68c269c-5ba9-4c31-85da-54c16c658125
//        System.out.println("네이버:" + naverAuthUrl);

        //네이버
        model.addAttribute("url", naverAuthUrl);


        return "index";
    }

}
