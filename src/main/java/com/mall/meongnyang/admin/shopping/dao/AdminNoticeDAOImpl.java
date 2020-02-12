package com.mall.meongnyang.admin.shopping.dao;

import com.mall.meongnyang.admin.shopping.vo.AdminNoticeVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("AdminNoticeDAO")
public class AdminNoticeDAOImpl implements AdminNoticeDAO
{
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;


    @Override
    public void insertNotice(AdminNoticeVO adminNoticeVO)
    {
        sqlSessionTemplate.insert("NoticeDAO.insertNotice", adminNoticeVO);
    }

    @Override
    public void updateNotice(AdminNoticeVO adminNoticeVO)
    {
        sqlSessionTemplate.update("NoticeDAO.updateNotice", adminNoticeVO);
    }

    @Override
    public void deleteNotice(AdminNoticeVO adminNoticeVO)
    {
        sqlSessionTemplate.delete("NoticeDAO.deleteNotice", adminNoticeVO);
    }

    @Override
    public List<AdminNoticeVO> selectNoticeList(AdminNoticeVO adminNoticeVO)
    {
        return sqlSessionTemplate.selectList("NoticeDAO.selectNoticeList", adminNoticeVO);
    }

    @Override
    public AdminNoticeVO selectNotice(AdminNoticeVO adminNoticeVO)
    {
        return sqlSessionTemplate.selectOne("NoticeDAO.selectNotice", adminNoticeVO);
    }
}
