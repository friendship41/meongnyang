package com.mall.meongnyang.client.community.service;

import java.util.List;

import com.mall.meongnyang.admin.shopping.vo.AdminQnaVO;

public interface ClientSelectQnaListService {
	public List<AdminQnaVO> selectQnaList(AdminQnaVO adminQnaVO);
	public int selectCountQna();
}
