package com.mall.meongnyang.admin.member.service;

import java.util.List;

import javax.inject.Inject;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.member.vo.AdminMemberVO;
import com.mall.meongnyang.admin.member.vo.AdminTermsMailVO;

@Service
public class AdminTermsMailServiceImpl implements AdminTermsMailService {
	@Inject
	JavaMailSender mailSender;
	
	
	
	
	@Override
	public void send(AdminTermsMailVO mailVO, List<AdminMemberVO> memberList) {
		try {
            // ¿Ã∏ﬁ¿œ ∞¥√º
            MimeMessage msg = mailSender.createMimeMessage();
 
            
            InternetAddress[] toAddr = new InternetAddress[memberList.size()];
            for(int i=0; i<memberList.size(); i++) {
            	toAddr[i] = new InternetAddress(memberList.get(i).getCustomerTbEmail());
            }
                        
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