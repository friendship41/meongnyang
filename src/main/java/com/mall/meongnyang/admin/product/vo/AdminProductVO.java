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

    private String productCategoryTbParent;
    private String productCategoryTbMedian;
    private String productCategoryTbSub;

    private int productImageCount;
    private int productSaleCount;

    private Date dayFrom;
    private Date dayTo;

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

    public String getProductCategoryTbParent()
    {
        return productCategoryTbParent;
    }

    public void setProductCategoryTbParent(String productCategoryTbParent)
    {
        this.productCategoryTbParent = productCategoryTbParent;
    }

    public String getProductCategoryTbMedian()
    {
        return productCategoryTbMedian;
    }

    public void setProductCategoryTbMedian(String productCategoryTbMedian)
    {
        this.productCategoryTbMedian = productCategoryTbMedian;
    }

    public String getProductCategoryTbSub()
    {
        return productCategoryTbSub;
    }

    public void setProductCategoryTbSub(String productCategoryTbSub)
    {
        this.productCategoryTbSub = productCategoryTbSub;
    }

    public int getProductImageCount()
    {
        return productImageCount;
    }

    public void setProductImageCount(int productImageCount)
    {
        this.productImageCount = productImageCount;
    }

    public int getProductSaleCount()
    {
        return productSaleCount;
    }

    public void setProductSaleCount(int productSaleCount)
    {
        this.productSaleCount = productSaleCount;
    }

    public Date getDayFrom()
    {
        return dayFrom;
    }

    public void setDayFrom(Date dayFrom)
    {
        this.dayFrom = dayFrom;
    }

    public Date getDayTo()
    {
        return dayTo;
    }

    public void setDayTo(Date dayTo)
    {
        this.dayTo = dayTo;
    }

    @Override
    public String toString()
    {
        return "AdminProductVO{" +
                "productTbCode='" + productTbCode + '\'' +
                ", productCategoryTbNo=" + productCategoryTbNo +
                ", productTbName='" + productTbName + '\'' +
                ", productTbRegDate=" + productTbRegDate +
                ", productTbDetail='" + productTbDetail + '\'' +
                ", productCategoryTbParent='" + productCategoryTbParent + '\'' +
                ", productCategoryTbMedian='" + productCategoryTbMedian + '\'' +
                ", productCategoryTbSub='" + productCategoryTbSub + '\'' +
                ", productImageCount=" + productImageCount +
                ", productSaleCount=" + productSaleCount +
                ", dayFrom=" + dayFrom +
                ", dayTo=" + dayTo +
                ", uploadFile=" + uploadFile +
                '}';
    }
}
