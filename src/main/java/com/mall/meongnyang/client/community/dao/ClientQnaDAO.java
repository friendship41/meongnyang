package com.mall.meongnyang.client.community.dao;

import com.mall.meongnyang.admin.shopping.vo.AdminQnaTypeVO;
import com.mall.meongnyang.admin.shopping.vo.AdminQnaVO;

import java.util.List;

public interface ClientQnaDAO {

	
	public void insertQnaReply(AdminQnaVO adminQnaVO);
	public void updateQna(AdminQnaVO adminQnaVO);
	public void deleteQna(AdminQnaVO adminQnaVO);
	public List<AdminQnaVO> selectQnaList(AdminQnaVO adminQnaVO);
	public AdminQnaVO selectQna(AdminQnaVO adminQnaVO);
	public List<AdminQnaTypeVO> selectQnaTypeList(AdminQnaTypeVO adminQnaTypeVO);
	public int selectCountQna();
	public void updateReadcountQna(int qnaTbNo);
	public void updateStep(AdminQnaVO adminQnaVO);
	public void updateStepDepth(AdminQnaVO adminQnaVO);
	public void insertNewQna(AdminQnaVO adminQnaVO);
	
}
