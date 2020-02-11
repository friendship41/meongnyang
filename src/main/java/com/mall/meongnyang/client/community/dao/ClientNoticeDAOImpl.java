package com.mall.meongnyang.client.community.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.client.community.vo.ClientNoticeVO;

@Repository("ClientNoticeDAO")
public class ClientNoticeDAOImpl implements ClientNoticeDAO{
	
	@Autowired
    private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<ClientNoticeVO> selectNoticeList(ClientNoticeVO clientNoticeVO) {
		
		return sqlSessionTemplate.selectList("NoticeDAO.selectNoticeList", clientNoticeVO);
	}

	@Override
	public ClientNoticeVO selectNotice(ClientNoticeVO clientNoticeVO) {
		
		return sqlSessionTemplate.selectOne("NoticeDAO.selectClientNotice", clientNoticeVO);
	}

	 
}
