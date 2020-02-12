package com.mall.meongnyang.client.community.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.admin.shopping.vo.AdminNoticeVO;


@Repository("ClientNoticeDAO")
public class ClientNoticeDAOImpl implements ClientNoticeDAO{
	
	@Autowired
    private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<AdminNoticeVO> selectNoticeList(AdminNoticeVO adminNoticeVO) {
		
		return sqlSessionTemplate.selectList("NoticeDAO.selectNoticeList", adminNoticeVO);
	}

	@Override
	public AdminNoticeVO selectNotice(AdminNoticeVO adminNoticeVO) {
		
		return sqlSessionTemplate.selectOne("NoticeDAO.selectNotice", adminNoticeVO);
	}

	 
}
