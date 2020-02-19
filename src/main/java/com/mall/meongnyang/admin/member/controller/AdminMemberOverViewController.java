package com.mall.meongnyang.admin.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.mall.meongnyang.admin.member.service.AdminSelectOverviewListService;
import com.mall.meongnyang.admin.member.vo.AdminOverviewChartVO;
import com.mall.meongnyang.admin.member.vo.AdminOverviewDataSetVO;
import com.mall.meongnyang.admin.member.vo.AdminOverviewDataVO;
import com.mall.meongnyang.admin.member.vo.AdminOverviewVisitorVO;

@Controller
public class AdminMemberOverViewController {
	

	@Autowired
	private AdminSelectOverviewListService adminSelectOverviewListService;
	
	@RequestMapping(value="/memberOverviewAjax.ado", method = {RequestMethod.GET, RequestMethod.POST}) 
	@ResponseBody
	public AdminOverviewChartVO getAdminOverviewChartVO(AdminOverviewVisitorVO adminOverviewVisitorVO) {
		
		List<AdminOverviewVisitorVO> adminOverviewVisitorList = adminSelectOverviewListService.selectOverviewList(adminOverviewVisitorVO);
		
		AdminOverviewChartVO adminOverviewChartVO = new AdminOverviewChartVO();
		adminOverviewChartVO.setType("line");
		adminOverviewChartVO.setOptions("{}");
	
		
		AdminOverviewDataSetVO adminOverviewDataSetVO = new AdminOverviewDataSetVO();
		adminOverviewDataSetVO.setLabel("일별 방문자");
		adminOverviewDataSetVO.setFill(false);
		adminOverviewDataSetVO.setBorderColor("rgb(99, 203, 137)");
		adminOverviewDataSetVO.setLineTension(0.2);
		
		String[] tempLabel = new String[adminOverviewVisitorList.size()];
		int[] tempData = new int[adminOverviewVisitorList.size()];
		
		
			
			for (int i = 0; i < adminOverviewVisitorList.size(); i++) {
				 tempLabel[i] = adminOverviewVisitorList.get(i).getUserCountTbDate();
				 System.out.println(adminOverviewVisitorList.get(i).getUserCountTbDate());
			      tempData[i] = adminOverviewVisitorList.get(i).getUserCountTbVisitors();
				
		}
			System.out.println("tempL : "+tempLabel);
			adminOverviewDataSetVO.setData(tempData);
			
			AdminOverviewDataSetVO[] datasets = {adminOverviewDataSetVO};
			
			AdminOverviewDataVO adminOverviewDataVO = new AdminOverviewDataVO();
			adminOverviewDataVO.setLabels(tempLabel);
			adminOverviewDataVO.setDatasets(datasets);
			
			adminOverviewChartVO.setData(adminOverviewDataVO);
			
			
		return adminOverviewChartVO;
		
	}
		
	//일단임시 
    @RequestMapping(value="/memberOverview.ado")
    public String memberOverviewPage()
    {
        return "member/member-overview";
    }

}
