package com.mall.meongnyang.util.apiRequest.voFactory;

import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import com.mall.meongnyang.util.apiRequest.vo.RequestRestVO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.net.URI;
import java.net.URISyntaxException;

public class RequestVOFactoryImpl implements RequestVOFactory
{
    @Override
    public RequestRestVO getKakaoPayReadyRequestVO(ClientOrderVO clientOrderVO)
    {
        RequestRestVO requestRestVO = new RequestRestVO();
        requestRestVO.setMethod("POST");
        try
        {
            requestRestVO.setTargetUrl(new URI("https://kapi.kakao.com/v1/payment/ready"));
        }
        catch (URISyntaxException e)
        {
            e.printStackTrace();
        }


        HttpHeaders h = new HttpHeaders();
        h.add("Authorization","KakaoAK "+"03a55c21febbc010522ac2faa27b2e07");
        h.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        h.add("Content-Type", MediaType.APPLICATION_FORM_URLENCODED_VALUE+";charset=UTF-8");
        requestRestVO.setHeader(h);

        MultiValueMap<String,String> p = new LinkedMultiValueMap<>();
        p.add("cid","TC0ONETIME");
        p.add("partner_order_id", clientOrderVO.getPdOrderTbNo());
        p.add("partner_user_id", ""+clientOrderVO.getCustomerTbNo());
        p.add("item_name", clientOrderVO.getOrderRepProductName()+" 외 "+(clientOrderVO.getOrderDetailVOList().size()-1)+" 건");
        p.add("quantity", ""+clientOrderVO.getOrderDetailVOList().size());
        p.add("total_amount", ""+clientOrderVO.getPdOrderTbPayment());
        p.add("tax_free_amount","0");
        p.add("approval_url", "http://localhost:8080/kakaoPayApproval.do");
        p.add("cancel_url", "http://localhost:8080/kakaoPayCancel.do");
        p.add("fail_url","http://localhost:8080/kakaoPayFail.do");

        requestRestVO.setParamMap(p);

        return requestRestVO;
    }

    @Override
    public RequestRestVO getKakaoPayApprovedRequestVO(ClientOrderVO clientOrderVO)
    {
        RequestRestVO requestRestVO = new RequestRestVO();

        try
        {
            requestRestVO.setTargetUrl(new URI("https://kapi.kakao.com/v1/payment/approve"));
        }
        catch (URISyntaxException e)
        {
            e.printStackTrace();
        }


        HttpHeaders h = new HttpHeaders();
        h.add("Authorization","KakaoAK "+"03a55c21febbc010522ac2faa27b2e07");
        h.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        h.add("Content-Type", MediaType.APPLICATION_FORM_URLENCODED_VALUE+";charset=UTF-8");
        requestRestVO.setHeader(h);

        MultiValueMap<String,String> p = new LinkedMultiValueMap<>();
        p.add("cid","TC0ONETIME");
        p.add("tid", clientOrderVO.getTid());
        p.add("partner_order_id", clientOrderVO.getPdOrderTbNo());
        p.add("partner_user_id", ""+clientOrderVO.getCustomerTbNo());
        p.add("pg_token", clientOrderVO.getPg_token());
        p.add("payload", clientOrderVO.getOrderRepProductName()+" 외 "+(clientOrderVO.getOrderDetailVOList().size()-1)+" 건");
        p.add("total_amount", ""+clientOrderVO.getPdOrderTbPayment());

        requestRestVO.setParamMap(p);

        return requestRestVO;
    }
}
