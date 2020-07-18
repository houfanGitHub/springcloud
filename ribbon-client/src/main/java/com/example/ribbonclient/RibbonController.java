package com.example.ribbonclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/index")
    public String index(){
        return restTemplate.getForObject("http://eureka-client/index",String.class);
    }
}
