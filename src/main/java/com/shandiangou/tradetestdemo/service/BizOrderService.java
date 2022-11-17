package com.shandiangou.tradetestdemo.service;

import com.shandiangou.trade.domain.BizOrderDO;
import com.shandiangou.tradetestdemo.domain.DO.BizOrder;
import com.shandiangou.tradetestdemo.domain.DO.SubBizOrder;

/**
 * 订单服务
 *
 * @author xuda
 */
public interface BizOrderService {

    /**
     * 根据订单号查询外部订单
     * @param bizOrderId
     * @return
     */
    BizOrderDO getOutBizOrderById(Long bizOrderId);

    /**
     * 根据订单号查询内部db订单
     * @param bizOrderId
     * @return
     */
    BizOrder getInnerBizOrderById(Long bizOrderId);

    SubBizOrder getInnerSubBizOrderById(Long bizOrderId);
}
