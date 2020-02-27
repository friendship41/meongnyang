package com.mall.meongnyang.util.chartLabel;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class LabelMaker { //날짜와 날짜사이의 일수 계산해서 chart에 쓰일 라벨 만들기
	
	public String[] chartLabelMaker(Date startDate, Date endDate) {
		
		long calDate = endDate.getTime() - startDate.getTime(); 

		int calDateDays = (int) (calDate / (1000*60*60*24)); // 날짜 사이의 일수 구하기
	
		String[] labels = new String[calDateDays+1]; // 라벨 담을 배열
	
		Calendar cld = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd");
		
		cld.setTime(startDate);
		
		java.util.Date currentDate = startDate;
		for(int i = 0; i < labels.length; i++) { //라벨에 값담기
			cld.setTime(currentDate);
			labels[i] = sdf.format(cld.getTime());
			cld.add(Calendar.DATE, 1);
			currentDate = cld.getTime();
		}
		
		return labels;
		
	}
	
}
