package com.mall.meongnyang.client.member.service;

import com.mall.meongnyang.client.member.dao.ClientLoginDAO;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.client.member.vo.ClientTermsAgreeVO;
import com.mall.meongnyang.client.member.vo.GoogleCustomerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("GoogleLoginProcService")
public class GoogleLoginProcServiceImpl implements GoogleLoginProcService
{
    @Autowired
    private ClientLoginDAO clientLoginDAO;
    @Autowired
    private ClientInsertTermsAgreeListService clientInsertTermsAgreeListService;

    @Override
    public ClientCustomerVO googleLoginProc(GoogleCustomerVO googleCustomerVO)
    {
        ClientCustomerVO customerTemp = new ClientCustomerVO();
        customerTemp.setCustomerTbEmail(googleCustomerVO.getEmail()==null ? googleCustomerVO.getId() : googleCustomerVO.getEmail());
        ClientCustomerVO customerDB = clientLoginDAO.selectLoginCheck(customerTemp);

        if(customerDB == null)
        {
            customerTemp.setCustomerTbName(googleCustomerVO.getName());
            clientLoginDAO.insertGoogleCustomer(customerTemp);
            customerDB = clientLoginDAO.selectLoginCheck(customerTemp);

            ClientTermsAgreeVO clientTermsAgreeVO = new ClientTermsAgreeVO();
            clientTermsAgreeVO.setTermsTbNo(2);
            clientTermsAgreeVO.setCustomerTbNo(customerDB.getCustomerTbNo());
            clientTermsAgreeVO.setTermsAgreeTbConsentStatus("N");
            clientInsertTermsAgreeListService.insertTermsAgreeListService(clientTermsAgreeVO);
        }
        else
        {
            clientLoginDAO.updateLastLogin(customerDB);
        }

        return customerDB;
    }
}
