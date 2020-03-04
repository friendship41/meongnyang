package com.mall.meongnyang.admin.product.controller;

import com.mall.meongnyang.admin.product.service.*;
import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AdminSelectProductController
{
    @Autowired
    private AdminSelectProductOverviewListService adminSelectProductOverviewListService;
    @Autowired
    private AdminSelectProductSaleOverviewListService adminSelectProductSaleOverviewListService;
    @Autowired
    private AdminSelectProductOrderOverviewService adminSelectProductOrderOverviewService;
    @Autowired
    private AdminSelectPopularProductListService adminSelectPopularProductListService;
    @Autowired
    private AdminSelectReadcountSaleListService adminSelectReadcountSaleListService;
    @Autowired
    private AdminSelectCancelProductRankingService adminSelectCancelProductRankingService;


    @RequestMapping(value = "productOverview.ado", method = RequestMethod.GET)
    public String goToProductOverviewPage()
    {
        return "product/product-overview";
    }

    @RequestMapping(value = "/productAllTableAjax.ado", method = RequestMethod.GET)
    @ResponseBody
    public List<AdminProductVO> getProductAllTableAjax(AdminProductVO adminProductVO)
    {
        return adminSelectProductOverviewListService.selectProductOverviewList(adminProductVO);
    }

    @RequestMapping(value = "/productSaleOverviewAjax.ado", method = RequestMethod.GET)
    @ResponseBody
    public List<AdminProductSaleVO> getProductSaleOverviewAjax(AdminProductSaleVO adminProductSaleVO)
    {
        return adminSelectProductSaleOverviewListService.selectProductSaleOverview(adminProductSaleVO);
    }

    @RequestMapping(value = "/productOrderOverviewAjax.ado", method = RequestMethod.GET)
    @ResponseBody
    public List<ClientProductOrderVO> getProductOrderOverviewAjax(ClientProductOrderVO clientProductOrderVO)
    {
        return adminSelectProductOrderOverviewService.selectProductOrderList(clientProductOrderVO);
    }

    @RequestMapping(value = "/popularProductOverview.ado", method = RequestMethod.GET)
    @ResponseBody
    public List<AdminProductVO> getPopularProductOverviewAjax(AdminProductVO adminProductVO)
    {
        return adminSelectPopularProductListService.getPopularProductList(adminProductVO);
    }

    @RequestMapping(value = "/productAnalysis.ado", method = RequestMethod.GET)
    public String goToProductAnalysisPage()
    {
        return "product/product-analysis";
    }

    @RequestMapping(value = "/readcountSaleListAjax.ado", method = RequestMethod.GET)
    @ResponseBody
    public List<AdminProductVO> getReadcountSaleListAjax(AdminProductVO adminProductVO)
    {
        return adminSelectReadcountSaleListService.getReadcountSaleList(adminProductVO);
    }

    @RequestMapping(value = "/productCancelRankingAjax.ado", method = RequestMethod.GET)
    @ResponseBody
    public List<AdminProductVO> getCancelRankingAjax(AdminProductVO adminProductVO)
    {
        return adminSelectCancelProductRankingService.selectCancelProductRanking(adminProductVO);
    }

}
