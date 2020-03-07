package com.mall.meongnyang.util.mail;


import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class AuthMailServer extends Authenticator
{
    private PasswordAuthentication pa;

    public AuthMailServer()
    {
        String id = "poo963369";
        String pw = "########";     //비밀번호

        pa = new PasswordAuthentication(id, pw);
    }

    public PasswordAuthentication getPasswordAuthentication()
    {
        return pa;
    }
}
