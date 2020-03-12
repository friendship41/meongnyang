package com.mall.meongnyang.admin.shopping.dao;

import java.util.List;

import com.mall.meongnyang.admin.shopping.vo.AdminFaqVO;

public interface AdminFaqDAO {

	//select
	public AdminFaqVO selectFaq(int num);
	
	//select list
	public List<AdminFaqVO> selectFaqList();
	
	//insert
	public void insertFaq(AdminFaqVO vo);
	
	//update
	public void updateFaq(AdminFaqVO vo);
}
