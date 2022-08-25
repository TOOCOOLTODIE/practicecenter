package com.lxy.practise.tiny.elegant.blog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * test
 * @author luo
 * @date 2022/08/25 17:47
 **/
@RestController
public class TestController {
    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/hello")
    public String hello(){
        long start = System.currentTimeMillis();
        log.info("<<<<<<<<<<<<<<<<<<<<<<<< begin >>>>>>>>>>>>>>>>>>>>");
        log.trace("trace log");
        log.debug("debug log");
        log.info("info log");
        log.warn("warn log");
        log.error("error log");
        log.info("<<<<<<<<<<<<<<<<<<<<<<<< end >>>>>>>>>>>>>>>>>>>>");
        log.info("耗时：{}毫秒.", System.currentTimeMillis() - start);
        return "hello";
    }
}
