package com.msr.ucenter;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author tom
 * @version V1.0
 * @Package com.msr.ucenter
 * @date 2020/6/12 11:10
 * @Copyright ©
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages={"com.msr.ucenter","com.msr.common"})
public class UcenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(UcenterApplication.class, args);
    }
}