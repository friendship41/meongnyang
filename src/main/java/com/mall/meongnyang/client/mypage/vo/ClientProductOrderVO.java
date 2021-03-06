package com.mall.meongnyang.client.mypage.vo;

import java.sql.Date;

public class ClientProductOrderVO {
	private String pdOrderTbNo;
    private int customerTbNo;
    private Date pdOrderTbOrderDate;
    private int pdOrderTbPayment;
    private String pdOrderTbState;
    private String pdOrderTbAddress;
    private String pdOrderTbAdCity;
    private String pdOrderTbReceiver;
    private Date pdOrderTbPaymentDate;
    private String pdOrderTbPhone;
    private int pdOrderTbDeliveryFee;
    private int pdOrderTbUsedPoint;
    
    private int startRow;    
    private int endRow;
    
    private String pdSaleTbProductName;
    private int orderProductCount;
    private String customerTbName;
    private Date dayFrom;
	private Date dayTo;
	
    private Date startDate;
    private Date endDate;
    
    private String pdOrderTbPaymentDateStr;
    private int pdOrderTbPaymentSum;
    private int pdSaleTbReceivedPrice;
    
    private String productCategoryTbParent;
    private String productCategoryTbSub;
    private int ordersDetailTbPriceSum;
    private int ordersDetailTbAmount;
    private String pdSaleTbSalesPriceRange;

    private String pdOrderTbTid;
    
