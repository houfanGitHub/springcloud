package com.example.ribbonclient.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/index")
    @HystrixCommand(fallbackMethod = "indexHistrxErrorMethod"
//        ,ignoreExceptions = {ArithmeticException.class}
    )
    public String index(){
        return restTemplate.getForObject("http://eureka-client/index",String.class);
    }

    private String indexHistrxErrorMethod(){
        return "服务异常，自动降级处理";
    }
}
