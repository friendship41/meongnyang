package com.mall.meongnyang.client.member.service;

import com.google.gson.Gson;
import com.mall.meongnyang.client.member.vo.GoogleCustomerVO;
import com.mall.meongnyang.client.member.vo.GoogleToken;
import org.springframework.stereotype.Service;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.ServletException;
import java.io.*;
import java.net.URL;

@Service("GoogleLoginService")
public class GoogleLoginServiceImpl implements GoogleLoginService
{

    @Override
    public GoogleCustomerVO googleLogin(String code)
    {
        StringBuffer paramSb = new StringBuffer();
        paramSb.append("code=");
        paramSb.append(code);
        paramSb.append("&client_id=466559862469-rpts5vfh9qtqesurt0ovu2p7poq2ej39.apps.googleusercontent.com");
        paramSb.append("&client_secret=QG2fuX57pJ4q_bfYJVbTvKft");
        paramSb.append("&redirect_uri=http://ec2-3-135-222-11.us-east-2.compute.amazonaws.com");
        paramSb.append("&grant_type=authorization_code");

        GoogleCustomerVO googleCustomerVO = null;

        try
        {
            String tokenJson = getHttpConnection("https://accounts.google.com/o/oauth2/token", paramSb.toString());
            Gson gson = new Gson();
            GoogleToken token = gson.fromJson(tokenJson, GoogleToken.class);

            String ret = getHttpConnection("https://www.googleapis.com/oauth2/v1/userinfo?access_token="+token.getAccess_token());

            googleCustomerVO = gson.fromJson(ret, GoogleCustomerVO.class);

        }
        catch (ServletException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return googleCustomerVO;
    }


    private String getHttpConnection(String uri) throws ServletException, IOException {
        URL url = new URL(uri);
        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        int responseCode = conn.getResponseCode();
        String line;
        StringBuffer buffer = new StringBuffer();
        try (InputStream stream = conn.getInputStream()) {
            try (BufferedReader rd = new BufferedReader(new InputStreamReader(stream, "UTF-8"))) {
                while ((line = rd.readLine()) != null) {
                    buffer.append(line);
                }
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return buffer.toString();
    }


    private String getHttpConnection(String uri, String param) throws ServletException, IOException
    {
        URL url = new URL(uri);
        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        try (OutputStream stream = conn.getOutputStream()) {
            try (BufferedWriter wd = new BufferedWriter(new OutputStreamWriter(stream))) {
                wd.write(param);
            }
        }
        int responseCode = conn.getResponseCode();
        String line;
        StringBuffer buffer = new StringBuffer();
        try (InputStream stream = conn.getInputStream()) {
            try (BufferedReader rd = new BufferedReader(new InputStreamReader(stream))) {
                while ((line = rd.readLine()) != null) {
                    buffer.append(line);
                }
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return buffer.toString();
    }
}
