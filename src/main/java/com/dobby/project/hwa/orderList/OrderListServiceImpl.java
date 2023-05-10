package com.dobby.project.hwa.orderList;

import com.dobby.project.hwa.cart.CartDto;
import com.dobby.project.hwa.order.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderListServiceImpl implements OrderListService {
    @Autowired
    OrderListDao orderListDao;


    @Override
    public List<OrdDto>  getOrdInfo(String mbrId) {

        return orderListDao.selectOrderInfo(mbrId);
    }

    @Override
    public List<OrdProdDto> getProdNm(String ordId) {
        return orderListDao.selectProdNm(ordId);
    }

    @Override
    public List<ProdCntDto> getProdCnt(String mbrId, String ordId) {
        return orderListDao.selectProdCnt(mbrId,ordId);
    }

    @Override
    public OrdDto getOrdDetailList(String orderId) {
        return orderListDao.selectOrderDetailList(orderId);
    }

    @Override
    public List<OrdProdInfoDto> getOrdProdInfo(String orderId) {
        return orderListDao.selectOrdProdInfo(orderId);
    }


}
