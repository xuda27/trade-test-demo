package com.shandiangou.tradetestdemo.service.impl;

import com.shandiangou.trade.api.TradeService;
import com.shandiangou.trade.domain.BizOrderDO;
import com.shandiangou.tradetestdemo.domain.DO.BizOrder;
import com.shandiangou.tradetestdemo.domain.DO.BizOrderExample;
import com.shandiangou.tradetestdemo.mapper.BizOrderMapper;
import com.shandiangou.tradetestdemo.service.BizOrderService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Slf4j
@Primary
@Service
public class BizOrderServiceImpl implements BizOrderService {
    @DubboReference
    private TradeService tradeService;

    @Autowired
    private BizOrderMapper bizOrderMapper;

    @Override
    public BizOrderDO getOutBizOrderById(Long bizOrderId) {
        try {
            BizOrderDO outOrder = tradeService.getOrderByBizOrderId(bizOrderId);
            return outOrder;
        } catch (Exception e) {
            log.error("查询订单失败：" + e.getMessage(), e);
            return null;
        }
    }

    @Override
    public BizOrder getInnerBizOrderById(Long bizOrderId) {
        BizOrderExample bizOrderExample = new BizOrderExample();
        BizOrderExample.Criteria c = bizOrderExample.createCriteria();
        c.andBizOrderIdEqualTo(bizOrderId);
        List<BizOrder> list = bizOrderMapper.selectByExample(bizOrderExample);
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        return list.get(0);
    }

}
