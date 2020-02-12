package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductDAO;
import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import com.mall.meongnyang.util.codeGen.GenerateCode;
import com.mall.meongnyang.util.imagesave.SaveImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Service("AdminInsertProductService")
public class AdminInsertProductServiceImpl implements AdminInsertProductService
{
    @Autowired
    private AdminProductDAO adminProductDAO;

    @Override
    public void insertProduct(AdminProductVO adminProductVO, HttpServletRequest request)
    {
//        제품코드 생성
        String productCode = new GenerateCode().generateProductCode();
        adminProductVO.setProductTbCode(productCode);

        try
        {
//            이미지 저장
            String fullFileName = new SaveImageService().saveImage("product-detail", adminProductVO.getUploadFile(), request);
            adminProductVO.setProductTbDetail(fullFileName);
            adminProductDAO.insertProduct(adminProductVO);
        }
        catch (IOException e)
        {
            System.out.println("파일 저장중 IO관련 오류");
        }


    }
}
