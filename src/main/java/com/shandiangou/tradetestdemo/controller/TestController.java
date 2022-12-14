package com.shandiangou.tradetestdemo.controller;

import com.shandiangou.trade.domain.BizOrderDO;
import com.shandiangou.tradetestdemo.domain.DO.BizOrder;
import com.shandiangou.tradetestdemo.domain.DO.SubBizOrder;
import com.shandiangou.tradetestdemo.service.BizOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
//    @Qualifier("bizOrderServiceImpl")
    private BizOrderService bizOrderService;


    /**
     * 调用外部订单
     * @param bizOrderId
     * @return
     */
    @RequestMapping("/getOutOrderById")
    public BizOrderDO getOutOrderById(@RequestParam Long bizOrderId) {
        return bizOrderService.getOutBizOrderById(bizOrderId);
    }

    @RequestMapping("/insertOutOrderById")
    public void insertOutOrderById(@RequestParam Long bizOrderId) {
        bizOrderService.insertOutOrderById(bizOrderId);
    }

    @RequestMapping("/updateBizOrderBuyerNickById")
    public void updateBizOrderBuyerNickById(@RequestParam Long bizOrderId,@RequestParam String buyerNick) {
        BizOrder bizOrder=new BizOrder();
        bizOrder.setBizOrderId(bizOrderId);
        bizOrder.setBuyerNick(buyerNick);
        bizOrderService.updateBizOrderBuyerNickById(bizOrder,bizOrderId);
    }

    /**
     * 调用返回内部订单
     * @param bizOrderId
     * @return
     */
    @RequestMapping("/getInnerBizOrderById")
    public BizOrder getInnerBizOrderById(@RequestParam Long bizOrderId) {
        return bizOrderService.getInnerBizOrderById(bizOrderId);
    }

    @RequestMapping("/getInnerSubBisOrderById")
    public SubBizOrder getInnerSubBisOrderById(@RequestParam Long bizOrderId) {
        return bizOrderService.getInnerSubBizOrderById(bizOrderId);
    }

    @RequestMapping("/deleteBizOrderById")
    public void deleteBizOrderById(@RequestParam Long bizOrderId) {
        bizOrderService.deleteBizOrderById(bizOrderId);
    }
}
