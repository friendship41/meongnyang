package com.mall.meongnyang.client.member.service;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mall.meongnyang.client.member.dao.ClientLoginDAO;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

@Service
public class ClientKaLoginServiceImpl implements ClientKaLoginService{

	@Autowired
	private ClientLoginDAO clientLoginDAO;
	
	@Override
	public void insertKakao(ClientCustomerVO clientCustomerVO) {
		clientLoginDAO.insertKakao(clientCustomerVO);
	}
	
	@Override
	public HashMap<String, Object> getKakaoAccessToken(String authorize_code) {
        HashMap<String, Object> token = new HashMap<String, Object>();
        String reqURL = "https://kauth.kakao.com/oauth/token";
        
        try {
            URL url = new URL(reqURL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            
            //    POST 요청을 위해 기본값이 false인 setDoOutput을 true로
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            
            //    POST 요청에 필요로 요구하는 파라미터 스트림을 통해 전송
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
            StringBuilder sb = new StringBuilder();
            sb.append("grant_type=authorization_code");
            sb.append("&client_id=979aa4be781f57e07a085e52b0e8a729");
            sb.append("&redirect_uri=http://ec2-3-135-222-11.us-east-2.compute.amazonaws.com/klogin.do");
            sb.append("&code=" + authorize_code);
            bw.write(sb.toString());
            bw.flush();
            
            //    결과 코드가 200이라면 성공
            int responseCode = conn.getResponseCode();
//          System.out.println("responseCode : " + responseCode);
 
            //    요청을 통해 얻은 JSON타입의 Response 메세지 읽어오기
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = "";
            String result = "";
            
            while ((line = br.readLine()) != null) {
                result += line;
            }
            
            //    Gson 라이브러리에 포함된 클래스로 JSON파싱 객체 생성
            JsonParser parser = new JsonParser();
            JsonElement element = parser.parse(result);
            
            token.put("accessToken", element.getAsJsonObject().get("access_token").getAsString());
            token.put("refreshToken", element.getAsJsonObject().get("refresh_token").getAsString());
            
            br.close();
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        
        return token;
    }
	
	@Override
	public ClientCustomerVO getKakaoUserInfo(HashMap<String, Object> token) {
	    
			ClientCustomerVO clientCustomerVO = new ClientCustomerVO();
			String nickName = "";
			String email = "";
			
		    String reqURL = "https://kapi.kakao.com/v2/user/me";
		    try {
		        URL url = new URL(reqURL);
		        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		        conn.setRequestMethod("POST");
		        
		        // 요청에 필요한 Header에 포함될 내용
		        conn.setRequestProperty("Authorization", "Bearer " + token.get("accessToken"));
		        
		        // TODO 카카오톡 API를 참고하여 responseCode를 이용해 예외 처리
		        int responseCode = conn.getResponseCode();
//		        System.out.println("responseCode : " + responseCode);
		        
		        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
		        
		        String line = "";
		        String result = "";
		        
		        while ((line = br.readLine()) != null) {
		            result += line;
		        }
		        
		        JsonParser parser = new JsonParser();
		        JsonElement element = parser.parse(result);
		        
		        JsonObject properties = element.getAsJsonObject().get("properties").getAsJsonObject();
		        JsonObject kakaoAccount = element.getAsJsonObject().get("kakao_account").getAsJsonObject();

		        // properties와 kakaoAccount JSON 값에 key 이름으로 nickname과 email이 있는 지 체크
		        // 해당 코드가 없으면 카카오 사용자가 email 값이 없는 경우 key 이름 자체가 없어서 nullpointerexception 발생! 
		        if (properties.getAsJsonObject().has("nickname"))
		        	nickName = properties.getAsJsonObject().get("nickname").getAsString();
		        
		        if (kakaoAccount.getAsJsonObject().has("email"))
		        	email = kakaoAccount.getAsJsonObject().get("email").getAsString();

		        if(email == null || email.equals(""))
                {
                    email = ""+element.getAsJsonObject().get("id").getAsInt();
                }

		        clientCustomerVO.setCustomerTbName(nickName);
		        clientCustomerVO.setCustomerTbEmail(email);
		        
		    } catch (IOException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    }
		    
		    return clientCustomerVO;
		}

	@Override
	public HashMap<String, Object> updateKakaoAccessToken(ClientCustomerVO clientCustomerVO) {
		HashMap<String, Object> token = new HashMap<String, Object>();
        String reqURL = "https://kauth.kakao.com/oauth/token";
        
        try {
            URL url = new URL(reqURL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            
            //    POST 요청을 위해 기본값이 false인 setDoOutput을 true로
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            
            //    POST 요청에 필요로 요구하는 파라미터 스트림을 통해 전송
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
            StringBuilder sb = new StringBuilder();
            sb.append("grant_type=refresh_token");
            sb.append("&client_id=979aa4be781f57e07a085e52b0e8a729");
            sb.append("&refresh_token=" + clientCustomerVO.getCustomerTbPhone());
            bw.write(sb.toString());
            bw.flush();
            
            //    결과 코드가 200이라면 성공
            int responseCode = conn.getResponseCode();
            //System.out.println("responseCode : " + responseCode);
 
            //    요청을 통해 얻은 JSON타입의 Response 메세지 읽어오기
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = "";
            String result = "";
            
            while ((line = br.readLine()) != null) {
                result += line;
            }
            
            //    Gson 라이브러리에 포함된 클래스로 JSON파싱 객체 생성
            JsonParser parser = new JsonParser();
            JsonElement element = parser.parse(result);
            
            token.put("accessToken", element.getAsJsonObject().get("access_token").getAsString());
            token.put("refreshToken", element.getAsJsonObject().get("refresh_Token").getAsString());
            
            br.close();
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        
        return token;
    }
	
}
