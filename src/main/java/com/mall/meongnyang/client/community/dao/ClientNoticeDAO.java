package com.mall.meongnyang.client.community.dao;

import java.util.List;

import com.mall.meongnyang.admin.shopping.vo.AdminNoticeVO;

public interface ClientNoticeDAO {

	public List<AdminNoticeVO> selectNoticeList(AdminNoticeVO adminNoticeVO);
    public AdminNoticeVO selectNotice(AdminNoticeVO adminNoticeVO);
    
    int selectCountNotice();
    
   
   
  
   
    
    
    
}
