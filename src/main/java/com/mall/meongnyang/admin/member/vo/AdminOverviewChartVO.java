package com.mall.meongnyang.admin.member.vo;



public class AdminOverviewChartVO {

	String type="line";
	AdminOverviewDataVO data ;
	String options ="{}";
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	public AdminOverviewDataVO getData() {
		return data;
	}
	public void setData(AdminOverviewDataVO data) {
		this.data = data;
	}
	public String getOptions() {
		return options;
	}
	public void setOptions(String options) {
		this.options = options;
	}
//	public AdminOverviewChartVO(String type, AdminOverviewDataSetVO[] datasets, String options) {
//		super();
//		this.type = type;
//		this.datasets = datasets;
//		this.options = options;
//	}
//	
//	@Override
//	public String toString() {
//		return "AdminOverviewChartVO [type=" + type + ", datasets=" + Arrays.toString(datasets) + ", options=" + options
//				+ "]";
//	}
	
	
	
	
}
