package com.mall.meongnyang.admin.member.service;

import com.mall.meongnyang.client.member.vo.ClientCustomerVO;

import java.util.List;

public interface AdminSelectAgreeMailCustomerListService
{
    public List<ClientCustomerVO> selectMailAgreeCustomerList(ClientCustomerVO clientCustomerVO);
}
