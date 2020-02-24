package com.mall.meongnyang.util.apiRequest.service;

import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import com.mall.meongnyang.util.apiRequest.vo.KakaoPayReadyResponseVO;
import com.mall.meongnyang.util.apiRequest.vo.RequestRestVO;
import com.mall.meongnyang.util.apiRequest.voFactory.RequestVOFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class KakaoPayReadyServiceImpl implements KakaoPayReadyService
{
    @Autowired
    private RequestVOFactory requestVOFactory;

    @Override
    public KakaoPayReadyResponseVO kakaoPayReady(ClientOrderVO clientOrderVO)
    {
        RequestRestVO requestRestVO = requestVOFactory.getKakaoPayReadyRequestVO(clientOrderVO);

        HttpEntity<MultiValueMap<String,String>> body = new HttpEntity<>(requestRestVO.getParamMap(),requestRestVO.getHeader());

        RestTemplate restTemplate = new RestTemplate();
        KakaoPayReadyResponseVO responseVO = null;
        try
        {
            responseVO = restTemplate.postForObject(requestRestVO.getTargetUrl(), body, KakaoPayReadyResponseVO.class);
            return responseVO;
        }
        catch (RestClientException e)
        {
            e.printStackTrace();
        }

        return null;
    }
}
