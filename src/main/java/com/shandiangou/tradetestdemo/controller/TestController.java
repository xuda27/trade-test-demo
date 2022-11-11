package com.shandiangou.tradetestdemo.controller;

import com.shandiangou.trade.domain.BizOrderDO;
import com.shandiangou.tradetestdemo.domain.DO.BizOrder;
import com.shandiangou.tradetestdemo.service.BizOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    /**
     * 调用返回内部订单
     * @param bizOrderId
     * @return
     */
    @RequestMapping("/getInnerBizOrderById")
    public BizOrder getInnerBizOrderById(@RequestParam Long bizOrderId) {
        return bizOrderService.getInnerBizOrderById(bizOrderId);
    }
}
