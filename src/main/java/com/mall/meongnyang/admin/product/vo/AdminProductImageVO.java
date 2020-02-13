package com.mall.meongnyang.admin.product.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;

public class AdminProductImageVO
{
    private int pdImageTbNo;
    private String productTbCode;
    private String pdImageTbPath;
    private String pdImageTbFileName;
    private String pdImageTbExtention;
    private String pdImageTbRepresentative;

    @JsonIgnore
    private MultipartFile uploadedImage;


    public MultipartFile getUploadedImage()
    {
        return uploadedImage;
    }

    public void setUploadedImage(MultipartFile uploadedImage)
    {
        this.uploadedImage = uploadedImage;
    }

    public int getPdImageTbNo()
    {
        return pdImageTbNo;
    }

    public void setPdImageTbNo(int pdImageTbNo)
    {
        this.pdImageTbNo = pdImageTbNo;
    }

    public String getProductTbCode()
    {
        return productTbCode;
    }

    public void setProductTbCode(String productTbCode)
    {
        this.productTbCode = productTbCode;
    }

    public String getPdImageTbPath()
    {
        return pdImageTbPath;
    }

    public void setPdImageTbPath(String pdImageTbPath)
    {
        this.pdImageTbPath = pdImageTbPath;
    }

    public String getPdImageTbFileName()
    {
        return pdImageTbFileName;
    }

    public void setPdImageTbFileName(String pdImageTbFileName)
    {
        this.pdImageTbFileName = pdImageTbFileName;
    }

    public String getPdImageTbExtention()
    {
        return pdImageTbExtention;
    }

    public void setPdImageTbExtention(String pdImageTbExtention)
    {
        this.pdImageTbExtention = pdImageTbExtention;
    }

    public String getPdImageTbRepresentative()
    {
        return pdImageTbRepresentative;
    }

    public void setPdImageTbRepresentative(String pdImageTbRepresentative)
    {
        this.pdImageTbRepresentative = pdImageTbRepresentative;
    }

    @Override
    public String toString()
    {
        return "AdminProductImageVO{" +
                "pdImageTbNo=" + pdImageTbNo +
                ", productTbCode='" + productTbCode + '\'' +
                ", pdImageTbPath='" + pdImageTbPath + '\'' +
                ", pdImageTbFileName='" + pdImageTbFileName + '\'' +
                ", pdImageTbExtention='" + pdImageTbExtention + '\'' +
                ", pdImageTbRepresentative='" + pdImageTbRepresentative + '\'' +
                '}';
    }
}
