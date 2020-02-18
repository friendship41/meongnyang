package com.mall.meongnyang.admin.member.vo;

import java.util.Arrays;

public class AdminOverviewDataSetVO {

	String[] label;
	int[] data;
	boolean fill;
	String borderColor;
	double lineTension;
	
	public String[] getLabel() {
		return label;
	}
	public void setLabel(String[] label) {
		this.label = label;
	}
	public int[] getData() {
		return data;
	}
	public void setData(int[] data) {
		this.data = data;
	}
	public boolean isFill() {
		return fill;
	}
	public void setFill(boolean fill) {
		this.fill = fill;
	}
	public String getBorderColor() {
		return borderColor;
	}
	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}
	public double getLineTension() {
		return lineTension;
	}
	public void setLineTension(double lineTension) {
		this.lineTension = lineTension;
	}
//	public AdminOverviewDataSetVO(String[] label, int[] data, boolean fill, String borderColor, double lineTension) {
//		super();
//		this.label = label;
//		this.data = data;
//		this.fill = fill;
//		this.borderColor = borderColor;
//		this.lineTension = lineTension;
//	}
	@Override
	public String toString() {
		return "AdminOverviewDataSetVO [label=" + Arrays.toString(label) + ", data=" + Arrays.toString(data) + ", fill="
				+ fill + ", borderColor=" + borderColor + ", lineTension=" + lineTension + "]";
	}
	
	
}
