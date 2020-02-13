package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductImageDAO;
import com.mall.meongnyang.admin.product.vo.AdminProductImageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminUpdateProductImageService")
public class AdminUpdateProductImageServiceImpl implements AdminUpdateProductImageService
{
    @Autowired
    private AdminProductImageDAO adminProductImageDAO;

    @Override
    public String updateProductImageRep(AdminProductImageVO adminProductImageVO)
    {
//        프로덕트 넘버 필요
        AdminProductImageVO pdImgRep = adminProductImageDAO.selectProductImageRepY(adminProductImageVO);
//        이미지 넘버 필요
        if(pdImgRep != null)
        {
            pdImgRep.setPdImageTbRepresentative("N");
            adminProductImageDAO.updateProductImageRep(pdImgRep);
        }
        else
        {
            pdImgRep = new AdminProductImageVO();
            pdImgRep.setPdImageTbNo(-1);
        }
        adminProductImageVO.setPdImageTbRepresentative("Y");
        adminProductImageDAO.updateProductImageRep(adminProductImageVO);

        return "{\"updateRepState\":\"updateSucess\",\"repImgNo\":\""+adminProductImageVO.getPdImageTbNo()+"\", \"pastRepImgNo\":\""+pdImgRep.getPdImageTbNo()+"\"}";
    }
}
