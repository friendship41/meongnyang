package com.mall.meongnyang.client.community.dao;

import java.util.List;


import com.mall.meongnyang.client.community.vo.ClientNoticeVO;

public interface ClientNoticeDAO {

	public List<ClientNoticeVO> selectNoticeList(ClientNoticeVO clientNoticeVO);
    public ClientNoticeVO selectNotice(ClientNoticeVO clientNoticeVO);
    
}
