package com.mall.meongnyang.admin.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.mall.meongnyang.admin.member.service.AdminSelectOverviewListService;
import com.mall.meongnyang.admin.member.vo.AdminOverviewChartVO;
import com.mall.meongnyang.admin.member.vo.AdminOverviewDataSetVO;
import com.mall.meongnyang.admin.member.vo.AdminOverviewVisitorVO;

@Controller
public class AdminMemberOverViewController {
	

	@Autowired
	private AdminSelectOverviewListService adminSelectOverviewListService;
	
	@RequestMapping(value="/memberOverviewChart.ado") 
	@ResponseBody
	public AdminOverviewChartVO getAdminOverviewChartVO(AdminOverviewVisitorVO adminOverviewVisitorVO) {
		
		List<AdminOverviewVisitorVO> adminOverviewVisitorList = adminSelectOverviewListService.selectOverviewList(adminOverviewVisitorVO);
		
		AdminOverviewChartVO adminOverviewChartVO = new AdminOverviewChartVO();
		adminOverviewChartVO.setType("line");
		adminOverviewChartVO.setOptions("{}");
	
		
		AdminOverviewDataSetVO adminOverviewDataSetVO = new AdminOverviewDataSetVO();
		adminOverviewDataSetVO.setFill(false);
		adminOverviewDataSetVO.setBorderColor("rgb(99, 203, 137)");
		adminOverviewDataSetVO.setLineTension(0.2);
		
		String[] tempLabel = new String[adminOverviewVisitorList.size()];
		int[] tempData = new int[adminOverviewVisitorList.size()];
		
		//for(AdminOverviewVisitorVO vo : adminOverviewVisitorList ) {
			
			for (int i = 0; i < adminOverviewVisitorList.size(); i++) {
				
				 tempLabel[i] = adminOverviewVisitorVO.getUserCountTbDate();
			      tempData[i] = adminOverviewVisitorVO.getUserCountTbVisitors();
				
		}
	
			adminOverviewDataSetVO.setLabel(tempLabel);
			adminOverviewDataSetVO.setData(tempData);
			
			AdminOverviewDataSetVO[] datasets = {adminOverviewDataSetVO};
						
			adminOverviewChartVO.setDatasets(datasets);
			
			
		return adminOverviewChartVO;
		
	}
		
	//일단임시 
    @RequestMapping(value="/memberOverview.ado")
    public String memberOverviewPage()
    {
        return "member/member-overview";
    }

}
