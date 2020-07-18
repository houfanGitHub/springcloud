package com.example.ribbonclient.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@SpringBootConfiguration
@Component
public class RibbonConfiguration {

    @Bean
    //开启客户端负载均衡
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
