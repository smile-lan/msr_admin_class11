package com.msr.statistics;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author tom
 * @version V1.0
 * @Package com.msr.statistics
 * @date 2020/6/12 13:25
 * @Copyright ©
 */

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages={"com.msr.statistics","com.msr.common"})
public class StatisticsApplication {
    public static void main(String[] args) {
        SpringApplication.run(StatisticsApplication.class, args);
    }
}
