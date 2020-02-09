package com.mall.meongnyang.util.mail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

public class MailServiceImpl implements MailService
{
    @Override
    public void sendMail(MailVO mailVO)
    {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.naver.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Authenticator auth = new AuthMailServer();

        Session session = Session.getDefaultInstance(props,auth);
        MimeMessage msg = new MimeMessage(session);

        try
        {
            msg.setSentDate(new Date());

            InternetAddress from = new InternetAddress(mailVO.getFrom());

            msg.setFrom(from);

            InternetAddress to = new InternetAddress(mailVO.getTo());
            msg.setRecipient(Message.RecipientType.TO, to);

            msg.setSubject(mailVO.getSubject(), "UTF-8");

            msg.setText(mailVO.getContent(), "UTF-8");

            msg.setHeader("content-Type", "text/html");

            Transport.send(msg);
        }
        catch (MessagingException e)
        {
            e.printStackTrace();
        }
    }
}
