package com.jxc.mettingroom.mettingroom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.jxc.mettingroom.mettingroom.mapper")
public class MettingroomApplication {

    public static void main(String[] args) {
        SpringApplication.run(MettingroomApplication.class, args);
    }

}
