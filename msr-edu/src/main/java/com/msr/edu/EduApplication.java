package com.msr.edu;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author tom
 * @version V1.0
 * @Package com.msr.edu
 * @date 2020/6/8 8:54
 * @Copyright ©
 */
//主类 或  启动类

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.msr.edu.mapper")
@ComponentScan(basePackages={"com.msr.edu","com.msr.common"})
public class EduApplication {
    public static void main(String[] args) {
        SpringApplication.run(EduApplication.class,args);
    }
}