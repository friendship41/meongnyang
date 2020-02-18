package com.mall.meongnyang.client.community.dao;

import java.util.List;

import com.mall.meongnyang.admin.shopping.vo.AdminQnaVO;

public interface ClientQnaDAO {

	
	public void insertQna(AdminQnaVO adminQnaVO);
	public void updateQna(AdminQnaVO adminQnaVO);
	public void deleteQna(AdminQnaVO adminQnaVO);
	public List<AdminQnaVO> selectQnaList(AdminQnaVO adminQnaVO);
	public AdminQnaVO selectQna(AdminQnaVO adminQnaVO);
}
