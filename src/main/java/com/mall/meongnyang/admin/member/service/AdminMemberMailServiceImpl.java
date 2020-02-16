package com.mall.meongnyang.admin.member.service;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.member.dao.AdminMemberDAO;
import com.mall.meongnyang.admin.member.vo.AdminMemberVO;
import com.mall.meongnyang.util.mail.AuthMailServer;
import com.mall.meongnyang.util.mail.MailService;
import com.mall.meongnyang.util.mail.MailVO;

@Service("AdminMemberMailService")
public class AdminMemberMailServiceImpl implements AdminMemberMailService {

	@Autowired
	private AdminMemberDAO adminMemberDAO;

	@Autowired
	private MailService mailService;

	@Override
	public void sendMail(MailVO mailVO) {
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.naver.com");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.auth", "true");

		Authenticator auth = new AuthMailServer();

		Session session = Session.getDefaultInstance(props, auth);
		MimeMessage msg = new MimeMessage(session);

		try {
			msg.setSentDate(new Date());

			InternetAddress from = new InternetAddress(mailVO.getFrom());

			msg.setFrom(from);

			InternetAddress to = new InternetAddress(mailVO.getTo());
			msg.setRecipient(Message.RecipientType.TO, to);

			msg.setSubject(mailVO.getSubject(), "UTF-8");

			msg.setText(mailVO.getContent(), "UTF-8");

			msg.setHeader("content-Type", "text/html");

			Transport.send(msg);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

}
