package com.mall.meongnyang.admin.member.service;

import com.mall.meongnyang.admin.member.dao.AdminMemberDAO;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AdminSelectAgreeMailCustomerListService")
public class AdminSelectAgreeMailCustomerListServiceImpl implements AdminSelectAgreeMailCustomerListService
{
    @Autowired
    private AdminMemberDAO adminMemberDAO;


    @Override
    public List<ClientCustomerVO> selectMailAgreeCustomerList(ClientCustomerVO clientCustomerVO)
    {
        return adminMemberDAO.selectMailAgreeCustomerList(clientCustomerVO);
    }
}