	public String getPdSaleTbSalesPriceRange() {
		return pdSaleTbSalesPriceRange;
	}
	public void setPdSaleTbSalesPriceRange(String pdSaleTbSalesPriceRange) {
		this.pdSaleTbSalesPriceRange = pdSaleTbSalesPriceRange;
	}
	public int getOrdersDetailTbAmount() {
		return ordersDetailTbAmount;
	}
	public void setOrdersDetailTbAmount(int ordersDetailTbAmount) {
		this.ordersDetailTbAmount = ordersDetailTbAmount;
	}
	public String getProductCategoryTbParent() {
		return productCategoryTbParent;
	}
	public void setProductCategoryTbParent(String productCategoryTbParent) {
		this.productCategoryTbParent = productCategoryTbParent;
	}
	public int getOrdersDetailTbPriceSum() {
		return ordersDetailTbPriceSum;
	}
	public void setOrdersDetailTbPriceSum(int ordersDetailTbPriceSum) {
		this.ordersDetailTbPriceSum = ordersDetailTbPriceSum;
	}
	public String getProductCategoryTbSub() {
		return productCategoryTbSub;
	}
	public void setProductCategoryTbSub(String productCategoryTbSub) {
		this.productCategoryTbSub = productCategoryTbSub;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getPdOrderTbPaymentDateStr() {
		return pdOrderTbPaymentDateStr;
	}
	public void setPdOrderTbPaymentDateStr(String pdOrderTbPaymentDateStr) {
		this.pdOrderTbPaymentDateStr = pdOrderTbPaymentDateStr;
	}
	public int getPdOrderTbPaymentSum() {
		return pdOrderTbPaymentSum;
	}
	public void setPdOrderTbPaymentSum(int pdOrderTbPaymentSum) {
		this.pdOrderTbPaymentSum = pdOrderTbPaymentSum;
	}
	public String getPdOrderTbNo() {
		return pdOrderTbNo;
	}
	public void setPdOrderTbNo(String pdOrderTbNo) {
		this.pdOrderTbNo = pdOrderTbNo;
	}
	public int getCustomerTbNo() {
		return customerTbNo;
	}
	public void setCustomerTbNo(int customerTbNo) {
		this.customerTbNo = customerTbNo;
	}
	public Date getPdOrderTbOrderDate() {
		return pdOrderTbOrderDate;
	}
	public void setPdOrderTbOrderDate(Date pdOrderTbOrderDate) {
		this.pdOrderTbOrderDate = pdOrderTbOrderDate;
	}
	public int getPdOrderTbPayment() {
		return pdOrderTbPayment;
	}
	public void setPdOrderTbPayment(int pdOrderTbPayment) {
		this.pdOrderTbPayment = pdOrderTbPayment;
	}
	public String getPdOrderTbState() {
		return pdOrderTbState;
	}
	public void setPdOrderTbState(String pdOrderTbState) {
		this.pdOrderTbState = pdOrderTbState;
	}
	public String getPdOrderTbAddress() {
		return pdOrderTbAddress;
	}
	public void setPdOrderTbAddress(String pdOrderTbAddress) {
		this.pdOrderTbAddress = pdOrderTbAddress;
	}
	public String getPdOrderTbAdCity() {
		return pdOrderTbAdCity;
	}
	public void setPdOrderTbAdCity(String pdOrderTbAdCity) {
		this.pdOrderTbAdCity = pdOrderTbAdCity;
	}
	public String getPdOrderTbReceiver() {
		return pdOrderTbReceiver;
	}
	public void setPdOrderTbReceiver(String pdOrderTbReceiver) {
		this.pdOrderTbReceiver = pdOrderTbReceiver;
	}
	public Date getPdOrderTbPaymentDate() {
		return pdOrderTbPaymentDate;
	}
	public void setPdOrderTbPaymentDate(Date pdOrderTbPaymentDate) {
		this.pdOrderTbPaymentDate = pdOrderTbPaymentDate;
	}
	public String getPdOrderTbPhone() {
		return pdOrderTbPhone;
	}
	public void setPdOrderTbPhone(String pdOrderTbPhone) {
		this.pdOrderTbPhone = pdOrderTbPhone;
	}
	public int getPdOrderTbDeliveryFee() {
		return pdOrderTbDeliveryFee;
	}
	public void setPdOrderTbDeliveryFee(int pdOrderTbDelivertyFee) {
		this.pdOrderTbDeliveryFee = pdOrderTbDelivertyFee;
	}
	public int getPdOrderTbUsedPoint() {
		return pdOrderTbUsedPoint;
	}
	public void setPdOrderTbUsedPoint(int pdOrderTbUsedPoint) {
		this.pdOrderTbUsedPoint = pdOrderTbUsedPoint;
	}
	
	public int getStartRow() {
		return startRow;
	}
	public int getEndRow() {
		return endRow;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}
	public String getPdSaleTbProductName() {
		return pdSaleTbProductName;
	}
	public void setPdSaleTbProductName(String pdSaleTbProductName) {
		this.pdSaleTbProductName = pdSaleTbProductName;
	}
	public int getOrderProductCount() {
		return orderProductCount;
	}
	public void setOrderProductCount(int orderProductCount) {
		this.orderProductCount = orderProductCount;
	}

	public String getCustomerTbName()
	{
		return customerTbName;
	}

	public void setCustomerTbName(String customerTbName)
	{
		this.customerTbName = customerTbName;
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

	public int getPdSaleTbReceivedPrice() {
		return pdSaleTbReceivedPrice;
	}
	public void setPdSaleTbReceivedPrice(int pdSaleTbReceivedPrice) {
		this.pdSaleTbReceivedPrice = pdSaleTbReceivedPrice;
	}

	public String getPdOrderTbTid()
	{
		return pdOrderTbTid;
	}

	public void setPdOrderTbTid(String pdOrderTbTid)
	{
		this.pdOrderTbTid = pdOrderTbTid;
	}

	@Override
	public String toString()
	{
		return "ClientProductOrderVO{" +
				"pdOrderTbNo='" + pdOrderTbNo + '\'' +
				", customerTbNo=" + customerTbNo +
				", pdOrderTbOrderDate=" + pdOrderTbOrderDate +
				", pdOrderTbPayment=" + pdOrderTbPayment +
				", pdOrderTbState='" + pdOrderTbState + '\'' +
				", pdOrderTbAddress='" + pdOrderTbAddress + '\'' +
				", pdOrderTbAdCity='" + pdOrderTbAdCity + '\'' +
				", pdOrderTbReceiver='" + pdOrderTbReceiver + '\'' +
				", pdOrderTbPaymentDate=" + pdOrderTbPaymentDate +
				", pdOrderTbPhone='" + pdOrderTbPhone + '\'' +
				", pdOrderTbDeliveryFee=" + pdOrderTbDeliveryFee +
				", pdOrderTbUsedPoint=" + pdOrderTbUsedPoint +
				", startRow=" + startRow +
				", endRow=" + endRow +
				", pdSaleTbProductName='" + pdSaleTbProductName + '\'' +
				", orderProductCount=" + orderProductCount +
				", customerTbName='" + customerTbName + '\'' +
				", dayFrom=" + dayFrom +
				", dayTo=" + dayTo +
				", startDate=" + startDate +
				", endDate=" + endDate +
				", pdOrderTbPaymentDateStr='" + pdOrderTbPaymentDateStr + '\'' +
				", pdOrderTbPaymentSum=" + pdOrderTbPaymentSum +
				", pdSaleTbReceivedPrice=" + pdSaleTbReceivedPrice +
				", productCategoryTbParent='" + productCategoryTbParent + '\'' +
				", productCategoryTbSub='" + productCategoryTbSub + '\'' +
				", ordersDetailTbPriceSum=" + ordersDetailTbPriceSum +
				", ordersDetailTbAmount=" + ordersDetailTbAmount +
				", pdSaleTbSalesPriceRange='" + pdSaleTbSalesPriceRange + '\'' +
				", pdOrderTbTid='" + pdOrderTbTid + '\'' +
				'}';
	}
}
