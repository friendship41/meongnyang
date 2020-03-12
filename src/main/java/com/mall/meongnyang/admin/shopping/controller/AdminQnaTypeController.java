package com.mall.meongnyang.admin.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mall.meongnyang.admin.shopping.service.AdminDeleteQnaTypeService;
import com.mall.meongnyang.admin.shopping.service.AdminInsertQnaTypeService;
import com.mall.meongnyang.admin.shopping.service.AdminSelectQnaTypeListService;
import com.mall.meongnyang.admin.shopping.service.AdminSelectQnaTypeService;
import com.mall.meongnyang.admin.shopping.service.AdminUpdateQnaTypeService;
import com.mall.meongnyang.admin.shopping.vo.AdminQnaTypeVO;

@Controller
public class AdminQnaTypeController {
	
	
	@Autowired
	private AdminInsertQnaTypeService adminInsertQnaTypeService;
	
	@Autowired
	private AdminUpdateQnaTypeService adminUpdateQnaTypeService;
	
	@Autowired
	private AdminDeleteQnaTypeService adminDeleteQnaTypeService;
	
	@Autowired
	private AdminSelectQnaTypeListService adminSelectQnaTypeListService;
	
	@Autowired
	private AdminSelectQnaTypeService adminSelectQnaTypeService;
	
	
	@RequestMapping(value = "/shoppingmall-qna-category.ado", method = RequestMethod.GET)
    public String qnaCategoryList(AdminQnaTypeVO adminQnaTypeVO, Model model)
    {
		List<AdminQnaTypeVO> tempVO = adminSelectQnaTypeListService.selectQnaTypeList(adminQnaTypeVO);
        model.addAttribute("qnaCategoryList", tempVO);
        
        return "shoppingmall/shoppingmall-qna-category";
    }
	
	
	
    @RequestMapping(value = "/qnaCategorySingleAjax.ado", method = RequestMethod.GET)
    @ResponseBody
    public AdminQnaTypeVO qnaCategoryListAjax(AdminQnaTypeVO adminQnaTypeVO)
    {
        return adminSelectQnaTypeService.selectQnaType(adminQnaTypeVO);
    }

    
    @RequestMapping(value = "qnaCategoryInsert.ado", method = RequestMethod.POST)
    public String insertQnaCategory(AdminQnaTypeVO adminQnaTypeVO)
    {
        adminInsertQnaTypeService.insertQnaType(adminQnaTypeVO);

        return "redirect:shoppingmall-qna-category.ado";
    }

    
    @RequestMapping(value = "/qnaCategoryUpdate.ado", method = RequestMethod.POST)
    public String updateQnaCategory(AdminQnaTypeVO adminQnaTypeVO)
    {
        adminUpdateQnaTypeService.updateQnaType(adminQnaTypeVO);

        return "redirect:shoppingmall-qna-category.ado";
    }

    
    @RequestMapping(value = "/qnaCategoryDelete.ado", method = RequestMethod.GET)
    public String deleteQnaCategory(AdminQnaTypeVO adminQnaTypeVO)
    {
//        System.out.println(adminQnaTypeVO);

        adminDeleteQnaTypeService.deleteQnaType(adminQnaTypeVO);

        return "redirect:shoppingmall-qna-category.ado";
    }
		
}
