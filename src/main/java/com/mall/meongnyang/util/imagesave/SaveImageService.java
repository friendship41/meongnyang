package com.mall.meongnyang.util.imagesave;

import com.mall.meongnyang.util.codeGen.GenerateCode;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

public class SaveImageService
{
    public String saveImage(String saveFolderName, MultipartFile file, HttpServletRequest request) throws IOException
    {
        if(!file.isEmpty())
        {
            String original = file.getOriginalFilename();
            original = original.substring(original.lastIndexOf('.'));
            String fileName = new GenerateCode().generateImageName()+original;
            String fullImagePath = request.getServletContext().getRealPath("resources/image/"+saveFolderName+"/"+fileName);
//            System.out.println("이미지경로: "+fullImagePath);
            file.transferTo(new File(fullImagePath));
            return "resources/image/"+saveFolderName+"/"+fileName;
        }
        else
        {
            throw new IOException("SaveImage클래스: 파일을 저장하지 못했습니다/파일이 없습니다");
        }
    }
}
