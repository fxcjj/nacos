1. spring cloud 启动服务发现之consumer
2. 使用的是spring-cloud-alibaba-dependencies
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
</dependency>
或者
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
</dependency>
3. 上面两个都依赖
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-alibaba-nacos-discovery</artifactId>
</dependency>
4. 使用到了@LoadBalanced、RestTemplate，对应要引入netflix-ribbon和openfeign

Reference
https://nacos.io/zh-cn/docs/quick-start-spring-cloud.html