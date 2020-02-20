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
		
		//일별 방문자
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
	
	@RequestMapping(value="/memberOverviewTwoAjax.ado", method = {RequestMethod.GET, RequestMethod.POST}) 
	@ResponseBody
	public AdminOverviewChartVO getAdminOverviewTWOChartVO(AdminOverviewVisitorVO adminOverviewVisitorVO) {
		
		//월별방문자  
		List<AdminOverviewVisitorVO> selectOverveiwListMonth = adminSelectOverviewListService.selectOverveiwListMonth(adminOverviewVisitorVO);
		
		
		AdminOverviewChartVO adminOverviewChartVO = new AdminOverviewChartVO();
		adminOverviewChartVO.setType("line");
		adminOverviewChartVO.setOptions("{}");
	
		
		AdminOverviewDataSetVO adminOverviewDataSetVO = new AdminOverviewDataSetVO();
		adminOverviewDataSetVO.setLabel("월별 방문자");
		adminOverviewDataSetVO.setFill(false);
		adminOverviewDataSetVO.setBorderColor("rgb(99, 203, 137)");
		adminOverviewDataSetVO.setLineTension(0.2);
		
		String[] tempLabel = new String[selectOverveiwListMonth.size()];
		int[] tempData = new int[selectOverveiwListMonth.size()];
		
		
			
			for (int i = 0; i < selectOverveiwListMonth.size(); i++) {
				 tempLabel[i] = selectOverveiwListMonth.get(i).getUserCountTbDate();
				 System.out.println(selectOverveiwListMonth.get(i).getUserCountTbDate());
			      tempData[i] = selectOverveiwListMonth.get(i).getUserCountTbVisitors();
				
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
	
	@RequestMapping(value="/memberOverviewThreeAjax.ado", method = {RequestMethod.GET, RequestMethod.POST}) 
	@ResponseBody
	public AdminOverviewChartVO getAdminOverviewThreeChartVO(AdminOverviewVisitorVO adminOverviewVisitorVO) {
		
		//일별회원수 
		List<AdminOverviewVisitorVO> adminOverviewVisitorList = adminSelectOverviewListService.selectOverviewList(adminOverviewVisitorVO);
		
		AdminOverviewChartVO adminOverviewChartVO = new AdminOverviewChartVO();
		adminOverviewChartVO.setType("line");
		adminOverviewChartVO.setOptions("{}");
	
		
		AdminOverviewDataSetVO adminOverviewDataSetVO = new AdminOverviewDataSetVO();
		adminOverviewDataSetVO.setLabel("일별 가입자");
		adminOverviewDataSetVO.setFill(false);
		adminOverviewDataSetVO.setBorderColor("rgb(93,168,203)");
		adminOverviewDataSetVO.setLineTension(0.2);
		
		String[] tempLabel = new String[adminOverviewVisitorList.size()];
		int[] tempData = new int[adminOverviewVisitorList.size()];
		
		
			
			for (int i = 0; i < adminOverviewVisitorList.size(); i++) {
				 tempLabel[i] = adminOverviewVisitorList.get(i).getUserCountTbDate();
				
			      tempData[i] = adminOverviewVisitorList.get(i).getUserCountTbJoiners();
				
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
	
	@RequestMapping(value="/memberOverviewFourAjax.ado", method = {RequestMethod.GET, RequestMethod.POST}) 
	@ResponseBody
	public AdminOverviewChartVO getAdminOverviewFourChartVO(AdminOverviewVisitorVO adminOverviewVisitorVO) {
		
		//월별회원수 
		List<AdminOverviewVisitorVO> selectOverveiwListMonth = adminSelectOverviewListService.selectOverveiwListMonth(adminOverviewVisitorVO);
		
		
		AdminOverviewChartVO adminOverviewChartVO = new AdminOverviewChartVO();
		adminOverviewChartVO.setType("line");
		adminOverviewChartVO.setOptions("{}");
	
		
		AdminOverviewDataSetVO adminOverviewDataSetVO = new AdminOverviewDataSetVO();
		adminOverviewDataSetVO.setLabel("월별 회원수");
		adminOverviewDataSetVO.setFill(false);
		adminOverviewDataSetVO.setBorderColor("rgb(93,168,203)");
		adminOverviewDataSetVO.setLineTension(0.2);
		
		String[] tempLabel = new String[selectOverveiwListMonth.size()];
		int[] tempData = new int[selectOverveiwListMonth.size()];
		
		
			
			for (int i = 0; i < selectOverveiwListMonth.size(); i++) {
				 tempLabel[i] = selectOverveiwListMonth.get(i).getUserCountTbDate();
				 System.out.println(selectOverveiwListMonth.get(i).getUserCountTbDate());
			      tempData[i] = selectOverveiwListMonth.get(i).getUserCountTbJoiners();
				
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
	
	@RequestMapping(value="/memberOverviewDayAjax.ado", method = {RequestMethod.GET, RequestMethod.POST}) 
	@ResponseBody
	public AdminOverviewChartVO getAdminOverviewDAYChartVO(AdminOverviewVisitorVO adminOverviewVisitorVO) {
		
		//일별회원증감표 
		List<AdminOverviewVisitorVO> adminOverviewVisitorList = adminSelectOverviewListService.selectOverviewList(adminOverviewVisitorVO);
		
		AdminOverviewChartVO adminOverviewChartVO = new AdminOverviewChartVO();
		adminOverviewChartVO.setType("line");
		adminOverviewChartVO.setOptions("{}");
	
		
		AdminOverviewDataSetVO adminOverviewDataSetVO = new AdminOverviewDataSetVO();
		
		//추가
		AdminOverviewDataSetVO adminOverviewDataSetVO2 = new AdminOverviewDataSetVO();
		//추가
		AdminOverviewDataSetVO adminOverviewDataSetVO3 = new AdminOverviewDataSetVO();
		
		adminOverviewDataSetVO.setLabel("일별 회원가입");
		adminOverviewDataSetVO.setFill(false);
		adminOverviewDataSetVO.setBorderColor("rgb(99, 203, 137)");
		adminOverviewDataSetVO.setLineTension(0.2);
		
		//추가
		adminOverviewDataSetVO2.setLabel("일별 회원탈퇴");
		adminOverviewDataSetVO2.setFill(false);
		adminOverviewDataSetVO2.setBorderColor("rgb(203,36,45)");
		adminOverviewDataSetVO2.setLineTension(0.2);
		
		//추가
		adminOverviewDataSetVO3.setLabel("일별 회원증감");
		adminOverviewDataSetVO3.setFill(false);
		adminOverviewDataSetVO3.setBorderColor("rgb(42,94,203)");
		adminOverviewDataSetVO3.setLineTension(0.2);
		
		
		
		
		
		
		String[] tempLabel = new String[adminOverviewVisitorList.size()];
	
		int[] tempData = new int[adminOverviewVisitorList.size()];
		
		int[] tempOutData=new int[adminOverviewVisitorList.size()];//회원탈퇴데이터
		int[] tempInOutData=new int[adminOverviewVisitorList.size()];//회원 증감데이터 
		
			
			for (int i = 0; i < adminOverviewVisitorList.size(); i++) {
				 tempLabel[i] = adminOverviewVisitorList.get(i).getUserCountTbDate();
				 tempOutData[i]=adminOverviewVisitorList.get(i).getUserCountTbOutcount();
				 tempData[i] = adminOverviewVisitorList.get(i).getUserCountTbJoiners();
				
		
				 tempInOutData[i]=tempData[i]-tempOutData[i];
						
			}
			System.out.println("tempL : "+tempLabel);
		
			
			
			adminOverviewDataSetVO.setData(tempData);
			
			adminOverviewDataSetVO2.setData(tempOutData); //회원탈퇴값 
			
			adminOverviewDataSetVO3.setData(tempInOutData);//회원증감표 
			
			AdminOverviewDataSetVO[] datasets = {adminOverviewDataSetVO,adminOverviewDataSetVO2,adminOverviewDataSetVO3};
				
			AdminOverviewDataVO adminOverviewDataVO = new AdminOverviewDataVO();
		
			adminOverviewDataVO.setLabels(tempLabel);
			adminOverviewDataVO.setDatasets(datasets);
			
			adminOverviewChartVO.setData(adminOverviewDataVO);
			
			
		return adminOverviewChartVO;
		
	}
	
	

	@RequestMapping(value="/memberOverviewMonthAjax.ado", method = {RequestMethod.GET, RequestMethod.POST}) 
	@ResponseBody
	public AdminOverviewChartVO getAdminOverviewMonthChartVO(AdminOverviewVisitorVO adminOverviewVisitorVO) {
		
		//월별회원증감표  
		List<AdminOverviewVisitorVO> selectOverveiwListMonth = adminSelectOverviewListService.selectOverveiwListMonth(adminOverviewVisitorVO);
		
		
		AdminOverviewChartVO adminOverviewChartVO = new AdminOverviewChartVO();
		
		adminOverviewChartVO.setType("line");
		adminOverviewChartVO.setOptions("{}");
	
		
		AdminOverviewDataSetVO adminOverviewDataSetVO = new AdminOverviewDataSetVO();
		adminOverviewDataSetVO.setLabel("월별 회원가입");
		adminOverviewDataSetVO.setFill(false);
		adminOverviewDataSetVO.setBorderColor("rgb(99, 203, 137)");
		adminOverviewDataSetVO.setLineTension(0.2);
		
				//추가
				AdminOverviewDataSetVO adminOverviewDataSetVO2 = new AdminOverviewDataSetVO();
				//추가
				AdminOverviewDataSetVO adminOverviewDataSetVO3 = new AdminOverviewDataSetVO();
				
				//추가
				adminOverviewDataSetVO2.setLabel("월별 회원탈퇴");
				adminOverviewDataSetVO2.setFill(false);
				adminOverviewDataSetVO2.setBorderColor("rgb(203,36,45)");
				adminOverviewDataSetVO2.setLineTension(0.2);
				
				//추가
				adminOverviewDataSetVO3.setLabel("월별 회원증감");
				adminOverviewDataSetVO3.setFill(false);
				adminOverviewDataSetVO3.setBorderColor("rgb(42,94,203)");
				adminOverviewDataSetVO3.setLineTension(0.2);
				
				
		
		
		String[] tempLabel = new String[selectOverveiwListMonth.size()];
		int[] tempData = new int[selectOverveiwListMonth.size()];
		int[] tempOutData=new int[selectOverveiwListMonth.size()];//회원탈퇴데이터
		int[] tempInOutData=new int[selectOverveiwListMonth.size()];//회원 증감데이터 
		
		
			
			for (int i = 0; i < selectOverveiwListMonth.size(); i++) {
				 tempLabel[i] = selectOverveiwListMonth.get(i).getUserCountTbDate();	 
				 tempOutData[i]=selectOverveiwListMonth.get(i).getUserCountTbOutcount();
			      tempData[i] = selectOverveiwListMonth.get(i).getUserCountTbJoiners();
			      
			      tempInOutData[i] = tempData[i]-tempOutData[i];
				
		}
			System.out.println("tempL : "+tempLabel);
			adminOverviewDataSetVO.setData(tempData);
			adminOverviewDataSetVO2.setData(tempOutData);
			adminOverviewDataSetVO3.setData(tempInOutData);
			
			AdminOverviewDataSetVO[] datasets = {adminOverviewDataSetVO,adminOverviewDataSetVO2,adminOverviewDataSetVO3};
			
			
			
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
