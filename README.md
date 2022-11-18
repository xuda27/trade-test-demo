# trade-test-demo

spring-boot练手工程
目前集成有：
1. spring-boot: https://docs.spring.io/spring-boot/docs/current/reference/html/
2. mybatis: https://github.com/mybatis/spring-boot-starter/blob/master/mybatis-spring-boot-autoconfigure/src/site/zh/markdown/index.md
3. mybatis-generator: http://mybatis.org/generator/index.html
4. dubbo: https://dubbo.apache.org/zh/docs3-v2/java-sdk/quick-start/spring-boot/
5. spring-data-source: https://docs.spring.io/spring-boot/docs/current/reference/html/data.html#data.sql.datasource


2022117 需求 
1. 调用外部dubbo获取订单，存入到本地数据库里
2. 更新，内部数据库订单数据修改逻辑，比如修改名称 哈哈 -》 呵呵。
3. 删除，订单数据。




1.先在TestController放入insertOutOrderById方法，把从网页得到的bizOrderId放进去，
然后写一个在service接口中写一个insertOutOrderById方法，其实现类先用bizOrderId调用dubbo外部服务得到bizOrderDo， 
通过BeanUtils.copyProperties(，)方法把bizOrderDo内容复制到bizOrder中，
再把bizOrder里面的内容放到bizOrderMapper的insert方法中

1.写一个updateBizOrderBuyerNickById的方法放入TestController，然后把从网页得到的bizOrderId和对应的buyer_nick放进新创建的bizOrder，
然后在service接口中写一个updateBizOrderBuyerNickById方法，其实现类先用bizOrderId得到BizOrderExample，然后再把controller传过来的
bizOrder和BizOrderExample放入bizOrderMapper的updateByPrimaryKeySelective

1.写一个deleteBizOrderById的方法放入TestController
2.写对应的接口方法，然后写对应的实现类