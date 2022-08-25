package com.lxy.practise.tiny.elegant.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * blog application
 * @author luo
 * @date 2022/04/18 20:51
 **/
@SpringBootApplication
@MapperScan(basePackages = "com.lxy.practise.tiny.elegant")
public class BlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }
}
