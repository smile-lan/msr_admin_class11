package com.msr.edu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author tom
 * @version V1.0
 * @Package com.msr.edu
 * @date 2020/6/8 8:54
 * @Copyright ©
 */
//主类 或  启动类

@SpringBootApplication
@MapperScan("com.msr.edu.mapper")
public class EduApplication {
    public static void main(String[] args) {
        SpringApplication.run(EduApplication.class,args);
    }
}