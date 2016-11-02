package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by bruce.ge on 2016/10/23.
 */
@Controller
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class SampleController {
    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleController.class,args);
    }
}