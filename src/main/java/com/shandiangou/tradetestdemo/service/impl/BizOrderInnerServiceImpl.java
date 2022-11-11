package com.shandiangou.tradetestdemo.service.impl;

import com.shandiangou.trade.domain.BizOrderDO;
import com.shandiangou.tradetestdemo.domain.DO.BizOrder;
import com.shandiangou.tradetestdemo.service.BizOrderService;
import org.springframework.stereotype.Service;

//@Service("bizOrderInnerServiceImpl")
@Service
public class BizOrderInnerServiceImpl implements BizOrderService {
    @Override
    public BizOrderDO getOutBizOrderById(Long bizOrderId) {
        return null;
    }

    @Override
    public BizOrder getInnerBizOrderById(Long bizOrderId) {
        return null;
    }
}
