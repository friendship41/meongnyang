package com.mall.meongnyang.admin.member.service;

import javax.inject.Inject;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.member.vo.AdminTermsMailVO;

@Service
public class AdminTermsMailServiceImpl implements AdminTermsMailService {
	@Inject
	JavaMailSender mailSender;
	
	
	
	
	@Override
	public void send(AdminTermsMailVO mailVO) {
		try {
            // ¿Ã∏ﬁ¿œ ∞¥√º
            MimeMessage msg = mailSender.createMimeMessage();
 
          
            //msg.addRecipient(RecipientType.TO, new InternetAddress(mailVO.getReceiveMail()));
            InternetAddress[] toAddr = new InternetAddress[2];
            toAddr[0] = new InternetAddress("indeed85@naver.com");
            toAddr[1] = new InternetAddress("indeed85@hanmail.net");
            
            msg.addRecipients(RecipientType.TO, toAddr);
            
            msg.addFrom(new InternetAddress[] { new InternetAddress(mailVO.getSenderMail(), mailVO.getSenderName()) });
 
          
            msg.setSubject(mailVO.getSubject(), "utf-8");
           
            msg.setText(mailVO.getMessage(), "utf-8");
           
 
     
            mailSender.send(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		
	}
}
