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
    private String productTbBannerState;

    private String productCategoryTbParent;
    private String productCategoryTbMedian;
    private String productCategoryTbSub;

    private int productImageCount;
    private int productSaleCount;

    private Date dayFrom;
    private Date dayTo;

    private String orderMethod;
    private String SearchWord;

    private String filterPrice;
    private int minPrice;
    private int maxPrice;

    private int nowPage;
    private int startNum;
    private int endNum;
    private int startBlock;
    private int endBlock;
    private int pageCnt;
    private int allBlockCnt;

    private String pdImageTbPath;
    private int pdSaleTbSalesPrice;
    private int pdSaleTbDiscountRate;
    private double pdSaleTbRating;
    private String pdSaleTbSize;
    private int pdSaleTbNo;
    private int ordersDetailTbAmount;




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

    public String getOrderMethod()
    {
        return orderMethod;
    }

    public void setOrderMethod(String orderMethod)
    {
        this.orderMethod = orderMethod;
    }

    public String getSearchWord()
    {
        return SearchWord;
    }

    public void setSearchWord(String searchWord)
    {
        SearchWord = searchWord;
    }

    public int getStartNum()
    {
        return startNum;
    }

    public void setStartNum(int startNum)
    {
        this.startNum = startNum;
    }

    public int getEndNum()
    {
        return endNum;
    }

    public void setEndNum(int endNum)
    {
        this.endNum = endNum;
    }

    public String getPdImageTbPath()
    {
        return pdImageTbPath;
    }

    public void setPdImageTbPath(String pdImageTbPath)
    {
        this.pdImageTbPath = pdImageTbPath;
    }

    public int getPdSaleTbSalesPrice()
    {
        return pdSaleTbSalesPrice;
    }

    public void setPdSaleTbSalesPrice(int pdSaleTbSalesPrice)
    {
        this.pdSaleTbSalesPrice = pdSaleTbSalesPrice;
    }

    public int getPdSaleTbDiscountRate()
    {
        return pdSaleTbDiscountRate;
    }

    public void setPdSaleTbDiscountRate(int pdSaleTbDiscountRate)
    {
        this.pdSaleTbDiscountRate = pdSaleTbDiscountRate;
    }

    public double getPdSaleTbRating()
    {
        return pdSaleTbRating;
    }

    public void setPdSaleTbRating(double pdSaleTbRating)
    {
        this.pdSaleTbRating = pdSaleTbRating;
    }

    public int getNowPage()
    {
        return nowPage;
    }

    public void setNowPage(int nowPage)
    {
        this.nowPage = nowPage;
    }

    public int getStartBlock()
    {
        return startBlock;
    }

    public void setStartBlock(int startBlock)
    {
        this.startBlock = startBlock;
    }

    public int getEndBlock()
    {
        return endBlock;
    }

    public void setEndBlock(int endBlock)
    {
        this.endBlock = endBlock;
    }

    public int getPageCnt()
    {
        return pageCnt;
    }

    public void setPageCnt(int pageCnt)
    {
        this.pageCnt = pageCnt;
    }

    public int getAllBlockCnt()
    {
        return allBlockCnt;
    }

    public void setAllBlockCnt(int allBlockCnt)
    {
        this.allBlockCnt = allBlockCnt;
    }

    public int getMinPrice()
    {
        return minPrice;
    }

    public void setMinPrice(int minPrice)
    {
        this.minPrice = minPrice;
    }

    public int getMaxPrice()
    {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice)
    {
        this.maxPrice = maxPrice;
    }

    public String getFilterPrice()
    {
        return filterPrice;
    }

    public void setFilterPrice(String filterPrice)
    {
        this.filterPrice = filterPrice;
    }

    public String getPdSaleTbSize()
    {
        return pdSaleTbSize;
    }

    public void setPdSaleTbSize(String pdSaleTbSize)
    {
        this.pdSaleTbSize = pdSaleTbSize;
    }

    public int getPdSaleTbNo()
    {
        return pdSaleTbNo;
    }

    public void setPdSaleTbNo(int pdSaleTbNo)
    {
        this.pdSaleTbNo = pdSaleTbNo;
    }

    public String getProductTbBannerState()
    {
        return productTbBannerState;
    }

    public void setProductTbBannerState(String productTbBannerState)
    {
        this.productTbBannerState = productTbBannerState;
    }

    public int getOrdersDetailTbAmount()
    {
        return ordersDetailTbAmount;
    }

    public void setOrdersDetailTbAmount(int ordersDetailTbAmount)
    {
        this.ordersDetailTbAmount = ordersDetailTbAmount;
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
                ", productTbBannerState='" + productTbBannerState + '\'' +
                ", productCategoryTbParent='" + productCategoryTbParent + '\'' +
                ", productCategoryTbMedian='" + productCategoryTbMedian + '\'' +
                ", productCategoryTbSub='" + productCategoryTbSub + '\'' +
                ", productImageCount=" + productImageCount +
                ", productSaleCount=" + productSaleCount +
                ", dayFrom=" + dayFrom +
                ", dayTo=" + dayTo +
                ", orderMethod='" + orderMethod + '\'' +
                ", SearchWord='" + SearchWord + '\'' +
                ", filterPrice='" + filterPrice + '\'' +
                ", minPrice=" + minPrice +
                ", maxPrice=" + maxPrice +
                ", nowPage=" + nowPage +
                ", startNum=" + startNum +
                ", endNum=" + endNum +
                ", startBlock=" + startBlock +
                ", endBlock=" + endBlock +
                ", pageCnt=" + pageCnt +
                ", allBlockCnt=" + allBlockCnt +
                ", pdImageTbPath='" + pdImageTbPath + '\'' +
                ", pdSaleTbSalesPrice=" + pdSaleTbSalesPrice +
                ", pdSaleTbDiscountRate=" + pdSaleTbDiscountRate +
                ", pdSaleTbRating=" + pdSaleTbRating +
                ", pdSaleTbSize='" + pdSaleTbSize + '\'' +
                ", pdSaleTbNo=" + pdSaleTbNo +
                ", ordersDetailTbAmount=" + ordersDetailTbAmount +
                ", uploadFile=" + uploadFile +
                '}';
    }
}
