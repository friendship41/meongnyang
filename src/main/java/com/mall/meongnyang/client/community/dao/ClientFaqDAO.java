package com.mall.meongnyang.client.community.dao;

import java.util.List;

import com.mall.meongnyang.client.community.vo.ClientFaqVO;

public interface ClientFaqDAO {
		
	
	public List<ClientFaqVO> selectFaqList(ClientFaqVO clientVo); 
		
}
