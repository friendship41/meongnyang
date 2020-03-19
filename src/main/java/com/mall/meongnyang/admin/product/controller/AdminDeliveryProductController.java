package com.mall.meongnyang.admin.product.controller;

import com.mall.meongnyang.admin.product.service.AdminDeleteProductOrderService;
import com.mall.meongnyang.admin.product.service.AdminSelectOrderDetailService;
import com.mall.meongnyang.admin.product.service.AdminSelectOrderStateListService;
import com.mall.meongnyang.admin.product.service.AdminUpdateOrderStateService;
import com.mall.meongnyang.client.mypage.vo.ClientOrdersDetailVO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class AdminDeliveryProductController
{
    @Autowired
    private AdminSelectOrderStateListService adminSelectOrderStateListService;
    @Autowired
    private AdminDeleteProductOrderService adminDeleteProductOrderService;
    @Autowired
    private AdminUpdateOrderStateService adminUpdateOrderStateService;
    @Autowired
    private AdminSelectOrderDetailService adminSelectOrderDetailService;


    @RequestMapping(value = "/productProcess.ado", method = RequestMethod.GET)
    public String goToProductProcessPage(Model model)
    {
        model.addAttribute("orderList",adminSelectOrderStateListService.selectOrderStateList());

        return "product/product-deliveryTemp";
    }

    @RequestMapping(value = "/deleteProductOrder.ado", method = RequestMethod.GET)
    public String deleteProductOrder(ClientOrderVO clientOrderVO)
    {
        adminDeleteProductOrderService.deleteProductOrder(clientOrderVO);
        return "redirect:productProcess.ado";
    }

    @RequestMapping(value = "/updateProductOrder.ado", method = RequestMethod.GET)
    public String updateProductOrder(ClientOrderVO clientOrderVO)
    {
        adminUpdateOrderStateService.updateOrderState(clientOrderVO);
        return "redirect:productProcess.ado";
    }

    @RequestMapping(value = "/orderDetailAjax.ado", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> orderDetailAjax(ClientOrdersDetailVO clientOrdersDetailVO)
    {
        return adminSelectOrderDetailService.selectOrderDetail(clientOrdersDetailVO);
    }

}
