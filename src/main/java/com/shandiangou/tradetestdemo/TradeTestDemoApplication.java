package com.shandiangou.tradetestdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shandiangou.tradetestdemo.mapper")
public class TradeTestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradeTestDemoApplication.class, args);
	}

}
