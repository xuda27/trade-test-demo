package com.shandiangou.tradetestdemo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 检查应用测试
 *
 * @author xuda
 */
@RestController
public class WebStatusController {

    @RequestMapping("/webStatus")
    public String webStatus() {
       return "ok";
    }



}
