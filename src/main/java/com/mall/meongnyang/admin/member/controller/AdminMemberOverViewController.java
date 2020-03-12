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
import com.mall.meongnyang.util.chartLabel.LabelMaker;

@Controller
public class AdminMemberOverViewController {

	@Autowired
	private AdminSelectOverviewListService adminSelectOverviewListService;

	@RequestMapping(value = "/memberOverviewAjax.ado", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public AdminOverviewChartVO getAdminOverviewChartVO(AdminOverviewVisitorVO adminOverviewVisitorVO) {

		// 일별 방문자
		List<AdminOverviewVisitorVO> adminOverviewVisitorList = adminSelectOverviewListService
				.selectOverviewList(adminOverviewVisitorVO);

		AdminOverviewChartVO adminOverviewChartVO = new AdminOverviewChartVO();
		adminOverviewChartVO.setType("line");
		adminOverviewChartVO.setOptions("{}");

		AdminOverviewDataSetVO adminOverviewDataSetVO = new AdminOverviewDataSetVO();
		adminOverviewDataSetVO.setLabel("일별 방문자");
		adminOverviewDataSetVO.setFill(false);
		adminOverviewDataSetVO.setBorderColor("rgb(99, 203, 137)");
		adminOverviewDataSetVO.setLineTension(0.2);
		
		String[] tmpLabels = new LabelMaker().chartDailyLabelMaker(adminOverviewVisitorVO.getStartDate(),
				adminOverviewVisitorVO.getEndDate());

		int[] tmpDatas = new int[tmpLabels.length];

		for (int i = 0; i < tmpLabels.length; i++) {
			for (int j = 0; j < adminOverviewVisitorList.size(); j++) {
				if (tmpLabels[i].equals(adminOverviewVisitorList.get(j).getUserCountTbDate())) {
					tmpDatas[i] = adminOverviewVisitorList.get(j).getUserCountTbVisitors();
					break;
				} else {
					tmpDatas[i] = 0;
				}
			}
		}

		adminOverviewDataSetVO.setData(tmpDatas);

		AdminOverviewDataSetVO[] datasets = { adminOverviewDataSetVO };

		AdminOverviewDataVO adminOverviewDataVO = new AdminOverviewDataVO();
		adminOverviewDataVO.setLabels(tmpLabels);
		adminOverviewDataVO.setDatasets(datasets);

		adminOverviewChartVO.setData(adminOverviewDataVO);

		return adminOverviewChartVO;

	}

	@RequestMapping(value = "/memberOverviewTwoAjax.ado", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public AdminOverviewChartVO getAdminOverviewTWOChartVO(AdminOverviewVisitorVO adminOverviewVisitorVO) {

		// 월별방문자
		List<AdminOverviewVisitorVO> selectOverveiwListMonth = adminSelectOverviewListService
				.selectOverveiwListMonth(adminOverviewVisitorVO);

		AdminOverviewChartVO adminOverviewChartVO = new AdminOverviewChartVO();
		adminOverviewChartVO.setType("line");
		adminOverviewChartVO.setOptions("{}");

		AdminOverviewDataSetVO adminOverviewDataSetVO = new AdminOverviewDataSetVO();
		adminOverviewDataSetVO.setLabel("월별 방문자");
		adminOverviewDataSetVO.setFill(false);
		adminOverviewDataSetVO.setBorderColor("rgb(99, 203, 137)");
		adminOverviewDataSetVO.setLineTension(0.2);

		String[] tmpLabels = new LabelMaker().chartMonthlyLabelMaker(adminOverviewVisitorVO.getStartDate(),
				adminOverviewVisitorVO.getEndDate());

		int[] tmpDatas = new int[tmpLabels.length];

		for (int i = 0; i < tmpLabels.length; i++) {
			for (int j = 0; j < selectOverveiwListMonth.size(); j++) {
				if (tmpLabels[i].equals(selectOverveiwListMonth.get(j).getUserCountTbDate())) {
					tmpDatas[i] = selectOverveiwListMonth.get(j).getUserCountTbVisitors();
					break;
				} else {
					tmpDatas[i] = 0;
				}
			}
		}
		
		adminOverviewDataSetVO.setData(tmpDatas);

		AdminOverviewDataSetVO[] datasets = { adminOverviewDataSetVO };

		AdminOverviewDataVO adminOverviewDataVO = new AdminOverviewDataVO();
		adminOverviewDataVO.setLabels(tmpLabels);
		adminOverviewDataVO.setDatasets(datasets);

		adminOverviewChartVO.setData(adminOverviewDataVO);

		return adminOverviewChartVO;

	}

	@RequestMapping(value = "/memberOverviewThreeAjax.ado", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public AdminOverviewChartVO getAdminOverviewThreeChartVO(AdminOverviewVisitorVO adminOverviewVisitorVO) {

		// 일별회원수
		List<AdminOverviewVisitorVO> adminOverviewVisitorList = adminSelectOverviewListService
				.selectOverviewList(adminOverviewVisitorVO);

		AdminOverviewChartVO adminOverviewChartVO = new AdminOverviewChartVO();
		adminOverviewChartVO.setType("line");
		adminOverviewChartVO.setOptions("{}");

		AdminOverviewDataSetVO adminOverviewDataSetVO = new AdminOverviewDataSetVO();
		adminOverviewDataSetVO.setLabel("일별 가입자");
		adminOverviewDataSetVO.setFill(false);
		adminOverviewDataSetVO.setBorderColor("rgb(93,168,203)");
		adminOverviewDataSetVO.setLineTension(0.2);

		String[] tmpLabels = new LabelMaker().chartDailyLabelMaker(adminOverviewVisitorVO.getStartDate(),
				adminOverviewVisitorVO.getEndDate());

		int[] tmpDatas = new int[tmpLabels.length];

		for (int i = 0; i < tmpLabels.length; i++) {
			for (int j = 0; j < adminOverviewVisitorList.size(); j++) {
				if (tmpLabels[i].equals(adminOverviewVisitorList.get(j).getUserCountTbDate())) {
					tmpDatas[i] = adminOverviewVisitorList.get(j).getUserCountTbJoiners();
					break;
				} else {
					tmpDatas[i] = 0;
				}
			}
		}
		
		adminOverviewDataSetVO.setData(tmpDatas);

		AdminOverviewDataSetVO[] datasets = { adminOverviewDataSetVO };

		AdminOverviewDataVO adminOverviewDataVO = new AdminOverviewDataVO();
		adminOverviewDataVO.setLabels(tmpLabels);
		adminOverviewDataVO.setDatasets(datasets);

		adminOverviewChartVO.setData(adminOverviewDataVO);

		return adminOverviewChartVO;

	}

	@RequestMapping(value = "/memberOverviewFourAjax.ado", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public AdminOverviewChartVO getAdminOverviewFourChartVO(AdminOverviewVisitorVO adminOverviewVisitorVO) {

		// 월별회원수
		List<AdminOverviewVisitorVO> selectOverveiwListMonth = adminSelectOverviewListService
				.selectOverveiwListMonth(adminOverviewVisitorVO);

		AdminOverviewChartVO adminOverviewChartVO = new AdminOverviewChartVO();
		adminOverviewChartVO.setType("line");
		adminOverviewChartVO.setOptions("{}");

		AdminOverviewDataSetVO adminOverviewDataSetVO = new AdminOverviewDataSetVO();
		adminOverviewDataSetVO.setLabel("월별 회원수");
		adminOverviewDataSetVO.setFill(false);
		adminOverviewDataSetVO.setBorderColor("rgb(93,168,203)");
		adminOverviewDataSetVO.setLineTension(0.2);
		
		String[] tmpLabels = new LabelMaker().chartMonthlyLabelMaker(adminOverviewVisitorVO.getStartDate(),
				adminOverviewVisitorVO.getEndDate());

		int[] tmpDatas = new int[tmpLabels.length];

		for (int i = 0; i < tmpLabels.length; i++) {
			for (int j = 0; j < selectOverveiwListMonth.size(); j++) {
				if (tmpLabels[i].equals(selectOverveiwListMonth.get(j).getUserCountTbDate())) {
					tmpDatas[i] = selectOverveiwListMonth.get(j).getUserCountTbJoiners();
					break;
				} else {
					tmpDatas[i] = 0;
				}
			}
		}
		
		adminOverviewDataSetVO.setData(tmpDatas);

		AdminOverviewDataSetVO[] datasets = { adminOverviewDataSetVO };

		AdminOverviewDataVO adminOverviewDataVO = new AdminOverviewDataVO();
		adminOverviewDataVO.setLabels(tmpLabels);
		adminOverviewDataVO.setDatasets(datasets);

		adminOverviewChartVO.setData(adminOverviewDataVO);

		return adminOverviewChartVO;

	}

	@RequestMapping(value = "/memberOverviewDayAjax.ado", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public AdminOverviewChartVO getAdminOverviewDAYChartVO(AdminOverviewVisitorVO adminOverviewVisitorVO) {

		// 일별회원증감표
		List<AdminOverviewVisitorVO> adminOverviewVisitorList = adminSelectOverviewListService
				.selectOverviewList(adminOverviewVisitorVO);

		AdminOverviewChartVO adminOverviewChartVO = new AdminOverviewChartVO();
		adminOverviewChartVO.setType("line");
		adminOverviewChartVO.setOptions("{}");

		AdminOverviewDataSetVO adminOverviewDataSetVO = new AdminOverviewDataSetVO();

		// 추가
		AdminOverviewDataSetVO adminOverviewDataSetVO2 = new AdminOverviewDataSetVO();
		// 추가
		AdminOverviewDataSetVO adminOverviewDataSetVO3 = new AdminOverviewDataSetVO();

		adminOverviewDataSetVO.setLabel("일별 회원가입");
		adminOverviewDataSetVO.setFill(false);
		adminOverviewDataSetVO.setBorderColor("rgb(99, 203, 137)");
		adminOverviewDataSetVO.setLineTension(0.2);

		// 추가
		adminOverviewDataSetVO2.setLabel("일별 회원탈퇴");
		adminOverviewDataSetVO2.setFill(false);
		adminOverviewDataSetVO2.setBorderColor("rgb(203,36,45)");
		adminOverviewDataSetVO2.setLineTension(0.2);

		// 추가
		adminOverviewDataSetVO3.setLabel("일별 회원증감");
		adminOverviewDataSetVO3.setFill(false);
		adminOverviewDataSetVO3.setBorderColor("rgb(42,94,203)");
		adminOverviewDataSetVO3.setLineTension(0.2);
		
		String[] tmpLabels = new LabelMaker().chartDailyLabelMaker(adminOverviewVisitorVO.getStartDate(),
				adminOverviewVisitorVO.getEndDate());

		int[] tmpDatas = new int[tmpLabels.length];
		int[] tmpOutDatas = new int[tmpLabels.length];
		int[] tmpInOutDatas = new int[tmpLabels.length];

		for (int i = 0; i < tmpLabels.length; i++) {
			for (int j = 0; j < adminOverviewVisitorList.size(); j++) {
				if (tmpLabels[i].equals(adminOverviewVisitorList.get(j).getUserCountTbDate())) {
					tmpDatas[i] = adminOverviewVisitorList.get(j).getUserCountTbJoiners();
					tmpOutDatas[i] = adminOverviewVisitorList.get(j).getUserCountTbOutcount();
					break;
				} else {
					tmpDatas[i] = 0;
					tmpOutDatas[i] = 0;
				}
				tmpInOutDatas[i] = tmpDatas[i] - tmpOutDatas[i];
			}
		}

		adminOverviewDataSetVO.setData(tmpDatas);
		adminOverviewDataSetVO2.setData(tmpOutDatas); // 회원탈퇴값
		adminOverviewDataSetVO3.setData(tmpInOutDatas);// 회원증감표

		AdminOverviewDataSetVO[] datasets = { adminOverviewDataSetVO, adminOverviewDataSetVO2,
				adminOverviewDataSetVO3 };

		AdminOverviewDataVO adminOverviewDataVO = new AdminOverviewDataVO();

		adminOverviewDataVO.setLabels(tmpLabels);
		adminOverviewDataVO.setDatasets(datasets);

		adminOverviewChartVO.setData(adminOverviewDataVO);

		return adminOverviewChartVO;

	}

	@RequestMapping(value = "/memberOverviewMonthAjax.ado", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public AdminOverviewChartVO getAdminOverviewMonthChartVO(AdminOverviewVisitorVO adminOverviewVisitorVO) {

		// 월별회원증감표
		List<AdminOverviewVisitorVO> selectOverveiwListMonth = adminSelectOverviewListService
				.selectOverveiwListMonth(adminOverviewVisitorVO);

		AdminOverviewChartVO adminOverviewChartVO = new AdminOverviewChartVO();

		adminOverviewChartVO.setType("line");
		adminOverviewChartVO.setOptions("{}");

		AdminOverviewDataSetVO adminOverviewDataSetVO = new AdminOverviewDataSetVO();
		adminOverviewDataSetVO.setLabel("월별 회원가입");
		adminOverviewDataSetVO.setFill(false);
		adminOverviewDataSetVO.setBorderColor("rgb(99, 203, 137)");
		adminOverviewDataSetVO.setLineTension(0.2);

		// 추가
		AdminOverviewDataSetVO adminOverviewDataSetVO2 = new AdminOverviewDataSetVO();
		// 추가
		AdminOverviewDataSetVO adminOverviewDataSetVO3 = new AdminOverviewDataSetVO();

		// 추가
		adminOverviewDataSetVO2.setLabel("월별 회원탈퇴");
		adminOverviewDataSetVO2.setFill(false);
		adminOverviewDataSetVO2.setBorderColor("rgb(203,36,45)");
		adminOverviewDataSetVO2.setLineTension(0.2);

		// 추가
		adminOverviewDataSetVO3.setLabel("월별 회원증감");
		adminOverviewDataSetVO3.setFill(false);
		adminOverviewDataSetVO3.setBorderColor("rgb(42,94,203)");
		adminOverviewDataSetVO3.setLineTension(0.2);

		String[] tmpLabels = new LabelMaker().chartMonthlyLabelMaker(adminOverviewVisitorVO.getStartDate(),
				adminOverviewVisitorVO.getEndDate());

		int[] tmpDatas = new int[tmpLabels.length];
		int[] tmpOutDatas = new int[tmpLabels.length];
		int[] tmpInOutDatas = new int[tmpLabels.length];
		
		for (int i = 0; i < tmpLabels.length; i++) {
			for (int j = 0; j < selectOverveiwListMonth.size(); j++) {
				if (tmpLabels[i].equals(selectOverveiwListMonth.get(j).getUserCountTbDate())) {
					tmpDatas[i] = selectOverveiwListMonth.get(j).getUserCountTbJoiners();
					tmpOutDatas[i] = selectOverveiwListMonth.get(j).getUserCountTbOutcount();

					break;	
				} else {		
					tmpDatas[i] = 0;
					tmpOutDatas[i] = 0;
				}
				tmpInOutDatas[i] = tmpDatas[i] - tmpOutDatas[i];
			}
		}
		
		adminOverviewDataSetVO.setData(tmpDatas);
		adminOverviewDataSetVO2.setData(tmpOutDatas);
		adminOverviewDataSetVO3.setData(tmpInOutDatas);

		AdminOverviewDataSetVO[] datasets = { adminOverviewDataSetVO, adminOverviewDataSetVO2,
				adminOverviewDataSetVO3 };

		AdminOverviewDataVO adminOverviewDataVO = new AdminOverviewDataVO();
		adminOverviewDataVO.setLabels(tmpLabels);
		adminOverviewDataVO.setDatasets(datasets);

		adminOverviewChartVO.setData(adminOverviewDataVO);

		return adminOverviewChartVO;

	}

	// 일단임시
	@RequestMapping(value = "/memberOverview.ado")
	public String memberOverviewPage() {
		return "member/member-overview";
	}

}
