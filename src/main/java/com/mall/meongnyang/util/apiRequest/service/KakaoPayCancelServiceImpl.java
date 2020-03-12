package com.mall.meongnyang.util.apiRequest.service;

import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import com.mall.meongnyang.util.apiRequest.vo.KakaoPayCancelResponseVO;
import com.mall.meongnyang.util.apiRequest.vo.RequestRestVO;
import com.mall.meongnyang.util.apiRequest.voFactory.RequestVOFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class KakaoPayCancelServiceImpl implements KakaoPayCancelService
{
    @Autowired
    private RequestVOFactory requestVOFactory;

    @Override
    @Transactional
    public KakaoPayCancelResponseVO kakaopaycancel(ClientOrderVO clientOrderVO)
    {
        RestTemplate restTemplate = new RestTemplate();

        RequestRestVO requestRestVO = requestVOFactory.getKakaoPayCancelRequestVO(clientOrderVO);

        HttpEntity<MultiValueMap<String,String>> body = new HttpEntity<>(requestRestVO.getParamMap(), requestRestVO.getHeader());

        try
        {
            KakaoPayCancelResponseVO responseVO = restTemplate.postForObject(requestRestVO.getTargetUrl(), body, KakaoPayCancelResponseVO.class);
            return responseVO;
        }
        catch (RestClientException e)
        {
            e.printStackTrace();
        }

        return null;
    }
}
