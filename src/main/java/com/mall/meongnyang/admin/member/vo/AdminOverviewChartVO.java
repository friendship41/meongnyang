package com.mall.meongnyang.admin.member.vo;

import java.util.Arrays;

public class AdminOverviewChartVO {

	String type="line";
	AdminOverviewDataSetVO[] datasets ;
	String options ="{}";
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public AdminOverviewDataSetVO[] getDatasets() {
		return datasets;
	}
	public void setDatasets(AdminOverviewDataSetVO[] datasets) {
		this.datasets = datasets;
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
