package com.mall.meongnyang.admin.sales.vo;

public class AdminSalesOverviewDataVO {
	
	private String[] labels;
	private AdminSalesOverviewDataSetVO[] datasets;
	
	
	public String[] getLabels() {
		return labels;
	}
	public void setLabels(String[] labels) {
		this.labels = labels;
	}
	public AdminSalesOverviewDataSetVO[] getDatasets() {
		return datasets;
	}
	public void setDatasets(AdminSalesOverviewDataSetVO[] datasets) {
		this.datasets = datasets;
	}

}
