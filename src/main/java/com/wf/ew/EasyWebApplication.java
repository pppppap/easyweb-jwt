package com.wf.ew;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.wf.jwtp.configuration.EnableJwtPermission;

@EnableJwtPermission
@SpringBootApplication
@MapperScan("com.wf.ew.*.mapper")
public class EasyWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyWebApplication.class, args);
    }
}
