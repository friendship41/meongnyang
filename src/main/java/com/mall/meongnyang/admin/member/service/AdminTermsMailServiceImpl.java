package com.mall.meongnyang.admin.member.service;

import com.mall.meongnyang.admin.member.vo.AdminMemberVO;
import com.mall.meongnyang.util.mail.MailService;
import com.mall.meongnyang.util.mail.MailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminTermsMailServiceImpl implements AdminTermsMailService {
	@Autowired
    private MailService mailService;

	@Override
	public void send(MailVO mailVO, List<AdminMemberVO> memberList) {
	    mailVO.setContent("수정된 약관 전문입니다:<br>"+mailVO.getContent());
		try {
		    for (AdminMemberVO member : memberList)
            {
                mailVO.setTo(member.getCustomerTbEmail());
                mailService.sendMail(mailVO);
            }
        }
		catch (Exception e)
        {
            e.printStackTrace();
        }
	}
}