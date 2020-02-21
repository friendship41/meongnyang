package com.mall.meongnyang.util.apiRequest.vo;

import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;

import java.net.URI;

public class RequestRestVO
{
    private String method;
    private URI targetUrl;
    private HttpHeaders header;
    private MultiValueMap<String, String> paramMap;

    public String getMethod()
    {
        return method;
    }

    public void setMethod(String method)
    {
        this.method = method;
    }

    public URI getTargetUrl()
    {
        return targetUrl;
    }

    public void setTargetUrl(URI targetUrl)
    {
        this.targetUrl = targetUrl;
    }

    public HttpHeaders getHeader()
    {
        return header;
    }

    public void setHeader(HttpHeaders header)
    {
        this.header = header;
    }

    public MultiValueMap<String, String> getParamMap()
    {
        return paramMap;
    }

    public void setParamMap(MultiValueMap<String, String> paramMap)
    {
        this.paramMap = paramMap;
    }
}
