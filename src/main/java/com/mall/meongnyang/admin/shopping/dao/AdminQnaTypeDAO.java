package com.mall.meongnyang.admin.shopping.dao;

import java.util.List;

import com.mall.meongnyang.admin.shopping.vo.AdminQnaTypeVO;

public interface AdminQnaTypeDAO {

	public void insertQnaType(AdminQnaTypeVO adminQnaTypeVO);
	public void deleteQnaType(AdminQnaTypeVO adminQnaTypeVO);
	public void updateQnaType(AdminQnaTypeVO adminQnaTypeVO);
	public List<AdminQnaTypeVO> selectQnaTypeList(AdminQnaTypeVO adminQnaTypeVO);
	public AdminQnaTypeVO selectQnaType(AdminQnaTypeVO adminQnaTypeVO);
	
}
