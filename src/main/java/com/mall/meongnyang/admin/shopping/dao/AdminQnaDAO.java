package com.mall.meongnyang.admin.shopping.dao;

import java.util.List;

import com.mall.meongnyang.admin.shopping.vo.AdminQnaVO;

public interface AdminQnaDAO {
	
	public AdminQnaVO selectQna(AdminQnaVO adminQnaVO);
	public List<AdminQnaVO> selectQnaList(AdminQnaVO adminQnaVO);
	public void insertQna(AdminQnaVO adminQnaVO);
	public void updateQna(AdminQnaVO adminQnaVO);
	public void deleteQna(AdminQnaVO adminQnaVO);
	public void updateStep(AdminQnaVO adminQnaVO);
}
