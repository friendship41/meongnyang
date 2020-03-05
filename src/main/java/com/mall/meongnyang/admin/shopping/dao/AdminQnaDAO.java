package com.mall.meongnyang.admin.shopping.dao;

import com.mall.meongnyang.admin.shopping.vo.AdminQnaVO;

import java.util.List;

public interface AdminQnaDAO {
	
	public AdminQnaVO selectQna(AdminQnaVO adminQnaVO);
	public List<AdminQnaVO> selectQnaList(AdminQnaVO adminQnaVO);
	public void insertQna(AdminQnaVO adminQnaVO);
	public void updateQna(AdminQnaVO adminQnaVO);
	public void deleteQna(AdminQnaVO adminQnaVO);
	public void updateStep(AdminQnaVO adminQnaVO);
	public void updateStepDepth(AdminQnaVO adminQnaVO);
	public void insertAdminQnaReply(AdminQnaVO adminQnaVO);
	public List<AdminQnaVO> selectNewQnalist(AdminQnaVO adminQnaVO);
}
