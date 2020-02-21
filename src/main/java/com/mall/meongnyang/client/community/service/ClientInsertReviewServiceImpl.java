package com.mall.meongnyang.client.community.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.community.dao.ClientReviewDAO;
import com.mall.meongnyang.client.community.vo.ClientReviewVO;
import com.mall.meongnyang.util.imagesave.SaveImageService;

@Service
public class ClientInsertReviewServiceImpl implements ClientInsertReviewService {

	@Autowired
	private ClientReviewDAO clientReviewDAO;

	@Override
	public void insertReview(ClientReviewVO clientReviewVO, HttpServletRequest request) {
		
		if (clientReviewVO.getFile() != null) {
			try {
				String fileName = new SaveImageService().saveImage("review", clientReviewVO.getFile(), request);
				clientReviewVO.setReviewTbImgPath(fileName);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		clientReviewDAO.insertReview(clientReviewVO);
	}

	@Override
	public int selectCount(ClientReviewVO clientReviewVO) {
		return clientReviewDAO.selectCount(clientReviewVO);
	}

}
