package com.mall.meongnyang.util.apiRequest.service;

import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import com.mall.meongnyang.util.apiRequest.vo.KakaoPayApprovedResponseVO;
import com.mall.meongnyang.util.apiRequest.vo.RequestRestVO;
import com.mall.meongnyang.util.apiRequest.voFactory.RequestVOFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class KakaoPayApprovedServiceImpl implements KakaoPayApprovedService
{
    @Autowired
    private RequestVOFactory requestVOFactory;

    @Override
    public KakaoPayApprovedResponseVO kakaopayapproved(ClientOrderVO clientOrderVO)
    {
        RestTemplate restTemplate = new RestTemplate();

        RequestRestVO requestRestVO = requestVOFactory.getKakaoPayApprovedRequestVO(clientOrderVO);

        HttpEntity<MultiValueMap<String,String>> body = new HttpEntity<>(requestRestVO.getParamMap(), requestRestVO.getHeader());

        try
        {
            KakaoPayApprovedResponseVO responseVO = restTemplate.postForObject(requestRestVO.getTargetUrl(), body, KakaoPayApprovedResponseVO.class);
            return responseVO;
        }
        catch (RestClientException e)
        {
            e.printStackTrace();
        }

        return null;
    }
}
