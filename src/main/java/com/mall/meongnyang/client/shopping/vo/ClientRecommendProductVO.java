package com.mall.meongnyang.client.shopping.vo;

public class ClientRecommendProductVO {
	
	private String productTbCode;
	private String productTbName;
	private String pdImageTbPath;
	
	public String getProductTbCode() {
		return productTbCode;
	}
	public String getProductTbName() {
		return productTbName;
	}
	public String getPdImageTbPath() {
		return pdImageTbPath;
	}
	public void setProductTbCode(String productTbCode) {
		this.productTbCode = productTbCode;
	}
	public void setProductTbName(String productTbName) {
		this.productTbName = productTbName;
	}
	public void setPdImageTbPath(String pdImageTbPath) {
		this.pdImageTbPath = pdImageTbPath;
	}
	
	@Override
	public String toString() {
		return "ClientRecommendProductVO [productTbCode=" + productTbCode + ", productTbName=" + productTbName
				+ ", pdImageTbPath=" + pdImageTbPath + "]";
	}

}
