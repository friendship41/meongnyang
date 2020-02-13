package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductDAO;
import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import com.mall.meongnyang.util.imagesave.SaveImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Service("AdminUpdateProductService")
public class AdminUpdateProductServiceImpl implements AdminUpdateProductService
{
    @Autowired
    private AdminProductDAO adminProductDAO;

    @Override
    public void updateProduct(AdminProductVO adminProductVO, HttpServletRequest request)
    {
        MultipartFile uploadFile = adminProductVO.getUploadFile();
        if(!uploadFile.isEmpty())
        {
            try
            {
                String filePath = new SaveImageService().saveImage("product-detail", uploadFile, request);
                adminProductVO.setProductTbDetail(filePath);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        adminProductDAO.updateProduct(adminProductVO);
    }
}
