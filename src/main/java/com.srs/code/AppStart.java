package com.srs.code;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author shaorensheng
 * @date 2019/12/20
 */
@SpringBootApplication
@MapperScan("com.srs.code.mapper")
public class AppStart {

    public static void main(String[] args) {
        SpringApplication.run(AppStart.class);
    }

}
