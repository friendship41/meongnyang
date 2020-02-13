package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductImageDAO;
import com.mall.meongnyang.admin.product.vo.AdminProductImageVO;
import com.mall.meongnyang.util.imagesave.SaveImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Service("AdminInsertProductImageService")
public class AdminInsertProductImageServiceImpl implements AdminInsertProductImageService
{
    @Autowired
    private AdminProductImageDAO adminProductImageDAO;


    @Override
    public AdminProductImageVO insertProductImageReturnImages(AdminProductImageVO adminProductImageVO, HttpServletRequest request)
    {
        System.out.println(adminProductImageVO);
        int imgCnt = adminProductImageDAO.selectProductImageCount(adminProductImageVO);
        if(imgCnt >= 3)
        {
            return null;
        }

        MultipartFile file = adminProductImageVO.getUploadedImage();
        try
        {
            String saveSrc = new SaveImageService().saveImage("product", file, request);
            String fileName = file.getOriginalFilename();
            String fileExt = fileName.substring(fileName.lastIndexOf('.')+1);

            adminProductImageVO.setPdImageTbPath(saveSrc);
            adminProductImageVO.setPdImageTbFileName(fileName);
            adminProductImageVO.setPdImageTbExtention(fileExt);
            adminProductImageDAO.insertProductImage(adminProductImageVO);

            List<AdminProductImageVO> rsList = adminProductImageDAO.selectProductImages(adminProductImageVO);
            for(AdminProductImageVO image : rsList)
            {
                String path = image.getPdImageTbPath();
                if (path.equals(saveSrc))
                {
                    return image;
                }
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
