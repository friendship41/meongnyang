package com.mall.meongnyang.admin.product.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Date;

public class AdminProductVO
{
    private String productTbCode;
    private int productCategoryTbNo;
    private String productTbName;
    private Date productTbRegDate;
    private String productTbDetail;

    @JsonIgnore
    private MultipartFile uploadFile;

    public String getProductTbCode()
    {
        return productTbCode;
    }

    public void setProductTbCode(String productTbCode)
    {
        this.productTbCode = productTbCode;
    }

    public int getProductCategoryTbNo()
    {
        return productCategoryTbNo;
    }

    public void setProductCategoryTbNo(int productCategoryTbNo)
    {
        this.productCategoryTbNo = productCategoryTbNo;
    }

    public String getProductTbName()
    {
        return productTbName;
    }

    public void setProductTbName(String productTbName)
    {
        this.productTbName = productTbName;
    }

    public Date getProductTbRegDate()
    {
        return productTbRegDate;
    }

    public void setProductTbRegDate(Date productTbRegDate)
    {
        this.productTbRegDate = productTbRegDate;
    }

    public String getProductTbDetail()
    {
        return productTbDetail;
    }

    public void setProductTbDetail(String productTbDetail)
    {
        this.productTbDetail = productTbDetail;
    }

    public MultipartFile getUploadFile()
    {
        return uploadFile;
    }

    public void setUploadFile(MultipartFile uploadFile)
    {
        this.uploadFile = uploadFile;
    }
}
