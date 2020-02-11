package com.mall.meongnyang.admin.product.vo;

public class AdminProductCategoryVO
{
    private int productCategoryTbNo;
    private String productCategoryTbParent;
    private String productCategoryTbMedian;
    private String productCategoryTbSub;

    @Override
    public String toString()
    {
        return "AdminProductCategoryVO{" +
                "productCategoryTbNo=" + productCategoryTbNo +
                ", productCategoryTbParent='" + productCategoryTbParent + '\'' +
                ", productCategoryTbMedian='" + productCategoryTbMedian + '\'' +
                ", productCategoryTbSub='" + productCategoryTbSub + '\'' +
                '}';
    }

    public int getProductCategoryTbNo()
    {
        return productCategoryTbNo;
    }

    public void setProductCategoryTbNo(int productCategoryTbNo)
    {
        this.productCategoryTbNo = productCategoryTbNo;
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
}
